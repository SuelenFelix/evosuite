package com.alkemy.ong.infrastructure.rest.mapper.user;

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
import static com.alkemy.ong.infrastructure.rest.mapper.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class RegisterUserMapper_toResponse_15902506901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1467;

    public RegisterUserMapper_toResponse_15902506901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1468 = new Long(6855071767938501807L);
        Long term1531 = new Long(-5892135042702373494L);
        term1467 = newInstance(Class.forName("com.alkemy.ong.domain.User"));
        Object term1530 = newInstance(Class.forName("com.alkemy.ong.domain.Role"));
        setField(term1467, term1467.getClass(), "id", term1468);
        setField(term1467, term1467.getClass(), "firstName", "OJJtVNPyKZ");
        setField(term1467, term1467.getClass(), "lastName", "AKNapTAfmD");
        setField(term1467, term1467.getClass(), "email", "xJgPlLxpgC");
        setField(term1467, term1467.getClass(), "password", "EYtfuJaxiM");
        setField(term1467, term1467.getClass(), "imageUrl", "gCWtLVKVVe");
        setField(term1530, term1530.getClass(), "id", term1531);
        setField(term1530, term1530.getClass(), "name", "fWKJoSoCwE");
        setField(term1530, term1530.getClass(), "description", "wfaXBpWAUH");
        setField(term1467, term1467.getClass(), "role", term1530);
        setField(term1467, term1467.getClass(), "token", "VMeAzAHwZj");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.RegisterUserMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.domain.User");
        Object[] args = new Object[1];
        args[0] = term1467;
        callMethod(klass, "toResponse", argTypes, null, args);
    }

};


