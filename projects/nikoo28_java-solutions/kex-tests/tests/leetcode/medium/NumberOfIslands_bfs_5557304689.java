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
import java.lang.Integer;

public class NumberOfIslands_bfs_5557304689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;
     Object term171;
     Object term173;

    public NumberOfIslands_bfs_5557304689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170 = newInstance(Class.forName("leetcode.medium.NumberOfIslands"));
        term171 = new Integer(0);
        term173 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.NumberOfIslands");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Array.newInstance(Array.newInstance(int.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term171;
        args[2] = term173;
        args[3] = null;
        callMethod(klass, "bfs", argTypes, term170, args);
    }

};


