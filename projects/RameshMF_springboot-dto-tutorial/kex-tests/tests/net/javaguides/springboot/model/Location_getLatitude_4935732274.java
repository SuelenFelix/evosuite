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

public class Location_getLatitude_4935732274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2715;

    public Location_getLatitude_4935732274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2715 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2715, term2715.getClass(), "id", 4178434741742309755L);
        setField(term2715, term2715.getClass(), "place", "iNwOJRBEjp");
        setField(term2715, term2715.getClass(), "description", "XylxrMBraH");
        setDoubleField(term2715, term2715.getClass(), "longitude", 0.25937345430928016);
        setDoubleField(term2715, term2715.getClass(), "latitude", 0.5873228247510078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLatitude", argTypes, term2715, args);
    }

};


