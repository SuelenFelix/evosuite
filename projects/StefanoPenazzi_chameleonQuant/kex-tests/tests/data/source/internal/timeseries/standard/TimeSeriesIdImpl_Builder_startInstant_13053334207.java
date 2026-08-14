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

public class TimeSeriesIdImpl_Builder_startInstant_13053334207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term599;

    public TimeSeriesIdImpl_Builder_startInstant_13053334207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term599 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder"));
        setField(term599, term599.getClass(), "startInstant", null);
        setField(term599, term599.getClass(), "endInstant", null);
        setField(term599, term599.getClass(), "id", null);
        setField(term599, term599.getClass(), "interval", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "startInstant", argTypes, term599, args);
    }

};


