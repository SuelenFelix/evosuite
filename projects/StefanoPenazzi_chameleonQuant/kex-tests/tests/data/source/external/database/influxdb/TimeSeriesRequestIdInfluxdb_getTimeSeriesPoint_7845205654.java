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

public class TimeSeriesRequestIdInfluxdb_getTimeSeriesPoint_7845205654 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1107;

    public TimeSeriesRequestIdInfluxdb_getTimeSeriesPoint_7845205654() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1107 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1118 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1119 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1107, term1107.getClass(), "SOURCE", "influxdb");
        setField(term1107, term1107.getClass(), "timeSeriesId", null);
        setField(term1107, term1107.getClass(), "tspc", null);
        setField(term1118, term1118.getClass(), "this$0", term1107);
        setElement(term1119, 0, "s");
        setElement(term1119, 1, "m");
        setElement(term1119, 2, "h");
        setElement(term1119, 3, "d");
        setElement(term1119, 4, "w");
        setElement(term1119, 5, "mo");
        setElement(term1119, 6, "y");
        setField(term1118, term1118.getClass(), "elementData", term1119);
        setIntField(term1118, term1118.getClass(), "size", 7);
        setIntField(term1118, term1118.getClass(), "modCount", 7);
        setField(term1107, term1107.getClass(), "influxIntervalChar", term1118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeSeriesPoint", argTypes, term1107, args);
    }

};


