package data.source.internal.timeseries;

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
import static data.source.internal.timeseries.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class TimeSeriesAbstract_getRange_8242064965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;
     Object term298;

    public TimeSeriesAbstract_getRange_8242064965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296 = newInstance(Class.forName("java.util.Date"));
        setLongField(term296, term296.getClass(), "fastTime", 1345871412244L);
        setField(term296, term296.getClass(), "cdate", null);
        term298 = newInstance(Class.forName("java.util.Date"));
        setLongField(term298, term298.getClass(), "fastTime", 1480438351369L);
        setField(term298, term298.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.TimeSeriesAbstract");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.Date");
        Object[] args = new Object[2];
        args[0] = term296;
        args[1] = term298;
        callMethod(klass, "getRange", argTypes, null, args);
    }

};


