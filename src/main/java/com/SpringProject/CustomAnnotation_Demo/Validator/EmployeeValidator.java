package com.SpringProject.CustomAnnotation_Demo.Validator;

import com.SpringProject.CustomAnnotation_Demo.Validation.AddressValidation;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.w3c.dom.stylesheets.LinkStyle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class EmployeeValidator implements ConstraintValidator<AddressValidation,String> {
    List<String> address= Arrays.asList("Delhi","Ranchi","UK");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context)
    {
        return address.contains(value);
    }
}
