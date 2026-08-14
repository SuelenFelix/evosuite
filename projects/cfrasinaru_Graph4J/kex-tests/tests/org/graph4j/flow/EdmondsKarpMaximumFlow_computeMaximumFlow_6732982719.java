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

public class EdmondsKarpMaximumFlow_computeMaximumFlow_6732982719 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1779;

    public EdmondsKarpMaximumFlow_computeMaximumFlow_6732982719() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1779 = newInstance(Class.forName("org.graph4j.flow.EdmondsKarpMaximumFlow"));
        setField(term1779, term1779.getClass(), "visited", null);
        setField(term1779, term1779.getClass(), "forward", null);
        setField(term1779, term1779.getClass(), "parent", null);
        setField(term1779, term1779.getClass(), "residual", null);
        setField(term1779, term1779.getClass(), "queue", null);
        setField(term1779, term1779.getClass(), "graph", null);
        setField(term1779, term1779.getClass(), "initialFlow", null);
        setIntField(term1779, term1779.getClass(), "numVertices", 0);
        setIntField(term1779, term1779.getClass(), "source", 0);
        setIntField(term1779, term1779.getClass(), "sink", 0);
        setIntField(term1779, term1779.getClass(), "sourceIndex", 0);
        setIntField(term1779, term1779.getClass(), "sinkIndex", 0);
        setBooleanField(term1779, term1779.getClass(), "computed", false);
        setField(term1779, term1779.getClass(), "sourcePart", null);
        setField(term1779, term1779.getClass(), "sinkPart", null);
        setField(term1779, term1779.getClass(), "cutEdges", null);
        setField(term1779, term1779.getClass(), "ekAlg", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.flow.EdmondsKarpMaximumFlow");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeMaximumFlow", argTypes, term1779, args);
    }

};


