package com.alkemy.ong.infrastructure.rest.response.common;

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
import static com.alkemy.ong.infrastructure.rest.response.common.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ErrorResponse_setMessage_12832104816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2159;

    public ErrorResponse_setMessage_12832104816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2159 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse"));
        setIntField(term2159, term2159.getClass(), "statusCode", 0);
        setField(term2159, term2159.getClass(), "message", null);
        setField(term2159, term2159.getClass(), "moreInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.common.ErrorResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMessage", argTypes, term2159, args);
    }

};


