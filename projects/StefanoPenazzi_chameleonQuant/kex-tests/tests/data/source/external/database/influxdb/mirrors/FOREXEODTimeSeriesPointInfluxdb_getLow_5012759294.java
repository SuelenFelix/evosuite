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

public class FOREXEODTimeSeriesPointInfluxdb_getLow_5012759294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1949;

    public FOREXEODTimeSeriesPointInfluxdb_getLow_5012759294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1953 = new Double(0.3074693824288357);
        Double term1955 = new Double(0.1245258965512791);
        Double term1957 = new Double(0.9511861072660375);
        Double term1959 = new Double(0.05880719443135807);
        Double term1961 = new Double(0.34010089048558567);
        term1949 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term1950 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term1950, term1950.getClass(), "seconds", 1347400561L);
        setIntField(term1950, term1950.getClass(), "nanos", 385000000);
        setField(term1949, term1949.getClass(), "time", term1950);
        setField(term1949, term1949.getClass(), "open", term1953);
        setField(term1949, term1949.getClass(), "close", term1955);
        setField(term1949, term1949.getClass(), "high", term1957);
        setField(term1949, term1949.getClass(), "low", term1959);
        setField(term1949, term1949.getClass(), "volume", term1961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLow", argTypes, term1949, args);
    }

};


