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

public class TimeSeriesRequestIdInfluxdb_getTimeSeriesId_14123291603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1054;

    public TimeSeriesRequestIdInfluxdb_getTimeSeriesId_14123291603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1054 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1065 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1066 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1054, term1054.getClass(), "SOURCE", "influxdb");
        setField(term1054, term1054.getClass(), "timeSeriesId", null);
        setField(term1054, term1054.getClass(), "tspc", null);
        setField(term1065, term1065.getClass(), "this$0", term1054);
        setElement(term1066, 0, "s");
        setElement(term1066, 1, "m");
        setElement(term1066, 2, "h");
        setElement(term1066, 3, "d");
        setElement(term1066, 4, "w");
        setElement(term1066, 5, "mo");
        setElement(term1066, 6, "y");
        setField(term1065, term1065.getClass(), "elementData", term1066);
        setIntField(term1065, term1065.getClass(), "size", 7);
        setIntField(term1065, term1065.getClass(), "modCount", 7);
        setField(term1054, term1054.getClass(), "influxIntervalChar", term1065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeSeriesId", argTypes, term1054, args);
    }

};


