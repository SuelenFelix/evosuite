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

public class FOREXEODTimeSeriesPointInfluxdb_getOpen_17748303276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;

    public FOREXEODTimeSeriesPointInfluxdb_getOpen_17748303276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term377 = new Double(0.19625398866403143);
        Double term379 = new Double(0.45069204793711093);
        Double term381 = new Double(0.9341364461850963);
        Double term383 = new Double(0.9022041121474429);
        Double term385 = new Double(0.6512870939318848);
        term373 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term374 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term374, term374.getClass(), "seconds", 1502158153L);
        setIntField(term374, term374.getClass(), "nanos", 899000000);
        setField(term373, term373.getClass(), "time", term374);
        setField(term373, term373.getClass(), "open", term377);
        setField(term373, term373.getClass(), "close", term379);
        setField(term373, term373.getClass(), "high", term381);
        setField(term373, term373.getClass(), "low", term383);
        setField(term373, term373.getClass(), "volume", term385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpen", argTypes, term373, args);
    }

};


