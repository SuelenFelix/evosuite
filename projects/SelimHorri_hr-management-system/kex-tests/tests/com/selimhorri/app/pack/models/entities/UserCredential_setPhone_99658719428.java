package com.selimhorri.app.pack.models.entities;

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
import static com.selimhorri.app.pack.models.entities.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserCredential_setPhone_99658719428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4993;

    public UserCredential_setPhone_99658719428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4993 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term4993, term4993.getClass(), "id", null);
        setField(term4993, term4993.getClass(), "username", null);
        setField(term4993, term4993.getClass(), "password", null);
        setField(term4993, term4993.getClass(), "enabled", null);
        setField(term4993, term4993.getClass(), "email", null);
        setField(term4993, term4993.getClass(), "phone", null);
        setField(term4993, term4993.getClass(), "role", null);
        setField(term4993, term4993.getClass(), "employee", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPhone", argTypes, term4993, args);
    }

};


