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

public class FOREXEODTimeSeriesPointInfluxdb_getVolume_20428319617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term387;

    public FOREXEODTimeSeriesPointInfluxdb_getVolume_20428319617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term391 = new Double(0.8777038609128434);
        Double term393 = new Double(0.008025683154629148);
        Double term395 = new Double(0.40598298281353484);
        Double term397 = new Double(0.3710067290060264);
        Double term399 = new Double(0.7818620200430967);
        term387 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term388 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term388, term388.getClass(), "seconds", 1630952644L);
        setIntField(term388, term388.getClass(), "nanos", 759000000);
        setField(term387, term387.getClass(), "time", term388);
        setField(term387, term387.getClass(), "open", term391);
        setField(term387, term387.getClass(), "close", term393);
        setField(term387, term387.getClass(), "high", term395);
        setField(term387, term387.getClass(), "low", term397);
        setField(term387, term387.getClass(), "volume", term399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolume", argTypes, term387, args);
    }

};


