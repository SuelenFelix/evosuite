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
     Object term108365;

    public Edge_hashCode_146546640718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term108370 = new Double(0.920204482814009);
        Double term108372 = new Double(0.18677602647831992);
        Double term108374 = new Double(0.5620284908568363);
        Double term108376 = new Double(0.4214941757931592);
        Double term108378 = new Double(0.9009620538952149);
        Double term108380 = new Double(0.09598300824663397);
        Double term108382 = new Double(0.3488342586091009);
        Double term108384 = new Double(0.07084009583074191);
        term108365 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term108369 = (Object[]) newArray("java.lang.Double", 8);
        setBooleanField(term108365, term108365.getClass(), "directed", true);
        setIntField(term108365, term108365.getClass(), "source", 1537040246);
        setIntField(term108365, term108365.getClass(), "target", -165158827);
        setElement(term108369, 0, term108370);
        setElement(term108369, 1, term108372);
        setElement(term108369, 2, term108374);
        setElement(term108369, 3, term108376);
        setElement(term108369, 4, term108378);
        setElement(term108369, 5, term108380);
        setElement(term108369, 6, term108382);
        setElement(term108369, 7, term108384);
        setField(term108365, term108365.getClass(), "data", term108369);
        setField(term108365, term108365.getClass(), "label", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.Edge");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term108365, args);
    }

};


