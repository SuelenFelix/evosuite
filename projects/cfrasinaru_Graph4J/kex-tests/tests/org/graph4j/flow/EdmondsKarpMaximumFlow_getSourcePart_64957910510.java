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

public class EdmondsKarpMaximumFlow_getSourcePart_64957910510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1786;

    public EdmondsKarpMaximumFlow_getSourcePart_64957910510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1786 = newInstance(Class.forName("org.graph4j.flow.EdmondsKarpMaximumFlow"));
        setField(term1786, term1786.getClass(), "visited", null);
        setField(term1786, term1786.getClass(), "forward", null);
        setField(term1786, term1786.getClass(), "parent", null);
        setField(term1786, term1786.getClass(), "residual", null);
        setField(term1786, term1786.getClass(), "queue", null);
        setField(term1786, term1786.getClass(), "graph", null);
        setField(term1786, term1786.getClass(), "initialFlow", null);
        setIntField(term1786, term1786.getClass(), "numVertices", 0);
        setIntField(term1786, term1786.getClass(), "source", 0);
        setIntField(term1786, term1786.getClass(), "sink", 0);
        setIntField(term1786, term1786.getClass(), "sourceIndex", 0);
        setIntField(term1786, term1786.getClass(), "sinkIndex", 0);
        setBooleanField(term1786, term1786.getClass(), "computed", false);
        setField(term1786, term1786.getClass(), "sourcePart", null);
        setField(term1786, term1786.getClass(), "sinkPart", null);
        setField(term1786, term1786.getClass(), "cutEdges", null);
        setField(term1786, term1786.getClass(), "ekAlg", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.EdmondsKarpMaximumFlow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSourcePart", argTypes, term1786, args);
    }

};


