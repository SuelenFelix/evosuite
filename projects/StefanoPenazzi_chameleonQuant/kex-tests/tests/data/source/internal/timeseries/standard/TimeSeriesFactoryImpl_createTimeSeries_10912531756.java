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

public class TimeSeriesFactoryImpl_createTimeSeries_10912531756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342;

    public TimeSeriesFactoryImpl_createTimeSeries_10912531756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesFactoryImpl"));
        setField(term342, term342.getClass(), "cleaners", null);
        setField(term342, term342.getClass(), "cleanersList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesFactoryImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("data.source.internal.timeseries.structure.TimeSeriesDataStructureI");
        argTypes[1] = Class.forName("data.source.internal.timeseries.TimeSeriesIdI");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createTimeSeries", argTypes, term342, args);
    }

};


