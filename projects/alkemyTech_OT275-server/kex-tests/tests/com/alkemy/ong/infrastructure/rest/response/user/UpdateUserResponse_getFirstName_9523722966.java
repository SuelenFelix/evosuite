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

public class UpdateUserResponse_getFirstName_9523722966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4020;

    public UpdateUserResponse_getFirstName_9523722966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4021 = new Long(-4920224193275732920L);
        term4020 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.UpdateUserResponse"));
        setField(term4020, term4020.getClass(), "id", term4021);
        setField(term4020, term4020.getClass(), "firstName", "jXzmYyrnnT");
        setField(term4020, term4020.getClass(), "lastName", "igCAtimmYB");
        setField(term4020, term4020.getClass(), "imageUrl", "DyiXbeYIaN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.UpdateUserResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstName", argTypes, term4020, args);
    }

};


