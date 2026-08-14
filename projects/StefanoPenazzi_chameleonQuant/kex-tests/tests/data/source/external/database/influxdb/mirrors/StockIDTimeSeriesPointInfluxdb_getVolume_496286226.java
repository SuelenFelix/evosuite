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

public class StockIDTimeSeriesPointInfluxdb_getVolume_496286226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;

    public StockIDTimeSeriesPointInfluxdb_getVolume_496286226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term285 = new Double(0.39286935532362843);
        Double term287 = new Double(0.11577948268926874);
        Double term289 = new Double(0.5617009352394552);
        Double term291 = new Double(0.09067063848644474);
        Double term293 = new Double(0.268304014379393);
        term281 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb"));
        Object term282 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term282, term282.getClass(), "seconds", 1725122217L);
        setIntField(term282, term282.getClass(), "nanos", 647000000);
        setField(term281, term281.getClass(), "time", term282);
        setField(term281, term281.getClass(), "open", term285);
        setField(term281, term281.getClass(), "close", term287);
        setField(term281, term281.getClass(), "high", term289);
        setField(term281, term281.getClass(), "low", term291);
        setField(term281, term281.getClass(), "volume", term293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term281, args);
    }

};


