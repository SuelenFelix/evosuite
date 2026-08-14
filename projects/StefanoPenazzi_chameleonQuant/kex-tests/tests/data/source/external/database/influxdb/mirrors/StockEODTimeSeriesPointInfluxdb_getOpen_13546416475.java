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

public class StockEODTimeSeriesPointInfluxdb_getOpen_13546416475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162;

    public StockEODTimeSeriesPointInfluxdb_getOpen_13546416475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term166 = new Double(0.9203805380592256);
        Double term168 = new Double(0.5804948995371725);
        Double term170 = new Double(0.20737514139742264);
        Double term172 = new Double(0.7919370314903882);
        Double term174 = new Double(0.2109867221632754);
        term162 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb"));
        Object term163 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term163, term163.getClass(), "seconds", 1589457921L);
        setIntField(term163, term163.getClass(), "nanos", 30000000);
        setField(term162, term162.getClass(), "time", term163);
        setField(term162, term162.getClass(), "open", term166);
        setField(term162, term162.getClass(), "close", term168);
        setField(term162, term162.getClass(), "high", term170);
        setField(term162, term162.getClass(), "low", term172);
        setField(term162, term162.getClass(), "volume", term174);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpen", argTypes, term162, args);
    }

};


