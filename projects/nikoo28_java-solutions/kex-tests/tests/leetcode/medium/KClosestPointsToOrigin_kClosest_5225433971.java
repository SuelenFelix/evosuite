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
import java.lang.Integer;

public class KClosestPointsToOrigin_kClosest_5225433971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1619;
     Object term1620;
     Object term1677;

    public KClosestPointsToOrigin_kClosest_5225433971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1619 = newInstance(Class.forName("leetcode.medium.KClosestPointsToOrigin"));
        term1620 = (Object[]) newArray("[I", 9);
        int[] term1621 = (int[]) newIntArray(6);
        int[] term1628 = (int[]) newIntArray(8);
        int[] term1637 = (int[]) newIntArray(6);
        int[] term1644 = (int[]) newIntArray(2);
        int[] term1647 = (int[]) newIntArray(1);
        int[] term1649 = (int[]) newIntArray(5);
        int[] term1655 = (int[]) newIntArray(3);
        int[] term1659 = (int[]) newIntArray(9);
        int[] term1669 = (int[]) newIntArray(7);
        setIntElement(term1621, 0, 1023209512);
        setIntElement(term1621, 1, 1084849225);
        setIntElement(term1621, 2, -1702055571);
        setIntElement(term1621, 3, -944542900);
        setIntElement(term1621, 4, 2063762142);
        setIntElement(term1621, 5, 1658391716);
        setElement(term1620, 0, term1621);
        setIntElement(term1628, 0, 2143282300);
        setIntElement(term1628, 1, 1137624258);
        setIntElement(term1628, 2, 977862393);
        setIntElement(term1628, 3, 301401782);
        setIntElement(term1628, 4, 1988605357);
        setIntElement(term1628, 5, 808203320);
        setIntElement(term1628, 6, -544382127);
        setIntElement(term1628, 7, -1830198043);
        setElement(term1620, 1, term1628);
        setIntElement(term1637, 0, -439048495);
        setIntElement(term1637, 1, -1849105286);
        setIntElement(term1637, 2, 1334483645);
        setIntElement(term1637, 3, 917513193);
        setIntElement(term1637, 4, 787278105);
        setIntElement(term1637, 5, -2063843486);
        setElement(term1620, 2, term1637);
        setIntElement(term1644, 0, 833762980);
        setIntElement(term1644, 1, 320711637);
        setElement(term1620, 3, term1644);
        setIntElement(term1647, 0, 1241164745);
        setElement(term1620, 4, term1647);
        setIntElement(term1649, 0, 1723148410);
        setIntElement(term1649, 1, -920797484);
        setIntElement(term1649, 2, -1631697577);
        setIntElement(term1649, 3, 765731371);
        setIntElement(term1649, 4, -1703035419);
        setElement(term1620, 5, term1649);
        setIntElement(term1655, 0, 765766290);
        setIntElement(term1655, 1, -1284825282);
        setIntElement(term1655, 2, -1941343035);
        setElement(term1620, 6, term1655);
        setIntElement(term1659, 0, 947897214);
        setIntElement(term1659, 1, 1496340209);
        setIntElement(term1659, 2, -1748391876);
        setIntElement(term1659, 3, 43258317);
        setIntElement(term1659, 4, 1707220033);
        setIntElement(term1659, 5, -1792504217);
        setIntElement(term1659, 6, 1824538861);
        setIntElement(term1659, 7, 499519708);
        setIntElement(term1659, 8, 1501165033);
        setElement(term1620, 7, term1659);
        setIntElement(term1669, 0, 510162332);
        setIntElement(term1669, 1, 888506903);
        setIntElement(term1669, 2, 200252898);
        setIntElement(term1669, 3, -1831826725);
        setIntElement(term1669, 4, 752152965);
        setIntElement(term1669, 5, -1577069773);
        setIntElement(term1669, 6, -266625190);
        setElement(term1620, 8, term1669);
        term1677 = new Integer(489201218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.KClosestPointsToOrigin");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1620;
        args[1] = term1677;
        callMethod(klass, "kClosest", argTypes, term1619, args);
    }

};


