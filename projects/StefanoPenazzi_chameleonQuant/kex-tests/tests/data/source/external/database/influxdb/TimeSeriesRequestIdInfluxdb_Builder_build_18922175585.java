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

public class TimeSeriesRequestIdInfluxdb_Builder_build_18922175585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;

    public TimeSeriesRequestIdInfluxdb_Builder_build_18922175585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$Builder"));
        setField(term389, term389.getClass(), "timeSeriesId", null);
        setField(term389, term389.getClass(), "tspc", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term389, args);
    }

};


