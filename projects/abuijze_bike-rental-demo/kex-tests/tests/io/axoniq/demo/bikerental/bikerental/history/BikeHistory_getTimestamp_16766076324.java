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

public class BikeHistory_getTimestamp_16766076324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186;

    public BikeHistory_getTimestamp_16766076324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term187 = new Long(-8257434502486459194L);
        term186 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory"));
        setField(term186, term186.getClass(), "id", term187);
        setField(term186, term186.getClass(), "bikeId", "hRNSzYYIrc");
        setField(term186, term186.getClass(), "description", "RMFIsYGgne");
        setField(term186, term186.getClass(), "timestamp", "NRdvgJlhkX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimestamp", argTypes, term186, args);
    }

};


