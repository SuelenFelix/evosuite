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

public class UserCredential_getUsername_103537090619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4984;

    public UserCredential_getUsername_103537090619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4984 = newInstance(Class.forName("com.selimhorri.app.pack.models.entities.UserCredential"));
        setField(term4984, term4984.getClass(), "id", null);
        setField(term4984, term4984.getClass(), "username", null);
        setField(term4984, term4984.getClass(), "password", null);
        setField(term4984, term4984.getClass(), "enabled", null);
        setField(term4984, term4984.getClass(), "email", null);
        setField(term4984, term4984.getClass(), "phone", null);
        setField(term4984, term4984.getClass(), "role", null);
        setField(term4984, term4984.getClass(), "employee", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.selimhorri.app.pack.models.entities.UserCredential");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUsername", argTypes, term4984, args);
    }

};


