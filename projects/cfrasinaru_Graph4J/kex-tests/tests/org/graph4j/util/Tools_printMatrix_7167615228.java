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

public class Tools_printMatrix_7167615228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185017;
     Object term185044;

    public Tools_printMatrix_7167615228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185017 = (Object[]) newArray("[D", 4);
        double[] term185018 = (double[]) newDoubleArray(4);
        double[] term185023 = (double[]) newDoubleArray(9);
        double[] term185033 = (double[]) newDoubleArray(6);
        double[] term185040 = (double[]) newDoubleArray(3);
        setDoubleElement(term185018, 0, 0.6004928718736182);
        setDoubleElement(term185018, 1, 0.936269040408882);
        setDoubleElement(term185018, 2, 0.9393778688749687);
        setDoubleElement(term185018, 3, 0.3512590965523733);
        setElement(term185017, 0, term185018);
        setDoubleElement(term185023, 0, 0.12233760371469315);
        setDoubleElement(term185023, 1, 0.11046175540097836);
        setDoubleElement(term185023, 2, 0.2629526660188758);
        setDoubleElement(term185023, 3, 0.8598758608427509);
        setDoubleElement(term185023, 4, 0.6325997496947859);
        setDoubleElement(term185023, 5, 0.6899561861194149);
        setDoubleElement(term185023, 6, 0.03891390017040064);
        setDoubleElement(term185023, 7, 0.4543321505688176);
        setDoubleElement(term185023, 8, 0.47522955857996885);
        setElement(term185017, 1, term185023);
        setDoubleElement(term185033, 0, 0.21568205743508873);
        setDoubleElement(term185033, 1, 0.3575374500278379);
        setDoubleElement(term185033, 2, 0.8902453120845066);
        setDoubleElement(term185033, 3, 0.35087748992550527);
        setDoubleElement(term185033, 4, 0.7077324120895774);
        setDoubleElement(term185033, 5, 0.9493378795932591);
        setElement(term185017, 2, term185033);
        setDoubleElement(term185040, 0, 0.5010247411385421);
        setDoubleElement(term185040, 1, 0.6647073157192498);
        setDoubleElement(term185040, 2, 0.024615274903945217);
        setElement(term185017, 3, term185040);
        term185044 = new Integer(656577433);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(double.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term185017;
        args[1] = term185044;
        callMethod(klass, "printMatrix", argTypes, null, args);
    }

};


