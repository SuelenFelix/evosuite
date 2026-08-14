package net.javaguides.springboot.model;

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
import static net.javaguides.springboot.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Location_getLongitude_14450796621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3317;

    public Location_getLongitude_14450796621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3317 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3317, term3317.getClass(), "id", 0L);
        setField(term3317, term3317.getClass(), "place", null);
        setField(term3317, term3317.getClass(), "description", null);
        setDoubleField(term3317, term3317.getClass(), "longitude", 0.0);
        setDoubleField(term3317, term3317.getClass(), "latitude", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLongitude", argTypes, term3317, args);
    }

};


