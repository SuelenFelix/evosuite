package hackerrank.algorithms.warmup;

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
import static hackerrank.algorithms.warmup.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Integer;
import java.lang.Object;

public class BirthdayCakeCandles_birthdayCakeCandles_13505020761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;

    public BirthdayCakeCandles_birthdayCakeCandles_13505020761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("hackerrank.algorithms.warmup.BirthdayCakeCandles"));
        Integer term5 = new Integer(568599855);
        Integer term8 = new Integer(1162663216);
        Integer term11 = new Integer(1484323161);
        Integer term14 = new Integer(391863371);
        term2 = new LinkedList();
        ((LinkedList) term2).add(term5);
        ((LinkedList) term2).add(term8);
        ((LinkedList) term2).add(term11);
        ((LinkedList) term2).add(term14);
        ((LinkedList) term2).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.algorithms.warmup.BirthdayCakeCandles");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2;
        callMethod(klass, "birthdayCakeCandles", argTypes, term1, args);
    }

};


