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

public class AggregationRunner_init_10295437210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public AggregationRunner_init_10295437210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        Integer term22 = new Integer(568599855);
        Integer term24 = new Integer(1162663216);
        Integer term26 = new Integer(1484323161);
        Integer term28 = new Integer(391863371);
        Integer term30 = new Integer(-1922583790);
        ArrayList term20 = new ArrayList();
        ((ArrayList) term20).add(term22);
        ((ArrayList) term20).add(term24);
        ((ArrayList) term20).add(term26);
        ((ArrayList) term20).add(term28);
        ((ArrayList) term20).add(term30);
        term1 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term12 = newInstance(Class.forName("java.util.TreeMap"));
        Object term13 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term14 = newInstance(Class.forName("java.time.Instant"));
        setField(term1, term1.getClass(), "stats", term2);
        setLongField(term1, term1.getClass(), "startTime", 2442117782898005296L);
        setField(term12, term12.getClass(), "comparator", null);
        setLongField(term14, term14.getClass(), "seconds", 1345871412L);
        setIntField(term14, term14.getClass(), "nanos", 244000000);
        setField(term13, term13.getClass(), "key", term14);
        setField(term13, term13.getClass(), "value", null);
        setField(term13, term13.getClass(), "left", null);
        setField(term13, term13.getClass(), "right", null);
        setField(term13, term13.getClass(), "parent", null);
        setBooleanField(term13, term13.getClass(), "color", true);
        setField(term12, term12.getClass(), "root", term13);
        setIntField(term12, term12.getClass(), "size", 1);
        setIntField(term12, term12.getClass(), "modCount", 1);
        setField(term12, term12.getClass(), "entrySet", null);
        setField(term12, term12.getClass(), "navigableKeySet", null);
        setField(term12, term12.getClass(), "descendingMap", null);
        setField(term12, term12.getClass(), "keySet", null);
        setField(term12, term12.getClass(), "values", null);
        setField(term1, term1.getClass(), "reports", term12);
        setField(term1, term1.getClass(), "percentiles", term20);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.AggregationRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.schambon.loadsimrunner.WorkloadManager");
        argTypes[1] = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


