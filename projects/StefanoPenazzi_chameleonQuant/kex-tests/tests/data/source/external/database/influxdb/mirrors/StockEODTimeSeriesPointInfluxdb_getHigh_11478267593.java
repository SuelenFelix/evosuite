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

public class StockEODTimeSeriesPointInfluxdb_getHigh_11478267593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;

    public StockEODTimeSeriesPointInfluxdb_getHigh_11478267593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term138 = new Double(0.5873228247510078);
        Double term140 = new Double(0.8823181080774973);
        Double term142 = new Double(0.2192450926212024);
        Double term144 = new Double(0.7591353014991907);
        Double term146 = new Double(0.791695029600875);
        term134 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb"));
        Object term135 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term135, term135.getClass(), "seconds", 1500721068L);
        setIntField(term135, term135.getClass(), "nanos", 23000000);
        setField(term134, term134.getClass(), "time", term135);
        setField(term134, term134.getClass(), "open", term138);
        setField(term134, term134.getClass(), "close", term140);
        setField(term134, term134.getClass(), "high", term142);
        setField(term134, term134.getClass(), "low", term144);
        setField(term134, term134.getClass(), "volume", term146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHigh", argTypes, term134, args);
    }

};


