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

public class Edge_isDirected_6364831388 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108182;

    public Edge_isDirected_6364831388() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108187 = new Double(0.533001418704147);
        Double term108189 = new Double(0.9818549251139834);
        Double term108191 = new Double(0.9968905523871232);
        Double term108193 = new Double(0.5782492033278201);
        Double term108195 = new Double(0.11415011225631944);
        Double term108197 = new Double(0.9680611801309333);
        Double term108199 = new Double(0.3247557569539842);
        Double term108201 = new Double(0.0145401306959696);
        term108182 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108186 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term108182, term108182.getClass(), "directed", true);
        setIntField(term108182, term108182.getClass(), "source", -642571564);
        setIntField(term108182, term108182.getClass(), "target", -1691073345);
        setElement(term108186, 0, term108187);
        setElement(term108186, 1, term108189);
        setElement(term108186, 2, term108191);
        setElement(term108186, 3, term108193);
        setElement(term108186, 4, term108195);
        setElement(term108186, 5, term108197);
        setElement(term108186, 6, term108199);
        setElement(term108186, 7, term108201);
        setField(term108182, term108182.getClass(), "data", term108186);
        setField(term108182, term108182.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDirected", argTypes, term108182, args);
    }

};


