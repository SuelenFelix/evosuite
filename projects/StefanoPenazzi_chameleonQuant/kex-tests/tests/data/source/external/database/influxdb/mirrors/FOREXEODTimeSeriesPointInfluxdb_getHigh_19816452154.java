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

public class FOREXEODTimeSeriesPointInfluxdb_getHigh_19816452154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345;

    public FOREXEODTimeSeriesPointInfluxdb_getHigh_19816452154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term349 = new Double(0.7330178886612495);
        Double term351 = new Double(0.7618164754425794);
        Double term353 = new Double(0.7385589312559342);
        Double term355 = new Double(0.7080134263823477);
        Double term357 = new Double(0.6059734092898602);
        term345 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term346 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term346, term346.getClass(), "seconds", 1744090065L);
        setIntField(term346, term346.getClass(), "nanos", 937000000);
        setField(term345, term345.getClass(), "time", term346);
        setField(term345, term345.getClass(), "open", term349);
        setField(term345, term345.getClass(), "close", term351);
        setField(term345, term345.getClass(), "high", term353);
        setField(term345, term345.getClass(), "low", term355);
        setField(term345, term345.getClass(), "volume", term357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHigh", argTypes, term345, args);
    }

};


