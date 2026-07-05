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

public class GetUserDetailsResponse_setRole_173598877819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1474;

    public GetUserDetailsResponse_setRole_173598877819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1474 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse"));
        setField(term1474, term1474.getClass(), "id", null);
        setField(term1474, term1474.getClass(), "firstName", null);
        setField(term1474, term1474.getClass(), "lastName", null);
        setField(term1474, term1474.getClass(), "email", null);
        setField(term1474, term1474.getClass(), "imageUrl", null);
        setField(term1474, term1474.getClass(), "role", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserDetailsResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setRole", argTypes, term1474, args);
    }

};


