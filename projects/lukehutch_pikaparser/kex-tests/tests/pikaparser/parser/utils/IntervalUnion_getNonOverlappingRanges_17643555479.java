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

public class IntervalUnion_getNonOverlappingRanges_17643555479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1482;

    public IntervalUnion_getNonOverlappingRanges_17643555479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1482 = newInstance(Class.forName("pikaparser.parser.utils.IntervalUnion"));
        setField(term1482, term1482.getClass(), "nonOverlappingRanges", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.IntervalUnion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNonOverlappingRanges", argTypes, term1482, args);
    }

};


