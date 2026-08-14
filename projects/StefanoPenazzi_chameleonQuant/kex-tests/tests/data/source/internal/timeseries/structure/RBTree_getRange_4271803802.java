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

public class RBTree_getRange_4271803802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68;
     Object term77;
     Object term80;

    public RBTree_getRange_4271803802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term69 = newInstance(Class.forName("java.util.TreeMap"));
        Object term70 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term71 = newInstance(Class.forName("java.time.Instant"));
        setField(term69, term69.getClass(), "comparator", null);
        setLongField(term71, term71.getClass(), "seconds", 1429023851L);
        setIntField(term71, term71.getClass(), "nanos", 389000000);
        setField(term70, term70.getClass(), "key", term71);
        setField(term70, term70.getClass(), "value", null);
        setField(term70, term70.getClass(), "left", null);
        setField(term70, term70.getClass(), "right", null);
        setField(term70, term70.getClass(), "parent", null);
        setBooleanField(term70, term70.getClass(), "color", true);
        setField(term69, term69.getClass(), "root", term70);
        setIntField(term69, term69.getClass(), "size", 1);
        setIntField(term69, term69.getClass(), "modCount", 1);
        setField(term69, term69.getClass(), "entrySet", null);
        setField(term69, term69.getClass(), "navigableKeySet", null);
        setField(term69, term69.getClass(), "descendingMap", null);
        setField(term69, term69.getClass(), "keySet", null);
        setField(term69, term69.getClass(), "values", null);
        setField(term68, term68.getClass(), "map", term69);
        term77 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term77, term77.getClass(), "seconds", 1495357463L);
        setIntField(term77, term77.getClass(), "nanos", 288000000);
        term80 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term80, term80.getClass(), "seconds", 1645834034L);
        setIntField(term80, term80.getClass(), "nanos", 896000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Instant");
        Object[] args = new Object[2];
        args[0] = term77;
        args[1] = term80;
        callMethod(klass, "getRange", argTypes, term68, args);
    }

};


