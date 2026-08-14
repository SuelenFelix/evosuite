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
import java.lang.Integer;

public class Tools_maxLength_14019792747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10740;
     Object term10758;

    public Tools_maxLength_14019792747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10740 = (Object[]) newArray("[D", 2);
        double[] term10741 = (double[]) newDoubleArray(9);
        double[] term10751 = (double[]) newDoubleArray(6);
        setDoubleElement(term10741, 0, 0.6805867182029153);
        setDoubleElement(term10741, 1, 0.2852810965221698);
        setDoubleElement(term10741, 2, 0.6300849762307866);
        setDoubleElement(term10741, 3, 0.9737083944266686);
        setDoubleElement(term10741, 4, 0.0668892744806211);
        setDoubleElement(term10741, 5, 0.3587267442738795);
        setDoubleElement(term10741, 6, 0.07802449704920456);
        setDoubleElement(term10741, 7, 0.5279279537140873);
        setDoubleElement(term10741, 8, 0.3202192021706908);
        setElement(term10740, 0, term10741);
        setDoubleElement(term10751, 0, 0.22651340641904605);
        setDoubleElement(term10751, 1, 0.8878841294187743);
        setDoubleElement(term10751, 2, 0.6588948704887806);
        setDoubleElement(term10751, 3, 0.6397214730945112);
        setDoubleElement(term10751, 4, 0.25937345430928016);
        setDoubleElement(term10751, 5, 0.5873228247510078);
        setElement(term10740, 1, term10751);
        term10758 = new Integer(-833785119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term10740;
        args[1] = term10758;
        callMethod(klass, "maxLength", argTypes, null, args);
    }

};


