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

public class IntervalUnion_addRange_17194207181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1439;
     Object term1443;
     Object term1445;

    public IntervalUnion_addRange_17194207181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1439 = newInstance(Class.forName("pikaparser.parser.utils.IntervalUnion"));
        Object term1440 = newInstance(Class.forName("java.util.TreeMap"));
        setField(term1440, term1440.getClass(), "comparator", null);
        setField(term1440, term1440.getClass(), "root", null);
        setIntField(term1440, term1440.getClass(), "size", 0);
        setIntField(term1440, term1440.getClass(), "modCount", 0);
        setField(term1440, term1440.getClass(), "entrySet", null);
        setField(term1440, term1440.getClass(), "navigableKeySet", null);
        setField(term1440, term1440.getClass(), "descendingMap", null);
        setField(term1440, term1440.getClass(), "keySet", null);
        setField(term1440, term1440.getClass(), "values", null);
        setField(term1439, term1439.getClass(), "nonOverlappingRanges", term1440);
        term1443 = new Integer(-6029667);
        term1445 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("pikaparser.parser.utils.IntervalUnion");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term1443;
        args[1] = term1445;
        callMethod(klass, "addRange", argTypes, term1439, args);
    }

};


