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

public class CustomRunner_init_6198064200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98;

    public CustomRunner_init_6198064200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term99 = new HashMap();
        Integer term119 = new Integer(1134449235);
        Integer term121 = new Integer(-883034806);
        Integer term123 = new Integer(1585847225);
        Integer term125 = new Integer(597278769);
        ArrayList term117 = new ArrayList();
        ((ArrayList) term117).add(term119);
        ((ArrayList) term117).add(term121);
        ((ArrayList) term117).add(term123);
        ((ArrayList) term117).add(term125);
        term98 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term109 = newInstance(Class.forName("java.util.TreeMap"));
        Object term110 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term111 = newInstance(Class.forName("java.time.Instant"));
        setField(term98, term98.getClass(), "stats", term99);
        setLongField(term98, term98.getClass(), "startTime", -8400487765614892086L);
        setField(term109, term109.getClass(), "comparator", null);
        setLongField(term111, term111.getClass(), "seconds", 1606045635L);
        setIntField(term111, term111.getClass(), "nanos", 837000000);
        setField(term110, term110.getClass(), "key", term111);
        setField(term110, term110.getClass(), "value", null);
        setField(term110, term110.getClass(), "left", null);
        setField(term110, term110.getClass(), "right", null);
        setField(term110, term110.getClass(), "parent", null);
        setBooleanField(term110, term110.getClass(), "color", true);
        setField(term109, term109.getClass(), "root", term110);
        setIntField(term109, term109.getClass(), "size", 1);
        setIntField(term109, term109.getClass(), "modCount", 1);
        setField(term109, term109.getClass(), "entrySet", null);
        setField(term109, term109.getClass(), "navigableKeySet", null);
        setField(term109, term109.getClass(), "descendingMap", null);
        setField(term109, term109.getClass(), "keySet", null);
        setField(term109, term109.getClass(), "values", null);
        setField(term98, term98.getClass(), "reports", term109);
        setField(term98, term98.getClass(), "percentiles", term117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.runner.CustomRunner");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.schambon.loadsimrunner.WorkloadManager");
        argTypes[1] = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term98;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


