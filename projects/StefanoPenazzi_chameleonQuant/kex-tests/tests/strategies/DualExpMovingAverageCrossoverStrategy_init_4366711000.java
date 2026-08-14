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

public class DualExpMovingAverageCrossoverStrategy_init_4366711000 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8872;
     Object term8874;
     Object term8888;
     Object term8890;

    public DualExpMovingAverageCrossoverStrategy_init_4366711000() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8872 = new Integer(-1498296052);
        term8874 = new Integer(2098647989);
        term8888 = new Double(0.12764449157430724);
        term8890 = new Double(0.39446728256884744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("data.source.internal.timeseries.TimeSeriesI");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = double.class;
        argTypes[5] = double.class;
        argTypes[6] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[7];
        args[0] = null;
        args[1] = term8872;
        args[2] = term8874;
        args[3] = "fztQhjqwdP";
        args[4] = term8888;
        args[5] = term8890;
        args[6] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


