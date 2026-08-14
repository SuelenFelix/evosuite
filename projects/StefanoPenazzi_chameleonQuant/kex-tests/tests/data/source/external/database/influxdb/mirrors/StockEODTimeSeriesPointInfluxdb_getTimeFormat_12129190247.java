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

public class StockEODTimeSeriesPointInfluxdb_getTimeFormat_12129190247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190;

    public StockEODTimeSeriesPointInfluxdb_getTimeFormat_12129190247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term194 = new Double(0.5306473989087822);
        Double term196 = new Double(0.022483645678509023);
        Double term198 = new Double(0.025133051616627267);
        Double term200 = new Double(0.016575281023182953);
        Double term202 = new Double(0.5308350402051779);
        term190 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb"));
        Object term191 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term191, term191.getClass(), "seconds", 1349069753L);
        setIntField(term191, term191.getClass(), "nanos", 960000000);
        setField(term190, term190.getClass(), "time", term191);
        setField(term190, term190.getClass(), "open", term194);
        setField(term190, term190.getClass(), "close", term196);
        setField(term190, term190.getClass(), "high", term198);
        setField(term190, term190.getClass(), "low", term200);
        setField(term190, term190.getClass(), "volume", term202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeFormat", argTypes, term190, args);
    }

};


