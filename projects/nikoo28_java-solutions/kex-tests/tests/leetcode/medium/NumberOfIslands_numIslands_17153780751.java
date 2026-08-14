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

public class NumberOfIslands_numIslands_17153780751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term24;

    public NumberOfIslands_numIslands_17153780751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("leetcode.medium.NumberOfIslands"));
        term24 = (Object[]) newArray("[C", 3);
        char[] term25 = (char[]) newCharArray(4);
        char[] term30 = (char[]) newCharArray(1);
        char[] term32 = (char[]) newCharArray(6);
        setCharElement(term25, 0, 'P');
        setCharElement(term25, 1, 'A');
        setCharElement(term25, 2, 'E');
        setCharElement(term25, 3, 'B');
        setElement(term24, 0, term25);
        setCharElement(term30, 0, 't');
        setElement(term24, 1, term30);
        setCharElement(term32, 0, 'n');
        setCharElement(term32, 1, 'Z');
        setCharElement(term32, 2, 't');
        setCharElement(term32, 3, 'T');
        setCharElement(term32, 4, 'D');
        setCharElement(term32, 5, 's');
        setElement(term24, 2, term32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.NumberOfIslands");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24;
        callMethod(klass, "numIslands", argTypes, term23, args);
    }

};


