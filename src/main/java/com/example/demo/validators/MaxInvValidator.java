package com.example.demo.validators;

import com.example.demo.domain.Part;

import org.springframework.beans.factory.annotation.Autowired;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import org.springframework.context.ApplicationContext;

public class MaxInvValidator implements ConstraintValidator<ValidMaxInv, Part> {
    @Autowired
    private ApplicationContext context;

    public static ApplicationContext myContext;

    @Override
    public void initialize(ValidMaxInv constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        if (context == null) return true;
        if (context != null) myContext = context;

        boolean isValid;
        //System.out.println("Inside of MinInvValidator. isValid is " + isValid);

        if(part.getId() != 0) {
            if(part.getInv() > part.getMaxInv()) {
                //System.out.println("if statement/ return false");
                isValid = false;
            } else {
                //System.out.println("else statement/ return true");
                isValid = true;
            }
        } else {
            isValid = true;
        }

        if (!isValid) {
            constraintValidatorContext.disableDefaultConstraintViolation();
            constraintValidatorContext.buildConstraintViolationWithTemplate(constraintValidatorContext.getDefaultConstraintMessageTemplate())
                    .addPropertyNode( "maxInv" ).addConstraintViolation();

        }
        return isValid;
    }
}
