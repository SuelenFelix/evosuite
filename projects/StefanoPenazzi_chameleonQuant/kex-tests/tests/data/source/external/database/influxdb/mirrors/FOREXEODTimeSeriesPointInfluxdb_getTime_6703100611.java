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

public class FOREXEODTimeSeriesPointInfluxdb_getTime_6703100611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term316;

    public FOREXEODTimeSeriesPointInfluxdb_getTime_6703100611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term320 = new Double(0.686293604788188);
        Double term322 = new Double(0.12764449157430724);
        Double term324 = new Double(0.39446728256884744);
        Double term326 = new Double(0.7865909711092062);
        Double term328 = new Double(0.06587158449170749);
        term316 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term317 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term317, term317.getClass(), "seconds", 1804998087L);
        setIntField(term317, term317.getClass(), "nanos", 131000000);
        setField(term316, term316.getClass(), "time", term317);
        setField(term316, term316.getClass(), "open", term320);
        setField(term316, term316.getClass(), "close", term322);
        setField(term316, term316.getClass(), "high", term324);
        setField(term316, term316.getClass(), "low", term326);
        setField(term316, term316.getClass(), "volume", term328);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term316, args);
    }

};


