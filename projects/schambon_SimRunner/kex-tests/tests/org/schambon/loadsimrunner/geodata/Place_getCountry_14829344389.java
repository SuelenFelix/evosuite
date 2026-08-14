package org.schambon.loadsimrunner.geodata;

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
import static org.schambon.loadsimrunner.geodata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Place_getCountry_14829344389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250;

    public Place_getCountry_14829344389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250 = newInstance(Class.forName("org.schambon.loadsimrunner.geodata.Place"));
        setDoubleField(term250, term250.getClass(), "longitude", 0.0);
        setDoubleField(term250, term250.getClass(), "latitude", 0.0);
        setField(term250, term250.getClass(), "name", null);
        setField(term250, term250.getClass(), "country", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.geodata.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCountry", argTypes, term250, args);
    }

};


