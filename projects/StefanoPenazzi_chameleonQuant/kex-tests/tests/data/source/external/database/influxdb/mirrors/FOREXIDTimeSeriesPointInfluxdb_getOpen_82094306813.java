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

public class FOREXIDTimeSeriesPointInfluxdb_getOpen_82094306813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;

    public FOREXIDTimeSeriesPointInfluxdb_getOpen_82094306813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = newInstance(Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb"));
        setField(term103, term103.getClass(), "time", null);
        setField(term103, term103.getClass(), "open", null);
        setField(term103, term103.getClass(), "close", null);
        setField(term103, term103.getClass(), "high", null);
        setField(term103, term103.getClass(), "low", null);
        setField(term103, term103.getClass(), "volume", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.external.database.influxdb.mirrors.FOREXIDTimeSeriesPointInfluxdb");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOpen", argTypes, term103, args);
    }

};


