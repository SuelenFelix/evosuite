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

public class UpdateUserResponse_setLastName_7766318423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3769;

    public UpdateUserResponse_setLastName_7766318423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term3770 = new Long(-316468845751588286L);
        term3769 = newInstance(Class.forName("com.alkemy.ong.infrastructure.rest.response.user.UpdateUserResponse"));
        setField(term3769, term3769.getClass(), "id", term3770);
        setField(term3769, term3769.getClass(), "firstName", "XYtryyobou");
        setField(term3769, term3769.getClass(), "lastName", "OYbzXylRWW");
        setField(term3769, term3769.getClass(), "imageUrl", "DSNsTGYXDF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.alkemy.ong.infrastructure.rest.response.user.UpdateUserResponse");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sQvGcVjdEx";
        callMethod(klass, "setLastName", argTypes, term3769, args);
    }

};


