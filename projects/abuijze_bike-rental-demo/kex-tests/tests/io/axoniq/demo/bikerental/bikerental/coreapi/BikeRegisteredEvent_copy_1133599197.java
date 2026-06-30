package io.axoniq.demo.bikerental.bikerental.coreapi;

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
import static io.axoniq.demo.bikerental.bikerental.coreapi.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BikeRegisteredEvent_copy_1133599197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3110;

    public BikeRegisteredEvent_copy_1133599197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3110 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRegisteredEvent"));
        setField(term3110, term3110.getClass(), "bikeId", "VMeAzAHwZj");
        setField(term3110, term3110.getClass(), "bikeType", "PznxWXsZME");
        setField(term3110, term3110.getClass(), "location", "ZzIujlwVsw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.coreapi.BikeRegisteredEvent");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "LWyEaeIyAo";
        args[1] = "yVMkkQhvmN";
        args[2] = "mvrkADEgpp";
        callMethod(klass, "copy", argTypes, term3110, args);
    }

};


