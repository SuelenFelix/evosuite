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

public class Reporter_getReportsSince_4216871076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;
     Object term252;

    public Reporter_getReportsSince_4216871076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term226 = new HashMap();
        Integer term246 = new Integer(1135664017);
        Integer term248 = new Integer(590364439);
        ArrayList term244 = new ArrayList();
        ((ArrayList) term244).add(term246);
        ((ArrayList) term244).add(term248);
        term225 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term236 = newInstance(Class.forName("java.util.TreeMap"));
        Object term237 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term238 = newInstance(Class.forName("java.time.Instant"));
        setField(term225, term225.getClass(), "stats", term226);
        setLongField(term225, term225.getClass(), "startTime", 6811161968424632369L);
        setField(term236, term236.getClass(), "comparator", null);
        setLongField(term238, term238.getClass(), "seconds", 1515890130L);
        setIntField(term238, term238.getClass(), "nanos", 18000000);
        setField(term237, term237.getClass(), "key", term238);
        setField(term237, term237.getClass(), "value", null);
        setField(term237, term237.getClass(), "left", null);
        setField(term237, term237.getClass(), "right", null);
        setField(term237, term237.getClass(), "parent", null);
        setBooleanField(term237, term237.getClass(), "color", true);
        setField(term236, term236.getClass(), "root", term237);
        setIntField(term236, term236.getClass(), "size", 1);
        setIntField(term236, term236.getClass(), "modCount", 1);
        setField(term236, term236.getClass(), "entrySet", null);
        setField(term236, term236.getClass(), "navigableKeySet", null);
        setField(term236, term236.getClass(), "descendingMap", null);
        setField(term236, term236.getClass(), "keySet", null);
        setField(term236, term236.getClass(), "values", null);
        setField(term225, term225.getClass(), "reports", term236);
        setField(term225, term225.getClass(), "percentiles", term244);
        term252 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term252, term252.getClass(), "seconds", 1429023851L);
        setIntField(term252, term252.getClass(), "nanos", 389000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term252;
        callMethod(klass, "getReportsSince", argTypes, term225, args);
    }

};


