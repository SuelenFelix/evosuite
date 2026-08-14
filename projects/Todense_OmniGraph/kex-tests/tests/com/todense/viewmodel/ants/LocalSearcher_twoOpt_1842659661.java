package com.todense.viewmodel.ants;

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
import static com.todense.viewmodel.ants.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class LocalSearcher_twoOpt_1842659661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term4;
     Object term28;

    public LocalSearcher_twoOpt_1842659661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("com.todense.viewmodel.ants.LocalSearcher"));
        term2 = new Integer(568599855);
        term4 = (Object[]) newArray("[D", 5);
        double[] term5 = (double[]) newDoubleArray(4);
        double[] term10 = (double[]) newDoubleArray(3);
        double[] term14 = (double[]) newDoubleArray(4);
        double[] term19 = (double[]) newDoubleArray(1);
        double[] term21 = (double[]) newDoubleArray(6);
        setDoubleElement(term5, 0, 0.13238746331190498);
        setDoubleElement(term5, 1, 0.3455959125047594);
        setDoubleElement(term5, 2, 0.5523635872663106);
        setDoubleElement(term5, 3, 0.544608645520025);
        setElement(term4, 0, term5);
        setDoubleElement(term10, 0, 0.28570734989730284);
        setDoubleElement(term10, 1, 0.40176586625454525);
        setDoubleElement(term10, 2, 0.2641345529914265);
        setElement(term4, 1, term10);
        setDoubleElement(term14, 0, 0.36923381893433327);
        setDoubleElement(term14, 1, 0.6076495596892013);
        setDoubleElement(term14, 2, 0.37773193782763337);
        setDoubleElement(term14, 3, 0.8474802076607362);
        setElement(term4, 2, term14);
        setDoubleElement(term19, 0, 0.5183269973490326);
        setElement(term4, 3, term19);
        setDoubleElement(term21, 0, 0.7655020693602768);
        setDoubleElement(term21, 1, 0.1374549299694151);
        setDoubleElement(term21, 2, 0.7031006357544823);
        setDoubleElement(term21, 3, 0.9527281779865117);
        setDoubleElement(term21, 4, 0.9828442029246764);
        setDoubleElement(term21, 5, 0.2779719046761513);
        setElement(term4, 4, term21);
        term28 = (Object[]) newArray("[Z", 2);
        boolean[] term29 = (boolean[]) newBooleanArray(6);
        boolean[] term36 = (boolean[]) newBooleanArray(7);
        setBooleanElement(term29, 4, true);
        setBooleanElement(term29, 5, true);
        setElement(term28, 0, term29);
        setBooleanElement(term36, 0, true);
        setBooleanElement(term36, 1, true);
        setBooleanElement(term36, 3, true);
        setBooleanElement(term36, 5, true);
        setElement(term28, 1, term36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.todense.viewmodel.ants.LocalSearcher");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.todense.viewmodel.ants.Ant");
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[3] = Array.newInstance(Array.newInstance(boolean.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term2;
        args[2] = term4;
        args[3] = term28;
        callMethod(klass, "twoOpt", argTypes, term1, args);
    }

};


