package leetcode.hard;

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
import static leetcode.hard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TrappingRainWaterII_trapRainWater_6937815971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536;
     Object term537;

    public TrappingRainWaterII_trapRainWater_6937815971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536 = newInstance(Class.forName("leetcode.hard.TrappingRainWaterII"));
        term537 = (Object[]) newArray("[I", 9);
        int[] term538 = (int[]) newIntArray(3);
        int[] term542 = (int[]) newIntArray(7);
        int[] term550 = (int[]) newIntArray(0);
        int[] term551 = (int[]) newIntArray(1);
        int[] term553 = (int[]) newIntArray(0);
        int[] term554 = (int[]) newIntArray(2);
        int[] term557 = (int[]) newIntArray(7);
        int[] term565 = (int[]) newIntArray(1);
        int[] term567 = (int[]) newIntArray(5);
        setIntElement(term538, 0, -341962980);
        setIntElement(term538, 1, 1532716628);
        setIntElement(term538, 2, -1801760683);
        setElement(term537, 0, term538);
        setIntElement(term542, 0, 1141317871);
        setIntElement(term542, 1, 890669485);
        setIntElement(term542, 2, 691577392);
        setIntElement(term542, 3, -893623680);
        setIntElement(term542, 4, -1963434938);
        setIntElement(term542, 5, 906181092);
        setIntElement(term542, 6, 1045657203);
        setElement(term537, 1, term542);
        setElement(term537, 2, term550);
        setIntElement(term551, 0, 1386130016);
        setElement(term537, 3, term551);
        setElement(term537, 4, term553);
        setIntElement(term554, 0, 1072005683);
        setIntElement(term554, 1, 1861318859);
        setElement(term537, 5, term554);
        setIntElement(term557, 0, 1474524152);
        setIntElement(term557, 1, 568954359);
        setIntElement(term557, 2, 53410913);
        setIntElement(term557, 3, -375014958);
        setIntElement(term557, 4, 1107176718);
        setIntElement(term557, 5, 480137250);
        setIntElement(term557, 6, -341152642);
        setElement(term537, 6, term557);
        setIntElement(term565, 0, -2015854073);
        setElement(term537, 7, term565);
        setIntElement(term567, 0, 538259104);
        setIntElement(term567, 1, 96566506);
        setIntElement(term567, 2, -343325701);
        setIntElement(term567, 3, 107945604);
        setIntElement(term567, 4, -1963464809);
        setElement(term537, 8, term567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.hard.TrappingRainWaterII");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term537;
        callMethod(klass, "trapRainWater", argTypes, term536, args);
    }

};


