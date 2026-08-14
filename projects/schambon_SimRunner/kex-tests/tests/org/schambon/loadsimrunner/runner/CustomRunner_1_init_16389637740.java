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

public class CustomRunner_1_init_16389637740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086;

    public CustomRunner_1_init_16389637740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1087 = new HashMap();
        Integer term1107 = new Integer(-1456670397);
        Integer term1109 = new Integer(1622346318);
        Integer term1111 = new Integer(1048535127);
        Integer term1113 = new Integer(-655067527);
        Integer term1115 = new Integer(-6029667);
        Integer term1117 = new Integer(-2068769794);
        Integer term1119 = new Integer(-117576464);
        Integer term1121 = new Integer(-1007160944);
        Integer term1123 = new Integer(1135664017);
        ArrayList term1105 = new ArrayList();
        ((ArrayList) term1105).add(term1107);
        ((ArrayList) term1105).add(term1109);
        ((ArrayList) term1105).add(term1111);
        ((ArrayList) term1105).add(term1113);
        ((ArrayList) term1105).add(term1115);
        ((ArrayList) term1105).add(term1117);
        ((ArrayList) term1105).add(term1119);
        ((ArrayList) term1105).add(term1121);
        ((ArrayList) term1105).add(term1123);
        term1086 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term1097 = newInstance(Class.forName("java.util.TreeMap"));
        Object term1098 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term1099 = newInstance(Class.forName("java.time.Instant"));
        setField(term1086, term1086.getClass(), "stats", term1087);
        setLongField(term1086, term1086.getClass(), "startTime", 5127676408959197577L);
        setField(term1097, term1097.getClass(), "comparator", null);
        setLongField(term1099, term1099.getClass(), "seconds", 1515890130L);
        setIntField(term1099, term1099.getClass(), "nanos", 18000000);
        setField(term1098, term1098.getClass(), "key", term1099);
        setField(term1098, term1098.getClass(), "value", null);
        setField(term1098, term1098.getClass(), "left", null);
        setField(term1098, term1098.getClass(), "right", null);
        setField(term1098, term1098.getClass(), "parent", null);
        setBooleanField(term1098, term1098.getClass(), "color", true);
        setField(term1097, term1097.getClass(), "root", term1098);
        setIntField(term1097, term1097.getClass(), "size", 1);
        setIntField(term1097, term1097.getClass(), "modCount", 1);
        setField(term1097, term1097.getClass(), "entrySet", null);
        setField(term1097, term1097.getClass(), "navigableKeySet", null);
        setField(term1097, term1097.getClass(), "descendingMap", null);
        setField(term1097, term1097.getClass(), "keySet", null);
        setField(term1097, term1097.getClass(), "values", null);
        setField(term1086, term1086.getClass(), "reports", term1097);
        setField(term1086, term1086.getClass(), "percentiles", term1105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.CustomRunner$1");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.schambon.loadsimrunner.runner.CustomRunner");
        argTypes[1] = Class.forName("org.schambon.loadsimrunner.WorkloadManager");
        argTypes[2] = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term1086;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


