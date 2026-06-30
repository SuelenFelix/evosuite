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

public class AuthenticatedResponse_AuthenticatedResponseBuilder_idToken_14531539263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385;

    public AuthenticatedResponse_AuthenticatedResponseBuilder_idToken_14531539263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385 = newInstance(Class.forName("com.authorization.sample.awscognitospringauthserver.web.response.AuthenticatedResponse$AuthenticatedResponseBuilder"));
        setField(term385, term385.getClass(), "username", "ZiaGIbnzTs");
        setField(term385, term385.getClass(), "accessToken", "tbcdzjIfER");
        setField(term385, term385.getClass(), "idToken", "HyxfbSQYBe");
        setField(term385, term385.getClass(), "refreshToken", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.authorization.sample.awscognitospringauthserver.web.response.AuthenticatedResponse$AuthenticatedResponseBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "idToken", argTypes, term385, args);
    }

};


