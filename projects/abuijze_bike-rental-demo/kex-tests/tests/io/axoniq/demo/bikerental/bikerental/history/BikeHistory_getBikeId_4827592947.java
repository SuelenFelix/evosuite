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

public class BikeHistory_getBikeId_4827592947 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255;

    public BikeHistory_getBikeId_4827592947() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term255 = newInstance(Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory"));
        setField(term255, term255.getClass(), "id", null);
        setField(term255, term255.getClass(), "bikeId", null);
        setField(term255, term255.getClass(), "description", null);
        setField(term255, term255.getClass(), "timestamp", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.axoniq.demo.bikerental.bikerental.history.BikeHistory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBikeId", argTypes, term255, args);
    }

};


