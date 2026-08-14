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
     Object term8691;
     Object term8692;

    public NumberOfLinesToWriteString_numberOfLines_19519912871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8691 = newInstance(Class.forName("leetcode.NumberOfLinesToWriteString"));
        term8692 = (int[]) newIntArray(7);
        setIntElement(term8692, 0, 472580433);
        setIntElement(term8692, 1, 1189049164);
        setIntElement(term8692, 2, -673413879);
        setIntElement(term8692, 3, 1609778442);
        setIntElement(term8692, 4, 524850421);
        setIntElement(term8692, 5, -1833121756);
        setIntElement(term8692, 6, -1493632787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfLinesToWriteString");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term8692;
        args[1] = "HDaezxQfQR";
        callMethod(klass, "numberOfLines", argTypes, term8691, args);
    }

};


