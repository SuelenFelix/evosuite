package org.graph4j;

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
import static org.graph4j.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EdgeIteratorImpl_next_7809329003 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172970;

    public EdgeIteratorImpl_next_7809329003() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term172977 = new Double(0.1275133937146814);
        Double term172979 = new Double(0.582988337023893);
        Double term172981 = new Double(0.13597502998586053);
        Double term172983 = new Double(0.9744588057109164);
        Double term172985 = new Double(0.5917275344743753);
        Double term172987 = new Double(0.6391951782023467);
        Double term172989 = new Double(0.037251985836196044);
        Double term172991 = new Double(0.851031727210683);
        term172970 = newInstance(Class.forName("org.graph4j.EdgeIteratorImpl"));
        Object term172972 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term172976 = (Object[]) newArray("java.lang.Double", 8);
        setField(term172970, term172970.getClass(), "graph", null);
        setField(term172970, term172970.getClass(), "neighbors", null);
        setIntField(term172970, term172970.getClass(), "index", -801701322);
        setBooleanField(term172972, term172972.getClass(), "directed", false);
        setIntField(term172972, term172972.getClass(), "source", 2025368113);
        setIntField(term172972, term172972.getClass(), "target", 692326762);
        setElement(term172976, 0, term172977);
        setElement(term172976, 1, term172979);
        setElement(term172976, 2, term172981);
        setElement(term172976, 3, term172983);
        setElement(term172976, 4, term172985);
        setElement(term172976, 5, term172987);
        setElement(term172976, 6, term172989);
        setElement(term172976, 7, term172991);
        setField(term172972, term172972.getClass(), "data", term172976);
        setField(term172972, term172972.getClass(), "label", null);
        setField(term172970, term172970.getClass(), "currentEdge", term172972);
        setBooleanField(term172970, term172970.getClass(), "directed", false);
        setIntField(term172970, term172970.getClass(), "numVertices", -1313753179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.EdgeIteratorImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "next", argTypes, term172970, args);
    }

};


