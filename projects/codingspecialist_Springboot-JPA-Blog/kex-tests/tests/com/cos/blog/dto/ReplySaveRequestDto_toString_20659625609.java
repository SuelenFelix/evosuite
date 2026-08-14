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

public class ReplySaveRequestDto_toString_20659625609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254;

    public ReplySaveRequestDto_toString_20659625609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term254 = newInstance(Class.forName("com.cos.blog.dto.ReplySaveRequestDto"));
        setIntField(term254, term254.getClass(), "userId", -655067527);
        setIntField(term254, term254.getClass(), "boardId", -6029667);
        setField(term254, term254.getClass(), "content", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.dto.ReplySaveRequestDto");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term254, args);
    }

};


