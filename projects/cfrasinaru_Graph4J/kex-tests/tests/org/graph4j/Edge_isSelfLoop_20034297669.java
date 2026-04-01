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
     Object term108203;

    public Edge_isSelfLoop_20034297669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108208 = new Double(0.7835572863983016);
        Double term108210 = new Double(0.27036192661860925);
        Double term108212 = new Double(0.871322715553573);
        Double term108214 = new Double(0.9859225497604077);
        Double term108216 = new Double(0.29527820404600214);
        Double term108218 = new Double(0.8434643614018447);
        Double term108220 = new Double(0.00210877501865836);
        term108203 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108207 = (Object[]) newArray("java.lang.Double", 7);
        setBooleanField(term108203, term108203.getClass(), "directed", true);
        setIntField(term108203, term108203.getClass(), "source", -1193140740);
        setIntField(term108203, term108203.getClass(), "target", -1587301779);
        setElement(term108207, 0, term108208);
        setElement(term108207, 1, term108210);
        setElement(term108207, 2, term108212);
        setElement(term108207, 3, term108214);
        setElement(term108207, 4, term108216);
        setElement(term108207, 5, term108218);
        setElement(term108207, 6, term108220);
        setField(term108203, term108203.getClass(), "data", term108207);
        setField(term108203, term108203.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSelfLoop", argTypes, term108203, args);
    }

};


