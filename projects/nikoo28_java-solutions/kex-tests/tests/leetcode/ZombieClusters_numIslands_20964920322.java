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
     Object term9680;
     Object term9694;

    public ZombieClusters_numIslands_20964920322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9680 = newInstance(Class.forName("leetcode.ZombieClusters"));
        Object[] term9681 = (Object[]) newArray("[I", 4);
        int[] term9682 = (int[]) newIntArray(2);
        int[] term9685 = (int[]) newIntArray(2);
        int[] term9688 = (int[]) newIntArray(2);
        int[] term9691 = (int[]) newIntArray(2);
        setIntElement(term9682, 0, 1);
        setElement(term9681, 0, term9682);
        setIntElement(term9685, 0, -1);
        setElement(term9681, 1, term9685);
        setIntElement(term9688, 1, 1);
        setElement(term9681, 2, term9688);
        setIntElement(term9691, 1, -1);
        setElement(term9681, 3, term9691);
        setField(term9680, term9680.getClass(), "distance", term9681);
        term9694 = (Object[]) newArray("[C", 4);
        char[] term9695 = (char[]) newCharArray(9);
        char[] term9705 = (char[]) newCharArray(6);
        char[] term9712 = (char[]) newCharArray(3);
        char[] term9716 = (char[]) newCharArray(3);
        setCharElement(term9695, 0, 'Y');
        setCharElement(term9695, 1, 'V');
        setCharElement(term9695, 2, 'z');
        setCharElement(term9695, 3, 'R');
        setCharElement(term9695, 4, 'f');
        setCharElement(term9695, 5, 'L');
        setCharElement(term9695, 6, 'Q');
        setCharElement(term9695, 7, 'F');
        setCharElement(term9695, 8, 'p');
        setElement(term9694, 0, term9695);
        setCharElement(term9705, 0, 'a');
        setCharElement(term9705, 1, 'H');
        setCharElement(term9705, 2, 'E');
        setCharElement(term9705, 3, 'w');
        setCharElement(term9705, 4, 'X');
        setCharElement(term9705, 5, 'R');
        setElement(term9694, 1, term9705);
        setCharElement(term9712, 0, 'o');
        setCharElement(term9712, 1, 'V');
        setCharElement(term9712, 2, 'c');
        setElement(term9694, 2, term9712);
        setCharElement(term9716, 0, 'I');
        setCharElement(term9716, 1, 'n');
        setCharElement(term9716, 2, 'Y');
        setElement(term9694, 3, term9716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.ZombieClusters");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9694;
        callMethod(klass, "numIslands", argTypes, term9680, args);
    }

};


