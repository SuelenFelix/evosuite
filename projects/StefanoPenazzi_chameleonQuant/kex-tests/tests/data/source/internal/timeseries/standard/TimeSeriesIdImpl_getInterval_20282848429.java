package data.source.internal.timeseries.standard;

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
import static data.source.internal.timeseries.standard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimeSeriesIdImpl_getInterval_20282848429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;

    public TimeSeriesIdImpl_getInterval_20282848429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl"));
        setField(term208, term208.getClass(), "startInstant", null);
        setField(term208, term208.getClass(), "endInstant", null);
        setField(term208, term208.getClass(), "id", null);
        setField(term208, term208.getClass(), "inter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInterval", argTypes, term208, args);
    }

};


