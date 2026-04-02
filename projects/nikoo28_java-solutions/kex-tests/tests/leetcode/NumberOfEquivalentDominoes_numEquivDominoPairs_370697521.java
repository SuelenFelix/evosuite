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
     Object term11463;
     Object term11464;

    public NumberOfEquivalentDominoes_numEquivDominoPairs_370697521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11463 = newInstance(Class.forName("leetcode.NumberOfEquivalentDominoes"));
        term11464 = (Object[]) newArray("[I", 5);
        int[] term11465 = (int[]) newIntArray(0);
        int[] term11466 = (int[]) newIntArray(2);
        int[] term11469 = (int[]) newIntArray(6);
        int[] term11476 = (int[]) newIntArray(3);
        int[] term11480 = (int[]) newIntArray(7);
        setElement(term11464, 0, term11465);
        setIntElement(term11466, 0, -1542216721);
        setIntElement(term11466, 1, -311300330);
        setElement(term11464, 1, term11466);
        setIntElement(term11469, 0, 1160936971);
        setIntElement(term11469, 1, 1258846008);
        setIntElement(term11469, 2, 702866958);
        setIntElement(term11469, 3, 622731276);
        setIntElement(term11469, 4, -1302341502);
        setIntElement(term11469, 5, 1113574554);
        setElement(term11464, 2, term11469);
        setIntElement(term11476, 0, 1685800093);
        setIntElement(term11476, 1, -318699441);
        setIntElement(term11476, 2, 1381027809);
        setElement(term11464, 3, term11476);
        setIntElement(term11480, 0, -371717995);
        setIntElement(term11480, 1, 1713005479);
        setIntElement(term11480, 2, -1948910444);
        setIntElement(term11480, 3, -1099061955);
        setIntElement(term11480, 4, -1672904007);
        setIntElement(term11480, 5, -217232010);
        setIntElement(term11480, 6, 2053372601);
        setElement(term11464, 4, term11480);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfEquivalentDominoes");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11464;
        callMethod(klass, "numEquivDominoPairs", argTypes, term11463, args);
    }

};


