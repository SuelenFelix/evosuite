package com.alkemy.ong.infrastructure.rest.response.user;

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
import static com.alkemy.ong.infrastructure.rest.response.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class GetUserDetailsResponse_getRole_1611221012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1356;

    public GetUserDetailsResponse_getRole_1611221012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1357 = new Long(-4325723315152823407L);
        term1356 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse"));
        setField(term1356, term1356.getClass(), "id", term1357);
        setField(term1356, term1356.getClass(), "firstName", "ieCtQFdkii");
        setField(term1356, term1356.getClass(), "lastName", "dEnhdmILtU");
        setField(term1356, term1356.getClass(), "email", "hoicvmsovO");
        setField(term1356, term1356.getClass(), "imageUrl", "eqJfYWRaEL");
        setField(term1356, term1356.getClass(), "role", "fhkbdRViHi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRole", argTypes, term1356, args);
    }

};


