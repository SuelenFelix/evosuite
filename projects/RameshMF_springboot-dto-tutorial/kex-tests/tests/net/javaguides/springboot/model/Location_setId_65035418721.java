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
import java.lang.Long;

public class Location_setId_65035418721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4294;
     Object term4298;

    public Location_setId_65035418721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4294 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term4294, term4294.getClass(), "id", 0L);
        setField(term4294, term4294.getClass(), "place", null);
        setField(term4294, term4294.getClass(), "description", null);
        setDoubleField(term4294, term4294.getClass(), "longitude", 0.0);
        setDoubleField(term4294, term4294.getClass(), "latitude", 0.0);
        term4298 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term4298;
        callMethod(klass, "setId", argTypes, term4294, args);
    }

};


