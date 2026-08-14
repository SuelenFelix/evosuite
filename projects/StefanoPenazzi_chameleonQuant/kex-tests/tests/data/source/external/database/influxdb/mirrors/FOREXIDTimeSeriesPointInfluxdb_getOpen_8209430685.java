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

public class FOREXIDTimeSeriesPointInfluxdb_getOpen_8209430685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;

    public FOREXIDTimeSeriesPointInfluxdb_getOpen_8209430685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Double term61 = new Double(0.4569171842750229);
        Double term63 = new Double(0.8598297828918529);
        Double term65 = new Double(0.43692187681405226);
        Double term67 = new Double(0.7633268466829064);
        Double term69 = new Double(0.13481025392611334);
        term57 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb"));
        Object term58 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term58, term58.getClass(), "seconds", 1442639565L);
        setIntField(term58, term58.getClass(), "nanos", 302000000);
        setField(term57, term57.getClass(), "time", term58);
        setField(term57, term57.getClass(), "open", term61);
        setField(term57, term57.getClass(), "close", term63);
        setField(term57, term57.getClass(), "high", term65);
        setField(term57, term57.getClass(), "low", term67);
        setField(term57, term57.getClass(), "volume", term69);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpen", argTypes, term57, args);
    }

};


