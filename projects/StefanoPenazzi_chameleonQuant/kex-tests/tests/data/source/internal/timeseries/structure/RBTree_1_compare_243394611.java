package data.source.internal.timeseries.structure;

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
import static data.source.internal.timeseries.structure.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class RBTree_1_compare_243394611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;

    public RBTree_1_compare_243394611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = newInstance(Class.forName("data.source.internal.timeseries.structure.RBTree$1"));
        setField(term207, term207.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("data.source.internal.timeseries.structure.RBTree$1");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("data.source.internal.timeseries.point.TimeSeriesPointI");
        argTypes[1] = Class.forName("data.source.internal.timeseries.point.TimeSeriesPointI");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "compare", argTypes, term207, args);
    }

};


