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
     Object term106640;

    public Weighted_getEdgeWeight_8299211170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term106645 = new Double(0.1960225801238138);
        Double term106647 = new Double(0.5148137742678777);
        Double term106649 = new Double(0.8391459612166138);
        Double term106651 = new Double(0.16703018107140954);
        Double term106653 = new Double(0.4586817610515208);
        Double term106655 = new Double(0.4514428416311852);
        Double term106657 = new Double(0.05035312439979578);
        term106640 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term106644 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term106640, term106640.getClass(), "directed", false);
        setIntField(term106640, term106640.getClass(), "source", -1837062636);
        setIntField(term106640, term106640.getClass(), "target", -2041717100);
        setElement(term106644, 0, term106645);
        setElement(term106644, 1, term106647);
        setElement(term106644, 2, term106649);
        setElement(term106644, 3, term106651);
        setElement(term106644, 4, term106653);
        setElement(term106644, 5, term106655);
        setElement(term106644, 6, term106657);
        setField(term106640, term106640.getClass(), "data", term106644);
        setField(term106640, term106640.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Weighted");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.graph4j.Edge");
        Object[] args = new Object[1];
        args[0] = term106640;
        callMethod(klass, "getEdgeWeight", argTypes, null, args);
    }

};


