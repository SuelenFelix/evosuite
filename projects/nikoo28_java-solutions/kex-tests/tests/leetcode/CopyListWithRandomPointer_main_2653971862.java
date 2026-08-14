package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CopyListWithRandomPointer_main_2653971862 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5854;

    public CopyListWithRandomPointer_main_2653971862() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5854 = (Object[]) newArray("java.lang.String", 8);
        setElement(term5854, 0, "EeBVbzjcCI");
        setElement(term5854, 1, "UfQtPRyWRC");
        setElement(term5854, 2, "FPvxVzzSvD");
        setElement(term5854, 3, "WHcwFgsGFC");
        setElement(term5854, 4, "HzqpegHiRq");
        setElement(term5854, 5, "jwsfVjMoJT");
        setElement(term5854, 6, "ZfdXfCCFDf");
        setElement(term5854, 7, "MwwjNtdOFT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.CopyListWithRandomPointer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5854;
        callMethod(klass, "main", argTypes, null, args);
    }

};


