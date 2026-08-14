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

public class TimeSeriesAbstract_getListFromTo_166926128821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312;
     Object term315;

    public TimeSeriesAbstract_getListFromTo_166926128821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term312, term312.getClass(), "seconds", 1863631094L);
        setIntField(term312, term312.getClass(), "nanos", 992000000);
        term315 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term315, term315.getClass(), "seconds", 1882638884L);
        setIntField(term315, term315.getClass(), "nanos", 364000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.TimeSeriesAbstract");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.time.Instant");
        argTypes[1] = Class.forName("java.time.Instant");
        Object[] args = new Object[2];
        args[0] = term312;
        args[1] = term315;
        callMethod(klass, "getListFromTo", argTypes, null, args);
    }

};


