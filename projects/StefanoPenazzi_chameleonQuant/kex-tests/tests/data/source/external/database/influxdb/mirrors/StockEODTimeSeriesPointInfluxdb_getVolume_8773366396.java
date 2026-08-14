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

public class StockEODTimeSeriesPointInfluxdb_getVolume_8773366396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public StockEODTimeSeriesPointInfluxdb_getVolume_8773366396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term180 = new Double(0.3227335400819148);
        Double term182 = new Double(0.43337207054070237);
        Double term184 = new Double(0.13246999699526574);
        Double term186 = new Double(0.9126850255993704);
        Double term188 = new Double(0.11179067076100713);
        term176 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb"));
        Object term177 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term177, term177.getClass(), "seconds", 1745462962L);
        setIntField(term177, term177.getClass(), "nanos", 80000000);
        setField(term176, term176.getClass(), "time", term177);
        setField(term176, term176.getClass(), "open", term180);
        setField(term176, term176.getClass(), "close", term182);
        setField(term176, term176.getClass(), "high", term184);
        setField(term176, term176.getClass(), "low", term186);
        setField(term176, term176.getClass(), "volume", term188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term176, args);
    }

};


