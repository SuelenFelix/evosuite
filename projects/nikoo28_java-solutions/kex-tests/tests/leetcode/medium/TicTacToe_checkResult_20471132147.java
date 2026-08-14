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

public class TicTacToe_checkResult_20471132147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4645;
     Object term4647;
     Object term4649;

    public TicTacToe_checkResult_20471132147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4645 = newInstance(Class.forName("leetcode.medium.TicTacToe"));
        setField(term4645, term4645.getClass(), "rows", null);
        setField(term4645, term4645.getClass(), "cols", null);
        setField(term4645, term4645.getClass(), "leftDiagonal", null);
        setField(term4645, term4645.getClass(), "rightDiagonal", null);
        setIntField(term4645, term4645.getClass(), "gridSize", 0);
        term4647 = new Integer(0);
        term4649 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.TicTacToe");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4647;
        args[1] = term4649;
        callMethod(klass, "checkResult", argTypes, term4645, args);
    }

};


