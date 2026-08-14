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

public class TimeSeriesIdImpl_Builder_endInstant_13622054453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term493;
     Object term524;

    public TimeSeriesIdImpl_Builder_endInstant_13622054453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term493 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder"));
        Object term494 = newInstance(Class.forName("java.time.Instant"));
        Object term497 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term494, term494.getClass(), "seconds", 1349069753L);
        setIntField(term494, term494.getClass(), "nanos", 960000000);
        setField(term493, term493.getClass(), "startInstant", term494);
        setLongField(term497, term497.getClass(), "seconds", 1706078172L);
        setIntField(term497, term497.getClass(), "nanos", 457000000);
        setField(term493, term493.getClass(), "endInstant", term497);
        setField(term493, term493.getClass(), "id", "eZFUvlxvGV");
        setField(term493, term493.getClass(), "interval", "BYqFIqCKAV");
        term524 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term524, term524.getClass(), "seconds", 1863631094L);
        setIntField(term524, term524.getClass(), "nanos", 992000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term524;
        callMethod(klass, "endInstant", argTypes, term493, args);
    }

};


