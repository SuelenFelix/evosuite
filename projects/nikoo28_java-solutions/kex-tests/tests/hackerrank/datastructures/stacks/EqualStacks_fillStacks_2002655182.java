package hackerrank.datastructures.stacks;

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
import static hackerrank.datastructures.stacks.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class EqualStacks_fillStacks_2002655182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term73;
     Object term86;
     Object term87;
     Object term92;
     Object term95;
     Object term110;

    public EqualStacks_fillStacks_2002655182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("hackerrank.datastructures.stacks.EqualStacks"));
        Integer term75 = new Integer(-522618178);
        Integer term77 = new Integer(1134449235);
        Integer term79 = new Integer(-883034806);
        Integer term81 = new Integer(1585847225);
        term73 = newInstance(Class.forName("java.util.Stack"));
        Object[] term74 = (Object[]) newArray("java.lang.Object", 10);
        setElement(term74, 0, term75);
        setElement(term74, 1, term77);
        setElement(term74, 2, term79);
        setElement(term74, 3, term81);
        setField(term73, term73.getClass(), "elementData", term74);
        setIntField(term73, term73.getClass(), "elementCount", 4);
        setIntField(term73, term73.getClass(), "capacityIncrement", 0);
        setIntField(term73, term73.getClass(), "modCount", 4);
        term86 = (int[]) newIntArray(0);
        term87 = newInstance(Class.forName("java.util.Stack"));
        Object[] term88 = (Object[]) newArray("java.lang.Object", 10);
        setField(term87, term87.getClass(), "elementData", term88);
        setIntField(term87, term87.getClass(), "elementCount", 0);
        setIntField(term87, term87.getClass(), "capacityIncrement", 0);
        setIntField(term87, term87.getClass(), "modCount", 0);
        term92 = (int[]) newIntArray(2);
        setIntElement(term92, 0, 1134449235);
        setIntElement(term92, 1, -883034806);
        Integer term97 = new Integer(597278769);
        Integer term99 = new Integer(-1685132342);
        Integer term101 = new Integer(-1456670397);
        Integer term103 = new Integer(1622346318);
        Integer term105 = new Integer(1048535127);
        term95 = newInstance(Class.forName("java.util.Stack"));
        Object[] term96 = (Object[]) newArray("java.lang.Object", 10);
        setElement(term96, 0, term97);
        setElement(term96, 1, term99);
        setElement(term96, 2, term101);
        setElement(term96, 3, term103);
        setElement(term96, 4, term105);
        setField(term95, term95.getClass(), "elementData", term96);
        setIntField(term95, term95.getClass(), "elementCount", 5);
        setIntField(term95, term95.getClass(), "capacityIncrement", 0);
        setIntField(term95, term95.getClass(), "modCount", 5);
        term110 = (int[]) newIntArray(9);
        setIntElement(term110, 0, 1585847225);
        setIntElement(term110, 1, 597278769);
        setIntElement(term110, 2, -1685132342);
        setIntElement(term110, 3, -1456670397);
        setIntElement(term110, 4, 1622346318);
        setIntElement(term110, 5, 1048535127);
        setIntElement(term110, 6, -655067527);
        setIntElement(term110, 7, -6029667);
        setIntElement(term110, 8, -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.stacks.EqualStacks");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("java.util.Stack");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Class.forName("java.util.Stack");
        argTypes[3] = Array.newInstance(int.class, 0).getClass();
        argTypes[4] = Class.forName("java.util.Stack");
        argTypes[5] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[6];
        args[0] = term73;
        args[1] = term86;
        args[2] = term87;
        args[3] = term92;
        args[4] = term95;
        args[5] = term110;
        callMethod(klass, "fillStacks", argTypes, term72, args);
    }

};


