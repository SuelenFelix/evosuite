package com.authorization.sample.awscognitospringauthserver.web.response;

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
import static com.authorization.sample.awscognitospringauthserver.web.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class AuthenticatedResponse_setIdToken_93891495722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2312;

    public AuthenticatedResponse_setIdToken_93891495722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2312 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.web.response.AuthenticatedResponse"));
        setField(term2312, term2312.getClass(), "username", null);
        setField(term2312, term2312.getClass(), "accessToken", null);
        setField(term2312, term2312.getClass(), "idToken", null);
        setField(term2312, term2312.getClass(), "refreshToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.web.response.AuthenticatedResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setIdToken", argTypes, term2312, args);
    }

};


