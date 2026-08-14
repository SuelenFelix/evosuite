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

public class FOREXEODTimeSeriesPointInfluxdb_getHigh_19816452153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1935;

    public FOREXEODTimeSeriesPointInfluxdb_getHigh_19816452153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1939 = new Double(0.7330178886612495);
        Double term1941 = new Double(0.7618164754425794);
        Double term1943 = new Double(0.7385589312559342);
        Double term1945 = new Double(0.7080134263823477);
        Double term1947 = new Double(0.6059734092898602);
        term1935 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term1936 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term1936, term1936.getClass(), "seconds", 1744090065L);
        setIntField(term1936, term1936.getClass(), "nanos", 937000000);
        setField(term1935, term1935.getClass(), "time", term1936);
        setField(term1935, term1935.getClass(), "open", term1939);
        setField(term1935, term1935.getClass(), "close", term1941);
        setField(term1935, term1935.getClass(), "high", term1943);
        setField(term1935, term1935.getClass(), "low", term1945);
        setField(term1935, term1935.getClass(), "volume", term1947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHigh", argTypes, term1935, args);
    }

};


