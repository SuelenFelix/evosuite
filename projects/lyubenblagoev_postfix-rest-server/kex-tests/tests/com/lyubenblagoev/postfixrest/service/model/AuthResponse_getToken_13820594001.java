package com.lyubenblagoev.postfixrest.service.model;

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
import static com.lyubenblagoev.postfixrest.service.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class AuthResponse_getToken_13820594001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5956;

    public AuthResponse_getToken_13820594001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5956 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AuthResponse"));
        Object term5981 = newInstance(Class.forName("java.util.Date"));
        setField(term5956, term5956.getClass(), "token", "TwfWVQGiIj");
        setField(term5956, term5956.getClass(), "refreshToken", "gUvcueTURF");
        setLongField(term5981, term5981.getClass(), "fastTime", 1496476439025L);
        setField(term5981, term5981.getClass(), "cdate", null);
        setField(term5956, term5956.getClass(), "refreshTokenExpirationDate", term5981);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AuthResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getToken", argTypes, term5956, args);
    }

};


