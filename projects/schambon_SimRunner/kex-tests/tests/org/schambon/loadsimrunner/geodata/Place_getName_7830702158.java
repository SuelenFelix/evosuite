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

public class Place_getName_7830702158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247;

    public Place_getName_7830702158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term247 = newInstance(Class.forName("org.schambon.loadsimrunner.geodata.Place"));
        setDoubleField(term247, term247.getClass(), "longitude", 0.0);
        setDoubleField(term247, term247.getClass(), "latitude", 0.0);
        setField(term247, term247.getClass(), "name", null);
        setField(term247, term247.getClass(), "country", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.geodata.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term247, args);
    }

};


