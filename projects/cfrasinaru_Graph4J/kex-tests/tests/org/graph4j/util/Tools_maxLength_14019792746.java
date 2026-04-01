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

public class Tools_maxLength_14019792746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184918;
     Object term184947;

    public Tools_maxLength_14019792746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184918 = (Object[]) newArray("[D", 5);
        double[] term184919 = (double[]) newDoubleArray(7);
        double[] term184927 = (double[]) newDoubleArray(5);
        double[] term184933 = (double[]) newDoubleArray(1);
        double[] term184935 = (double[]) newDoubleArray(9);
        double[] term184945 = (double[]) newDoubleArray(1);
        setDoubleElement(term184919, 0, 0.9013579433791381);
        setDoubleElement(term184919, 1, 0.5421768766336728);
        setDoubleElement(term184919, 2, 0.9930900503541242);
        setDoubleElement(term184919, 3, 0.1133225662823748);
        setDoubleElement(term184919, 4, 0.4466769562662847);
        setDoubleElement(term184919, 5, 0.35255621909680324);
        setDoubleElement(term184919, 6, 0.5414359823709687);
        setElement(term184918, 0, term184919);
        setDoubleElement(term184927, 0, 0.029445532736492863);
        setDoubleElement(term184927, 1, 0.7788330075970307);
        setDoubleElement(term184927, 2, 0.8994033322676958);
        setDoubleElement(term184927, 3, 0.9080629268049336);
        setDoubleElement(term184927, 4, 0.5141741092692096);
        setElement(term184918, 1, term184927);
        setDoubleElement(term184933, 0, 0.933476869517443);
        setElement(term184918, 2, term184933);
        setDoubleElement(term184935, 0, 0.372698624903531);
        setDoubleElement(term184935, 1, 0.6978151528650772);
        setDoubleElement(term184935, 2, 0.8133393596346342);
        setDoubleElement(term184935, 3, 0.1611948861795366);
        setDoubleElement(term184935, 4, 0.8105541296845098);
        setDoubleElement(term184935, 5, 0.5030522996403742);
        setDoubleElement(term184935, 6, 0.16499064527102247);
        setDoubleElement(term184935, 7, 0.6598246220867015);
        setDoubleElement(term184935, 8, 0.6580254528740881);
        setElement(term184918, 3, term184935);
        setDoubleElement(term184945, 0, 0.5752680711339421);
        setElement(term184918, 4, term184945);
        term184947 = new Integer(-1209672009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term184918;
        args[1] = term184947;
        callMethod(klass, "maxLength", argTypes, null, args);
    }

};


