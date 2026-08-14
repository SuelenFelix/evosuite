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
     Object term12431;
     Object term12432;
     Object term12438;

    public SmallestLetterGreaterThanTarget_nextGreatestLetter_11758040361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12431 = newInstance(Class.forName("leetcode.SmallestLetterGreaterThanTarget"));
        term12432 = (char[]) newCharArray(5);
        setCharElement(term12432, 0, 'B');
        setCharElement(term12432, 1, 'a');
        setCharElement(term12432, 2, 'J');
        setCharElement(term12432, 3, 'l');
        setCharElement(term12432, 4, 'i');
        term12438 = new Character('e');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.SmallestLetterGreaterThanTarget");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term12432;
        args[1] = term12438;
        callMethod(klass, "nextGreatestLetter", argTypes, term12431, args);
    }

};


