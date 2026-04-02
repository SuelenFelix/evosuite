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

public class MaximalSquare_maximalSquare_8394719051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2613;
     Object term2614;

    public MaximalSquare_maximalSquare_8394719051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2613 = newInstance(Class.forName("leetcode.medium.MaximalSquare"));
        term2614 = (Object[]) newArray("[C", 9);
        char[] term2615 = (char[]) newCharArray(6);
        char[] term2622 = (char[]) newCharArray(1);
        char[] term2624 = (char[]) newCharArray(1);
        char[] term2626 = (char[]) newCharArray(6);
        char[] term2633 = (char[]) newCharArray(6);
        char[] term2640 = (char[]) newCharArray(5);
        char[] term2646 = (char[]) newCharArray(9);
        char[] term2656 = (char[]) newCharArray(2);
        char[] term2659 = (char[]) newCharArray(7);
        setCharElement(term2615, 0, 'V');
        setCharElement(term2615, 1, 'p');
        setCharElement(term2615, 2, 'O');
        setCharElement(term2615, 3, 'Q');
        setCharElement(term2615, 4, 'T');
        setCharElement(term2615, 5, 'y');
        setElement(term2614, 0, term2615);
        setCharElement(term2622, 0, 'S');
        setElement(term2614, 1, term2622);
        setCharElement(term2624, 0, 'M');
        setElement(term2614, 2, term2624);
        setCharElement(term2626, 0, 'j');
        setCharElement(term2626, 1, 'G');
        setCharElement(term2626, 2, 'Y');
        setCharElement(term2626, 3, 'S');
        setCharElement(term2626, 4, 'R');
        setCharElement(term2626, 5, 'K');
        setElement(term2614, 3, term2626);
        setCharElement(term2633, 0, 'T');
        setCharElement(term2633, 1, 'N');
        setCharElement(term2633, 2, 'F');
        setCharElement(term2633, 3, 'h');
        setCharElement(term2633, 4, 'R');
        setCharElement(term2633, 5, 'N');
        setElement(term2614, 4, term2633);
        setCharElement(term2640, 0, 'S');
        setCharElement(term2640, 1, 'z');
        setCharElement(term2640, 2, 'Y');
        setCharElement(term2640, 3, 'Y');
        setCharElement(term2640, 4, 'I');
        setElement(term2614, 5, term2640);
        setCharElement(term2646, 0, 'r');
        setCharElement(term2646, 1, 'c');
        setCharElement(term2646, 2, 'R');
        setCharElement(term2646, 3, 'M');
        setCharElement(term2646, 4, 'F');
        setCharElement(term2646, 5, 'I');
        setCharElement(term2646, 6, 's');
        setCharElement(term2646, 7, 'Y');
        setCharElement(term2646, 8, 'G');
        setElement(term2614, 6, term2646);
        setCharElement(term2656, 0, 'g');
        setCharElement(term2656, 1, 'n');
        setElement(term2614, 7, term2656);
        setCharElement(term2659, 0, 'e');
        setCharElement(term2659, 1, 'N');
        setCharElement(term2659, 2, 'R');
        setCharElement(term2659, 3, 'd');
        setCharElement(term2659, 4, 'v');
        setCharElement(term2659, 5, 'g');
        setCharElement(term2659, 6, 'J');
        setElement(term2614, 8, term2659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.MaximalSquare");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term2614;
        callMethod(klass, "maximalSquare", argTypes, term2613, args);
    }

};


