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

public class BirthdayCakeCandles_birthdayCakeCandlesStream_6228750362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20;
     Object term21;

    public BirthdayCakeCandles_birthdayCakeCandlesStream_6228750362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20 = newInstance(Class.forName("hackerrank.algorithms.warmup.BirthdayCakeCandles"));
        Integer term24 = new Integer(-616727354);
        Integer term27 = new Integer(-1955890973);
        Integer term30 = new Integer(-2038273078);
        Integer term33 = new Integer(1227103734);
        term21 = new LinkedList();
        ((LinkedList) term21).add(term24);
        ((LinkedList) term21).add(term27);
        ((LinkedList) term21).add(term30);
        ((LinkedList) term21).add(term33);
        ((LinkedList) term21).add((Object)null);
        ((LinkedList) term21).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("hackerrank.algorithms.warmup.BirthdayCakeCandles");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term21;
        callMethod(klass, "birthdayCakeCandlesStream", argTypes, term20, args);
    }

};


