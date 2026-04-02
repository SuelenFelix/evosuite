package leetcode;

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
import static leetcode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Integer;

public class MovingAverage_next_18699015201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6848;
     Object term6860;

    public MovingAverage_next_18699015201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6852 = new Integer(1225272962);
        Integer term6855 = new Integer(1324040357);
        LinkedList term6849 = new LinkedList();
        ((LinkedList) term6849).add(term6852);
        ((LinkedList) term6849).add(term6855);
        term6848 = newInstance(Class.forName("leetcode.MovingAverage"));
        setField(term6848, term6848.getClass(), "slidingWindow", term6849);
        setDoubleField(term6848, term6848.getClass(), "previousSum", 0.13238746331190498);
        setIntField(term6848, term6848.getClass(), "limit", 2081679151);
        term6860 = new Integer(-1030167086);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MovingAverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6860;
        callMethod(klass, "next", argTypes, term6848, args);
    }

};


