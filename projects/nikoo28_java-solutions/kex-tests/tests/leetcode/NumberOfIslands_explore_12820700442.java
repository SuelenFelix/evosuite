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
     Object term6204;
     Object term6205;
     Object term6220;
     Object term6222;

    public NumberOfIslands_explore_12820700442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6204 = newInstance(Class.forName("leetcode.NumberOfIslands"));
        term6205 = (Object[]) newArray("[C", 3);
        char[] term6206 = (char[]) newCharArray(4);
        char[] term6211 = (char[]) newCharArray(1);
        char[] term6213 = (char[]) newCharArray(6);
        setCharElement(term6206, 0, 'K');
        setCharElement(term6206, 1, 'T');
        setCharElement(term6206, 2, 'N');
        setCharElement(term6206, 3, 'F');
        setElement(term6205, 0, term6206);
        setCharElement(term6211, 0, 'h');
        setElement(term6205, 1, term6211);
        setCharElement(term6213, 0, 'R');
        setCharElement(term6213, 1, 'N');
        setCharElement(term6213, 2, 'S');
        setCharElement(term6213, 3, 'z');
        setCharElement(term6213, 4, 'Y');
        setCharElement(term6213, 5, 'Y');
        setElement(term6205, 2, term6213);
        term6220 = new Integer(47607734);
        term6222 = new Integer(1717232691);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.NumberOfIslands");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term6205;
        args[1] = term6220;
        args[2] = term6222;
        callMethod(klass, "explore", argTypes, term6204, args);
    }

};


