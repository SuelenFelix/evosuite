package leetcode.easy;

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
import static leetcode.easy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class RotateArray_reverse_10071949642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1872;
     Object term1873;
     Object term1880;
     Object term1882;

    public RotateArray_reverse_10071949642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1872 = newInstance(Class.forName("leetcode.easy.RotateArray"));
        term1873 = (int[]) newIntArray(6);
        setIntElement(term1873, 0, 1084849225);
        setIntElement(term1873, 1, -1702055571);
        setIntElement(term1873, 2, -944542900);
        setIntElement(term1873, 3, 2063762142);
        setIntElement(term1873, 4, 1658391716);
        setIntElement(term1873, 5, 2143282300);
        term1880 = new Integer(1137624258);
        term1882 = new Integer(977862393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.easy.RotateArray");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term1873;
        args[1] = term1880;
        args[2] = term1882;
        callMethod(klass, "reverse", argTypes, term1872, args);
    }

};


