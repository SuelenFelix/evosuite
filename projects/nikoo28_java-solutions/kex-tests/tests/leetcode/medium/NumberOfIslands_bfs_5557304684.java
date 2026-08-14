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

public class NumberOfIslands_bfs_5557304684 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99;
     Object term100;
     Object term117;
     Object term119;
     Object term121;

    public NumberOfIslands_bfs_5557304684() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99 = newInstance(Class.forName("leetcode.medium.NumberOfIslands"));
        term100 = (Object[]) newArray("[C", 5);
        char[] term101 = (char[]) newCharArray(5);
        char[] term107 = (char[]) newCharArray(2);
        char[] term110 = (char[]) newCharArray(3);
        char[] term114 = (char[]) newCharArray(1);
        char[] term116 = (char[]) newCharArray(0);
        setCharElement(term101, 0, 'x');
        setCharElement(term101, 1, 'x');
        setCharElement(term101, 2, 't');
        setCharElement(term101, 3, 'l');
        setCharElement(term101, 4, 'P');
        setElement(term100, 0, term101);
        setCharElement(term107, 0, 'w');
        setCharElement(term107, 1, 'D');
        setElement(term100, 1, term107);
        setCharElement(term110, 0, 'Y');
        setCharElement(term110, 1, 'F');
        setCharElement(term110, 2, 's');
        setElement(term100, 2, term110);
        setCharElement(term114, 0, 'j');
        setElement(term100, 3, term114);
        setElement(term100, 4, term116);
        term117 = new Integer(-522618178);
        term119 = new Integer(1134449235);
        term121 = (Object[]) newArray("[I", 2);
        int[] term122 = (int[]) newIntArray(8);
        int[] term131 = (int[]) newIntArray(6);
        setIntElement(term122, 0, -883034806);
        setIntElement(term122, 1, 1585847225);
        setIntElement(term122, 2, 597278769);
        setIntElement(term122, 3, -1685132342);
        setIntElement(term122, 4, -1456670397);
        setIntElement(term122, 5, 1622346318);
        setIntElement(term122, 6, 1048535127);
        setIntElement(term122, 7, -655067527);
        setElement(term121, 0, term122);
        setIntElement(term131, 0, -6029667);
        setIntElement(term131, 1, -2068769794);
        setIntElement(term131, 2, -117576464);
        setIntElement(term131, 3, -1007160944);
        setIntElement(term131, 4, 1135664017);
        setIntElement(term131, 5, 590364439);
        setElement(term121, 1, term131);
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
        args[0] = term100;
        args[1] = term117;
        args[2] = term119;
        args[3] = term121;
        callMethod(klass, "bfs", argTypes, term99, args);
    }

};


