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

public class StockIDTimeSeriesPointInfluxdb_getHigh_3201187423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239;

    public StockIDTimeSeriesPointInfluxdb_getHigh_3201187423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term243 = new Double(0.29874017652881824);
        Double term245 = new Double(0.32554480512985284);
        Double term247 = new Double(0.8924855581421237);
        Double term249 = new Double(0.32237559209193944);
        Double term251 = new Double(0.53094494792755);
        term239 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb"));
        Object term240 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term240, term240.getClass(), "seconds", 1882638884L);
        setIntField(term240, term240.getClass(), "nanos", 364000000);
        setField(term239, term239.getClass(), "time", term240);
        setField(term239, term239.getClass(), "open", term243);
        setField(term239, term239.getClass(), "close", term245);
        setField(term239, term239.getClass(), "high", term247);
        setField(term239, term239.getClass(), "low", term249);
        setField(term239, term239.getClass(), "volume", term251);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.StockIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHigh", argTypes, term239, args);
    }

};


