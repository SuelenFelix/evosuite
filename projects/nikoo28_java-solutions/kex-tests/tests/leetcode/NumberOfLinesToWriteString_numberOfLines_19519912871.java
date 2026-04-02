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

public class NumberOfLinesToWriteString_numberOfLines_19519912871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8496;
     Object term8497;

    public NumberOfLinesToWriteString_numberOfLines_19519912871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8496 = newInstance(Class.forName("leetcode.NumberOfLinesToWriteString"));
        term8497 = (int[]) newIntArray(4);
        setIntElement(term8497, 0, 1674165862);
        setIntElement(term8497, 1, 1875252647);
        setIntElement(term8497, 2, -1298688401);
        setIntElement(term8497, 3, 1907832341);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfLinesToWriteString");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term8497;
        args[1] = "JppkknKVOw";
        callMethod(klass, "numberOfLines", argTypes, term8496, args);
    }

};


