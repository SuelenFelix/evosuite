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

public class UserSignUpDTO_setLastname_132421225931 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2821;

    public UserSignUpDTO_setLastname_132421225931() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2821 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO"));
        setField(term2821, term2821.getClass(), "email", null);
        setField(term2821, term2821.getClass(), "password", null);
        setField(term2821, term2821.getClass(), "name", null);
        setField(term2821, term2821.getClass(), "nationality", null);
        setField(term2821, term2821.getClass(), "lastname", null);
        setField(term2821, term2821.getClass(), "phoneNumber", null);
        setField(term2821, term2821.getClass(), "roles", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserSignUpDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastname", argTypes, term2821, args);
    }

};


