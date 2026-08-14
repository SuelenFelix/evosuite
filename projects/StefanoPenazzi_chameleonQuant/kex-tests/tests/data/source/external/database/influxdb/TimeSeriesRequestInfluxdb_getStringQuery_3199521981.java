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

public class TimeSeriesRequestInfluxdb_getStringQuery_3199521981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1733;

    public TimeSeriesRequestInfluxdb_getStringQuery_3199521981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1733 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1744 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1745 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1733, term1733.getClass(), "SOURCE", "influxdb");
        setField(term1733, term1733.getClass(), "timeSeriesId", null);
        setField(term1733, term1733.getClass(), "tspc", null);
        setField(term1744, term1744.getClass(), "this$0", term1733);
        setElement(term1745, 0, "s");
        setElement(term1745, 1, "m");
        setElement(term1745, 2, "h");
        setElement(term1745, 3, "d");
        setElement(term1745, 4, "w");
        setElement(term1745, 5, "mo");
        setElement(term1745, 6, "y");
        setField(term1744, term1744.getClass(), "elementData", term1745);
        setIntField(term1744, term1744.getClass(), "size", 7);
        setIntField(term1744, term1744.getClass(), "modCount", 7);
        setField(term1733, term1733.getClass(), "influxIntervalChar", term1744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestInfluxdb");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Object[] args = new Object[1];
        args[0] = term1733;
        callMethod(klass, "getStringQuery", argTypes, null, args);
    }

};


