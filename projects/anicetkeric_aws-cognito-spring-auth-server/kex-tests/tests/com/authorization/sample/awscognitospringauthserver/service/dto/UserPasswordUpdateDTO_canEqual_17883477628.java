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

public class UserPasswordUpdateDTO_canEqual_17883477628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4398;
     Object term4459;

    public UserPasswordUpdateDTO_canEqual_17883477628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4398 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO"));
        setField(term4398, term4398.getClass(), "password", "lCyLIcSuom");
        setField(term4398, term4398.getClass(), "passwordConfirm", "CGOpQSZZwI");
        setField(term4398, term4398.getClass(), "sessionId", "ypEdrstygY");
        setField(term4398, term4398.getClass(), "username", "sNQFlATEeQ");
        setField(term4398, term4398.getClass(), "challengeType", "ZKMLioamsY");
        term4459 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4459;
        callMethod(klass, "canEqual", argTypes, term4398, args);
    }

};


