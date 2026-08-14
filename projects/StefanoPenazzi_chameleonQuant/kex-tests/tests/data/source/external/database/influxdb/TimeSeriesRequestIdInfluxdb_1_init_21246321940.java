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

public class TimeSeriesRequestIdInfluxdb_1_init_21246321940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1854;

    public TimeSeriesRequestIdInfluxdb_1_init_21246321940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1854 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1865 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1866 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1854, term1854.getClass(), "SOURCE", "influxdb");
        setField(term1854, term1854.getClass(), "timeSeriesId", null);
        setField(term1854, term1854.getClass(), "tspc", null);
        setField(term1865, term1865.getClass(), "this$0", term1854);
        setElement(term1866, 0, "s");
        setElement(term1866, 1, "m");
        setElement(term1866, 2, "h");
        setElement(term1866, 3, "d");
        setElement(term1866, 4, "w");
        setElement(term1866, 5, "mo");
        setElement(term1866, 6, "y");
        setField(term1865, term1865.getClass(), "elementData", term1866);
        setIntField(term1865, term1865.getClass(), "size", 7);
        setIntField(term1865, term1865.getClass(), "modCount", 7);
        setField(term1854, term1854.getClass(), "influxIntervalChar", term1865);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Object[] args = new Object[1];
        args[0] = term1854;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


