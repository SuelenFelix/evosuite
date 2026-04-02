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

public class NumberOfIslands_numIslandsBFS_4699463103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84;
     Object term85;

    public NumberOfIslands_numIslandsBFS_4699463103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84 = newInstance(Class.forName("leetcode.medium.NumberOfIslands"));
        term85 = (Object[]) newArray("[C", 1);
        char[] term86 = (char[]) newCharArray(6);
        setCharElement(term86, 0, 'g');
        setCharElement(term86, 1, 'Q');
        setCharElement(term86, 2, 'H');
        setCharElement(term86, 3, 'g');
        setCharElement(term86, 4, 'q');
        setCharElement(term86, 5, 'z');
        setElement(term85, 0, term86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.NumberOfIslands");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term85;
        callMethod(klass, "numIslandsBFS", argTypes, term84, args);
    }

};


