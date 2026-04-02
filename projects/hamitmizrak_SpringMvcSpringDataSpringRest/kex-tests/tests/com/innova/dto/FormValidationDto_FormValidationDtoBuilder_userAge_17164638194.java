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
import java.lang.Integer;

public class FormValidationDto_FormValidationDtoBuilder_userAge_17164638194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term337;
     Object term387;

    public FormValidationDto_FormValidationDtoBuilder_userAge_17164638194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term337 = newInstance(Class.forName("com.innova.dto.FormValidationDto$FormValidationDtoBuilder"));
        setField(term337, term337.getClass(), "userName", "aJlieCFVtF");
        setField(term337, term337.getClass(), "userSurname", "ZiaGIbnzTs");
        setField(term337, term337.getClass(), "emailAddress", "tbcdzjIfER");
        setIntField(term337, term337.getClass(), "userAge", 391863371);
        setField(term337, term337.getClass(), "userMessage", "HyxfbSQYBe");
        term387 = new Integer(-1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.innova.dto.FormValidationDto$FormValidationDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term387;
        callMethod(klass, "userAge", argTypes, term337, args);
    }

};


