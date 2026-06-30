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

public class FormValidationDto_FormValidationDtoBuilder_emailAddress_5534393723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;

    public FormValidationDto_FormValidationDtoBuilder_emailAddress_5534393723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term225 = newInstance(Class.forName("com.innova.dto.FormValidationDto$FormValidationDtoBuilder"));
        setField(term225, term225.getClass(), "userName", "NRdvgJlhkX");
        setField(term225, term225.getClass(), "userSurname", "uuaPigETmJ");
        setField(term225, term225.getClass(), "emailAddress", "MxlszYVzRf");
        setIntField(term225, term225.getClass(), "userAge", 1484323161);
        setField(term225, term225.getClass(), "userMessage", "LQFpaHEwXR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.FormValidationDto$FormValidationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "emailAddress", argTypes, term225, args);
    }

};


