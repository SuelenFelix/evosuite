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
import java.lang.Integer;

public class IntervalUnion_rangeOverlaps_6136257813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1455;
     Object term1459;
     Object term1461;

    public IntervalUnion_rangeOverlaps_6136257813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1455 = newInstance(Class.forName("pikaparser.parser.utils.IntervalUnion"));
        Object term1456 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term1456, term1456.getClass(), "comparator", null);
        setField(term1456, term1456.getClass(), "root", null);
        setIntField(term1456, term1456.getClass(), "size", 0);
        setIntField(term1456, term1456.getClass(), "modCount", 0);
        setField(term1456, term1456.getClass(), "entrySet", null);
        setField(term1456, term1456.getClass(), "navigableKeySet", null);
        setField(term1456, term1456.getClass(), "descendingMap", null);
        setField(term1456, term1456.getClass(), "keySet", null);
        setField(term1456, term1456.getClass(), "values", null);
        setField(term1455, term1455.getClass(), "nonOverlappingRanges", term1456);
        term1459 = new Integer(1135664017);
        term1461 = new Integer(590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.IntervalUnion");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1459;
        args[1] = term1461;
        callMethod(klass, "rangeOverlaps", argTypes, term1455, args);
    }

};


