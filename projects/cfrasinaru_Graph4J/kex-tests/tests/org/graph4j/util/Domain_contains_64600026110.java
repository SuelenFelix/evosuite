package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Domain_contains_64600026110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10016;
     Object term10036;

    public Domain_contains_64600026110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10016 = newInstance(Class.forName("org.graph4j.util.Domain"));
        int[] term10018 = (int[]) newIntArray(6);
        int[] term10025 = (int[]) newIntArray(9);
        setIntField(term10016, term10016.getClass(), "vertex", -1077451707);
        setIntElement(term10018, 0, -580180892);
        setIntElement(term10018, 1, 862135498);
        setIntElement(term10018, 2, -1640521852);
        setIntElement(term10018, 3, 1999560627);
        setIntElement(term10018, 4, 93344937);
        setIntElement(term10018, 5, 1426545044);
        setField(term10016, term10016.getClass(), "values", term10018);
        setIntElement(term10025, 0, -2114135536);
        setIntElement(term10025, 1, -1934156754);
        setIntElement(term10025, 2, -2122545415);
        setIntElement(term10025, 3, 45477597);
        setIntElement(term10025, 4, 702851889);
        setIntElement(term10025, 5, 2035373298);
        setIntElement(term10025, 6, 1328311779);
        setIntElement(term10025, 7, -1459351662);
        setIntElement(term10025, 8, -887392605);
        setField(term10016, term10016.getClass(), "positions", term10025);
        setIntField(term10016, term10016.getClass(), "size", 1813573586);
        term10036 = new Integer(-1950105121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Domain");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10036;
        callMethod(klass, "contains", argTypes, term10016, args);
    }

};


