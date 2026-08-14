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

public class RBTree_iterator_47878280710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;

    public RBTree_iterator_47878280710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term156 = newInstance(Class.forName("java.util.TreeMap"));
        Object term157 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term158 = newInstance(Class.forName("java.time.Instant"));
        setField(term156, term156.getClass(), "comparator", null);
        setLongField(term158, term158.getClass(), "seconds", 1725122217L);
        setIntField(term158, term158.getClass(), "nanos", 647000000);
        setField(term157, term157.getClass(), "key", term158);
        setField(term157, term157.getClass(), "value", null);
        setField(term157, term157.getClass(), "left", null);
        setField(term157, term157.getClass(), "right", null);
        setField(term157, term157.getClass(), "parent", null);
        setBooleanField(term157, term157.getClass(), "color", true);
        setField(term156, term156.getClass(), "root", term157);
        setIntField(term156, term156.getClass(), "size", 1);
        setIntField(term156, term156.getClass(), "modCount", 1);
        setField(term156, term156.getClass(), "entrySet", null);
        setField(term156, term156.getClass(), "navigableKeySet", null);
        setField(term156, term156.getClass(), "descendingMap", null);
        setField(term156, term156.getClass(), "keySet", null);
        setField(term156, term156.getClass(), "values", null);
        setField(term155, term155.getClass(), "map", term156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "iterator", argTypes, term155, args);
    }

};


