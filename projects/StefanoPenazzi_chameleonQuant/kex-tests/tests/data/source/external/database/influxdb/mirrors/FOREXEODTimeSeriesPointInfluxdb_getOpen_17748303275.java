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

public class FOREXEODTimeSeriesPointInfluxdb_getOpen_17748303275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1963;

    public FOREXEODTimeSeriesPointInfluxdb_getOpen_17748303275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1967 = new Double(0.19625398866403143);
        Double term1969 = new Double(0.45069204793711093);
        Double term1971 = new Double(0.9341364461850963);
        Double term1973 = new Double(0.9022041121474429);
        Double term1975 = new Double(0.6512870939318848);
        term1963 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term1964 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term1964, term1964.getClass(), "seconds", 1502158153L);
        setIntField(term1964, term1964.getClass(), "nanos", 899000000);
        setField(term1963, term1963.getClass(), "time", term1964);
        setField(term1963, term1963.getClass(), "open", term1967);
        setField(term1963, term1963.getClass(), "close", term1969);
        setField(term1963, term1963.getClass(), "high", term1971);
        setField(term1963, term1963.getClass(), "low", term1973);
        setField(term1963, term1963.getClass(), "volume", term1975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpen", argTypes, term1963, args);
    }

};


