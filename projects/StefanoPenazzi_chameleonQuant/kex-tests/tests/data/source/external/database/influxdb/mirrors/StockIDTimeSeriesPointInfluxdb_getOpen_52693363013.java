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

public class StockIDTimeSeriesPointInfluxdb_getOpen_52693363013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313;

    public StockIDTimeSeriesPointInfluxdb_getOpen_52693363013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb"));
        setField(term313, term313.getClass(), "time", null);
        setField(term313, term313.getClass(), "open", null);
        setField(term313, term313.getClass(), "close", null);
        setField(term313, term313.getClass(), "high", null);
        setField(term313, term313.getClass(), "low", null);
        setField(term313, term313.getClass(), "volume", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpen", argTypes, term313, args);
    }

};


