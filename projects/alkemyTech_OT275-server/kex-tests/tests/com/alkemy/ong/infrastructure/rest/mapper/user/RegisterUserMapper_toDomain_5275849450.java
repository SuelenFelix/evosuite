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

public class RegisterUserMapper_toDomain_5275849450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1378;

    public RegisterUserMapper_toDomain_5275849450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1378 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.user.RegisterUserRequest"));
        setField(term1378, term1378.getClass(), "firstName", "JDaAnsVTGV");
        setField(term1378, term1378.getClass(), "lastName", "mLUZFTfjle");
        setField(term1378, term1378.getClass(), "email", "xIeFjkHkOe");
        setField(term1378, term1378.getClass(), "password", "SdCKLMIYnX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.mapper.user.RegisterUserMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.alkemy.ong.infrastructure.rest.request.user.RegisterUserRequest");
        Object[] args = new Object[1];
        args[0] = term1378;
        callMethod(klass, "toDomain", argTypes, null, args);
    }

};


