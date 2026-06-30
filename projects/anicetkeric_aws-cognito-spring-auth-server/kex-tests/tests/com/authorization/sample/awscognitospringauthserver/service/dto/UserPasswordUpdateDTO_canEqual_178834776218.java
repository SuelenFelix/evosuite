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

public class UserPasswordUpdateDTO_canEqual_178834776218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4627;

    public UserPasswordUpdateDTO_canEqual_178834776218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4627 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO"));
        setField(term4627, term4627.getClass(), "password", null);
        setField(term4627, term4627.getClass(), "passwordConfirm", null);
        setField(term4627, term4627.getClass(), "sessionId", null);
        setField(term4627, term4627.getClass(), "username", null);
        setField(term4627, term4627.getClass(), "challengeType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term4627, args);
    }

};


