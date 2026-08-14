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

public class Member_MemberBuilder_toString_8255987016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1619;

    public Member_MemberBuilder_toString_8255987016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1619 = newInstance(Class.forName("com.cos.blog.test.Member$MemberBuilder"));
        setIntField(term1619, term1619.getClass(), "id", -1007160944);
        setField(term1619, term1619.getClass(), "username", "bLPjGVBhlX");
        setField(term1619, term1619.getClass(), "password", "whBvTVIIlC");
        setField(term1619, term1619.getClass(), "email", "IgRJUzaCwW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.test.Member$MemberBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1619, args);
    }

};


