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

public class FOREXIDTimeSeriesPointInfluxdb_getTimeFormat_9064635577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85;

    public FOREXIDTimeSeriesPointInfluxdb_getTimeFormat_9064635577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term89 = new Double(0.37161417339133307);
        Double term91 = new Double(0.6805867182029153);
        Double term93 = new Double(0.2852810965221698);
        Double term95 = new Double(0.6300849762307866);
        Double term97 = new Double(0.9737083944266686);
        term85 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb"));
        Object term86 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term86, term86.getClass(), "seconds", 1429023851L);
        setIntField(term86, term86.getClass(), "nanos", 389000000);
        setField(term85, term85.getClass(), "time", term86);
        setField(term85, term85.getClass(), "open", term89);
        setField(term85, term85.getClass(), "close", term91);
        setField(term85, term85.getClass(), "high", term93);
        setField(term85, term85.getClass(), "low", term95);
        setField(term85, term85.getClass(), "volume", term97);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTimeFormat", argTypes, term85, args);
    }

};


