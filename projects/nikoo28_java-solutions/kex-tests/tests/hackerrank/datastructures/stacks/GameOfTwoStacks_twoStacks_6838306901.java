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
import java.lang.Integer;
import java.util.LinkedList;
import java.lang.Object;

public class GameOfTwoStacks_twoStacks_6838306901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term4;
     Object term22;

    public GameOfTwoStacks_twoStacks_6838306901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("hackerrank.datastructures.stacks.GameOfTwoStacks"));
        term2 = new Integer(568599855);
        Integer term7 = new Integer(568599855);
        Integer term10 = new Integer(1162663216);
        Integer term13 = new Integer(1484323161);
        Integer term16 = new Integer(391863371);
        term4 = new LinkedList();
        ((LinkedList) term4).add(term7);
        ((LinkedList) term4).add(term10);
        ((LinkedList) term4).add(term13);
        ((LinkedList) term4).add(term16);
        ((LinkedList) term4).add((Object)null);
        Integer term25 = new Integer(-616727354);
        Integer term28 = new Integer(-1955890973);
        Integer term31 = new Integer(-2038273078);
        Integer term34 = new Integer(1227103734);
        term22 = new LinkedList();
        ((LinkedList) term22).add(term25);
        ((LinkedList) term22).add(term28);
        ((LinkedList) term22).add(term31);
        ((LinkedList) term22).add(term34);
        ((LinkedList) term22).add((Object)null);
        ((LinkedList) term22).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.stacks.GameOfTwoStacks");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = term2;
        args[1] = term4;
        args[2] = term22;
        callMethod(klass, "twoStacks", argTypes, term1, args);
    }

};


