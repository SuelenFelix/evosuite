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

public class AuthenticatedChallengeDTO_equals_21106639867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3296;
     Object term3333;

    public AuthenticatedChallengeDTO_equals_21106639867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3296 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.AuthenticatedChallengeDTO"));
        setField(term3296, term3296.getClass(), "sessionId", "AZdLeSugwv");
        setField(term3296, term3296.getClass(), "username", "RMsXuyzKJV");
        setField(term3296, term3296.getClass(), "challengeType", "FwPbDZcHmB");
        term3333 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.AuthenticatedChallengeDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3333;
        callMethod(klass, "equals", argTypes, term3296, args);
    }

};


