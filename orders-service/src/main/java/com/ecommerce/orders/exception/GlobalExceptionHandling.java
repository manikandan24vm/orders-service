package com.ecommerce.orders.exception;

import com.ecommerce.orders.dto.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandling {
    @ExceptionHandler(OrderNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handleOrderNotFoundException(OrderNotFoundException orderNotFoundException, WebRequest webRequest) {

        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                LocalDateTime.now(),
                orderNotFoundException.getMessage()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(PaymentNotFoundException.class)
    public ResponseEntity<ErrorResponseDTO> handlePaymentNotFoundException(PaymentNotFoundException exception,WebRequest webRequest){
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                LocalDateTime.now(),
                exception.getMessage()
        );
        return new ResponseEntity<>(errorResponseDTO,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(OrdersException.class)
    public ResponseEntity<ErrorResponseDTO> handleOrdersException(OrdersException ordersException,WebRequest webRequest){
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                LocalDateTime.now(),
                ordersException.getMessage()
        );
        return  new ResponseEntity<>(errorResponseDTO,HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(PaymentException.class)
    public ResponseEntity<ErrorResponseDTO> handlePaymentException(PaymentException paymentException,WebRequest webRequest){
        ErrorResponseDTO errorResponseDTO = new ErrorResponseDTO(
                webRequest.getDescription(false),
                HttpStatus.BAD_REQUEST,
                LocalDateTime.now(),
                paymentException.getMessage()
        );
        return  new ResponseEntity<>(errorResponseDTO,HttpStatus.BAD_REQUEST);
    }


}
