package com.ciplogic.jsinjector.web;

import com.ciplogic.jsinjector.IOInjectTraceWrap;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.net.Socket;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
public class JavascriptInjectFilter implements Filter {
    public static String REDIRECT_HOST = null;
    public static int REDIRECT_PORT = 80;

    private static Pattern STATUS_PATTERN = Pattern.compile("^.*? (\\d+) (.*)$");
    private static Pattern HEADER_PATTERN = Pattern.compile("^(.*?): (.*)$");

    public void init(FilterConfig filterConfig) throws ServletException {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        if (!isRedirectUrlConfigured()) {
            filterChain.doFilter(request, response);
            return;
        }

        redirectCall(request, response);
    }

    private boolean isRedirectUrlConfigured() {
        return null != REDIRECT_HOST;
    }

    private void redirectCall(ServletRequest request, ServletResponse response) throws IOException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;

        RemoteConnection remoteConnection = null;
        try {
            remoteConnection = new RemoteConnection().create();

            writeTranslatedRequest(httpRequest, remoteConnection);
            copyResponseFromRemote(httpRequest, response, remoteConnection.getInputStream());
        } finally {
            closeQuietly(remoteConnection);
        }
    }

    private void closeQuietly(RemoteConnection socket) {
        if (socket != null) {
            try {
                socket.getSocket().close();
            } catch (Exception e) {
                // ignored
            }
        }
    }

    private void copyResponseFromRemote(HttpServletRequest httpRequest, ServletResponse response, InputStream remoteInputStream) throws IOException {
        InputStreamLineSupport reader = new InputStreamLineSupport(remoteInputStream, "UTF-8");
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        writeStatus(reader, httpResponse);
        boolean chunked = writeHeaders(reader, httpResponse);

        OutputStream outputStream = response.getOutputStream();

        InputStream inputStream = chunked ? new InputStreamChunked(reader) : reader;
        //InputStream inputStream = reader;

        if (shouldParse(httpRequest.getRequestURI())) {
            new IOInjectTraceWrap(httpRequest.getServletPath(),
                    inputStream,
                    outputStream).write();
        } else {
            IOUtils.copy(inputStream, outputStream);
        }

        outputStream.flush();
    }

    private boolean writeHeaders(InputStreamLineSupport reader, HttpServletResponse httpResponse) throws IOException {
        boolean chunked = false;

        String headerLine;
        while (!"".equals(headerLine = reader.readLine())) {
            Matcher headerMatcher = HEADER_PATTERN.matcher(headerLine);
            headerMatcher.matches();

            if ("Transfer-Encoding".equals(headerMatcher.group(1)) && "chunked".equals(headerMatcher.group(2))) {
                chunked = true;
            }

            httpResponse.setHeader(headerMatcher.group(1), headerMatcher.group(2));
        }

        return chunked;
    }

    private void writeStatus(InputStreamLineSupport reader, HttpServletResponse httpResponse) throws IOException {
        String responseLine = reader.readLine();
        Matcher statusMatcher = STATUS_PATTERN.matcher(responseLine);
        statusMatcher.matches();

        httpResponse.setStatus(Integer.parseInt(statusMatcher.group(1)), statusMatcher.group(2));
    }

    private void writeTranslatedRequest(HttpServletRequest httpRequest, RemoteConnection remoteConnection) throws IOException {
        OutputStream outputStream = remoteConnection.getOutputStream();

        writeProtocolLine(httpRequest, outputStream);
        writeHeaders(httpRequest, outputStream);
        writeEmptyLine(outputStream);
        writeContent(httpRequest, outputStream);

        outputStream.flush();
    }

    private boolean shouldParse(String uri) {
        return false;
    }

    private void writeProtocolLine(HttpServletRequest httpRequest, OutputStream writer) throws IOException {
        StringBuilder requestLine = new StringBuilder("");

        requestLine.append(httpRequest.getMethod())
                .append(" ")
                .append(httpRequest.getRequestURI());

        if (httpRequest.getQueryString() != null && !"".equals(httpRequest.getQueryString())) {
            requestLine.append("?")
                    .append(httpRequest.getQueryString());
        }

        requestLine.append(" ")
                .append(httpRequest.getProtocol())
                .append("\r\n");

        writer.write(requestLine.toString().getBytes("UTF-8"));
    }

    private void writeHeaders(HttpServletRequest httpRequest, OutputStream writer) throws IOException {
        Enumeration headerNames = httpRequest.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = (String) headerNames.nextElement();
            String headerValue = httpRequest.getHeader(headerName);

            String header = capitalize(headerName) + ": " + headerValue + "\r\n";
            writer.write(header.getBytes("UTF-8"));
        }
    }

    private String capitalize(String headerName) {
        return headerName.substring(0, 1).toUpperCase() + headerName.substring(1);
    }

    private void writeEmptyLine(OutputStream writer) throws IOException {
        writer.write("\r\n".getBytes("UTF-8"));
    }

    private void writeContent(HttpServletRequest request, OutputStream writer) {
        try {
            IOUtils.copy(request.getInputStream(), writer);
        } catch (Exception e) {
            throw new IllegalArgumentException(e.getMessage(), e);
        }
    }

    public void destroy() {
    }

    private class RemoteConnection {
        private Socket socket;
        private OutputStream outputStream;
        private InputStream inputStream;

        public Socket getSocket() {
            return socket;
        }

        public OutputStream getOutputStream() {
            return outputStream;
        }

        public InputStream getInputStream() {
            return inputStream;
        }

        public RemoteConnection create() throws IOException {
            socket = new Socket(REDIRECT_HOST, REDIRECT_PORT);

            outputStream = new BufferedOutputStream( socket.getOutputStream() );
            inputStream = new BufferedInputStream( socket.getInputStream() );

            return this;
        }
    }
}
*/