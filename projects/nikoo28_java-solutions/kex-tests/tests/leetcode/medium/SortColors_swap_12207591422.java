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
import java.lang.Integer;

public class SortColors_swap_12207591422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3420;
     Object term3421;
     Object term3424;
     Object term3426;

    public SortColors_swap_12207591422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3420 = newInstance(Class.forName("leetcode.medium.SortColors"));
        term3421 = (int[]) newIntArray(2);
        setIntElement(term3421, 0, -1747711865);
        setIntElement(term3421, 1, 682812715);
        term3424 = new Integer(-1092883950);
        term3426 = new Integer(950385621);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.SortColors");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3421;
        args[1] = term3424;
        args[2] = term3426;
        callMethod(klass, "swap", argTypes, term3420, args);
    }

};


