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
import java.lang.Object;

public class IslandPerimeter_calculateWaterBoundaries_5396521722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8165;
     Object term8166;
     Object term8168;
     Object term8170;

    public IslandPerimeter_calculateWaterBoundaries_5396521722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8165 = newInstance(Class.forName("leetcode.IslandPerimeter"));
        term8166 = new Integer(1769496642);
        term8168 = new Integer(-947460705);
        term8170 = (Object[]) newArray("[I", 5);
        int[] term8171 = (int[]) newIntArray(4);
        int[] term8176 = (int[]) newIntArray(4);
        int[] term8181 = (int[]) newIntArray(9);
        int[] term8191 = (int[]) newIntArray(4);
        int[] term8196 = (int[]) newIntArray(3);
        setIntElement(term8171, 0, -1435758764);
        setIntElement(term8171, 1, 752858379);
        setIntElement(term8171, 2, -370819357);
        setIntElement(term8171, 3, -71819242);
        setElement(term8170, 0, term8171);
        setIntElement(term8176, 0, 1268893136);
        setIntElement(term8176, 1, -1472700822);
        setIntElement(term8176, 2, 1626670889);
        setIntElement(term8176, 3, -2117361140);
        setElement(term8170, 1, term8176);
        setIntElement(term8181, 0, 407708341);
        setIntElement(term8181, 1, -287519200);
        setIntElement(term8181, 2, -1490696181);
        setIntElement(term8181, 3, 623717232);
        setIntElement(term8181, 4, -1413291732);
        setIntElement(term8181, 5, 203264365);
        setIntElement(term8181, 6, -1066281036);
        setIntElement(term8181, 7, 30837706);
        setIntElement(term8181, 8, 379523101);
        setElement(term8170, 2, term8181);
        setIntElement(term8191, 0, 1017354215);
        setIntElement(term8191, 1, 695330987);
        setIntElement(term8191, 2, -267289967);
        setIntElement(term8191, 3, 773432822);
        setElement(term8170, 3, term8191);
        setIntElement(term8196, 0, -488294922);
        setIntElement(term8196, 1, -397161164);
        setIntElement(term8196, 2, -703717191);
        setElement(term8170, 4, term8196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.IslandPerimeter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term8166;
        args[1] = term8168;
        args[2] = term8170;
        callMethod(klass, "calculateWaterBoundaries", argTypes, term8165, args);
    }

};


