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

public class GetUserResponse_getEmail_15490574129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5134;

    public GetUserResponse_getEmail_15490574129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5135 = new Long(4178434741742309755L);
        term5134 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term5134, term5134.getClass(), "id", term5135);
        setField(term5134, term5134.getClass(), "firstName", "sNQFlATEeQ");
        setField(term5134, term5134.getClass(), "lastName", "ZKMLioamsY");
        setField(term5134, term5134.getClass(), "email", "WVbxuoDBcn");
        setField(term5134, term5134.getClass(), "role", "pvDEABOxLt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmail", argTypes, term5134, args);
    }

};


