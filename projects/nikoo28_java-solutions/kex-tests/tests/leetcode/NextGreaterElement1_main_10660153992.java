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

public class NextGreaterElement1_main_10660153992 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5134;

    public NextGreaterElement1_main_10660153992() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5134 = (Object[]) newArray("java.lang.String", 6);
        setElement(term5134, 0, "EYtfuJaxiM");
        setElement(term5134, 1, "gCWtLVKVVe");
        setElement(term5134, 2, "fWKJoSoCwE");
        setElement(term5134, 3, "wfaXBpWAUH");
        setElement(term5134, 4, "VMeAzAHwZj");
        setElement(term5134, 5, "PznxWXsZME");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NextGreaterElement1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5134;
        callMethod(klass, "main", argTypes, null, args);
    }

};


