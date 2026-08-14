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

public class TimeSeriesRequestIdInfluxdb_getStartTime_8698240797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1266;

    public TimeSeriesRequestIdInfluxdb_getStartTime_8698240797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1266 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1277 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1278 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1266, term1266.getClass(), "SOURCE", "influxdb");
        setField(term1266, term1266.getClass(), "timeSeriesId", null);
        setField(term1266, term1266.getClass(), "tspc", null);
        setField(term1277, term1277.getClass(), "this$0", term1266);
        setElement(term1278, 0, "s");
        setElement(term1278, 1, "m");
        setElement(term1278, 2, "h");
        setElement(term1278, 3, "d");
        setElement(term1278, 4, "w");
        setElement(term1278, 5, "mo");
        setElement(term1278, 6, "y");
        setField(term1277, term1277.getClass(), "elementData", term1278);
        setIntField(term1277, term1277.getClass(), "size", 7);
        setIntField(term1277, term1277.getClass(), "modCount", 7);
        setField(term1266, term1266.getClass(), "influxIntervalChar", term1277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartTime", argTypes, term1266, args);
    }

};


