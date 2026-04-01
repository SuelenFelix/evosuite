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

public class Weighted_getEdgeWeight_8299211170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106637;

    public Weighted_getEdgeWeight_8299211170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term106642 = new Double(0.1960225801238138);
        Double term106644 = new Double(0.5148137742678777);
        Double term106646 = new Double(0.8391459612166138);
        Double term106648 = new Double(0.16703018107140954);
        Double term106650 = new Double(0.4586817610515208);
        Double term106652 = new Double(0.4514428416311852);
        Double term106654 = new Double(0.05035312439979578);
        term106637 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term106641 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term106637, term106637.getClass(), "directed", false);
        setIntField(term106637, term106637.getClass(), "source", -1837062636);
        setIntField(term106637, term106637.getClass(), "target", -2041717100);
        setElement(term106641, 0, term106642);
        setElement(term106641, 1, term106644);
        setElement(term106641, 2, term106646);
        setElement(term106641, 3, term106648);
        setElement(term106641, 4, term106650);
        setElement(term106641, 5, term106652);
        setElement(term106641, 6, term106654);
        setField(term106637, term106637.getClass(), "data", term106641);
        setField(term106637, term106637.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Weighted");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term106637;
        callMethod(klass, "getEdgeWeight", argTypes, null, args);
    }

};


