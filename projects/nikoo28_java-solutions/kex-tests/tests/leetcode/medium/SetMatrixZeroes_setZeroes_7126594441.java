package leetcode.medium;

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
import static leetcode.medium.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SetMatrixZeroes_setZeroes_7126594441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term394;
     Object term395;

    public SetMatrixZeroes_setZeroes_7126594441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term394 = newInstance(Class.forName("leetcode.medium.SetMatrixZeroes"));
        term395 = (Object[]) newArray("[I", 3);
        int[] term396 = (int[]) newIntArray(7);
        int[] term404 = (int[]) newIntArray(2);
        int[] term407 = (int[]) newIntArray(6);
        setIntElement(term396, 0, 335112684);
        setIntElement(term396, 1, 1551099402);
        setIntElement(term396, 2, -2027534003);
        setIntElement(term396, 3, 1063420942);
        setIntElement(term396, 4, 1375330971);
        setIntElement(term396, 5, -478195677);
        setIntElement(term396, 6, 972867650);
        setElement(term395, 0, term396);
        setIntElement(term404, 0, 1655935355);
        setIntElement(term404, 1, -481533957);
        setElement(term395, 1, term404);
        setIntElement(term407, 0, 1240914516);
        setIntElement(term407, 1, -1465035361);
        setIntElement(term407, 2, 1090617576);
        setIntElement(term407, 3, -1547384488);
        setIntElement(term407, 4, 1442160736);
        setIntElement(term407, 5, 1114000454);
        setElement(term395, 2, term407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SetMatrixZeroes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term395;
        callMethod(klass, "setZeroes", argTypes, term394, args);
    }

};


