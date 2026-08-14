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

public class BTree_getRange_10182269621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;
     Object term210;
     Object term213;

    public BTree_getRange_10182269621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = newInstance(Class.forName("data.source.internal.timeseries.structure.BTree"));
        term210 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term210, term210.getClass(), "seconds", 1744090065L);
        setIntField(term210, term210.getClass(), "nanos", 937000000);
        term213 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term213, term213.getClass(), "seconds", 1347400561L);
        setIntField(term213, term213.getClass(), "nanos", 385000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.BTree");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Instant");
        Object[] args = new Object[2];
        args[0] = term210;
        args[1] = term213;
        callMethod(klass, "getRange", argTypes, term209, args);
    }

};


