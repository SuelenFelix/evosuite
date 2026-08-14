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

public class TimeSeriesIdImpl_getStartInstant_2304149852 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52;

    public TimeSeriesIdImpl_getStartInstant_2304149852() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl"));
        Object term53 = newInstance(Class.forName("java.time.Instant"));
        Object term56 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term53, term53.getClass(), "seconds", 1610940182L);
        setIntField(term53, term53.getClass(), "nanos", 830000000);
        setField(term52, term52.getClass(), "startInstant", term53);
        setLongField(term56, term56.getClass(), "seconds", 1606045635L);
        setIntField(term56, term56.getClass(), "nanos", 837000000);
        setField(term52, term52.getClass(), "endInstant", term56);
        setField(term52, term52.getClass(), "id", "MuLcgQHgqz");
        setField(term52, term52.getClass(), "inter", "xxtlPwDYFs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartInstant", argTypes, term52, args);
    }

};


