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

public class UserMachineDetails_setIpAddress_16942783858 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7074;

    public UserMachineDetails_setIpAddress_16942783858() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7074 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.UserMachineDetails"));
        setField(term7074, term7074.getClass(), "browser", "aQFUvuaYxd");
        setField(term7074, term7074.getClass(), "operatingSystem", "zNFLXMifnS");
        setField(term7074, term7074.getClass(), "ipAddress", "HHQcYMSBVc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.UserMachineDetails");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wdoqITnaAP";
        callMethod(klass, "setIpAddress", argTypes, term7074, args);
    }

};


