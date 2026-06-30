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

public class UserPasswordUpdateDTO_setPasswordConfirm_8447588955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4042;

    public UserPasswordUpdateDTO_setPasswordConfirm_8447588955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4042 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO"));
        setField(term4042, term4042.getClass(), "password", "iIRsCSYqXH");
        setField(term4042, term4042.getClass(), "passwordConfirm", "nghfqDXyCG");
        setField(term4042, term4042.getClass(), "sessionId", "WBAOTqErtm");
        setField(term4042, term4042.getClass(), "username", "PqtVXXZMqK");
        setField(term4042, term4042.getClass(), "challengeType", "rYbtIDVdnd");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UKAReurpHG";
        callMethod(klass, "setPasswordConfirm", argTypes, term4042, args);
    }

};


