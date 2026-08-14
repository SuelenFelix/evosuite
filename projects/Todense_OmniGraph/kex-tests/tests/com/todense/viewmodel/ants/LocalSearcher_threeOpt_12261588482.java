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

public class LocalSearcher_threeOpt_12261588482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75;
     Object term76;
     Object term78;
     Object term86;

    public LocalSearcher_threeOpt_12261588482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("com.todense.viewmodel.ants.LocalSearcher"));
        term76 = new Integer(1162663216);
        term78 = (Object[]) newArray("[D", 1);
        double[] term79 = (double[]) newDoubleArray(6);
        setDoubleElement(term79, 0, 0.6436713023569729);
        setDoubleElement(term79, 1, 0.7332741045694002);
        setDoubleElement(term79, 2, 0.4569171842750229);
        setDoubleElement(term79, 3, 0.8598297828918529);
        setDoubleElement(term79, 4, 0.43692187681405226);
        setDoubleElement(term79, 5, 0.7633268466829064);
        setElement(term78, 0, term79);
        term86 = (Object[]) newArray("[Z", 5);
        boolean[] term87 = (boolean[]) newBooleanArray(5);
        boolean[] term93 = (boolean[]) newBooleanArray(2);
        boolean[] term96 = (boolean[]) newBooleanArray(3);
        boolean[] term100 = (boolean[]) newBooleanArray(1);
        boolean[] term102 = (boolean[]) newBooleanArray(0);
        setBooleanElement(term87, 0, true);
        setBooleanElement(term87, 3, true);
        setBooleanElement(term87, 4, true);
        setElement(term86, 0, term87);
        setElement(term86, 1, term93);
        setBooleanElement(term96, 0, true);
        setBooleanElement(term96, 1, true);
        setBooleanElement(term96, 2, true);
        setElement(term86, 2, term96);
        setBooleanElement(term100, 0, true);
        setElement(term86, 3, term100);
        setElement(term86, 4, term102);
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
        args[1] = term76;
        args[2] = term78;
        args[3] = term86;
        callMethod(klass, "threeOpt", argTypes, term75, args);
    }

};


