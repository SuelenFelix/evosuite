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

public class Place_getName_7830702153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term143;

    public Place_getName_7830702153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term143 = newInstance(Class.forName("org.schambon.loadsimrunner.geodata.Place"));
        setDoubleField(term143, term143.getClass(), "longitude", 0.2641345529914265);
        setDoubleField(term143, term143.getClass(), "latitude", 0.36923381893433327);
        setField(term143, term143.getClass(), "name", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "country", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.geodata.Place");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term143, args);
    }

};


