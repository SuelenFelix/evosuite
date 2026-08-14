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
import java.lang.Object;

public class IntervalUnion_getNonOverlappingRanges_17643555474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1463;

    public IntervalUnion_getNonOverlappingRanges_17643555474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1463 = newInstance(Class.forName("pikaparser.parser.utils.IntervalUnion"));
        Object term1464 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term1464, term1464.getClass(), "comparator", null);
        setField(term1464, term1464.getClass(), "root", null);
        setIntField(term1464, term1464.getClass(), "size", 0);
        setIntField(term1464, term1464.getClass(), "modCount", 0);
        setField(term1464, term1464.getClass(), "entrySet", null);
        setField(term1464, term1464.getClass(), "navigableKeySet", null);
        setField(term1464, term1464.getClass(), "descendingMap", null);
        setField(term1464, term1464.getClass(), "keySet", null);
        setField(term1464, term1464.getClass(), "values", null);
        setField(term1463, term1463.getClass(), "nonOverlappingRanges", term1464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.IntervalUnion");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNonOverlappingRanges", argTypes, term1463, args);
    }

};


