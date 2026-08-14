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
import java.util.LinkedList;
import java.lang.Object;

public class TimeSeriesAbstract_getComparableList_53341897723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318;

    public TimeSeriesAbstract_getComparableList_53341897723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term318 = new LinkedList();
        ((LinkedList) term318).add((Object)null);
        ((LinkedList) term318).add((Object)null);
        ((LinkedList) term318).add((Object)null);
        ((LinkedList) term318).add((Object)null);
        ((LinkedList) term318).add((Object)null);
        ((LinkedList) term318).add((Object)null);
        ((LinkedList) term318).add((Object)null);
        ((LinkedList) term318).add((Object)null);
        ((LinkedList) term318).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.TimeSeriesAbstract");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term318;
        callMethod(klass, "getComparableList", argTypes, null, args);
    }

};


