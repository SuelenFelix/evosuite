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
import java.util.LinkedList;
import java.lang.Object;

public class TimeSeriesImpl_init_14109405970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209;

    public TimeSeriesImpl_init_14109405970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209 = new LinkedList();
        ((LinkedList) term209).add((Object)null);
        ((LinkedList) term209).add((Object)null);
        ((LinkedList) term209).add((Object)null);
        ((LinkedList) term209).add((Object)null);
        ((LinkedList) term209).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.standard.TimeSeriesImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("data.source.internal.timeseries.structure.TimeSeriesDataStructureI");
        argTypes[1] = Class.forName("data.source.internal.timeseries.TimeSeriesIdI");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term209;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


