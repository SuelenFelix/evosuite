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
     Object term184929;
     Object term184958;

    public Tools_maxLength_14019792746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184929 = (Object[]) newArray("[D", 5);
        double[] term184930 = (double[]) newDoubleArray(7);
        double[] term184938 = (double[]) newDoubleArray(5);
        double[] term184944 = (double[]) newDoubleArray(1);
        double[] term184946 = (double[]) newDoubleArray(9);
        double[] term184956 = (double[]) newDoubleArray(1);
        setDoubleElement(term184930, 0, 0.9013579433791381);
        setDoubleElement(term184930, 1, 0.5421768766336728);
        setDoubleElement(term184930, 2, 0.9930900503541242);
        setDoubleElement(term184930, 3, 0.1133225662823748);
        setDoubleElement(term184930, 4, 0.4466769562662847);
        setDoubleElement(term184930, 5, 0.35255621909680324);
        setDoubleElement(term184930, 6, 0.5414359823709687);
        setElement(term184929, 0, term184930);
        setDoubleElement(term184938, 0, 0.029445532736492863);
        setDoubleElement(term184938, 1, 0.7788330075970307);
        setDoubleElement(term184938, 2, 0.8994033322676958);
        setDoubleElement(term184938, 3, 0.9080629268049336);
        setDoubleElement(term184938, 4, 0.5141741092692096);
        setElement(term184929, 1, term184938);
        setDoubleElement(term184944, 0, 0.933476869517443);
        setElement(term184929, 2, term184944);
        setDoubleElement(term184946, 0, 0.372698624903531);
        setDoubleElement(term184946, 1, 0.6978151528650772);
        setDoubleElement(term184946, 2, 0.8133393596346342);
        setDoubleElement(term184946, 3, 0.1611948861795366);
        setDoubleElement(term184946, 4, 0.8105541296845098);
        setDoubleElement(term184946, 5, 0.5030522996403742);
        setDoubleElement(term184946, 6, 0.16499064527102247);
        setDoubleElement(term184946, 7, 0.6598246220867015);
        setDoubleElement(term184946, 8, 0.6580254528740881);
        setElement(term184929, 3, term184946);
        setDoubleElement(term184956, 0, 0.5752680711339421);
        setElement(term184929, 4, term184956);
        term184958 = new Integer(-1209672009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term184929;
        args[1] = term184958;
        callMethod(klass, "maxLength", argTypes, null, args);
    }

};


