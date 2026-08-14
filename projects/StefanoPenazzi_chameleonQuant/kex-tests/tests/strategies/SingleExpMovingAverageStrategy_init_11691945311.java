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
import java.lang.Double;

public class SingleExpMovingAverageStrategy_init_11691945311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17651;
     Object term17653;

    public SingleExpMovingAverageStrategy_init_11691945311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17651 = new Integer(0);
        term17653 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.SingleExpMovingAverageStrategy");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("data.source.internal.timeseries.TimeSeriesI");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = double.class;
        argTypes[4] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = term17651;
        args[3] = term17653;
        args[4] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


