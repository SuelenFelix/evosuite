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

public class PTrie_getRange_14190389201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term5;

    public PTrie_getRange_14190389201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("data.source.internal.timeseries.structure.PTrie"));
        term2 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term2, term2.getClass(), "seconds", 1345871412L);
        setIntField(term2, term2.getClass(), "nanos", 244000000);
        term5 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term5, term5.getClass(), "seconds", 1480438351L);
        setIntField(term5, term5.getClass(), "nanos", 369000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.PTrie");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Instant");
        Object[] args = new Object[2];
        args[0] = term2;
        args[1] = term5;
        callMethod(klass, "getRange", argTypes, term1, args);
    }

};


