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

public class FOREXEODTimeSeriesPointInfluxdb_getTimeFormat_474237027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1991;

    public FOREXEODTimeSeriesPointInfluxdb_getTimeFormat_474237027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term1995 = new Double(0.04640022995603543);
        Double term1997 = new Double(0.9123572866833729);
        Double term1999 = new Double(0.40635376375558196);
        Double term2001 = new Double(0.4772043271031934);
        Double term2003 = new Double(0.2446504549754045);
        term1991 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term1992 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term1992, term1992.getClass(), "seconds", 1739417792L);
        setIntField(term1992, term1992.getClass(), "nanos", 956000000);
        setField(term1991, term1991.getClass(), "time", term1992);
        setField(term1991, term1991.getClass(), "open", term1995);
        setField(term1991, term1991.getClass(), "close", term1997);
        setField(term1991, term1991.getClass(), "high", term1999);
        setField(term1991, term1991.getClass(), "low", term2001);
        setField(term1991, term1991.getClass(), "volume", term2003);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeFormat", argTypes, term1991, args);
    }

};


