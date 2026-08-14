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

public class Reporter_start_12709940301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19;

    public Reporter_start_12709940301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20 = new HashMap();
        Integer term40 = new Integer(-616727354);
        Integer term42 = new Integer(-1955890973);
        Integer term44 = new Integer(-2038273078);
        Integer term46 = new Integer(1227103734);
        Integer term48 = new Integer(-1339778481);
        Integer term50 = new Integer(1725571209);
        Integer term52 = new Integer(-522618178);
        Integer term54 = new Integer(1134449235);
        Integer term56 = new Integer(-883034806);
        ArrayList term38 = new ArrayList();
        ((ArrayList) term38).add(term40);
        ((ArrayList) term38).add(term42);
        ((ArrayList) term38).add(term44);
        ((ArrayList) term38).add(term46);
        ((ArrayList) term38).add(term48);
        ((ArrayList) term38).add(term50);
        ((ArrayList) term38).add(term52);
        ((ArrayList) term38).add(term54);
        ((ArrayList) term38).add(term56);
        term19 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term30 = newInstance(Class.forName("java.util.TreeMap"));
        Object term31 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term32 = newInstance(Class.forName("java.time.Instant"));
        setField(term19, term19.getClass(), "stats", term20);
        setLongField(term19, term19.getClass(), "startTime", 2442117782898005296L);
        setField(term30, term30.getClass(), "comparator", null);
        setLongField(term32, term32.getClass(), "seconds", 1345871412L);
        setIntField(term32, term32.getClass(), "nanos", 244000000);
        setField(term31, term31.getClass(), "key", term32);
        setField(term31, term31.getClass(), "value", null);
        setField(term31, term31.getClass(), "left", null);
        setField(term31, term31.getClass(), "right", null);
        setField(term31, term31.getClass(), "parent", null);
        setBooleanField(term31, term31.getClass(), "color", true);
        setField(term30, term30.getClass(), "root", term31);
        setIntField(term30, term30.getClass(), "size", 1);
        setIntField(term30, term30.getClass(), "modCount", 1);
        setField(term30, term30.getClass(), "entrySet", null);
        setField(term30, term30.getClass(), "navigableKeySet", null);
        setField(term30, term30.getClass(), "descendingMap", null);
        setField(term30, term30.getClass(), "keySet", null);
        setField(term30, term30.getClass(), "values", null);
        setField(term19, term19.getClass(), "reports", term30);
        setField(term19, term19.getClass(), "percentiles", term38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "start", argTypes, term19, args);
    }

};


