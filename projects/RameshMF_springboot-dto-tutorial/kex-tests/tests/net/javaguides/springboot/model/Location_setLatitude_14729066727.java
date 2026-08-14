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
import java.lang.Double;

public class Location_setLatitude_14729066727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3345;
     Object term3349;

    public Location_setLatitude_14729066727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3345 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3345, term3345.getClass(), "id", 0L);
        setField(term3345, term3345.getClass(), "place", null);
        setField(term3345, term3345.getClass(), "description", null);
        setDoubleField(term3345, term3345.getClass(), "longitude", 0.0);
        setDoubleField(term3345, term3345.getClass(), "latitude", 0.0);
        term3349 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term3349;
        callMethod(klass, "setLatitude", argTypes, term3345, args);
    }

};


