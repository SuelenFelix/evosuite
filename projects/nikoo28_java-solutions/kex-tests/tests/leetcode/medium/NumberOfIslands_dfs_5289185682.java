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
import java.lang.Integer;

public class NumberOfIslands_dfs_5289185682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term51;
     Object term67;
     Object term69;

    public NumberOfIslands_dfs_5289185682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("leetcode.medium.NumberOfIslands"));
        term51 = (Object[]) newArray("[C", 2);
        char[] term52 = (char[]) newCharArray(6);
        char[] term59 = (char[]) newCharArray(7);
        setCharElement(term52, 0, 'j');
        setCharElement(term52, 1, 'l');
        setCharElement(term52, 2, 'J');
        setCharElement(term52, 3, 'A');
        setCharElement(term52, 4, 'E');
        setCharElement(term52, 5, 't');
        setElement(term51, 0, term52);
        setCharElement(term59, 0, 'R');
        setCharElement(term59, 1, 'r');
        setCharElement(term59, 2, 'b');
        setCharElement(term59, 3, 'M');
        setCharElement(term59, 4, 'u');
        setCharElement(term59, 5, 'L');
        setCharElement(term59, 6, 'c');
        setElement(term51, 1, term59);
        term67 = new Integer(-1339778481);
        term69 = new Integer(1725571209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.NumberOfIslands");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(Array.newInstance(char.class, 0).getClass(), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term51;
        args[1] = term67;
        args[2] = term69;
        callMethod(klass, "dfs", argTypes, term50, args);
    }

};


