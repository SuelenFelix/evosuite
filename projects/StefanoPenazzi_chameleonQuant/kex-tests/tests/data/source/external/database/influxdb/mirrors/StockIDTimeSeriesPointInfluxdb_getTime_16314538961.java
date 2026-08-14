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
import java.lang.Object;
import java.lang.Double;

public class StockIDTimeSeriesPointInfluxdb_getTime_16314538961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211;

    public StockIDTimeSeriesPointInfluxdb_getTime_16314538961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term215 = new Double(0.7154795600170818);
        Double term217 = new Double(0.6355029654528058);
        Double term219 = new Double(0.0022646783892913414);
        Double term221 = new Double(0.36226058076369927);
        Double term223 = new Double(0.03699061125289671);
        term211 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb"));
        Object term212 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term212, term212.getClass(), "seconds", 1706078172L);
        setIntField(term212, term212.getClass(), "nanos", 457000000);
        setField(term211, term211.getClass(), "time", term212);
        setField(term211, term211.getClass(), "open", term215);
        setField(term211, term211.getClass(), "close", term217);
        setField(term211, term211.getClass(), "high", term219);
        setField(term211, term211.getClass(), "low", term221);
        setField(term211, term211.getClass(), "volume", term223);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term211, args);
    }

};


