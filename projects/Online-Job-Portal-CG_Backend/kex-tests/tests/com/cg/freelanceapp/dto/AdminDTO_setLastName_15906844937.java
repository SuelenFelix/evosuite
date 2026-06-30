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

public class AdminDTO_setLastName_15906844937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7034;

    public AdminDTO_setLastName_15906844937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7034 = newInstance(Class.forName("com.cg.freelanceapp.dto.AdminDTO"));
        setField(term7034, term7034.getClass(), "userName", "wBGfLpNNiZ");
        setField(term7034, term7034.getClass(), "firstName", "yUGCjlqgJE");
        setField(term7034, term7034.getClass(), "lastName", "PXdVZyoJyC");
        setField(term7034, term7034.getClass(), "password", "vLerpqavFM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cg.freelanceapp.dto.AdminDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qnvxzwuGKX";
        callMethod(klass, "setLastName", argTypes, term7034, args);
    }

};


