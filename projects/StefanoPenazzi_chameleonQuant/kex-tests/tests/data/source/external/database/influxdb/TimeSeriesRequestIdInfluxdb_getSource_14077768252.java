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

public class TimeSeriesRequestIdInfluxdb_getSource_14077768252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001;

    public TimeSeriesRequestIdInfluxdb_getSource_14077768252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1001 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1012 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1013 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1001, term1001.getClass(), "SOURCE", "influxdb");
        setField(term1001, term1001.getClass(), "timeSeriesId", null);
        setField(term1001, term1001.getClass(), "tspc", null);
        setField(term1012, term1012.getClass(), "this$0", term1001);
        setElement(term1013, 0, "s");
        setElement(term1013, 1, "m");
        setElement(term1013, 2, "h");
        setElement(term1013, 3, "d");
        setElement(term1013, 4, "w");
        setElement(term1013, 5, "mo");
        setElement(term1013, 6, "y");
        setField(term1012, term1012.getClass(), "elementData", term1013);
        setIntField(term1012, term1012.getClass(), "size", 7);
        setIntField(term1012, term1012.getClass(), "modCount", 7);
        setField(term1001, term1001.getClass(), "influxIntervalChar", term1012);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term1001, args);
    }

};


