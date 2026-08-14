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

public class RBTree_addPoint_8234799826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;

    public RBTree_addPoint_8234799826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term120 = newInstance(Class.forName("java.util.TreeMap"));
        Object term121 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term122 = newInstance(Class.forName("java.time.Instant"));
        setField(term120, term120.getClass(), "comparator", null);
        setLongField(term122, term122.getClass(), "seconds", 1863631094L);
        setIntField(term122, term122.getClass(), "nanos", 992000000);
        setField(term121, term121.getClass(), "key", term122);
        setField(term121, term121.getClass(), "value", null);
        setField(term121, term121.getClass(), "left", null);
        setField(term121, term121.getClass(), "right", null);
        setField(term121, term121.getClass(), "parent", null);
        setBooleanField(term121, term121.getClass(), "color", true);
        setField(term120, term120.getClass(), "root", term121);
        setIntField(term120, term120.getClass(), "size", 1);
        setIntField(term120, term120.getClass(), "modCount", 1);
        setField(term120, term120.getClass(), "entrySet", null);
        setField(term120, term120.getClass(), "navigableKeySet", null);
        setField(term120, term120.getClass(), "descendingMap", null);
        setField(term120, term120.getClass(), "keySet", null);
        setField(term120, term120.getClass(), "values", null);
        setField(term119, term119.getClass(), "map", term120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.internal.timeseries.point.TimeSeriesPointI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addPoint", argTypes, term119, args);
    }

};


