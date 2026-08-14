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

public class Reporter_getAllReports_17587722785 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190;

    public Reporter_getAllReports_17587722785() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term191 = new HashMap();
        Integer term211 = new Integer(1048535127);
        Integer term213 = new Integer(-655067527);
        Integer term215 = new Integer(-6029667);
        Integer term217 = new Integer(-2068769794);
        Integer term219 = new Integer(-117576464);
        Integer term221 = new Integer(-1007160944);
        ArrayList term209 = new ArrayList();
        ((ArrayList) term209).add(term211);
        ((ArrayList) term209).add(term213);
        ((ArrayList) term209).add(term215);
        ((ArrayList) term209).add(term217);
        ((ArrayList) term209).add(term219);
        ((ArrayList) term209).add(term221);
        term190 = newInstance(Class.forName("org.schambon.loadsimrunner.report.Reporter"));
        Object term201 = newInstance(Class.forName("java.util.TreeMap"));
        Object term202 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term203 = newInstance(Class.forName("java.time.Instant"));
        setField(term190, term190.getClass(), "stats", term191);
        setLongField(term190, term190.getClass(), "startTime", 4872422362414183754L);
        setField(term201, term201.getClass(), "comparator", null);
        setLongField(term203, term203.getClass(), "seconds", 1442639565L);
        setIntField(term203, term203.getClass(), "nanos", 302000000);
        setField(term202, term202.getClass(), "key", term203);
        setField(term202, term202.getClass(), "value", null);
        setField(term202, term202.getClass(), "left", null);
        setField(term202, term202.getClass(), "right", null);
        setField(term202, term202.getClass(), "parent", null);
        setBooleanField(term202, term202.getClass(), "color", true);
        setField(term201, term201.getClass(), "root", term202);
        setIntField(term201, term201.getClass(), "size", 1);
        setIntField(term201, term201.getClass(), "modCount", 1);
        setField(term201, term201.getClass(), "entrySet", null);
        setField(term201, term201.getClass(), "navigableKeySet", null);
        setField(term201, term201.getClass(), "descendingMap", null);
        setField(term201, term201.getClass(), "keySet", null);
        setField(term201, term201.getClass(), "values", null);
        setField(term190, term190.getClass(), "reports", term201);
        setField(term190, term190.getClass(), "percentiles", term209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.schambon.loadsimrunner.report.Reporter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllReports", argTypes, term190, args);
    }

};


