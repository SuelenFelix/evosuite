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

public class UserPasswordUpdateDTO_getPassword_374698712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3687;

    public UserPasswordUpdateDTO_getPassword_374698712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3687 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO"));
        setField(term3687, term3687.getClass(), "password", "NzBMMhkhpT");
        setField(term3687, term3687.getClass(), "passwordConfirm", "qCpEbQDHdF");
        setField(term3687, term3687.getClass(), "sessionId", "AHbZyFOmlo");
        setField(term3687, term3687.getClass(), "username", "TwfWVQGiIj");
        setField(term3687, term3687.getClass(), "challengeType", "gUvcueTURF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.UserPasswordUpdateDTO");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPassword", argTypes, term3687, args);
    }

};


