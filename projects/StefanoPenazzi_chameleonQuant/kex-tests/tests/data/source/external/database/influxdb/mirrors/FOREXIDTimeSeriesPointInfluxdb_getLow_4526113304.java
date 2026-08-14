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

public class FOREXIDTimeSeriesPointInfluxdb_getLow_4526113304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;

    public FOREXIDTimeSeriesPointInfluxdb_getLow_4526113304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term47 = new Double(0.9527281779865117);
        Double term49 = new Double(0.9828442029246764);
        Double term51 = new Double(0.2779719046761513);
        Double term53 = new Double(0.6436713023569729);
        Double term55 = new Double(0.7332741045694002);
        term43 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb"));
        Object term44 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term44, term44.getClass(), "seconds", 1606045635L);
        setIntField(term44, term44.getClass(), "nanos", 837000000);
        setField(term43, term43.getClass(), "time", term44);
        setField(term43, term43.getClass(), "open", term47);
        setField(term43, term43.getClass(), "close", term49);
        setField(term43, term43.getClass(), "high", term51);
        setField(term43, term43.getClass(), "low", term53);
        setField(term43, term43.getClass(), "volume", term55);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLow", argTypes, term43, args);
    }

};


