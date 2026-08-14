package com.cos.blog.test;

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
import static com.cos.blog.test.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Member_getUsername_20950548818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1175;

    public Member_getUsername_20950548818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1175 = newInstance(Class.forName("com.cos.blog.test.Member"));
        setIntField(term1175, term1175.getClass(), "id", 0);
        setField(term1175, term1175.getClass(), "username", null);
        setField(term1175, term1175.getClass(), "password", null);
        setField(term1175, term1175.getClass(), "email", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.test.Member");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term1175, args);
    }

};


