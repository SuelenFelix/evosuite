package data.source.external.database.influxdb.mirrors;

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
import static data.source.external.database.influxdb.mirrors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StockEODTimeSeriesPointInfluxdb_getOpen_135464164713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;

    public StockEODTimeSeriesPointInfluxdb_getOpen_135464164713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb"));
        setField(term208, term208.getClass(), "time", null);
        setField(term208, term208.getClass(), "open", null);
        setField(term208, term208.getClass(), "close", null);
        setField(term208, term208.getClass(), "high", null);
        setField(term208, term208.getClass(), "low", null);
        setField(term208, term208.getClass(), "volume", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpen", argTypes, term208, args);
    }

};


