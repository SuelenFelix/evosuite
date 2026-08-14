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
import java.util.LinkedList;

public class TimeSeriesFactoryImpl_createTimeSeries_13574268013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324;
     Object term338;

    public TimeSeriesFactoryImpl_createTimeSeries_13574268013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term325 = new HashMap();
        ArrayList term334 = new ArrayList();
        ((ArrayList) term334).add((Object)null);
        ((ArrayList) term334).add((Object)null);
        ((ArrayList) term334).add((Object)null);
        ((ArrayList) term334).add((Object)null);
        ((ArrayList) term334).add((Object)null);
        term324 = newInstance(Class.forName("data.source.internal.timeseries.standard.TimeSeriesFactoryImpl"));
        setField(term324, term324.getClass(), "cleaners", term325);
        setField(term324, term324.getClass(), "cleanersList", term334);
        term338 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesFactoryImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("data.source.internal.timeseries.structure.TimeSeriesDataStructureI");
        argTypes[1] = Class.forName("data.source.internal.timeseries.TimeSeriesIdI");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term338;
        callMethod(klass, "createTimeSeries", argTypes, term324, args);
    }

};


