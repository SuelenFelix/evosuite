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
import java.lang.Integer;
import java.util.LinkedList;

public class Reporter_computeReport_18994466613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term105;
     Object term136;

    public Reporter_computeReport_18994466613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term106 = new HashMap();
        Integer term126 = new Integer(1585847225);
        Integer term128 = new Integer(597278769);
        Integer term130 = new Integer(-1685132342);
        Integer term132 = new Integer(-1456670397);
        ArrayList term124 = new ArrayList();
        ((ArrayList) term124).add(term126);
        ((ArrayList) term124).add(term128);
        ((ArrayList) term124).add(term130);
        ((ArrayList) term124).add(term132);
        term105 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term116 = newInstance(Class.forName("java.util.TreeMap"));
        Object term117 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term118 = newInstance(Class.forName("java.time.Instant"));
        setField(term105, term105.getClass(), "stats", term106);
        setLongField(term105, term105.getClass(), "startTime", -8257434502486459194L);
        setField(term116, term116.getClass(), "comparator", null);
        setLongField(term118, term118.getClass(), "seconds", 1610940182L);
        setIntField(term118, term118.getClass(), "nanos", 830000000);
        setField(term117, term117.getClass(), "key", term118);
        setField(term117, term117.getClass(), "value", null);
        setField(term117, term117.getClass(), "left", null);
        setField(term117, term117.getClass(), "right", null);
        setField(term117, term117.getClass(), "parent", null);
        setBooleanField(term117, term117.getClass(), "color", true);
        setField(term116, term116.getClass(), "root", term117);
        setIntField(term116, term116.getClass(), "size", 1);
        setIntField(term116, term116.getClass(), "modCount", 1);
        setField(term116, term116.getClass(), "entrySet", null);
        setField(term116, term116.getClass(), "navigableKeySet", null);
        setField(term116, term116.getClass(), "descendingMap", null);
        setField(term116, term116.getClass(), "keySet", null);
        setField(term116, term116.getClass(), "values", null);
        setField(term105, term105.getClass(), "reports", term116);
        setField(term105, term105.getClass(), "percentiles", term124);
        term136 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term136;
        callMethod(klass, "computeReport", argTypes, term105, args);
    }

};


