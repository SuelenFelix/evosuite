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

public class TimeSeriesIdImpl_getEndInstant_16312644143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;

    public TimeSeriesIdImpl_getEndInstant_16312644143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl"));
        Object term104 = newInstance(Class.forName("java.time.Instant"));
        Object term107 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term104, term104.getClass(), "seconds", 1442639565L);
        setIntField(term104, term104.getClass(), "nanos", 302000000);
        setField(term103, term103.getClass(), "startInstant", term104);
        setLongField(term107, term107.getClass(), "seconds", 1515890130L);
        setIntField(term107, term107.getClass(), "nanos", 18000000);
        setField(term103, term103.getClass(), "endInstant", term107);
        setField(term103, term103.getClass(), "id", "jJCZpVmanW");
        setField(term103, term103.getClass(), "inter", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEndInstant", argTypes, term103, args);
    }

};


