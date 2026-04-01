package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Main_main_399888581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190614;

    public Main_main_399888581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190614 = (Object[]) newArray("java.lang.String", 6);
        setElement(term190614, 0, "zMsSLTfGhl");
        setElement(term190614, 1, "bEmHScVZaQ");
        setElement(term190614, 2, "TcuXODkzBV");
        setElement(term190614, 3, "coJPjrBZNe");
        setElement(term190614, 4, "vMsWjuPTnO");
        setElement(term190614, 5, "zHvfKaOstO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Main");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term190614;
        callMethod(klass, "main", argTypes, null, args);
    }

};


