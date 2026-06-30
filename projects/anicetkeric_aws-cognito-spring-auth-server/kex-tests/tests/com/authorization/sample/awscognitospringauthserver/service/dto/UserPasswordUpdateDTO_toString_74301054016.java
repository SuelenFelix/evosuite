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

public class UserPasswordUpdateDTO_toString_74301054016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4625;

    public UserPasswordUpdateDTO_toString_74301054016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4625 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO"));
        setField(term4625, term4625.getClass(), "password", null);
        setField(term4625, term4625.getClass(), "passwordConfirm", null);
        setField(term4625, term4625.getClass(), "sessionId", null);
        setField(term4625, term4625.getClass(), "username", null);
        setField(term4625, term4625.getClass(), "challengeType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4625, args);
    }

};


