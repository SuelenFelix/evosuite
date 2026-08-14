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

public class TimeSeriesFactoryImpl_createTimeSeriesQueryRequest_11999685855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341;

    public TimeSeriesFactoryImpl_createTimeSeriesQueryRequest_11999685855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesFactoryImpl"));
        setField(term341, term341.getClass(), "cleaners", null);
        setField(term341, term341.getClass(), "cleanersList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesFactoryImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("data.source.internal.timeseries.TimeSeriesRequestI");
        argTypes[2] = Class.forName("data.source.internal.timeseries.TimeSeriesRequestIdI");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "createTimeSeriesQueryRequest", argTypes, term341, args);
    }

};


