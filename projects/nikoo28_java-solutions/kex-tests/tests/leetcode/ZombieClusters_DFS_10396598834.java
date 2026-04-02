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

public class ZombieClusters_DFS_10396598834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9670;
     Object term9686;
     Object term9688;
     Object term9695;

    public ZombieClusters_DFS_10396598834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9670 = (Object[]) newArray("[I", 4);
        int[] term9671 = (int[]) newIntArray(2);
        int[] term9674 = (int[]) newIntArray(6);
        int[] term9681 = (int[]) newIntArray(0);
        int[] term9682 = (int[]) newIntArray(3);
        setIntElement(term9671, 0, 962385185);
        setIntElement(term9671, 1, 2146718886);
        setElement(term9670, 0, term9671);
        setIntElement(term9674, 0, -985577036);
        setIntElement(term9674, 1, 802539130);
        setIntElement(term9674, 2, 2105146188);
        setIntElement(term9674, 3, -862415480);
        setIntElement(term9674, 4, 312605349);
        setIntElement(term9674, 5, -402072606);
        setElement(term9670, 1, term9674);
        setElement(term9670, 2, term9681);
        setIntElement(term9682, 0, -477355193);
        setIntElement(term9682, 1, 168425089);
        setIntElement(term9682, 2, -571931590);
        setElement(term9670, 3, term9682);
        term9686 = new Integer(37757400);
        term9688 = (boolean[]) newBooleanArray(6);
        setBooleanElement(term9688, 0, true);
        setBooleanElement(term9688, 2, true);
        setBooleanElement(term9688, 4, true);
        term9695 = new Integer(-1632221612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ZombieClusters");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(boolean.class, 0).getClass();
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term9670;
        args[1] = term9686;
        args[2] = term9688;
        args[3] = term9695;
        callMethod(klass, "DFS", argTypes, null, args);
    }

};


