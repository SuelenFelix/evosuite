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

public class RBTree_getCeilingPoint_14773423524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;
     Object term104;

    public RBTree_getCeilingPoint_14773423524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term96 = newInstance(Class.forName("java.util.TreeMap"));
        Object term97 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term98 = newInstance(Class.forName("java.time.Instant"));
        setField(term96, term96.getClass(), "comparator", null);
        setLongField(term98, term98.getClass(), "seconds", 1589457921L);
        setIntField(term98, term98.getClass(), "nanos", 30000000);
        setField(term97, term97.getClass(), "key", term98);
        setField(term97, term97.getClass(), "value", null);
        setField(term97, term97.getClass(), "left", null);
        setField(term97, term97.getClass(), "right", null);
        setField(term97, term97.getClass(), "parent", null);
        setBooleanField(term97, term97.getClass(), "color", true);
        setField(term96, term96.getClass(), "root", term97);
        setIntField(term96, term96.getClass(), "size", 1);
        setIntField(term96, term96.getClass(), "modCount", 1);
        setField(term96, term96.getClass(), "entrySet", null);
        setField(term96, term96.getClass(), "navigableKeySet", null);
        setField(term96, term96.getClass(), "descendingMap", null);
        setField(term96, term96.getClass(), "keySet", null);
        setField(term96, term96.getClass(), "values", null);
        setField(term95, term95.getClass(), "map", term96);
        term104 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term104, term104.getClass(), "seconds", 1745462962L);
        setIntField(term104, term104.getClass(), "nanos", 80000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term104;
        callMethod(klass, "getCeilingPoint", argTypes, term95, args);
    }

};


