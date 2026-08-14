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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Character;

public class TicTacToe_processTuple_9426053942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4541;
     Object term4587;
     Object term4591;

    public TicTacToe_processTuple_9426053942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4544 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4544, term4544.getClass(), "currentSize", 1064185088);
        setBooleanField(term4544, term4544.getClass(), "allSame", false);
        setCharField(term4544, term4544.getClass(), "firstCharacter", 'T');
        Object term4548 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4548, term4548.getClass(), "currentSize", -1249782654);
        setBooleanField(term4548, term4548.getClass(), "allSame", true);
        setCharField(term4548, term4548.getClass(), "firstCharacter", 'm');
        Object term4552 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4552, term4552.getClass(), "currentSize", 399302934);
        setBooleanField(term4552, term4552.getClass(), "allSame", true);
        setCharField(term4552, term4552.getClass(), "firstCharacter", 'J');
        Object term4556 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4556, term4556.getClass(), "currentSize", -1823255084);
        setBooleanField(term4556, term4556.getClass(), "allSame", false);
        setCharField(term4556, term4556.getClass(), "firstCharacter", 'M');
        Object term4560 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4560, term4560.getClass(), "currentSize", 793345010);
        setBooleanField(term4560, term4560.getClass(), "allSame", false);
        setCharField(term4560, term4560.getClass(), "firstCharacter", 'x');
        ArrayList term4542 = new ArrayList();
        ((ArrayList) term4542).add(term4544);
        ((ArrayList) term4542).add(term4548);
        ((ArrayList) term4542).add(term4552);
        ((ArrayList) term4542).add(term4556);
        ((ArrayList) term4542).add(term4560);
        Object term4568 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4568, term4568.getClass(), "currentSize", -2092117838);
        setBooleanField(term4568, term4568.getClass(), "allSame", true);
        setCharField(term4568, term4568.getClass(), "firstCharacter", 'l');
        Object term4572 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4572, term4572.getClass(), "currentSize", 1524590776);
        setBooleanField(term4572, term4572.getClass(), "allSame", true);
        setCharField(term4572, term4572.getClass(), "firstCharacter", 's');
        ArrayList term4566 = new ArrayList();
        ((ArrayList) term4566).add(term4568);
        ((ArrayList) term4566).add(term4572);
        term4541 = newInstance(Class.forName("leetcode.medium.TicTacToe"));
        Object term4578 = newInstance(Class.forName("leetcode.medium.Tuple"));
        Object term4582 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setField(term4541, term4541.getClass(), "rows", term4542);
        setField(term4541, term4541.getClass(), "cols", term4566);
        setIntField(term4578, term4578.getClass(), "currentSize", 1523896653);
        setBooleanField(term4578, term4578.getClass(), "allSame", true);
        setCharField(term4578, term4578.getClass(), "firstCharacter", 'z');
        setField(term4541, term4541.getClass(), "leftDiagonal", term4578);
        setIntField(term4582, term4582.getClass(), "currentSize", -1731921726);
        setBooleanField(term4582, term4582.getClass(), "allSame", true);
        setCharField(term4582, term4582.getClass(), "firstCharacter", 'Y');
        setField(term4541, term4541.getClass(), "rightDiagonal", term4582);
        setIntField(term4541, term4541.getClass(), "gridSize", 919994471);
        term4587 = newInstance(Class.forName("leetcode.medium.Tuple"));
        setIntField(term4587, term4587.getClass(), "currentSize", 183531701);
        setBooleanField(term4587, term4587.getClass(), "allSame", true);
        setCharField(term4587, term4587.getClass(), "firstCharacter", 'V');
        term4591 = new Character('z');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TicTacToe");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("leetcode.medium.Tuple");
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term4587;
        args[1] = term4591;
        callMethod(klass, "processTuple", argTypes, term4541, args);
    }

};


