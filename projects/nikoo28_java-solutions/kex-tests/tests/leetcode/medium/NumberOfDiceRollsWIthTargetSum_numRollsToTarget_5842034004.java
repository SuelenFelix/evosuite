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

public class NumberOfDiceRollsWIthTargetSum_numRollsToTarget_5842034004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3853;
     Object term3854;
     Object term3856;
     Object term3858;

    public NumberOfDiceRollsWIthTargetSum_numRollsToTarget_5842034004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3853 = newInstance(Class.forName("leetcode.medium.NumberOfDiceRollsWIthTargetSum"));
        term3854 = new Integer(0);
        term3856 = new Integer(0);
        term3858 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.medium.NumberOfDiceRollsWIthTargetSum");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term3854;
        args[1] = term3856;
        args[2] = term3858;
        callMethod(klass, "numRollsToTarget", argTypes, term3853, args);
    }

};


