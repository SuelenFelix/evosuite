package io.axoniq.demo.bikerental.bikerental.query;

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
import static io.axoniq.demo.bikerental.bikerental.query.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BikeStatus_getLocation_61946164711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646;

    public BikeStatus_getLocation_61946164711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term646 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.query.BikeStatus"));
        setField(term646, term646.getClass(), "bikeId", null);
        setField(term646, term646.getClass(), "bikeType", null);
        setField(term646, term646.getClass(), "location", null);
        setField(term646, term646.getClass(), "renter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.query.BikeStatus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocation", argTypes, term646, args);
    }

};


