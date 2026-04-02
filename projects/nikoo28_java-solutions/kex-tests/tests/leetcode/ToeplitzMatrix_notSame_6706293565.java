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
import java.lang.Integer;

public class ToeplitzMatrix_notSame_6706293565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1230;
     Object term1231;
     Object term1233;
     Object term1235;
     Object term1237;
     Object term1239;

    public ToeplitzMatrix_notSame_6706293565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1230 = newInstance(Class.forName("leetcode.ToeplitzMatrix"));
        term1231 = new Integer(0);
        term1233 = new Integer(0);
        term1235 = new Integer(0);
        term1237 = new Integer(0);
        term1239 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ToeplitzMatrix");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term1231;
        args[2] = term1233;
        args[3] = term1235;
        args[4] = term1237;
        args[5] = term1239;
        callMethod(klass, "notSame", argTypes, term1230, args);
    }

};


