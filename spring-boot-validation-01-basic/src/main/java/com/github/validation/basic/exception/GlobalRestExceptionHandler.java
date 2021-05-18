package com.github.validation.basic.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

/**
 * TODO
 * <p>
 * create in 2021/5/17 9:17 上午
 *
 * @author shishaodong
 * @version 0.0.1
 */

@Slf4j
@RestControllerAdvice
public class GlobalRestExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ConstraintViolationException.class)
    public String message(ConstraintViolationException exception) {
        log.info("GlobalRestExceptionHandler - ConstraintViolationException:{}", exception.getMessage());
        return exception.getMessage();
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String message(MethodArgumentNotValidException exception) {
        log.info("GlobalRestExceptionHandler - MethodArgumentNotValidException:{}", exception.getMessage());
        exception.getAllErrors().forEach(objectError -> log.info("错误信息:{}", objectError.getDefaultMessage()));
        return exception.getMessage();
    }

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public String message(Exception exception) {
        log.info("GlobalRestExceptionHandler - Exception - INTERNAL_SERVER_ERROR:{}", exception.getMessage());
        return exception.getMessage();
    }

}
