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
     Object term9782;
     Object term9837;
     Object term9839;
     Object term9848;

    public ZombieClusters_DFS_10396598834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9782 = (Object[]) newArray("[I", 8);
        int[] term9783 = (int[]) newIntArray(6);
        int[] term9790 = (int[]) newIntArray(8);
        int[] term9799 = (int[]) newIntArray(6);
        int[] term9806 = (int[]) newIntArray(3);
        int[] term9810 = (int[]) newIntArray(9);
        int[] term9820 = (int[]) newIntArray(1);
        int[] term9822 = (int[]) newIntArray(4);
        int[] term9827 = (int[]) newIntArray(9);
        setIntElement(term9783, 0, 1561513428);
        setIntElement(term9783, 1, 778959809);
        setIntElement(term9783, 2, -7504064);
        setIntElement(term9783, 3, -1464364418);
        setIntElement(term9783, 4, 1050420173);
        setIntElement(term9783, 5, 994300935);
        setElement(term9782, 0, term9783);
        setIntElement(term9790, 0, 433954476);
        setIntElement(term9790, 1, 1780958641);
        setIntElement(term9790, 2, 1890582085);
        setIntElement(term9790, 3, 2146568808);
        setIntElement(term9790, 4, 245081679);
        setIntElement(term9790, 5, 1199789398);
        setIntElement(term9790, 6, -1056402285);
        setIntElement(term9790, 7, 1881803912);
        setElement(term9782, 1, term9790);
        setIntElement(term9799, 0, -188535038);
        setIntElement(term9799, 1, 254650626);
        setIntElement(term9799, 2, -1789030917);
        setIntElement(term9799, 3, 912208163);
        setIntElement(term9799, 4, 909767683);
        setIntElement(term9799, 5, -639390893);
        setElement(term9782, 2, term9799);
        setIntElement(term9806, 0, 1176415280);
        setIntElement(term9806, 1, -1272714687);
        setIntElement(term9806, 2, -762778853);
        setElement(term9782, 3, term9806);
        setIntElement(term9810, 0, 946727239);
        setIntElement(term9810, 1, 349182490);
        setIntElement(term9810, 2, -353671511);
        setIntElement(term9810, 3, 1598831363);
        setIntElement(term9810, 4, -690367798);
        setIntElement(term9810, 5, 1863738073);
        setIntElement(term9810, 6, 2009028243);
        setIntElement(term9810, 7, 1900131331);
        setIntElement(term9810, 8, -1489604464);
        setElement(term9782, 4, term9810);
        setIntElement(term9820, 0, 601642248);
        setElement(term9782, 5, term9820);
        setIntElement(term9822, 0, -1186936928);
        setIntElement(term9822, 1, -315380004);
        setIntElement(term9822, 2, -1945754843);
        setIntElement(term9822, 3, -1512221115);
        setElement(term9782, 6, term9822);
        setIntElement(term9827, 0, -515486706);
        setIntElement(term9827, 1, -612862488);
        setIntElement(term9827, 2, 52739905);
        setIntElement(term9827, 3, -2105349391);
        setIntElement(term9827, 4, -1176968921);
        setIntElement(term9827, 5, -1986225025);
        setIntElement(term9827, 6, -838689952);
        setIntElement(term9827, 7, -307464652);
        setIntElement(term9827, 8, 460605690);
        setElement(term9782, 7, term9827);
        term9837 = new Integer(2119231643);
        term9839 = (boolean[]) newBooleanArray(8);
        setBooleanElement(term9839, 1, true);
        setBooleanElement(term9839, 3, true);
        setBooleanElement(term9839, 5, true);
        term9848 = new Integer(688546450);
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
        args[0] = term9782;
        args[1] = term9837;
        args[2] = term9839;
        args[3] = term9848;
        callMethod(klass, "DFS", argTypes, null, args);
    }

};


