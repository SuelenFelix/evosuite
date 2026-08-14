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

public class StockIDTimeSeriesPointInfluxdb_getOpen_5269336305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267;

    public StockIDTimeSeriesPointInfluxdb_getOpen_5269336305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term271 = new Double(0.3626177854778667);
        Double term273 = new Double(0.3163771663728089);
        Double term275 = new Double(0.8819646072665548);
        Double term277 = new Double(0.5412182593116958);
        Double term279 = new Double(0.16988691727397487);
        term267 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb"));
        Object term268 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term268, term268.getClass(), "seconds", 1668569229L);
        setIntField(term268, term268.getClass(), "nanos", 825000000);
        setField(term267, term267.getClass(), "time", term268);
        setField(term267, term267.getClass(), "open", term271);
        setField(term267, term267.getClass(), "close", term273);
        setField(term267, term267.getClass(), "high", term275);
        setField(term267, term267.getClass(), "low", term277);
        setField(term267, term267.getClass(), "volume", term279);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpen", argTypes, term267, args);
    }

};


