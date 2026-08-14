package data.source.internal.dataset;

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
import static data.source.internal.dataset.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DatasetImpl_removeTimeSeries_17058424468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32;

    public DatasetImpl_removeTimeSeries_17058424468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32 = newInstance(Class.forName("data.source.internal.dataset.DatasetImpl"));
        setField(term32, term32.getClass(), "datasetMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.dataset.DatasetImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.internal.timeseries.TimeSeriesI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeTimeSeries", argTypes, term32, args);
    }

};


