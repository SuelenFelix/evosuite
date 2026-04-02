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
import java.lang.Character;

public class SmallestLetterGreaterThanTarget_nextGreatestLetter_11758040361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12011;
     Object term12012;
     Object term12022;

    public SmallestLetterGreaterThanTarget_nextGreatestLetter_11758040361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12011 = newInstance(Class.forName("leetcode.SmallestLetterGreaterThanTarget"));
        term12012 = (char[]) newCharArray(9);
        setCharElement(term12012, 0, 'n');
        setCharElement(term12012, 1, 'Y');
        setCharElement(term12012, 2, 'n');
        setCharElement(term12012, 3, 'L');
        setCharElement(term12012, 4, 'W');
        setCharElement(term12012, 5, 'B');
        setCharElement(term12012, 6, 'a');
        setCharElement(term12012, 7, 'J');
        setCharElement(term12012, 8, 'l');
        term12022 = new Character('i');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.SmallestLetterGreaterThanTarget");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term12012;
        args[1] = term12022;
        callMethod(klass, "nextGreatestLetter", argTypes, term12011, args);
    }

};


