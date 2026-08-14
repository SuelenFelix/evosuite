package pikaparser.parser.utils;

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
import static pikaparser.parser.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class IntervalUnion_rangeOverlaps_6136257818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1477;
     Object term1478;
     Object term1480;

    public IntervalUnion_rangeOverlaps_6136257818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1477 = newInstance(Class.forName("pikaparser.parser.utils.IntervalUnion"));
        setField(term1477, term1477.getClass(), "nonOverlappingRanges", null);
        term1478 = new Integer(0);
        term1480 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.IntervalUnion");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1478;
        args[1] = term1480;
        callMethod(klass, "rangeOverlaps", argTypes, term1477, args);
    }

};


