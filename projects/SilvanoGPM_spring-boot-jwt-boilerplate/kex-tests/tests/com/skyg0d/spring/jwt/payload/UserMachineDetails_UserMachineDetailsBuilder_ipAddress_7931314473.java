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

public class UserMachineDetails_UserMachineDetailsBuilder_ipAddress_7931314473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7576;

    public UserMachineDetails_UserMachineDetailsBuilder_ipAddress_7931314473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7576 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.UserMachineDetails$UserMachineDetailsBuilder"));
        setField(term7576, term7576.getClass(), "browser", "RCOqfVsRHt");
        setField(term7576, term7576.getClass(), "operatingSystem", "TSyCeEZPaT");
        setField(term7576, term7576.getClass(), "ipAddress", "JeZFtaqkzW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.UserMachineDetails$UserMachineDetailsBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vOVuNSCCLe";
        callMethod(klass, "ipAddress", argTypes, term7576, args);
    }

};


