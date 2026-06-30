package com.authorization.sample.awscognitospringauthserver.service.dto;

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
import static com.authorization.sample.awscognitospringauthserver.service.dto.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class UserSignUpDTO_equals_104730387515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2218;
     Object term2302;

    public UserSignUpDTO_equals_104730387515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2292 = new HashMap();
        Set<Object> term2363 =  ((Map) term2292).keySet();
        HashSet term2291 = new HashSet((Collection<? extends Object>) term2363);
        term2218 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term2218, term2218.getClass(), "email", "FPvxVzzSvD");
        setField(term2218, term2218.getClass(), "password", "WHcwFgsGFC");
        setField(term2218, term2218.getClass(), "name", "HzqpegHiRq");
        setField(term2218, term2218.getClass(), "nationality", "jwsfVjMoJT");
        setField(term2218, term2218.getClass(), "lastname", "ZfdXfCCFDf");
        setField(term2218, term2218.getClass(), "phoneNumber", "MwwjNtdOFT");
        setField(term2218, term2218.getClass(), "roles", term2291);
        term2302 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2302;
        callMethod(klass, "equals", argTypes, term2218, args);
    }

};


