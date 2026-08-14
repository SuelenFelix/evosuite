package data.source.external.database.influxdb;

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
import static data.source.external.database.influxdb.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TimeSeriesRequestIdInfluxdb_timeSeriesId_17043706421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term948;

    public TimeSeriesRequestIdInfluxdb_timeSeriesId_17043706421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term948 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term959 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term960 = (Object[]) newArray("java.lang.Object", 10);
        setField(term948, term948.getClass(), "SOURCE", "influxdb");
        setField(term948, term948.getClass(), "timeSeriesId", null);
        setField(term948, term948.getClass(), "tspc", null);
        setField(term959, term959.getClass(), "this$0", term948);
        setElement(term960, 0, "s");
        setElement(term960, 1, "m");
        setElement(term960, 2, "h");
        setElement(term960, 3, "d");
        setElement(term960, 4, "w");
        setElement(term960, 5, "mo");
        setElement(term960, 6, "y");
        setField(term959, term959.getClass(), "elementData", term960);
        setIntField(term959, term959.getClass(), "size", 7);
        setIntField(term959, term959.getClass(), "modCount", 7);
        setField(term948, term948.getClass(), "influxIntervalChar", term959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "timeSeriesId", argTypes, term948, args);
    }

};


