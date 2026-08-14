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
import java.lang.Object;

public class MovingAverage_next_18699015201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6977;
     Object term6995;

    public MovingAverage_next_18699015201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term6981 = new Integer(-157887805);
        Integer term6984 = new Integer(1876565163);
        Integer term6987 = new Integer(-817164822);
        LinkedList term6978 = new LinkedList();
        ((LinkedList) term6978).add(term6981);
        ((LinkedList) term6978).add(term6984);
        ((LinkedList) term6978).add(term6987);
        ((LinkedList) term6978).add((Object)null);
        term6977 = newInstance(Class.forName("leetcode.MovingAverage"));
        setField(term6977, term6977.getClass(), "slidingWindow", term6978);
        setDoubleField(term6977, term6977.getClass(), "previousSum", 0.13238746331190498);
        setIntField(term6977, term6977.getClass(), "limit", -58633039);
        term6995 = new Integer(448061908);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("leetcode.MovingAverage");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6995;
        callMethod(klass, "next", argTypes, term6977, args);
    }

};


