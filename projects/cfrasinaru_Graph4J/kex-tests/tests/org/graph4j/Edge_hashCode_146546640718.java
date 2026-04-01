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

public class Edge_hashCode_146546640718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108362;

    public Edge_hashCode_146546640718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108367 = new Double(0.920204482814009);
        Double term108369 = new Double(0.18677602647831992);
        Double term108371 = new Double(0.5620284908568363);
        Double term108373 = new Double(0.4214941757931592);
        Double term108375 = new Double(0.9009620538952149);
        Double term108377 = new Double(0.09598300824663397);
        Double term108379 = new Double(0.3488342586091009);
        Double term108381 = new Double(0.07084009583074191);
        term108362 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108366 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term108362, term108362.getClass(), "directed", true);
        setIntField(term108362, term108362.getClass(), "source", 1537040246);
        setIntField(term108362, term108362.getClass(), "target", -165158827);
        setElement(term108366, 0, term108367);
        setElement(term108366, 1, term108369);
        setElement(term108366, 2, term108371);
        setElement(term108366, 3, term108373);
        setElement(term108366, 4, term108375);
        setElement(term108366, 5, term108377);
        setElement(term108366, 6, term108379);
        setElement(term108366, 7, term108381);
        setField(term108362, term108362.getClass(), "data", term108366);
        setField(term108362, term108362.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term108362, args);
    }

};


