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

public class RBTree_getFloorPoint_14330661775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term116;

    public RBTree_getFloorPoint_14330661775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term108 = newInstance(Class.forName("java.util.TreeMap"));
        Object term109 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term110 = newInstance(Class.forName("java.time.Instant"));
        setField(term108, term108.getClass(), "comparator", null);
        setLongField(term110, term110.getClass(), "seconds", 1349069753L);
        setIntField(term110, term110.getClass(), "nanos", 960000000);
        setField(term109, term109.getClass(), "key", term110);
        setField(term109, term109.getClass(), "value", null);
        setField(term109, term109.getClass(), "left", null);
        setField(term109, term109.getClass(), "right", null);
        setField(term109, term109.getClass(), "parent", null);
        setBooleanField(term109, term109.getClass(), "color", true);
        setField(term108, term108.getClass(), "root", term109);
        setIntField(term108, term108.getClass(), "size", 1);
        setIntField(term108, term108.getClass(), "modCount", 1);
        setField(term108, term108.getClass(), "entrySet", null);
        setField(term108, term108.getClass(), "navigableKeySet", null);
        setField(term108, term108.getClass(), "descendingMap", null);
        setField(term108, term108.getClass(), "keySet", null);
        setField(term108, term108.getClass(), "values", null);
        setField(term107, term107.getClass(), "map", term108);
        term116 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term116, term116.getClass(), "seconds", 1706078172L);
        setIntField(term116, term116.getClass(), "nanos", 457000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term116;
        callMethod(klass, "getFloorPoint", argTypes, term107, args);
    }

};


