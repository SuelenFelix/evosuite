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

public class QuickSort_findPartition_12427962762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2694;
     Object term2702;
     Object term2704;

    public QuickSort_findPartition_12427962762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2694 = (int[]) newIntArray(7);
        setIntElement(term2694, 0, 1801052257);
        setIntElement(term2694, 1, -2110556060);
        setIntElement(term2694, 2, 313459791);
        setIntElement(term2694, 3, 752615112);
        setIntElement(term2694, 4, -1674430871);
        setIntElement(term2694, 5, 794352120);
        setIntElement(term2694, 6, 340719678);
        term2702 = new Integer(299791142);
        term2704 = new Integer(1862191391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.QuickSort");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2694;
        args[1] = term2702;
        args[2] = term2704;
        callMethod(klass, "findPartition", argTypes, null, args);
    }

};


