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

public class AuthenticatedChallengeDTO_canEqual_13065013579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3365;
     Object term3402;

    public AuthenticatedChallengeDTO_canEqual_13065013579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3365 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.AuthenticatedChallengeDTO"));
        setField(term3365, term3365.getClass(), "sessionId", "hOncybyCAH");
        setField(term3365, term3365.getClass(), "username", "QduALnDSVo");
        setField(term3365, term3365.getClass(), "challengeType", "izPpKDErnQ");
        term3402 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.service.dto.AuthenticatedChallengeDTO");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3402;
        callMethod(klass, "canEqual", argTypes, term3365, args);
    }

};


