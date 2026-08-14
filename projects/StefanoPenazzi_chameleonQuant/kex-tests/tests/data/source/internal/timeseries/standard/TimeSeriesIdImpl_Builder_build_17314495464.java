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

public class TimeSeriesIdImpl_Builder_build_17314495464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term547;

    public TimeSeriesIdImpl_Builder_build_17314495464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term547 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder"));
        Object term548 = newInstance(Class.forName("java.time.Instant"));
        Object term551 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term548, term548.getClass(), "seconds", 1882638884L);
        setIntField(term548, term548.getClass(), "nanos", 364000000);
        setField(term547, term547.getClass(), "startInstant", term548);
        setLongField(term551, term551.getClass(), "seconds", 1437757323L);
        setIntField(term551, term551.getClass(), "nanos", 580000000);
        setField(term547, term547.getClass(), "endInstant", term551);
        setField(term547, term547.getClass(), "id", "vrQLuWIDJX");
        setField(term547, term547.getClass(), "interval", "flxyYxBRtu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "build", argTypes, term547, args);
    }

};


