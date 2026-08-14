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

public class StockIDTimeSeriesPointInfluxdb_getTimeFormat_20406270417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295;

    public StockIDTimeSeriesPointInfluxdb_getTimeFormat_20406270417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term299 = new Double(0.7171972879282721);
        Double term301 = new Double(0.9006361024877096);
        Double term303 = new Double(0.5644914462415626);
        Double term305 = new Double(0.509895859167191);
        Double term307 = new Double(0.07417792024383196);
        term295 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb"));
        Object term296 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term296, term296.getClass(), "seconds", 1550698994L);
        setIntField(term296, term296.getClass(), "nanos", 689000000);
        setField(term295, term295.getClass(), "time", term296);
        setField(term295, term295.getClass(), "open", term299);
        setField(term295, term295.getClass(), "close", term301);
        setField(term295, term295.getClass(), "high", term303);
        setField(term295, term295.getClass(), "low", term305);
        setField(term295, term295.getClass(), "volume", term307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeFormat", argTypes, term295, args);
    }

};


