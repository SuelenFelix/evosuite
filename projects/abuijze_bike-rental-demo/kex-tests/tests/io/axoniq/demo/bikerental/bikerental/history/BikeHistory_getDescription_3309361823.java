package io.axoniq.demo.bikerental.bikerental.history;

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
import static io.axoniq.demo.bikerental.bikerental.history.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class BikeHistory_getDescription_3309361823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117;

    public BikeHistory_getDescription_3309361823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term118 = new Long(6375119433582206027L);
        term117 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory"));
        setField(term117, term117.getClass(), "id", term118);
        setField(term117, term117.getClass(), "bikeId", "EGtDIRbSSb");
        setField(term117, term117.getClass(), "description", "SzjVpOQTyS");
        setField(term117, term117.getClass(), "timestamp", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term117, args);
    }

};


