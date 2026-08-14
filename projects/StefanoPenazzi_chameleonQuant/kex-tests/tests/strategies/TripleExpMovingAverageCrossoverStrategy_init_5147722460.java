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

public class TripleExpMovingAverageCrossoverStrategy_init_5147722460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term863;
     Object term865;
     Object term867;
     Object term881;
     Object term883;
     Object term885;
     Object term887;

    public TripleExpMovingAverageCrossoverStrategy_init_5147722460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term863 = new Integer(-1955890973);
        term865 = new Integer(-2038273078);
        term867 = new Integer(1227103734);
        term881 = new Double(0.37773193782763337);
        term883 = new Double(0.8474802076607362);
        term885 = new Double(0.5183269973490326);
        term887 = new Double(0.7655020693602768);
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
        args[1] = term863;
        args[2] = term865;
        args[3] = term867;
        args[4] = "MjGYSRKTNF";
        args[5] = term881;
        args[6] = term883;
        args[7] = term885;
        args[8] = term887;
        args[9] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


