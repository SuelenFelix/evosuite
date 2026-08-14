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

public class Location_setId_6503541875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2763;
     Object term2791;

    public Location_setId_6503541875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2763 = newInstance(Class.forName("net.javaguides.springboot.model.Location"));
        setLongField(term2763, term2763.getClass(), "id", -2068172595987555756L);
        setField(term2763, term2763.getClass(), "place", "pORebkoRdD");
        setField(term2763, term2763.getClass(), "description", "mXGCWJDOqA");
        setDoubleField(term2763, term2763.getClass(), "longitude", 0.8823181080774973);
        setDoubleField(term2763, term2763.getClass(), "latitude", 0.2192450926212024);
        term2791 = new Long(-6292278961887936280L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("net.javaguides.springboot.model.Location");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term2791;
        callMethod(klass, "setId", argTypes, term2763, args);
    }

};


