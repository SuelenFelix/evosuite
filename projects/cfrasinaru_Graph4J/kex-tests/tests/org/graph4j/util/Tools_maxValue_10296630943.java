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

public class Tools_maxValue_10296630943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184716;

    public Tools_maxValue_10296630943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184716 = (Object[]) newArray("[I", 9);
        int[] term184717 = (int[]) newIntArray(4);
        int[] term184722 = (int[]) newIntArray(5);
        int[] term184728 = (int[]) newIntArray(1);
        int[] term184730 = (int[]) newIntArray(2);
        int[] term184733 = (int[]) newIntArray(4);
        int[] term184738 = (int[]) newIntArray(6);
        int[] term184745 = (int[]) newIntArray(9);
        int[] term184755 = (int[]) newIntArray(3);
        int[] term184759 = (int[]) newIntArray(8);
        setIntElement(term184717, 0, -1758444761);
        setIntElement(term184717, 1, 765699300);
        setIntElement(term184717, 2, -882008098);
        setIntElement(term184717, 3, 674551844);
        setElement(term184716, 0, term184717);
        setIntElement(term184722, 0, -917520325);
        setIntElement(term184722, 1, -431923372);
        setIntElement(term184722, 2, -1534337016);
        setIntElement(term184722, 3, 1248651458);
        setIntElement(term184722, 4, 1231104902);
        setElement(term184716, 1, term184722);
        setIntElement(term184728, 0, 2007689969);
        setElement(term184716, 2, term184728);
        setIntElement(term184730, 0, -1461289174);
        setIntElement(term184730, 1, -878470833);
        setElement(term184716, 3, term184730);
        setIntElement(term184733, 0, -2076739116);
        setIntElement(term184733, 1, -1819851231);
        setIntElement(term184733, 2, -313309611);
        setIntElement(term184733, 3, -1848587569);
        setElement(term184716, 4, term184733);
        setIntElement(term184738, 0, 2095596087);
        setIntElement(term184738, 1, 615602172);
        setIntElement(term184738, 2, 516647715);
        setIntElement(term184738, 3, 795193615);
        setIntElement(term184738, 4, -1668935329);
        setIntElement(term184738, 5, -774184177);
        setElement(term184716, 5, term184738);
        setIntElement(term184745, 0, 1285096752);
        setIntElement(term184745, 1, -1356985078);
        setIntElement(term184745, 2, 14425647);
        setIntElement(term184745, 3, -131768228);
        setIntElement(term184745, 4, 1340204745);
        setIntElement(term184745, 5, 1186998669);
        setIntElement(term184745, 6, 878195596);
        setIntElement(term184745, 7, -1992358235);
        setIntElement(term184745, 8, 490392803);
        setElement(term184716, 6, term184745);
        setIntElement(term184755, 0, 483229214);
        setIntElement(term184755, 1, -288824457);
        setIntElement(term184755, 2, 1823637993);
        setElement(term184716, 7, term184755);
        setIntElement(term184759, 0, 2015959631);
        setIntElement(term184759, 1, -253748198);
        setIntElement(term184759, 2, -1973201059);
        setIntElement(term184759, 3, 1912348462);
        setIntElement(term184759, 4, 1546162730);
        setIntElement(term184759, 5, 1938770461);
        setIntElement(term184759, 6, -874163795);
        setIntElement(term184759, 7, -522227583);
        setElement(term184716, 8, term184759);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.graph4j.util.Tools");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term184716;
        callMethod(klass, "maxValue", argTypes, null, args);
    }

};


