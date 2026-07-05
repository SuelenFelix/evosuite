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

public class GetUserResponse_setRole_3457205465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4748;

    public GetUserResponse_setRole_3457205465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4749 = new Long(6617340557564669657L);
        term4748 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse"));
        setField(term4748, term4748.getClass(), "id", term4749);
        setField(term4748, term4748.getClass(), "firstName", "WBAOTqErtm");
        setField(term4748, term4748.getClass(), "lastName", "PqtVXXZMqK");
        setField(term4748, term4748.getClass(), "email", "rYbtIDVdnd");
        setField(term4748, term4748.getClass(), "role", "UKAReurpHG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.GetUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WVRMUmrljA";
        callMethod(klass, "setRole", argTypes, term4748, args);
    }

};


