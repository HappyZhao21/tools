package com.jtravel.api.file.infrastructure;


import com.jtravel.common.exception.BusinessException;
import com.jtravel.common.model.ResultJson;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolationException;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

/**
 * @author ziy
 */
@Log4j2
@ControllerAdvice
public class RestExceptionHandler {

    @SuppressWarnings("rawtypes")
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultJson errorHandler(HttpServletRequest request, HttpServletResponse response, Exception exception) {

        log.error("request page url{}, params:{}, error:{}", request.getRequestURI(), request.getParameterMap(), exception);

        if (exception instanceof BindException) {
            BindException be = (BindException) exception;
            Map<String, String> errorMsg = be.getBindingResult().getFieldErrors().stream()
                    .collect(toMap(FieldError::getField, FieldError::getDefaultMessage));
            return ResultJson.badRequest("参数错误", errorMsg);
        }
        if (exception instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException manve = (MethodArgumentNotValidException) exception;
            Map<String, String> errorMsg = manve.getBindingResult().getFieldErrors().stream()
                    .collect(toMap(FieldError::getField, FieldError::getDefaultMessage));
            return ResultJson.badRequest("参数错误", errorMsg);
        }
        if (exception instanceof MissingPathVariableException) {
            MissingPathVariableException mpve = (MissingPathVariableException) exception;
            return ResultJson.badRequest("缺少路径参数" + mpve.getVariableName());
        }
        if (exception instanceof ServletRequestBindingException) {
            return ResultJson.badRequest("参数错误", exception.getMessage());
        }
        if (exception instanceof HttpMessageNotReadableException) {
            return ResultJson.badRequest("Json参数读取错误", exception.getMessage());
        }
        if (exception instanceof ConstraintViolationException) {
            return ResultJson.badRequest("参数校验错误", exception.getMessage());
        }
        if (exception instanceof org.springframework.web.servlet.NoHandlerFoundException) {
            return ResultJson.badRequest(HttpStatus.NOT_FOUND.value(), exception.getMessage());
        }
        if (exception instanceof BusinessException) {
            BusinessException be = (BusinessException) exception;
            return ResultJson.badRequest(be.getCode(), be.getMessage());
        } else {
            response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
            return ResultJson.badRequest(500, "系统错误");
        }
    }

}
