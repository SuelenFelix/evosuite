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

public class TimeSeriesRequestIdInfluxdb_getEndTime_6808797528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1319;

    public TimeSeriesRequestIdInfluxdb_getEndTime_6808797528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1319 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1330 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1331 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1319, term1319.getClass(), "SOURCE", "influxdb");
        setField(term1319, term1319.getClass(), "timeSeriesId", null);
        setField(term1319, term1319.getClass(), "tspc", null);
        setField(term1330, term1330.getClass(), "this$0", term1319);
        setElement(term1331, 0, "s");
        setElement(term1331, 1, "m");
        setElement(term1331, 2, "h");
        setElement(term1331, 3, "d");
        setElement(term1331, 4, "w");
        setElement(term1331, 5, "mo");
        setElement(term1331, 6, "y");
        setField(term1330, term1330.getClass(), "elementData", term1331);
        setIntField(term1330, term1330.getClass(), "size", 7);
        setIntField(term1330, term1330.getClass(), "modCount", 7);
        setField(term1319, term1319.getClass(), "influxIntervalChar", term1330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndTime", argTypes, term1319, args);
    }

};


