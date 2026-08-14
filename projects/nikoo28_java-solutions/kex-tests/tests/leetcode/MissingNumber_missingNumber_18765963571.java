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

public class MissingNumber_missingNumber_18765963571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5763;
     Object term5764;

    public MissingNumber_missingNumber_18765963571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5763 = newInstance(Class.forName("leetcode.MissingNumber"));
        term5764 = (int[]) newIntArray(9);
        setIntElement(term5764, 0, -552272253);
        setIntElement(term5764, 1, -633523956);
        setIntElement(term5764, 2, 1761540885);
        setIntElement(term5764, 3, -168498989);
        setIntElement(term5764, 4, 388247095);
        setIntElement(term5764, 5, -1320402633);
        setIntElement(term5764, 6, 919602316);
        setIntElement(term5764, 7, 1833713431);
        setIntElement(term5764, 8, -706222608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MissingNumber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5764;
        callMethod(klass, "missingNumber", argTypes, term5763, args);
    }

};


