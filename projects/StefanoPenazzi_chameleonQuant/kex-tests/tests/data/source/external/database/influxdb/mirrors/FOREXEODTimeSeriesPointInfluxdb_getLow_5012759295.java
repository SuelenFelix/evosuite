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

public class FOREXEODTimeSeriesPointInfluxdb_getLow_5012759295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term359;

    public FOREXEODTimeSeriesPointInfluxdb_getLow_5012759295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term363 = new Double(0.3074693824288357);
        Double term365 = new Double(0.1245258965512791);
        Double term367 = new Double(0.9511861072660375);
        Double term369 = new Double(0.05880719443135807);
        Double term371 = new Double(0.34010089048558567);
        term359 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term360 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term360, term360.getClass(), "seconds", 1347400561L);
        setIntField(term360, term360.getClass(), "nanos", 385000000);
        setField(term359, term359.getClass(), "time", term360);
        setField(term359, term359.getClass(), "open", term363);
        setField(term359, term359.getClass(), "close", term365);
        setField(term359, term359.getClass(), "high", term367);
        setField(term359, term359.getClass(), "low", term369);
        setField(term359, term359.getClass(), "volume", term371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLow", argTypes, term359, args);
    }

};


