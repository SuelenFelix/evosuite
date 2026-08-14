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

public class FOREXIDTimeSeriesPointInfluxdb_getHigh_10277579563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;

    public FOREXIDTimeSeriesPointInfluxdb_getHigh_10277579563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term33 = new Double(0.8474802076607362);
        Double term35 = new Double(0.5183269973490326);
        Double term37 = new Double(0.7655020693602768);
        Double term39 = new Double(0.1374549299694151);
        Double term41 = new Double(0.7031006357544823);
        term29 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb"));
        Object term30 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term30, term30.getClass(), "seconds", 1610940182L);
        setIntField(term30, term30.getClass(), "nanos", 830000000);
        setField(term29, term29.getClass(), "time", term30);
        setField(term29, term29.getClass(), "open", term33);
        setField(term29, term29.getClass(), "close", term35);
        setField(term29, term29.getClass(), "high", term37);
        setField(term29, term29.getClass(), "low", term39);
        setField(term29, term29.getClass(), "volume", term41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHigh", argTypes, term29, args);
    }

};


