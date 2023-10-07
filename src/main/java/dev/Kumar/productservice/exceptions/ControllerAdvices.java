package dev.kumar.productservice.exceptions;

import dev.kumar.productservice.dtos.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerAdvices {
//    @ExceptionHandler(NotFoundException.class)
//    private ResponseEntity<NotFoundException> handleNotFoundException(NotFoundException e){
//        return new ResponseEntity(
//                new ExceptionDto(HttpStatus.NOT_FOUND,e.getMessage()),
//                HttpStatus.NOT_FOUND
//        );
//    }
}
