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

public class TimeSeriesIdImpl_getId_2222367561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public TimeSeriesIdImpl_getId_2222367561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl"));
        Object term2 = newInstance(Class.forName("java.time.Instant"));
        Object term5 = newInstance(Class.forName("java.time.Instant"));
        setLongField(term2, term2.getClass(), "seconds", 1345871412L);
        setIntField(term2, term2.getClass(), "nanos", 244000000);
        setField(term1, term1.getClass(), "startInstant", term2);
        setLongField(term5, term5.getClass(), "seconds", 1480438351L);
        setIntField(term5, term5.getClass(), "nanos", 369000000);
        setField(term1, term1.getClass(), "endInstant", term5);
        setField(term1, term1.getClass(), "id", "PAEBtnZtTD");
        setField(term1, term1.getClass(), "inter", "sjlJAEtRrb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesIdImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term1, args);
    }

};


