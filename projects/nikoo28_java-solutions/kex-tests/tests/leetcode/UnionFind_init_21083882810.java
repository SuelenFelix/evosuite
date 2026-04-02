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

public class UnionFind_init_21083882810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13696;

    public UnionFind_init_21083882810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13696 = (Object[]) newArray("[C", 2);
        char[] term13697 = (char[]) newCharArray(0);
        char[] term13698 = (char[]) newCharArray(4);
        setElement(term13696, 0, term13697);
        setCharElement(term13698, 0, 'M');
        setCharElement(term13698, 1, 'b');
        setCharElement(term13698, 2, 'l');
        setCharElement(term13698, 3, 'Y');
        setElement(term13696, 1, term13698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.UnionFind");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13696;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


