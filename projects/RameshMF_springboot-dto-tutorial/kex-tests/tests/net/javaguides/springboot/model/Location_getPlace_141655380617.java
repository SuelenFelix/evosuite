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

public class Location_getPlace_141655380617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4278;

    public Location_getPlace_141655380617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4278 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term4278, term4278.getClass(), "id", 0L);
        setField(term4278, term4278.getClass(), "place", null);
        setField(term4278, term4278.getClass(), "description", null);
        setDoubleField(term4278, term4278.getClass(), "longitude", 0.0);
        setDoubleField(term4278, term4278.getClass(), "latitude", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlace", argTypes, term4278, args);
    }

};


