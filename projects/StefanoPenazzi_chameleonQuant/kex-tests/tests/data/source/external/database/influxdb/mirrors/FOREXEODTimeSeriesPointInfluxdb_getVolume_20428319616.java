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

public class FOREXEODTimeSeriesPointInfluxdb_getVolume_20428319616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1977;

    public FOREXEODTimeSeriesPointInfluxdb_getVolume_20428319616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1981 = new Double(0.8777038609128434);
        Double term1983 = new Double(0.008025683154629148);
        Double term1985 = new Double(0.40598298281353484);
        Double term1987 = new Double(0.3710067290060264);
        Double term1989 = new Double(0.7818620200430967);
        term1977 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term1978 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term1978, term1978.getClass(), "seconds", 1630952644L);
        setIntField(term1978, term1978.getClass(), "nanos", 759000000);
        setField(term1977, term1977.getClass(), "time", term1978);
        setField(term1977, term1977.getClass(), "open", term1981);
        setField(term1977, term1977.getClass(), "close", term1983);
        setField(term1977, term1977.getClass(), "high", term1985);
        setField(term1977, term1977.getClass(), "low", term1987);
        setField(term1977, term1977.getClass(), "volume", term1989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term1977, args);
    }

};


