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

public class BucketSort_bucketSort_4114968901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2508;
     Object term2516;

    public BucketSort_bucketSort_4114968901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2508 = (int[]) newIntArray(7);
        setIntElement(term2508, 0, 864645689);
        setIntElement(term2508, 1, 279384872);
        setIntElement(term2508, 2, 1427305953);
        setIntElement(term2508, 3, -781832877);
        setIntElement(term2508, 4, 797203987);
        setIntElement(term2508, 5, 1973060703);
        setIntElement(term2508, 6, -138239905);
        term2516 = new Integer(1709474063);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("util.BucketSort");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term2508;
        args[1] = term2516;
        callMethod(klass, "bucketSort", argTypes, null, args);
    }

};


