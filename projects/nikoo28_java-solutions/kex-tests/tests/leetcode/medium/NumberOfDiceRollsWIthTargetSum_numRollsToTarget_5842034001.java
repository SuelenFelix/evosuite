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

public class NumberOfDiceRollsWIthTargetSum_numRollsToTarget_5842034001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3801;
     Object term3802;
     Object term3804;
     Object term3806;

    public NumberOfDiceRollsWIthTargetSum_numRollsToTarget_5842034001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3801 = newInstance(Class.forName("leetcode.medium.NumberOfDiceRollsWIthTargetSum"));
        term3802 = new Integer(81427089);
        term3804 = new Integer(755951489);
        term3806 = new Integer(1175146356);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.NumberOfDiceRollsWIthTargetSum");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3802;
        args[1] = term3804;
        args[2] = term3806;
        callMethod(klass, "numRollsToTarget", argTypes, term3801, args);
    }

};


