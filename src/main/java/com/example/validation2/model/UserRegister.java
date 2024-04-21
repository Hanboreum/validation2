package com.example.validation2.model;

import com.example.validation2.annotation.YearMonth;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

//2
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRegister {

    // @NotBlank
    private String name;

    @NotNull
    @Min(1)
    @Max(100)
    private int age;

    private String tel;

    @YearMonth(pattern = "yyyy-MM-dd")
    private String birthYearMonthDay;

    @AssertTrue(message = "이름은 공백일 수 없습니다. ")
    public boolean isNameCheck(){
        if(Objects.nonNull(name) && ! name.isBlank()){
            return true;
        }
        return  false;
    }
}
