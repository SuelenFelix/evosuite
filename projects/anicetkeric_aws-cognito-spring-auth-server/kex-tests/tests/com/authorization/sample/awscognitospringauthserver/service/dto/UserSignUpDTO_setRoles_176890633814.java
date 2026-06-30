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

public class UserSignUpDTO_setRoles_176890633814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2066;
     Object term2150;

    public UserSignUpDTO_setRoles_176890633814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2140 = new HashMap();
        Set<Object> term2216 =  ((Map) term2140).keySet();
        HashSet term2139 = new HashSet((Collection<? extends Object>) term2216);
        term2066 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term2066, term2066.getClass(), "email", "ZzIujlwVsw");
        setField(term2066, term2066.getClass(), "password", "LWyEaeIyAo");
        setField(term2066, term2066.getClass(), "name", "yVMkkQhvmN");
        setField(term2066, term2066.getClass(), "nationality", "mvrkADEgpp");
        setField(term2066, term2066.getClass(), "lastname", "pXOkjyeIRb");
        setField(term2066, term2066.getClass(), "phoneNumber", "GgZWSjxjyE");
        setField(term2066, term2066.getClass(), "roles", term2139);
        HashMap term2151 = new HashMap();
        Set<Object> term2217 =  ((Map) term2151).keySet();
        term2150 = new HashSet((Collection<? extends Object>) term2217);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Set");
        Object[] args = new Object[1];
        args[0] = term2150;
        callMethod(klass, "setRoles", argTypes, term2066, args);
    }

};


