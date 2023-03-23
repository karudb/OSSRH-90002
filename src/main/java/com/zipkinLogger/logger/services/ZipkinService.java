package com.zipkinLogger.logger.services;

public interface ZipkinService {
    public void send(String fieldName, Object data);

    public void sendResponse(Object response);
}
