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

public class Location_getPlace_14165538061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2571;

    public Location_getPlace_14165538061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2571 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2571, term2571.getClass(), "id", 1439298019805881866L);
        setField(term2571, term2571.getClass(), "place", "eVpkWxjuki");
        setField(term2571, term2571.getClass(), "description", "SJiQaLvSKv");
        setDoubleField(term2571, term2571.getClass(), "longitude", 0.5279279537140873);
        setDoubleField(term2571, term2571.getClass(), "latitude", 0.3202192021706908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlace", argTypes, term2571, args);
    }

};


