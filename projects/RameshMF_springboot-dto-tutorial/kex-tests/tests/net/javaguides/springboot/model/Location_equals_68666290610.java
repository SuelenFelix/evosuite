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

public class Location_equals_68666290610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3053;
     Object term3081;

    public Location_equals_68666290610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3053 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3053, term3053.getClass(), "id", 4044358158040652353L);
        setField(term3053, term3053.getClass(), "place", "OJJtVNPyKZ");
        setField(term3053, term3053.getClass(), "description", "AKNapTAfmD");
        setDoubleField(term3053, term3053.getClass(), "longitude", 0.7919370314903882);
        setDoubleField(term3053, term3053.getClass(), "latitude", 0.2109867221632754);
        term3081 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3081;
        callMethod(klass, "equals", argTypes, term3053, args);
    }

};


