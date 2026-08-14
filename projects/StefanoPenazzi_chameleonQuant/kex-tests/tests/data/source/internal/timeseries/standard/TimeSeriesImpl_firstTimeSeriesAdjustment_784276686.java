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

public class TimeSeriesImpl_firstTimeSeriesAdjustment_784276686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221;

    public TimeSeriesImpl_firstTimeSeriesAdjustment_784276686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesImpl"));
        setField(term221, term221.getClass(), "tsd", null);
        setField(term221, term221.getClass(), "itsq", null);
        setBooleanField(term221, term221.getClass(), "singleInterval", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.internal.timeseries.structure.TimeSeriesDataStructureI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "firstTimeSeriesAdjustment", argTypes, term221, args);
    }

};


