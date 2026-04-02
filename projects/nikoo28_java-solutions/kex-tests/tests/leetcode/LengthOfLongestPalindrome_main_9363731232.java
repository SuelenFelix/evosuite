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

public class LengthOfLongestPalindrome_main_9363731232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9972;

    public LengthOfLongestPalindrome_main_9363731232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9972 = (Object[]) newArray("java.lang.String", 5);
        setElement(term9972, 0, "EwQBhZjCIT");
        setElement(term9972, 1, "aSkmSwTnEw");
        setElement(term9972, 2, "xvkbvaEGYd");
        setElement(term9972, 3, "HBGNxdNURv");
        setElement(term9972, 4, "mfCpTPPQQm");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.LengthOfLongestPalindrome");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9972;
        callMethod(klass, "main", argTypes, null, args);
    }

};


