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
import java.lang.Long;

public class Reporter_reportOp_5181705584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139;
     Object term176;
     Object term178;

    public Reporter_reportOp_5181705584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term140 = new HashMap();
        Integer term160 = new Integer(1622346318);
        ArrayList term158 = new ArrayList();
        ((ArrayList) term158).add(term160);
        term139 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term150 = newInstance(Class.forName("java.util.TreeMap"));
        Object term151 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term152 = newInstance(Class.forName("java.time.Instant"));
        setField(term139, term139.getClass(), "stats", term140);
        setLongField(term139, term139.getClass(), "startTime", -8400487765614892086L);
        setField(term150, term150.getClass(), "comparator", null);
        setLongField(term152, term152.getClass(), "seconds", 1606045635L);
        setIntField(term152, term152.getClass(), "nanos", 837000000);
        setField(term151, term151.getClass(), "key", term152);
        setField(term151, term151.getClass(), "value", null);
        setField(term151, term151.getClass(), "left", null);
        setField(term151, term151.getClass(), "right", null);
        setField(term151, term151.getClass(), "parent", null);
        setBooleanField(term151, term151.getClass(), "color", true);
        setField(term150, term150.getClass(), "root", term151);
        setIntField(term150, term150.getClass(), "size", 1);
        setIntField(term150, term150.getClass(), "modCount", 1);
        setField(term150, term150.getClass(), "entrySet", null);
        setField(term150, term150.getClass(), "navigableKeySet", null);
        setField(term150, term150.getClass(), "descendingMap", null);
        setField(term150, term150.getClass(), "keySet", null);
        setField(term150, term150.getClass(), "values", null);
        setField(term139, term139.getClass(), "reports", term150);
        setField(term139, term139.getClass(), "percentiles", term158);
        term176 = new Long(5270370404989704783L);
        term178 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = long.class;
        argTypes[2] = long.class;
        Object[] args = new Object[3];
        args[0] = "EGtDIRbSSb";
        args[1] = term176;
        args[2] = term178;
        callMethod(klass, "reportOp", argTypes, term139, args);
    }

};


