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

public class TimeSeriesRequestIdInfluxdb_getSource_140777682511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1373;

    public TimeSeriesRequestIdInfluxdb_getSource_140777682511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1373 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        setField(term1373, term1373.getClass(), "SOURCE", null);
        setField(term1373, term1373.getClass(), "timeSeriesId", null);
        setField(term1373, term1373.getClass(), "tspc", null);
        setField(term1373, term1373.getClass(), "influxIntervalChar", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSource", argTypes, term1373, args);
    }

};


