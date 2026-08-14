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

public class StockEODTimeSeriesPointInfluxdb_getClose_17223644312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120;

    public StockEODTimeSeriesPointInfluxdb_getClose_17223644312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term124 = new Double(0.22651340641904605);
        Double term126 = new Double(0.8878841294187743);
        Double term128 = new Double(0.6588948704887806);
        Double term130 = new Double(0.6397214730945112);
        Double term132 = new Double(0.25937345430928016);
        term120 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb"));
        Object term121 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term121, term121.getClass(), "seconds", 1645834034L);
        setIntField(term121, term121.getClass(), "nanos", 896000000);
        setField(term120, term120.getClass(), "time", term121);
        setField(term120, term120.getClass(), "open", term124);
        setField(term120, term120.getClass(), "close", term126);
        setField(term120, term120.getClass(), "high", term128);
        setField(term120, term120.getClass(), "low", term130);
        setField(term120, term120.getClass(), "volume", term132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClose", argTypes, term120, args);
    }

};


