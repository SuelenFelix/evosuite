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

public class Location_setLongitude_125830935424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4308;
     Object term4312;

    public Location_setLongitude_125830935424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4308 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term4308, term4308.getClass(), "id", 0L);
        setField(term4308, term4308.getClass(), "place", null);
        setField(term4308, term4308.getClass(), "description", null);
        setDoubleField(term4308, term4308.getClass(), "longitude", 0.0);
        setDoubleField(term4308, term4308.getClass(), "latitude", 0.0);
        term4312 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term4312;
        callMethod(klass, "setLongitude", argTypes, term4308, args);
    }

};


