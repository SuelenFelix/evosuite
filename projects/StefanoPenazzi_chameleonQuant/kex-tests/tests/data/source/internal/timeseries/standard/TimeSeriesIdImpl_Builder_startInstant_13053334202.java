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

public class TimeSeriesIdImpl_Builder_startInstant_13053334202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439;
     Object term470;

    public TimeSeriesIdImpl_Builder_startInstant_13053334202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder"));
        Object term440 = newInstance(Class.forName("java.time.Instant"));
        Object term443 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term440, term440.getClass(), "seconds", 1797203628L);
        setIntField(term440, term440.getClass(), "nanos", 25000000);
        setField(term439, term439.getClass(), "startInstant", term440);
        setLongField(term443, term443.getClass(), "seconds", 1589457921L);
        setIntField(term443, term443.getClass(), "nanos", 30000000);
        setField(term439, term439.getClass(), "endInstant", term443);
        setField(term439, term439.getClass(), "id", "RkybSrpybU");
        setField(term439, term439.getClass(), "interval", "xOEqzGAmDU");
        term470 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term470, term470.getClass(), "seconds", 1745462962L);
        setIntField(term470, term470.getClass(), "nanos", 80000000);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.Instant");
        Object[] args = new Object[1];
        args[0] = term470;
        callMethod(klass, "startInstant", argTypes, term439, args);
    }

};


