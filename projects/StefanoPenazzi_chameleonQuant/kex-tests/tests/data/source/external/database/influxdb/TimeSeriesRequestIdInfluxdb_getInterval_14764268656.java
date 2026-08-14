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

public class TimeSeriesRequestIdInfluxdb_getInterval_14764268656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1213;

    public TimeSeriesRequestIdInfluxdb_getInterval_14764268656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1213 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1224 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1225 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1213, term1213.getClass(), "SOURCE", "influxdb");
        setField(term1213, term1213.getClass(), "timeSeriesId", null);
        setField(term1213, term1213.getClass(), "tspc", null);
        setField(term1224, term1224.getClass(), "this$0", term1213);
        setElement(term1225, 0, "s");
        setElement(term1225, 1, "m");
        setElement(term1225, 2, "h");
        setElement(term1225, 3, "d");
        setElement(term1225, 4, "w");
        setElement(term1225, 5, "mo");
        setElement(term1225, 6, "y");
        setField(term1224, term1224.getClass(), "elementData", term1225);
        setIntField(term1224, term1224.getClass(), "size", 7);
        setIntField(term1224, term1224.getClass(), "modCount", 7);
        setField(term1213, term1213.getClass(), "influxIntervalChar", term1224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInterval", argTypes, term1213, args);
    }

};


