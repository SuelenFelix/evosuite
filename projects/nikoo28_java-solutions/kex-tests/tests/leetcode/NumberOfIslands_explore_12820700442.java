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
import java.lang.Integer;

public class NumberOfIslands_explore_12820700442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6437;
     Object term6438;
     Object term6461;
     Object term6463;

    public NumberOfIslands_explore_12820700442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6437 = newInstance(Class.forName("leetcode.NumberOfIslands"));
        term6438 = (Object[]) newArray("[C", 3);
        char[] term6439 = (char[]) newCharArray(9);
        char[] term6449 = (char[]) newCharArray(5);
        char[] term6455 = (char[]) newCharArray(5);
        setCharElement(term6439, 0, 'K');
        setCharElement(term6439, 1, 'T');
        setCharElement(term6439, 2, 'N');
        setCharElement(term6439, 3, 'F');
        setCharElement(term6439, 4, 'h');
        setCharElement(term6439, 5, 'R');
        setCharElement(term6439, 6, 'N');
        setCharElement(term6439, 7, 'S');
        setCharElement(term6439, 8, 'z');
        setElement(term6438, 0, term6439);
        setCharElement(term6449, 0, 'Y');
        setCharElement(term6449, 1, 'Y');
        setCharElement(term6449, 2, 'I');
        setCharElement(term6449, 3, 'r');
        setCharElement(term6449, 4, 'c');
        setElement(term6438, 1, term6449);
        setCharElement(term6455, 0, 'R');
        setCharElement(term6455, 1, 'M');
        setCharElement(term6455, 2, 'F');
        setCharElement(term6455, 3, 'I');
        setCharElement(term6455, 4, 's');
        setElement(term6438, 2, term6455);
        term6461 = new Integer(-1911828505);
        term6463 = new Integer(241725499);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfIslands");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term6438;
        args[1] = term6461;
        args[2] = term6463;
        callMethod(klass, "explore", argTypes, term6437, args);
    }

};


