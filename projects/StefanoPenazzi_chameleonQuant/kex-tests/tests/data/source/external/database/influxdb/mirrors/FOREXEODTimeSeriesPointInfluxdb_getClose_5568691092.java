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

public class FOREXEODTimeSeriesPointInfluxdb_getClose_5568691092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330;

    public FOREXEODTimeSeriesPointInfluxdb_getClose_5568691092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term334 = new Double(0.0865998004187658);
        Double term336 = new Double(0.9628647861255637);
        Double term338 = new Double(0.623231822150205);
        Double term340 = new Double(0.09037487793444521);
        Double term342 = new Double(0.6561919196821765);
        term330 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb"));
        Object term331 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term331, term331.getClass(), "seconds", 1538078916L);
        setIntField(term331, term331.getClass(), "nanos", 394000000);
        setField(term330, term330.getClass(), "time", term331);
        setField(term330, term330.getClass(), "open", term334);
        setField(term330, term330.getClass(), "close", term336);
        setField(term330, term330.getClass(), "high", term338);
        setField(term330, term330.getClass(), "low", term340);
        setField(term330, term330.getClass(), "volume", term342);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXEODTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClose", argTypes, term330, args);
    }

};


