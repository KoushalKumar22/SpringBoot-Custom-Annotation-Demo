package com.SpringProject.CustomAnnotation_Demo.Validation;

import com.SpringProject.CustomAnnotation_Demo.Validator.EmployeeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {EmployeeValidator.class})
public @interface AddressValidation {
    String message() default "Fill the Correct City Name";
    Class<?>[] group() default {};
    Class<? extends Payload>[] payload() default {};
}
