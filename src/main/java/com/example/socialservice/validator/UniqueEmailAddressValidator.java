package com.example.socialservice.validator;

import com.example.socialservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueEmailAddressValidator implements ConstraintValidator<UniqueEmailAddress, String> {

    @Autowired
    UserService userService;


    @Override
    public void initialize(UniqueEmailAddress constraintAnnotation) {

    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        return !userService.emailExist(email);
    }
}
