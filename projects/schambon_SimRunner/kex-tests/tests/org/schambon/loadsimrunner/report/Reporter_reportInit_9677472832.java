package org.schambon.loadsimrunner.report;

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
import static org.schambon.loadsimrunner.report.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;

public class Reporter_reportInit_9677472832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60;

    public Reporter_reportInit_9677472832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term61 = new HashMap();
        ArrayList term79 = new ArrayList();
        term60 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term71 = newInstance(Class.forName("java.util.TreeMap"));
        Object term72 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term73 = newInstance(Class.forName("java.time.Instant"));
        setField(term60, term60.getClass(), "stats", term61);
        setLongField(term60, term60.getClass(), "startTime", 6375119433582206027L);
        setField(term71, term71.getClass(), "comparator", null);
        setLongField(term73, term73.getClass(), "seconds", 1480438351L);
        setIntField(term73, term73.getClass(), "nanos", 369000000);
        setField(term72, term72.getClass(), "key", term73);
        setField(term72, term72.getClass(), "value", null);
        setField(term72, term72.getClass(), "left", null);
        setField(term72, term72.getClass(), "right", null);
        setField(term72, term72.getClass(), "parent", null);
        setBooleanField(term72, term72.getClass(), "color", true);
        setField(term71, term71.getClass(), "root", term72);
        setIntField(term71, term71.getClass(), "size", 1);
        setIntField(term71, term71.getClass(), "modCount", 1);
        setField(term71, term71.getClass(), "entrySet", null);
        setField(term71, term71.getClass(), "navigableKeySet", null);
        setField(term71, term71.getClass(), "descendingMap", null);
        setField(term71, term71.getClass(), "keySet", null);
        setField(term71, term71.getClass(), "values", null);
        setField(term60, term60.getClass(), "reports", term71);
        setField(term60, term60.getClass(), "percentiles", term79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "reportInit", argTypes, term60, args);
    }

};


