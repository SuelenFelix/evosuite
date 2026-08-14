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

public class DualSimpleMovingAverageCrossoverStrategy_init_17696882051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9481;
     Object term9483;
     Object term9485;
     Object term9487;

    public DualSimpleMovingAverageCrossoverStrategy_init_17696882051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9481 = new Integer(0);
        term9483 = new Integer(0);
        term9485 = new Integer(0);
        term9487 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("data.source.internal.timeseries.TimeSeriesI");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term9481;
        args[2] = term9483;
        args[3] = null;
        args[4] = term9485;
        args[5] = term9487;
        args[6] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


