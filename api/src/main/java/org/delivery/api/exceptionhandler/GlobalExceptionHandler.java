package org.delivery.api.exceptionhandler;


import lombok.extern.slf4j.Slf4j;
import org.delivery.api.common.api.Api;
import org.delivery.api.common.error.ErrorCode;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@Order(value = Integer.MAX_VALUE) // 글로벌로 하기위해 order값 값이 낮을수록 우선순위 높음 높을수록 우선순위 맨 뒤
@ResponseStatus
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<Api<Object>> exception(Exception e){
        log.error("",e);
        return ResponseEntity.status(500).body(Api.ERROR(ErrorCode.SERVER_ERROR));
    }
}
