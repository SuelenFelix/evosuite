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

public class UserMachineDetails_UserMachineDetailsBuilder_build_7806426604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7665;

    public UserMachineDetails_UserMachineDetailsBuilder_build_7806426604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7665 = newInstance(Class.forName("com.skyg0d.spring.jwt.payload.UserMachineDetails$UserMachineDetailsBuilder"));
        setField(term7665, term7665.getClass(), "browser", "fzeqPnzpnt");
        setField(term7665, term7665.getClass(), "operatingSystem", "RxbhrFBjkO");
        setField(term7665, term7665.getClass(), "ipAddress", "aanyiAOJCl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.skyg0d.spring.jwt.payload.UserMachineDetails$UserMachineDetailsBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term7665, args);
    }

};


