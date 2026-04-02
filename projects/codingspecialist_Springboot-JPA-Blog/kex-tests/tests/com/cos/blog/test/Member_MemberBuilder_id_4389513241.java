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
import java.lang.Integer;

public class Member_MemberBuilder_id_4389513241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1211;
     Object term1249;

    public Member_MemberBuilder_id_4389513241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1211 = newInstance(Class.forName("com.cos.blog.test.Member$MemberBuilder"));
        setIntField(term1211, term1211.getClass(), "id", 1622346318);
        setField(term1211, term1211.getClass(), "username", "UiUYnPrcCi");
        setField(term1211, term1211.getClass(), "password", "UoYtihxVaS");
        setField(term1211, term1211.getClass(), "email", "JDswTTCZHV");
        term1249 = new Integer(1048535127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.cos.blog.test.Member$MemberBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1249;
        callMethod(klass, "id", argTypes, term1211, args);
    }

};


