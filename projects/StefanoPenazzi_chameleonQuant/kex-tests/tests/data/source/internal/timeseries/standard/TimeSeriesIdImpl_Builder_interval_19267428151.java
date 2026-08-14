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
import java.lang.Object;

public class TimeSeriesIdImpl_Builder_interval_19267428151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366;

    public TimeSeriesIdImpl_Builder_interval_19267428151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder"));
        Object term367 = newInstance(Class.forName("java.time.Instant"));
        Object term370 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term367, term367.getClass(), "seconds", 1645834034L);
        setIntField(term367, term367.getClass(), "nanos", 896000000);
        setField(term366, term366.getClass(), "startInstant", term367);
        setLongField(term370, term370.getClass(), "seconds", 1500721068L);
        setIntField(term370, term370.getClass(), "nanos", 23000000);
        setField(term366, term366.getClass(), "endInstant", term370);
        setField(term366, term366.getClass(), "id", "HyxfbSQYBe");
        setField(term366, term366.getClass(), "interval", "pCTimMblYc");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hNxWaHcfhY";
        callMethod(klass, "interval", argTypes, term366, args);
    }

};


