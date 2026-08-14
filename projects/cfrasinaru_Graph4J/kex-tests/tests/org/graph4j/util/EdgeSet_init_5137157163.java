package org.graph4j.util;

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
import static org.graph4j.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class EdgeSet_init_5137157163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3500;

    public EdgeSet_init_5137157163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term3506 = new Double(0.5873228247510078);
        Double term3508 = new Double(0.8823181080774973);
        Double term3510 = new Double(0.2192450926212024);
        Double term3512 = new Double(0.7591353014991907);
        Double term3514 = new Double(0.791695029600875);
        Double term3516 = new Double(0.6862221294683138);
        Double term3518 = new Double(0.15917839663695388);
        Double term3525 = new Double(0.9374115574082594);
        Double term3527 = new Double(0.8454723071922143);
        Double term3529 = new Double(0.8566567697571895);
        Double term3531 = new Double(0.9203805380592256);
        term3500 = (Object[]) newArray("org.graph4j.Edge", 2);
        Object term3501 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term3505 = (Object[]) newArray("java.lang.Double", 7);
        Object term3520 = newInstance(Class.forName("org.graph4j.Edge"));
        Object[] term3524 = (Object[]) newArray("java.lang.Double", 4);
        setBooleanField(term3501, term3501.getClass(), "directed", false);
        setIntField(term3501, term3501.getClass(), "source", 2108571355);
        setIntField(term3501, term3501.getClass(), "target", 1909966089);
        setElement(term3505, 0, term3506);
        setElement(term3505, 1, term3508);
        setElement(term3505, 2, term3510);
        setElement(term3505, 3, term3512);
        setElement(term3505, 4, term3514);
        setElement(term3505, 5, term3516);
        setElement(term3505, 6, term3518);
        setField(term3501, term3501.getClass(), "data", term3505);
        setField(term3501, term3501.getClass(), "label", null);
        setElement(term3500, 0, term3501);
        setBooleanField(term3520, term3520.getClass(), "directed", true);
        setIntField(term3520, term3520.getClass(), "source", 1827255916);
        setIntField(term3520, term3520.getClass(), "target", 2039815750);
        setElement(term3524, 0, term3525);
        setElement(term3524, 1, term3527);
        setElement(term3524, 2, term3529);
        setElement(term3524, 3, term3531);
        setField(term3520, term3520.getClass(), "data", term3524);
        setField(term3520, term3520.getClass(), "label", null);
        setElement(term3500, 1, term3520);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.EdgeSet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.graph4j.Graph");
        argTypes[1] = Array.newInstance(Class.forName("org.graph4j.Edge"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term3500;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


