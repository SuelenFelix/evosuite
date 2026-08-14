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

public class NumberOfEquivalentDominoes_numEquivDominoPairs_370697521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11835;
     Object term11836;

    public NumberOfEquivalentDominoes_numEquivDominoPairs_370697521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11835 = newInstance(Class.forName("leetcode.NumberOfEquivalentDominoes"));
        term11836 = (Object[]) newArray("[I", 6);
        int[] term11837 = (int[]) newIntArray(8);
        int[] term11846 = (int[]) newIntArray(8);
        int[] term11855 = (int[]) newIntArray(5);
        int[] term11861 = (int[]) newIntArray(6);
        int[] term11868 = (int[]) newIntArray(6);
        int[] term11875 = (int[]) newIntArray(5);
        setIntElement(term11837, 0, 511399994);
        setIntElement(term11837, 1, 2094923086);
        setIntElement(term11837, 2, 1532355365);
        setIntElement(term11837, 3, -156316508);
        setIntElement(term11837, 4, -1304449497);
        setIntElement(term11837, 5, -80320412);
        setIntElement(term11837, 6, -356797136);
        setIntElement(term11837, 7, -2035641970);
        setElement(term11836, 0, term11837);
        setIntElement(term11846, 0, 1813581230);
        setIntElement(term11846, 1, 844569461);
        setIntElement(term11846, 2, -15085966);
        setIntElement(term11846, 3, -1929631412);
        setIntElement(term11846, 4, 1014160441);
        setIntElement(term11846, 5, 975753484);
        setIntElement(term11846, 6, -1886360357);
        setIntElement(term11846, 7, -235867268);
        setElement(term11836, 1, term11846);
        setIntElement(term11855, 0, -972330704);
        setIntElement(term11855, 1, 134173297);
        setIntElement(term11855, 2, 2025698852);
        setIntElement(term11855, 3, 113961338);
        setIntElement(term11855, 4, 1869277085);
        setElement(term11836, 2, term11855);
        setIntElement(term11861, 0, 498801287);
        setIntElement(term11861, 1, 969573395);
        setIntElement(term11861, 2, -899109027);
        setIntElement(term11861, 3, -694297070);
        setIntElement(term11861, 4, 786551253);
        setIntElement(term11861, 5, -104779523);
        setElement(term11836, 3, term11861);
        setIntElement(term11868, 0, 749289511);
        setIntElement(term11868, 1, -414437174);
        setIntElement(term11868, 2, -860227615);
        setIntElement(term11868, 3, -1696192372);
        setIntElement(term11868, 4, 1239525687);
        setIntElement(term11868, 5, 1496590861);
        setElement(term11836, 4, term11868);
        setIntElement(term11875, 0, 1046957508);
        setIntElement(term11875, 1, -553500478);
        setIntElement(term11875, 2, 841910530);
        setIntElement(term11875, 3, -1415371559);
        setIntElement(term11875, 4, -2083858949);
        setElement(term11836, 5, term11875);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfEquivalentDominoes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11836;
        callMethod(klass, "numEquivDominoPairs", argTypes, term11835, args);
    }

};


