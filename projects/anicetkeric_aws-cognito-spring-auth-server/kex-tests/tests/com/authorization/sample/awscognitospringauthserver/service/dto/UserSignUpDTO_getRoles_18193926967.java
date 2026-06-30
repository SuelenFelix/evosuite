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

public class UserSignUpDTO_getRoles_18193926967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term889;

    public UserSignUpDTO_getRoles_18193926967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term963 = new HashMap();
        Set<Object> term1033 =  ((Map) term963).keySet();
        HashSet term962 = new HashSet((Collection<? extends Object>) term1033);
        term889 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term889, term889.getClass(), "email", "nHXjMycHlU");
        setField(term889, term889.getClass(), "password", "ieCtQFdkii");
        setField(term889, term889.getClass(), "name", "dEnhdmILtU");
        setField(term889, term889.getClass(), "nationality", "hoicvmsovO");
        setField(term889, term889.getClass(), "lastname", "eqJfYWRaEL");
        setField(term889, term889.getClass(), "phoneNumber", "fhkbdRViHi");
        setField(term889, term889.getClass(), "roles", term962);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRoles", argTypes, term889, args);
    }

};


