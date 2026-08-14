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

public class FOREXEODTimeSeriesPointInfluxdb_getTimeFormat_474237028 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401;

    public FOREXEODTimeSeriesPointInfluxdb_getTimeFormat_474237028() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term405 = new Double(0.04640022995603543);
        Double term407 = new Double(0.9123572866833729);
        Double term409 = new Double(0.40635376375558196);
        Double term411 = new Double(0.4772043271031934);
        Double term413 = new Double(0.2446504549754045);
        term401 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term402 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term402, term402.getClass(), "seconds", 1739417792L);
        setIntField(term402, term402.getClass(), "nanos", 956000000);
        setField(term401, term401.getClass(), "time", term402);
        setField(term401, term401.getClass(), "open", term405);
        setField(term401, term401.getClass(), "close", term407);
        setField(term401, term401.getClass(), "high", term409);
        setField(term401, term401.getClass(), "low", term411);
        setField(term401, term401.getClass(), "volume", term413);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeFormat", argTypes, term401, args);
    }

};


