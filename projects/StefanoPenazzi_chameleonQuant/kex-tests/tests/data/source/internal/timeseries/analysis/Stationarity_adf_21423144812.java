package data.source.internal.timeseries.analysis;

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
import static data.source.internal.timeseries.analysis.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Stationarity_adf_21423144812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Stationarity_adf_21423144812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.analysis.Stationarity");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("data.source.internal.timeseries.TimeSeriesI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "adf", argTypes, null, args);
    }

};


