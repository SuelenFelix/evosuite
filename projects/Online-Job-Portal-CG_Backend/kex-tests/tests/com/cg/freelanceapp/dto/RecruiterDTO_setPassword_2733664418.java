package com.cg.freelanceapp.dto;

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
import static com.cg.freelanceapp.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RecruiterDTO_setPassword_2733664418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17099;

    public RecruiterDTO_setPassword_2733664418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17099 = newInstance(Class.forName("com.cg.freelanceapp.dto.RecruiterDTO"));
        setField(term17099, term17099.getClass(), "userName", "tvxYdqiyGc");
        setField(term17099, term17099.getClass(), "firstName", "ZEXFoMSKeG");
        setField(term17099, term17099.getClass(), "lastName", "HvxahUfZcJ");
        setField(term17099, term17099.getClass(), "password", "WkLpmqoQxy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.RecruiterDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XiNoscmYhd";
        callMethod(klass, "setPassword", argTypes, term17099, args);
    }

};


