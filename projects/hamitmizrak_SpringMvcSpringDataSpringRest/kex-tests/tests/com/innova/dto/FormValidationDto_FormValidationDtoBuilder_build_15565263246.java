package com.innova.dto;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.innova.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FormValidationDto_FormValidationDtoBuilder_build_15565263246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541;

    public FormValidationDto_FormValidationDtoBuilder_build_15565263246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541 = newInstance(Class.forName("com.innova.dto.FormValidationDto$FormValidationDtoBuilder"));
        setField(term541, term541.getClass(), "userName", "BYqFIqCKAV");
        setField(term541, term541.getClass(), "userSurname", "vrQLuWIDJX");
        setField(term541, term541.getClass(), "emailAddress", "flxyYxBRtu");
        setIntField(term541, term541.getClass(), "userAge", -1955890973);
        setField(term541, term541.getClass(), "userMessage", "OclPbYPkcH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.FormValidationDto$FormValidationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term541, args);
    }

};


