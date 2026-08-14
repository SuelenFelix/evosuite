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

public class TimeSeriesRequestIdInfluxdb_getId_10124923455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1160;

    public TimeSeriesRequestIdInfluxdb_getId_10124923455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1160 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb"));
        Object term1171 = newInstance(Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb$1"));
        Object[] term1172 = (Object[]) newArray("java.lang.Object", 10);
        setField(term1160, term1160.getClass(), "SOURCE", "influxdb");
        setField(term1160, term1160.getClass(), "timeSeriesId", null);
        setField(term1160, term1160.getClass(), "tspc", null);
        setField(term1171, term1171.getClass(), "this$0", term1160);
        setElement(term1172, 0, "s");
        setElement(term1172, 1, "m");
        setElement(term1172, 2, "h");
        setElement(term1172, 3, "d");
        setElement(term1172, 4, "w");
        setElement(term1172, 5, "mo");
        setElement(term1172, 6, "y");
        setField(term1171, term1171.getClass(), "elementData", term1172);
        setIntField(term1171, term1171.getClass(), "size", 7);
        setIntField(term1171, term1171.getClass(), "modCount", 7);
        setField(term1160, term1160.getClass(), "influxIntervalChar", term1171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.TimeSeriesRequestIdInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1160, args);
    }

};


