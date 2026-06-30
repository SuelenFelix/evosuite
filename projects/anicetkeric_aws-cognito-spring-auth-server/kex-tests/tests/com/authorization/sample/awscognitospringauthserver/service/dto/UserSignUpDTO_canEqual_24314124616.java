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

public class UserSignUpDTO_canEqual_24314124616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2364;
     Object term2454;

    public UserSignUpDTO_canEqual_24314124616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2438 = new HashMap();
        Set<Object> term2515 =  ((Map) term2438).keySet();
        HashSet term2437 = new HashSet((Collection<? extends Object>) term2515);
        term2364 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term2364, term2364.getClass(), "email", "aNWLJdrZMq");
        setField(term2364, term2364.getClass(), "password", "HHmNoYxIGj");
        setField(term2364, term2364.getClass(), "name", "PtirvZmsGt");
        setField(term2364, term2364.getClass(), "nationality", "HWkpTmtlrc");
        setField(term2364, term2364.getClass(), "lastname", "hMmaoREuCK");
        setField(term2364, term2364.getClass(), "phoneNumber", "VeDtgDzGAN");
        setField(term2364, term2364.getClass(), "roles", term2437);
        term2454 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term2454;
        callMethod(klass, "canEqual", argTypes, term2364, args);
    }

};


