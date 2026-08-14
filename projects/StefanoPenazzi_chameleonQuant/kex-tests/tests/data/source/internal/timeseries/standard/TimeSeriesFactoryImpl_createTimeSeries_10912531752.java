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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;

public class TimeSeriesFactoryImpl_createTimeSeries_10912531752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term310;

    public TimeSeriesFactoryImpl_createTimeSeries_10912531752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term311 = new HashMap();
        ArrayList term320 = new ArrayList();
        ((ArrayList) term320).add((Object)null);
        ((ArrayList) term320).add((Object)null);
        ((ArrayList) term320).add((Object)null);
        ((ArrayList) term320).add((Object)null);
        term310 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesFactoryImpl"));
        setField(term310, term310.getClass(), "cleaners", term311);
        setField(term310, term310.getClass(), "cleanersList", term320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesFactoryImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("data.source.internal.timeseries.structure.TimeSeriesDataStructureI");
        argTypes[1] = Class.forName("data.source.internal.timeseries.TimeSeriesIdI");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "createTimeSeries", argTypes, term310, args);
    }

};


