package com.cos.blog.dto;

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
import static com.cos.blog.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ResponseDto_ResponseDtoBuilder_build_20656213703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350;

    public ResponseDto_ResponseDtoBuilder_build_20656213703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350 = newInstance(Class.forName("com.cos.blog.dto.ResponseDto$ResponseDtoBuilder"));
        setIntField(term350, term350.getClass(), "status", 865208305);
        setField(term350, term350.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.dto.ResponseDto$ResponseDtoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term350, args);
    }

};


