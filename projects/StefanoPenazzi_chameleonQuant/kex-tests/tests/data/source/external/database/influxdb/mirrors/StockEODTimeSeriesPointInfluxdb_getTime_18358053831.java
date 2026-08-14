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

public class StockEODTimeSeriesPointInfluxdb_getTime_18358053831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;

    public StockEODTimeSeriesPointInfluxdb_getTime_18358053831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term110 = new Double(0.0668892744806211);
        Double term112 = new Double(0.3587267442738795);
        Double term114 = new Double(0.07802449704920456);
        Double term116 = new Double(0.5279279537140873);
        Double term118 = new Double(0.3202192021706908);
        term106 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb"));
        Object term107 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term107, term107.getClass(), "seconds", 1495357463L);
        setIntField(term107, term107.getClass(), "nanos", 288000000);
        setField(term106, term106.getClass(), "time", term107);
        setField(term106, term106.getClass(), "open", term110);
        setField(term106, term106.getClass(), "close", term112);
        setField(term106, term106.getClass(), "high", term114);
        setField(term106, term106.getClass(), "low", term116);
        setField(term106, term106.getClass(), "volume", term118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTime", argTypes, term106, args);
    }

};


