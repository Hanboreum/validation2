package com.example.validation2.annotation;

import com.example.validation2.validator.YearMonthValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import jakarta.validation.constraints.NotBlank;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@NotBlank
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = {YearMonthValidator.class})
public @interface YearMonth {

    String message() default "날짜 양식에 맞지 않음 ex)20201210";
    String pattern() default  "yyyyMMdd";
    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
