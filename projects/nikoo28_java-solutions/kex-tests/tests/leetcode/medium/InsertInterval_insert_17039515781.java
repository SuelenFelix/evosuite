package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class InsertInterval_insert_17039515781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1009;
     Object term1010;
     Object term1029;

    public InsertInterval_insert_17039515781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1009 = newInstance(Class.forName("leetcode.medium.InsertInterval"));
        term1010 = (Object[]) newArray("[I", 2);
        int[] term1011 = (int[]) newIntArray(9);
        int[] term1021 = (int[]) newIntArray(7);
        setIntElement(term1011, 0, 479531250);
        setIntElement(term1011, 1, 1320570890);
        setIntElement(term1011, 2, -130649791);
        setIntElement(term1011, 3, 534834644);
        setIntElement(term1011, 4, 1959097203);
        setIntElement(term1011, 5, -209654048);
        setIntElement(term1011, 6, 477625804);
        setIntElement(term1011, 7, 252575029);
        setIntElement(term1011, 8, 57189932);
        setElement(term1010, 0, term1011);
        setIntElement(term1021, 0, 1460722225);
        setIntElement(term1021, 1, 1743224434);
        setIntElement(term1021, 2, 842904495);
        setIntElement(term1021, 3, 1008080511);
        setIntElement(term1021, 4, 1935707624);
        setIntElement(term1021, 5, 1507074215);
        setIntElement(term1021, 6, -282881827);
        setElement(term1010, 1, term1021);
        term1029 = (int[]) newIntArray(6);
        setIntElement(term1029, 0, -1183353915);
        setIntElement(term1029, 1, -420030135);
        setIntElement(term1029, 2, 267763294);
        setIntElement(term1029, 3, -1497710478);
        setIntElement(term1029, 4, 49950830);
        setIntElement(term1029, 5, -525257914);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.InsertInterval");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1010;
        args[1] = term1029;
        callMethod(klass, "insert", argTypes, term1009, args);
    }

};


