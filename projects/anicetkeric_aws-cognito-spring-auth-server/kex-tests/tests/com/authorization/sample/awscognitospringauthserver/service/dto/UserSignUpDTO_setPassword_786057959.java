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

public class UserSignUpDTO_setPassword_786057959 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1207;

    public UserSignUpDTO_setPassword_786057959() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1281 = new HashMap();
        Set<Object> term1371 =  ((Map) term1281).keySet();
        HashSet term1280 = new HashSet((Collection<? extends Object>) term1371);
        term1207 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term1207, term1207.getClass(), "email", "idgaQsnJpQ");
        setField(term1207, term1207.getClass(), "password", "VgZnGoIFwQ");
        setField(term1207, term1207.getClass(), "name", "jUbSRrkrYZ");
        setField(term1207, term1207.getClass(), "nationality", "bWWfajKbEX");
        setField(term1207, term1207.getClass(), "lastname", "cAPeiZHKGJ");
        setField(term1207, term1207.getClass(), "phoneNumber", "LvJFtLBaxj");
        setField(term1207, term1207.getClass(), "roles", term1280);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JqXGgAhZPl";
        callMethod(klass, "setPassword", argTypes, term1207, args);
    }

};


