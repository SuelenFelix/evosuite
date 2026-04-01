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
import java.lang.Integer;
import java.lang.Object;
import java.lang.Double;

public class Weighted_getEdgeData_19052423002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106662;
     Object term106664;
     Object term106681;

    public Weighted_getEdgeData_19052423002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106662 = new Integer(1832320421);
        Double term106669 = new Double(0.2030931676384783);
        Double term106671 = new Double(0.5220991694127869);
        Double term106673 = new Double(0.7431278279525401);
        Double term106675 = new Double(0.6468277621896449);
        Double term106677 = new Double(0.6348426143487798);
        Double term106679 = new Double(0.2609298549951239);
        term106664 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term106668 = (Object[]) newArray("java.lang.Double", 6);
        setBooleanField(term106664, term106664.getClass(), "directed", false);
        setIntField(term106664, term106664.getClass(), "source", -2077745055);
        setIntField(term106664, term106664.getClass(), "target", 806903399);
        setElement(term106668, 0, term106669);
        setElement(term106668, 1, term106671);
        setElement(term106668, 2, term106673);
        setElement(term106668, 3, term106675);
        setElement(term106668, 4, term106677);
        setElement(term106668, 5, term106679);
        setField(term106664, term106664.getClass(), "data", term106668);
        setField(term106664, term106664.getClass(), "label", null);
        term106681 = new Double(0.7959748136672563);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Weighted");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.graph4j.Edge");
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term106662;
        args[1] = term106664;
        args[2] = term106681;
        callMethod(klass, "getEdgeData", argTypes, null, args);
    }

};


