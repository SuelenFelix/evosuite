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
import java.lang.Integer;

public class RBTree_getPointByIndex_149158212412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term182;

    public RBTree_getPointByIndex_149158212412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree"));
        Object term174 = newInstance(Class.forName("java.util.TreeMap"));
        Object term175 = newInstance(Class.forName("java.util.TreeMap$Entry"));
        Object term176 = newInstance(Class.forName("java.time.Instant"));
        setField(term174, term174.getClass(), "comparator", null);
        setLongField(term176, term176.getClass(), "seconds", 1804998087L);
        setIntField(term176, term176.getClass(), "nanos", 131000000);
        setField(term175, term175.getClass(), "key", term176);
        setField(term175, term175.getClass(), "value", null);
        setField(term175, term175.getClass(), "left", null);
        setField(term175, term175.getClass(), "right", null);
        setField(term175, term175.getClass(), "parent", null);
        setBooleanField(term175, term175.getClass(), "color", true);
        setField(term174, term174.getClass(), "root", term175);
        setIntField(term174, term174.getClass(), "size", 1);
        setIntField(term174, term174.getClass(), "modCount", 1);
        setField(term174, term174.getClass(), "entrySet", null);
        setField(term174, term174.getClass(), "navigableKeySet", null);
        setField(term174, term174.getClass(), "descendingMap", null);
        setField(term174, term174.getClass(), "keySet", null);
        setField(term174, term174.getClass(), "values", null);
        setField(term173, term173.getClass(), "map", term174);
        term182 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term182;
        callMethod(klass, "getPointByIndex", argTypes, term173, args);
    }

};


