package strategies;

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
import static strategies.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SingleSimpleMovingAverageStrategy_init_12329027971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3808;
     Object term3810;

    public SingleSimpleMovingAverageStrategy_init_12329027971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3808 = new Integer(0);
        term3810 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleSimpleMovingAverageStrategy");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("data.source.internal.timeseries.TimeSeriesI");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term3808;
        args[3] = term3810;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


