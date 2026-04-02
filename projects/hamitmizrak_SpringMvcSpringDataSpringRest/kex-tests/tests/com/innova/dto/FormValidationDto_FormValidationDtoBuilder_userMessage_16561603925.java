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

public class FormValidationDto_FormValidationDtoBuilder_userMessage_16561603925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;

    public FormValidationDto_FormValidationDtoBuilder_userMessage_16561603925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429 = newInstance(Class.forName("com.innova.dto.FormValidationDto$FormValidationDtoBuilder"));
        setField(term429, term429.getClass(), "userName", "pCTimMblYc");
        setField(term429, term429.getClass(), "userSurname", "hNxWaHcfhY");
        setField(term429, term429.getClass(), "emailAddress", "RkybSrpybU");
        setIntField(term429, term429.getClass(), "userAge", -616727354);
        setField(term429, term429.getClass(), "userMessage", "xOEqzGAmDU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.FormValidationDto$FormValidationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eZFUvlxvGV";
        callMethod(klass, "userMessage", argTypes, term429, args);
    }

};


