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

public class TimeSeriesRunner_init_11478344330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69;

    public TimeSeriesRunner_init_11478344330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term70 = new HashMap();
        Integer term90 = new Integer(-1339778481);
        Integer term92 = new Integer(1725571209);
        Integer term94 = new Integer(-522618178);
        ArrayList term88 = new ArrayList();
        ((ArrayList) term88).add(term90);
        ((ArrayList) term88).add(term92);
        ((ArrayList) term88).add(term94);
        term69 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term80 = newInstance(Class.forName("java.util.TreeMap"));
        Object term81 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term82 = newInstance(Class.forName("java.time.Instant"));
        setField(term69, term69.getClass(), "stats", term70);
        setLongField(term69, term69.getClass(), "startTime", -8257434502486459194L);
        setField(term80, term80.getClass(), "comparator", null);
        setLongField(term82, term82.getClass(), "seconds", 1610940182L);
        setIntField(term82, term82.getClass(), "nanos", 830000000);
        setField(term81, term81.getClass(), "key", term82);
        setField(term81, term81.getClass(), "value", null);
        setField(term81, term81.getClass(), "left", null);
        setField(term81, term81.getClass(), "right", null);
        setField(term81, term81.getClass(), "parent", null);
        setBooleanField(term81, term81.getClass(), "color", true);
        setField(term80, term80.getClass(), "root", term81);
        setIntField(term80, term80.getClass(), "size", 1);
        setIntField(term80, term80.getClass(), "modCount", 1);
        setField(term80, term80.getClass(), "entrySet", null);
        setField(term80, term80.getClass(), "navigableKeySet", null);
        setField(term80, term80.getClass(), "descendingMap", null);
        setField(term80, term80.getClass(), "keySet", null);
        setField(term80, term80.getClass(), "values", null);
        setField(term69, term69.getClass(), "reports", term80);
        setField(term69, term69.getClass(), "percentiles", term88);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.TimeSeriesRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.schambon.loadsimrunner.WorkloadManager");
        argTypes[1] = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term69;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


