package com.prac.react.model.dto;

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
import static com.prac.react.model.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FrontMember_setMemberHash_11598638143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8844;

    public FrontMember_setMemberHash_11598638143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8844 = newInstance(Class.forName("com.prac.react.model.dto.FrontMember"));
        setField(term8844, term8844.getClass(), "memberHash", "qUtkFGMNUV");
        setField(term8844, term8844.getClass(), "memberName", "mGRiYhnMcR");
        setField(term8844, term8844.getClass(), "pfUrl", "NFlvfJCVPO");
        setField(term8844, term8844.getClass(), "mgHash", "KarbTXFmUU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.prac.react.model.dto.FrontMember");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jiUSjqwSIQ";
        callMethod(klass, "setMemberHash", argTypes, term8844, args);
    }

};


