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

public class RBTree_removePoint_1107377717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128;

    public RBTree_removePoint_1107377717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term129 = newInstance(Class.forName("java.util.TreeMap"));
        Object term130 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term131 = newInstance(Class.forName("java.time.Instant"));
        setField(term129, term129.getClass(), "comparator", null);
        setLongField(term131, term131.getClass(), "seconds", 1882638884L);
        setIntField(term131, term131.getClass(), "nanos", 364000000);
        setField(term130, term130.getClass(), "key", term131);
        setField(term130, term130.getClass(), "value", null);
        setField(term130, term130.getClass(), "left", null);
        setField(term130, term130.getClass(), "right", null);
        setField(term130, term130.getClass(), "parent", null);
        setBooleanField(term130, term130.getClass(), "color", true);
        setField(term129, term129.getClass(), "root", term130);
        setIntField(term129, term129.getClass(), "size", 1);
        setIntField(term129, term129.getClass(), "modCount", 1);
        setField(term129, term129.getClass(), "entrySet", null);
        setField(term129, term129.getClass(), "navigableKeySet", null);
        setField(term129, term129.getClass(), "descendingMap", null);
        setField(term129, term129.getClass(), "keySet", null);
        setField(term129, term129.getClass(), "values", null);
        setField(term128, term128.getClass(), "map", term129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.internal.timeseries.point.TimeSeriesPointI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removePoint", argTypes, term128, args);
    }

};


