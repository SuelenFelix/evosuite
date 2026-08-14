package data.source.internal.timeseries.structure;

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
import static data.source.internal.timeseries.structure.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class RBTree_initialize_13334844271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term59;

    public RBTree_initialize_13334844271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term51 = newInstance(Class.forName("java.util.TreeMap"));
        Object term52 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term53 = newInstance(Class.forName("java.time.Instant"));
        setField(term51, term51.getClass(), "comparator", null);
        setLongField(term53, term53.getClass(), "seconds", 1515890130L);
        setIntField(term53, term53.getClass(), "nanos", 18000000);
        setField(term52, term52.getClass(), "key", term53);
        setField(term52, term52.getClass(), "value", null);
        setField(term52, term52.getClass(), "left", null);
        setField(term52, term52.getClass(), "right", null);
        setField(term52, term52.getClass(), "parent", null);
        setBooleanField(term52, term52.getClass(), "color", true);
        setField(term51, term51.getClass(), "root", term52);
        setIntField(term51, term51.getClass(), "size", 1);
        setIntField(term51, term51.getClass(), "modCount", 1);
        setField(term51, term51.getClass(), "entrySet", null);
        setField(term51, term51.getClass(), "navigableKeySet", null);
        setField(term51, term51.getClass(), "descendingMap", null);
        setField(term51, term51.getClass(), "keySet", null);
        setField(term51, term51.getClass(), "values", null);
        setField(term50, term50.getClass(), "map", term51);
        term59 = new LinkedList();
        ((LinkedList) term59).add((Object)null);
        ((LinkedList) term59).add((Object)null);
        ((LinkedList) term59).add((Object)null);
        ((LinkedList) term59).add((Object)null);
        ((LinkedList) term59).add((Object)null);
        ((LinkedList) term59).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term59;
        callMethod(klass, "initialize", argTypes, term50, args);
    }

};


