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

public class TimeSeriesIdImpl_Builder_endInstant_13622054458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600;

    public TimeSeriesIdImpl_Builder_endInstant_13622054458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder"));
        setField(term600, term600.getClass(), "startInstant", null);
        setField(term600, term600.getClass(), "endInstant", null);
        setField(term600, term600.getClass(), "id", null);
        setField(term600, term600.getClass(), "interval", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "endInstant", argTypes, term600, args);
    }

};


