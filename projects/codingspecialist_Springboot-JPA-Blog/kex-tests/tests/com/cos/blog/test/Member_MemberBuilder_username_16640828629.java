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

public class Member_MemberBuilder_username_16640828629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1691;

    public Member_MemberBuilder_username_16640828629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1691 = newInstance(Class.forName("com.cos.blog.test.Member$MemberBuilder"));
        setIntField(term1691, term1691.getClass(), "id", 0);
        setField(term1691, term1691.getClass(), "username", null);
        setField(term1691, term1691.getClass(), "password", null);
        setField(term1691, term1691.getClass(), "email", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.test.Member$MemberBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "username", argTypes, term1691, args);
    }

};


