package hackerrank.algorithms.search;

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
import static hackerrank.algorithms.search.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Long;
import java.lang.Object;

public class MinimumLoss_minimumLoss_12775892361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public MinimumLoss_minimumLoss_12775892361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("hackerrank.algorithms.search.MinimumLoss"));
        Long term5 = new Long(2442117782898005296L);
        Long term8 = new Long(6375119433582206027L);
        Long term11 = new Long(-8257434502486459194L);
        Long term14 = new Long(-8400487765614892086L);
        term2 = new LinkedList();
        ((LinkedList) term2).add(term5);
        ((LinkedList) term2).add(term8);
        ((LinkedList) term2).add(term11);
        ((LinkedList) term2).add(term14);
        ((LinkedList) term2).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.algorithms.search.MinimumLoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "minimumLoss", argTypes, term1, args);
    }

};


