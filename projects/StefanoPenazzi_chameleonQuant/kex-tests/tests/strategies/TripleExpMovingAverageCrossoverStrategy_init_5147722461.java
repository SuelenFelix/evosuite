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

public class TripleExpMovingAverageCrossoverStrategy_init_5147722461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term899;
     Object term901;
     Object term903;
     Object term905;
     Object term907;
     Object term909;
     Object term911;

    public TripleExpMovingAverageCrossoverStrategy_init_5147722461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term899 = new Integer(0);
        term901 = new Integer(0);
        term903 = new Integer(0);
        term905 = new Double(0.0);
        term907 = new Double(0.0);
        term909 = new Double(0.0);
        term911 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("data.source.internal.timeseries.TimeSeriesI");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = double.class;
        argTypes[6] = double.class;
        argTypes[7] = double.class;
        argTypes[8] = double.class;
        argTypes[9] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = term899;
        args[2] = term901;
        args[3] = term903;
        args[4] = null;
        args[5] = term905;
        args[6] = term907;
        args[7] = term909;
        args[8] = term911;
        args[9] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


