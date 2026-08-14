package data.source.internal.timeseries;

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
import static data.source.internal.timeseries.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimeSeriesAbstract_getRange_14597296321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;
     Object term284;

    public TimeSeriesAbstract_getRange_14597296321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term281, term281.getClass(), "seconds", 1645834034L);
        setIntField(term281, term281.getClass(), "nanos", 896000000);
        term284 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term284, term284.getClass(), "seconds", 1500721068L);
        setIntField(term284, term284.getClass(), "nanos", 23000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.TimeSeriesAbstract");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Instant");
        Object[] args = new Object[2];
        args[0] = term281;
        args[1] = term284;
        callMethod(klass, "getRange", argTypes, null, args);
    }

};


