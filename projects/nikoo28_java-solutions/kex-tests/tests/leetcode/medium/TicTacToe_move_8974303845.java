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

public class TicTacToe_move_8974303845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4633;
     Object term4635;
     Object term4637;
     Object term4639;

    public TicTacToe_move_8974303845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4633 = newInstance(Class.forName("leetcode.medium.TicTacToe"));
        setField(term4633, term4633.getClass(), "rows", null);
        setField(term4633, term4633.getClass(), "cols", null);
        setField(term4633, term4633.getClass(), "leftDiagonal", null);
        setField(term4633, term4633.getClass(), "rightDiagonal", null);
        setIntField(term4633, term4633.getClass(), "gridSize", 0);
        term4635 = new Integer(0);
        term4637 = new Integer(0);
        term4639 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TicTacToe");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4635;
        args[1] = term4637;
        args[2] = term4639;
        callMethod(klass, "move", argTypes, term4633, args);
    }

};


