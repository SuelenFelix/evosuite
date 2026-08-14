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

public class StockIDTimeSeriesPointInfluxdb_getClose_17448948482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225;

    public StockIDTimeSeriesPointInfluxdb_getClose_17448948482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term229 = new Double(0.6047137830113202);
        Double term231 = new Double(0.6767213143579776);
        Double term233 = new Double(0.48862955528902696);
        Double term235 = new Double(0.426231085465289);
        Double term237 = new Double(0.0027299293098262956);
        term225 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb"));
        Object term226 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term226, term226.getClass(), "seconds", 1863631094L);
        setIntField(term226, term226.getClass(), "nanos", 992000000);
        setField(term225, term225.getClass(), "time", term226);
        setField(term225, term225.getClass(), "open", term229);
        setField(term225, term225.getClass(), "close", term231);
        setField(term225, term225.getClass(), "high", term233);
        setField(term225, term225.getClass(), "low", term235);
        setField(term225, term225.getClass(), "volume", term237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClose", argTypes, term225, args);
    }

};


