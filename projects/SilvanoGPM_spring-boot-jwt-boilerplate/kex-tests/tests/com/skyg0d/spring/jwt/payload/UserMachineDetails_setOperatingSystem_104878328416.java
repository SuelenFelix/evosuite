package com.skyg0d.spring.jwt.payload;

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
import static com.skyg0d.spring.jwt.payload.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserMachineDetails_setOperatingSystem_104878328416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7168;

    public UserMachineDetails_setOperatingSystem_104878328416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7168 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.UserMachineDetails"));
        setField(term7168, term7168.getClass(), "browser", null);
        setField(term7168, term7168.getClass(), "operatingSystem", null);
        setField(term7168, term7168.getClass(), "ipAddress", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.UserMachineDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOperatingSystem", argTypes, term7168, args);
    }

};


