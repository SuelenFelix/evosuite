package data.source.internal.timeseries.standard;

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
import static data.source.internal.timeseries.standard.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TimeSeriesIdImpl_getInterval_20282848424 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154;

    public TimeSeriesIdImpl_getInterval_20282848424() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl"));
        Object term155 = newInstance(Class.forName("java.time.Instant"));
        Object term158 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term155, term155.getClass(), "seconds", 1429023851L);
        setIntField(term155, term155.getClass(), "nanos", 389000000);
        setField(term154, term154.getClass(), "startInstant", term155);
        setLongField(term158, term158.getClass(), "seconds", 1495357463L);
        setIntField(term158, term158.getClass(), "nanos", 288000000);
        setField(term154, term154.getClass(), "endInstant", term158);
        setField(term154, term154.getClass(), "id", "SzjVpOQTyS");
        setField(term154, term154.getClass(), "inter", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInterval", argTypes, term154, args);
    }

};


