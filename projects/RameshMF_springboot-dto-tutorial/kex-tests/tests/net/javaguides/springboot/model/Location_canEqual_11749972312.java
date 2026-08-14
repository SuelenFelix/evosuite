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

public class Location_canEqual_11749972312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3106;
     Object term3134;

    public Location_canEqual_11749972312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3106 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term3106, term3106.getClass(), "id", -4443169559037975007L);
        setField(term3106, term3106.getClass(), "place", "xJgPlLxpgC");
        setField(term3106, term3106.getClass(), "description", "EYtfuJaxiM");
        setDoubleField(term3106, term3106.getClass(), "longitude", 0.3227335400819148);
        setDoubleField(term3106, term3106.getClass(), "latitude", 0.43337207054070237);
        term3134 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3134;
        callMethod(klass, "canEqual", argTypes, term3106, args);
    }

};


