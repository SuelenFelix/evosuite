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

public class EqualStacks_equalStacks_7263940691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46;
     Object term47;
     Object term52;
     Object term56;

    public EqualStacks_equalStacks_7263940691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46 = newInstance(Class.forName("hackerrank.datastructures.stacks.EqualStacks"));
        term47 = (int[]) newIntArray(4);
        setIntElement(term47, 0, 1162663216);
        setIntElement(term47, 1, 1484323161);
        setIntElement(term47, 2, 391863371);
        setIntElement(term47, 3, -1922583790);
        term52 = (int[]) newIntArray(3);
        setIntElement(term52, 0, -616727354);
        setIntElement(term52, 1, -1955890973);
        setIntElement(term52, 2, -2038273078);
        term56 = (int[]) newIntArray(4);
        setIntElement(term56, 0, 1227103734);
        setIntElement(term56, 1, -1339778481);
        setIntElement(term56, 2, 1725571209);
        setIntElement(term56, 3, -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.datastructures.stacks.EqualStacks");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(int.class, 0).getClass();
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        argTypes[2] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term47;
        args[1] = term52;
        args[2] = term56;
        callMethod(klass, "equalStacks", argTypes, term46, args);
    }

};


