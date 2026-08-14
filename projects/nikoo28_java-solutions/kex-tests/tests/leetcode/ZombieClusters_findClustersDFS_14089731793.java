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
import java.lang.Integer;

public class ZombieClusters_findClustersDFS_14089731793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9749;
     Object term9767;

    public ZombieClusters_findClustersDFS_14089731793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9749 = (Object[]) newArray("[I", 4);
        int[] term9750 = (int[]) newIntArray(2);
        int[] term9753 = (int[]) newIntArray(4);
        int[] term9758 = (int[]) newIntArray(1);
        int[] term9760 = (int[]) newIntArray(6);
        setIntElement(term9750, 0, -402072606);
        setIntElement(term9750, 1, -477355193);
        setElement(term9749, 0, term9750);
        setIntElement(term9753, 0, 168425089);
        setIntElement(term9753, 1, -571931590);
        setIntElement(term9753, 2, 37757400);
        setIntElement(term9753, 3, -1632221612);
        setElement(term9749, 1, term9753);
        setIntElement(term9758, 0, 1545314376);
        setElement(term9749, 2, term9758);
        setIntElement(term9760, 0, 437959151);
        setIntElement(term9760, 1, 27780241);
        setIntElement(term9760, 2, -683868408);
        setIntElement(term9760, 3, -381130069);
        setIntElement(term9760, 4, 885769749);
        setIntElement(term9760, 5, -1021168716);
        setElement(term9749, 3, term9760);
        term9767 = new Integer(-1238055654);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ZombieClusters");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term9749;
        args[1] = term9767;
        callMethod(klass, "findClustersDFS", argTypes, null, args);
    }

};


