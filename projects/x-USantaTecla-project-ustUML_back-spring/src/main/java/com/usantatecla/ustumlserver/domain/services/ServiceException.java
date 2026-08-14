package com.usantatecla.ustumlserver.domain.services;

import com.usantatecla.ustumlserver.infrastructure.api.dtos.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ServiceException extends RuntimeException {

    static final String DESCRIPTION = "Service exception";

    public ServiceException(String detail) {
        super(DESCRIPTION + ". " + detail);
    }

    public ServiceException(ErrorMessage errorMessage, String context) {
        this(String.format(errorMessage.getDetail(), "\"" + context + "\""));
    }

    public ServiceException(ErrorMessage errorMessage) {
        this(DESCRIPTION + ". " + errorMessage.getDetail());
    }

}
