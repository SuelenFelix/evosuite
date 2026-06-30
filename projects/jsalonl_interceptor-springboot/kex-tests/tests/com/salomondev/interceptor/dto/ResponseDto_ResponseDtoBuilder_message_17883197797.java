package com.salomondev.interceptor.dto;

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
import static com.salomondev.interceptor.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResponseDto_ResponseDtoBuilder_message_17883197797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term960;

    public ResponseDto_ResponseDtoBuilder_message_17883197797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term960 = newInstance(Class.forName("com.salomondev.interceptor.dto.ResponseDto$ResponseDtoBuilder"));
        setField(term960, term960.getClass(), "code", null);
        setField(term960, term960.getClass(), "message", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.salomondev.interceptor.dto.ResponseDto$ResponseDtoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "message", argTypes, term960, args);
    }

};


