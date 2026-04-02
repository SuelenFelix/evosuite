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

public class BaseballGame_calPoints_2234202711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7370;
     Object term7371;

    public BaseballGame_calPoints_2234202711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7370 = newInstance(Class.forName("leetcode.BaseballGame"));
        term7371 = (Object[]) newArray("java.lang.String", 9);
        setElement(term7371, 0, "smnHEqRFRx");
        setElement(term7371, 1, "XYtryyobou");
        setElement(term7371, 2, "OYbzXylRWW");
        setElement(term7371, 3, "DSNsTGYXDF");
        setElement(term7371, 4, "sQvGcVjdEx");
        setElement(term7371, 5, "rLHAoqXgPh");
        setElement(term7371, 6, "zUlRdimJtU");
        setElement(term7371, 7, "vwbEQQNQrx");
        setElement(term7371, 8, "xtftXXMbem");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.BaseballGame");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7371;
        callMethod(klass, "calPoints", argTypes, term7370, args);
    }

};


