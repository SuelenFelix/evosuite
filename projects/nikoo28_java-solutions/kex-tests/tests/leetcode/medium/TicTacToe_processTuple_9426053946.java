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
import java.lang.Character;

public class TicTacToe_processTuple_9426053946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4641;
     Object term4643;

    public TicTacToe_processTuple_9426053946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4641 = newInstance(Class.forName("leetcode.medium.TicTacToe"));
        setField(term4641, term4641.getClass(), "rows", null);
        setField(term4641, term4641.getClass(), "cols", null);
        setField(term4641, term4641.getClass(), "leftDiagonal", null);
        setField(term4641, term4641.getClass(), "rightDiagonal", null);
        setIntField(term4641, term4641.getClass(), "gridSize", 0);
        term4643 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TicTacToe");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("leetcode.medium.Tuple");
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term4643;
        callMethod(klass, "processTuple", argTypes, term4641, args);
    }

};


