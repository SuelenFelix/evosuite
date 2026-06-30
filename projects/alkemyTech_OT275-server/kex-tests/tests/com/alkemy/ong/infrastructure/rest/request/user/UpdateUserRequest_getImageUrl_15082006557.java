package com.alkemy.ong.infrastructure.rest.request.user;

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
import static com.alkemy.ong.infrastructure.rest.request.user.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UpdateUserRequest_getImageUrl_15082006557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623;

    public UpdateUserRequest_getImageUrl_15082006557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.request.user.UpdateUserRequest"));
        setField(term623, term623.getClass(), "firstName", "IoAlmYsBwc");
        setField(term623, term623.getClass(), "lastName", "TEParAifyi");
        setField(term623, term623.getClass(), "imageUrl", "OWDIEULEFu");
        setField(term623, term623.getClass(), "password", "dWRymuLBtr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.request.user.UpdateUserRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImageUrl", argTypes, term623, args);
    }

};


