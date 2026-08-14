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

public class MaxAreaOfIsland_maxAreaOfIsland_1725514831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1860;
     Object term1861;

    public MaxAreaOfIsland_maxAreaOfIsland_1725514831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1860 = newInstance(Class.forName("leetcode.MaxAreaOfIsland"));
        term1861 = (Object[]) newArray("[I", 6);
        int[] term1862 = (int[]) newIntArray(7);
        int[] term1870 = (int[]) newIntArray(9);
        int[] term1880 = (int[]) newIntArray(7);
        int[] term1888 = (int[]) newIntArray(6);
        int[] term1895 = (int[]) newIntArray(6);
        int[] term1902 = (int[]) newIntArray(0);
        setIntElement(term1862, 0, -1347358701);
        setIntElement(term1862, 1, 806595993);
        setIntElement(term1862, 2, 548228925);
        setIntElement(term1862, 3, -749861210);
        setIntElement(term1862, 4, 1694224101);
        setIntElement(term1862, 5, 937859191);
        setIntElement(term1862, 6, -916584829);
        setElement(term1861, 0, term1862);
        setIntElement(term1870, 0, -2131181468);
        setIntElement(term1870, 1, 282916351);
        setIntElement(term1870, 2, 880977281);
        setIntElement(term1870, 3, 371943306);
        setIntElement(term1870, 4, 982388293);
        setIntElement(term1870, 5, -159494544);
        setIntElement(term1870, 6, -75206835);
        setIntElement(term1870, 7, -1618206977);
        setIntElement(term1870, 8, -1747406163);
        setElement(term1861, 1, term1870);
        setIntElement(term1880, 0, 388157121);
        setIntElement(term1880, 1, 1684998508);
        setIntElement(term1880, 2, -1476644457);
        setIntElement(term1880, 3, 1270666529);
        setIntElement(term1880, 4, -1146679443);
        setIntElement(term1880, 5, -860131894);
        setIntElement(term1880, 6, -1022990421);
        setElement(term1861, 2, term1880);
        setIntElement(term1888, 0, 1045547089);
        setIntElement(term1888, 1, -1122880881);
        setIntElement(term1888, 2, -542712742);
        setIntElement(term1888, 3, -1254072822);
        setIntElement(term1888, 4, -1111249833);
        setIntElement(term1888, 5, -1692331299);
        setElement(term1861, 3, term1888);
        setIntElement(term1895, 0, 479531250);
        setIntElement(term1895, 1, 1320570890);
        setIntElement(term1895, 2, -130649791);
        setIntElement(term1895, 3, 534834644);
        setIntElement(term1895, 4, 1959097203);
        setIntElement(term1895, 5, -209654048);
        setElement(term1861, 4, term1895);
        setElement(term1861, 5, term1902);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MaxAreaOfIsland");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1861;
        callMethod(klass, "maxAreaOfIsland", argTypes, term1860, args);
    }

};


