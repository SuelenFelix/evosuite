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

public class ZombieClusters_numIslands_20964920322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9587;
     Object term9601;

    public ZombieClusters_numIslands_20964920322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9587 = newInstance(Class.forName("leetcode.ZombieClusters"));
        Object[] term9588 = (Object[]) newArray("[I", 4);
        int[] term9589 = (int[]) newIntArray(2);
        int[] term9592 = (int[]) newIntArray(2);
        int[] term9595 = (int[]) newIntArray(2);
        int[] term9598 = (int[]) newIntArray(2);
        setIntElement(term9589, 0, 1);
        setElement(term9588, 0, term9589);
        setIntElement(term9592, 0, -1);
        setElement(term9588, 1, term9592);
        setIntElement(term9595, 1, 1);
        setElement(term9588, 2, term9595);
        setIntElement(term9598, 1, -1);
        setElement(term9588, 3, term9598);
        setField(term9587, term9587.getClass(), "distance", term9588);
        term9601 = (Object[]) newArray("[C", 6);
        char[] term9602 = (char[]) newCharArray(4);
        char[] term9607 = (char[]) newCharArray(3);
        char[] term9611 = (char[]) newCharArray(7);
        char[] term9619 = (char[]) newCharArray(6);
        char[] term9626 = (char[]) newCharArray(0);
        char[] term9627 = (char[]) newCharArray(3);
        setCharElement(term9602, 0, 'M');
        setCharElement(term9602, 1, 'x');
        setCharElement(term9602, 2, 'l');
        setCharElement(term9602, 3, 's');
        setElement(term9601, 0, term9602);
        setCharElement(term9607, 0, 'z');
        setCharElement(term9607, 1, 'Y');
        setCharElement(term9607, 2, 'V');
        setElement(term9601, 1, term9607);
        setCharElement(term9611, 0, 'z');
        setCharElement(term9611, 1, 'R');
        setCharElement(term9611, 2, 'f');
        setCharElement(term9611, 3, 'L');
        setCharElement(term9611, 4, 'Q');
        setCharElement(term9611, 5, 'F');
        setCharElement(term9611, 6, 'p');
        setElement(term9601, 2, term9611);
        setCharElement(term9619, 0, 'a');
        setCharElement(term9619, 1, 'H');
        setCharElement(term9619, 2, 'E');
        setCharElement(term9619, 3, 'w');
        setCharElement(term9619, 4, 'X');
        setCharElement(term9619, 5, 'R');
        setElement(term9601, 3, term9619);
        setElement(term9601, 4, term9626);
        setCharElement(term9627, 0, 'o');
        setCharElement(term9627, 1, 'V');
        setCharElement(term9627, 2, 'c');
        setElement(term9601, 5, term9627);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ZombieClusters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9601;
        callMethod(klass, "numIslands", argTypes, term9587, args);
    }

};


