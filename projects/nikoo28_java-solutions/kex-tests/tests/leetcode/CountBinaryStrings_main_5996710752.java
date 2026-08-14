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

public class CountBinaryStrings_main_5996710752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11331;

    public CountBinaryStrings_main_5996710752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11331 = (Object[]) newArray("java.lang.String", 5);
        setElement(term11331, 0, "bnsyeQXFdu");
        setElement(term11331, 1, "BwtdjiefJn");
        setElement(term11331, 2, "jDmhBrIoDa");
        setElement(term11331, 3, "SPtPatHeOm");
        setElement(term11331, 4, "ywmcuThdfL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.CountBinaryStrings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11331;
        callMethod(klass, "main", argTypes, null, args);
    }

};


