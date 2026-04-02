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

public class AuthResponse_getRefreshToken_15658989192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6003;

    public AuthResponse_getRefreshToken_15658989192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6003 = newInstance(Class.forName("com.lyubenblagoev.postfixrest.service.model.AuthResponse"));
        Object term6028 = newInstance(Class.forName("java.util.Date"));
        setField(term6003, term6003.getClass(), "token", "EwQBhZjCIT");
        setField(term6003, term6003.getClass(), "refreshToken", "aSkmSwTnEw");
        setLongField(term6028, term6028.getClass(), "fastTime", 1755788577674L);
        setField(term6028, term6028.getClass(), "cdate", null);
        setField(term6003, term6003.getClass(), "refreshTokenExpirationDate", term6028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.lyubenblagoev.postfixrest.service.model.AuthResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRefreshToken", argTypes, term6003, args);
    }

};


