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

public class Edge_isSelfLoop_20034297669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108206;

    public Edge_isSelfLoop_20034297669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108211 = new Double(0.7835572863983016);
        Double term108213 = new Double(0.27036192661860925);
        Double term108215 = new Double(0.871322715553573);
        Double term108217 = new Double(0.9859225497604077);
        Double term108219 = new Double(0.29527820404600214);
        Double term108221 = new Double(0.8434643614018447);
        Double term108223 = new Double(0.00210877501865836);
        term108206 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108210 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term108206, term108206.getClass(), "directed", true);
        setIntField(term108206, term108206.getClass(), "source", -1193140740);
        setIntField(term108206, term108206.getClass(), "target", -1587301779);
        setElement(term108210, 0, term108211);
        setElement(term108210, 1, term108213);
        setElement(term108210, 2, term108215);
        setElement(term108210, 3, term108217);
        setElement(term108210, 4, term108219);
        setElement(term108210, 5, term108221);
        setElement(term108210, 6, term108223);
        setField(term108206, term108206.getClass(), "data", term108210);
        setField(term108206, term108206.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSelfLoop", argTypes, term108206, args);
    }

};


