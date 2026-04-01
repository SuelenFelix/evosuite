package org.graph4j.flow;

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
import static org.graph4j.flow.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class EdmondsKarpMaximumFlow_scan_12530378678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1770;
     Object term1777;

    public EdmondsKarpMaximumFlow_scan_12530378678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1770 = newInstance(Class.forName("org.graph4j.flow.EdmondsKarpMaximumFlow"));
        setField(term1770, term1770.getClass(), "visited", null);
        setField(term1770, term1770.getClass(), "forward", null);
        setField(term1770, term1770.getClass(), "parent", null);
        setField(term1770, term1770.getClass(), "residual", null);
        setField(term1770, term1770.getClass(), "queue", null);
        setField(term1770, term1770.getClass(), "graph", null);
        setField(term1770, term1770.getClass(), "initialFlow", null);
        setIntField(term1770, term1770.getClass(), "numVertices", 0);
        setIntField(term1770, term1770.getClass(), "source", 0);
        setIntField(term1770, term1770.getClass(), "sink", 0);
        setIntField(term1770, term1770.getClass(), "sourceIndex", 0);
        setIntField(term1770, term1770.getClass(), "sinkIndex", 0);
        setBooleanField(term1770, term1770.getClass(), "computed", false);
        setField(term1770, term1770.getClass(), "sourcePart", null);
        setField(term1770, term1770.getClass(), "sinkPart", null);
        setField(term1770, term1770.getClass(), "cutEdges", null);
        setField(term1770, term1770.getClass(), "ekAlg", null);
        term1777 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.EdmondsKarpMaximumFlow");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1777;
        callMethod(klass, "scan", argTypes, term1770, args);
    }

};


