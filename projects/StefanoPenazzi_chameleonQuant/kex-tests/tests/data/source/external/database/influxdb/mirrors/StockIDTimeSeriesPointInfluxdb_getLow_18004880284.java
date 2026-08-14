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

public class StockIDTimeSeriesPointInfluxdb_getLow_18004880284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term253;

    public StockIDTimeSeriesPointInfluxdb_getLow_18004880284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term257 = new Double(0.146431486357265);
        Double term259 = new Double(0.24259014218848696);
        Double term261 = new Double(0.1544348383112728);
        Double term263 = new Double(0.5187846213101265);
        Double term265 = new Double(0.045893173090043815);
        term253 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb"));
        Object term254 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term254, term254.getClass(), "seconds", 1437757323L);
        setIntField(term254, term254.getClass(), "nanos", 580000000);
        setField(term253, term253.getClass(), "time", term254);
        setField(term253, term253.getClass(), "open", term257);
        setField(term253, term253.getClass(), "close", term259);
        setField(term253, term253.getClass(), "high", term261);
        setField(term253, term253.getClass(), "low", term263);
        setField(term253, term253.getClass(), "volume", term265);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLow", argTypes, term253, args);
    }

};


