package org.schambon.loadsimrunner.runner;

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
import static org.schambon.loadsimrunner.runner.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class InsertRunner_init_9091137160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public InsertRunner_init_9091137160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term36 = new HashMap();
        Integer term56 = new Integer(-616727354);
        Integer term58 = new Integer(-1955890973);
        Integer term60 = new Integer(-2038273078);
        Integer term62 = new Integer(1227103734);
        ArrayList term54 = new ArrayList();
        ((ArrayList) term54).add(term56);
        ((ArrayList) term54).add(term58);
        ((ArrayList) term54).add(term60);
        ((ArrayList) term54).add(term62);
        term35 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term46 = newInstance(Class.forName("java.util.TreeMap"));
        Object term47 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term48 = newInstance(Class.forName("java.time.Instant"));
        setField(term35, term35.getClass(), "stats", term36);
        setLongField(term35, term35.getClass(), "startTime", 6375119433582206027L);
        setField(term46, term46.getClass(), "comparator", null);
        setLongField(term48, term48.getClass(), "seconds", 1480438351L);
        setIntField(term48, term48.getClass(), "nanos", 369000000);
        setField(term47, term47.getClass(), "key", term48);
        setField(term47, term47.getClass(), "value", null);
        setField(term47, term47.getClass(), "left", null);
        setField(term47, term47.getClass(), "right", null);
        setField(term47, term47.getClass(), "parent", null);
        setBooleanField(term47, term47.getClass(), "color", true);
        setField(term46, term46.getClass(), "root", term47);
        setIntField(term46, term46.getClass(), "size", 1);
        setIntField(term46, term46.getClass(), "modCount", 1);
        setField(term46, term46.getClass(), "entrySet", null);
        setField(term46, term46.getClass(), "navigableKeySet", null);
        setField(term46, term46.getClass(), "descendingMap", null);
        setField(term46, term46.getClass(), "keySet", null);
        setField(term46, term46.getClass(), "values", null);
        setField(term35, term35.getClass(), "reports", term46);
        setField(term35, term35.getClass(), "percentiles", term54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.InsertRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.schambon.loadsimrunner.WorkloadManager");
        argTypes[1] = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term35;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


