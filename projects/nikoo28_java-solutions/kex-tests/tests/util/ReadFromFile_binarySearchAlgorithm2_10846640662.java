package util;

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
import static util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ReadFromFile_binarySearchAlgorithm2_10846640662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1130;
     Object term1136;

    public ReadFromFile_binarySearchAlgorithm2_10846640662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1130 = (int[]) newIntArray(5);
        setIntElement(term1130, 0, -1748391876);
        setIntElement(term1130, 1, 43258317);
        setIntElement(term1130, 2, 1707220033);
        setIntElement(term1130, 3, -1792504217);
        setIntElement(term1130, 4, 1824538861);
        term1136 = new Integer(499519708);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.ReadFromFile");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1130;
        args[1] = term1136;
        callMethod(klass, "binarySearchAlgorithm2", argTypes, null, args);
    }

};


