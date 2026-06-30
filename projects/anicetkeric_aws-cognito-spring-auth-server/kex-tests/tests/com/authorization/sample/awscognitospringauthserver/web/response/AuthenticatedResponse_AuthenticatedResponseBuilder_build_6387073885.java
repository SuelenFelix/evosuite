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

public class AuthenticatedResponse_AuthenticatedResponseBuilder_build_6387073885 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;

    public AuthenticatedResponse_AuthenticatedResponseBuilder_build_6387073885() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term607 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.web.response.AuthenticatedResponse$AuthenticatedResponseBuilder"));
        setField(term607, term607.getClass(), "username", "flxyYxBRtu");
        setField(term607, term607.getClass(), "accessToken", "OclPbYPkcH");
        setField(term607, term607.getClass(), "idToken", "IoAlmYsBwc");
        setField(term607, term607.getClass(), "refreshToken", "TEParAifyi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.web.response.AuthenticatedResponse$AuthenticatedResponseBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term607, args);
    }

};


