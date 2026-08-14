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

public class TripleSimpleMovingAverageCrossoverStrategy_init_17355324541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17611;
     Object term17613;
     Object term17615;
     Object term17617;
     Object term17619;
     Object term17621;
     Object term17623;

    public TripleSimpleMovingAverageCrossoverStrategy_init_17355324541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17611 = new Integer(0);
        term17613 = new Integer(0);
        term17615 = new Integer(0);
        term17617 = new Integer(0);
        term17619 = new Integer(0);
        term17621 = new Integer(0);
        term17623 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[10];
        argTypes[0] = Class.forName("data.source.internal.timeseries.TimeSeriesI");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = double.class;
        argTypes[9] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[10];
        args[0] = null;
        args[1] = term17611;
        args[2] = term17613;
        args[3] = term17615;
        args[4] = null;
        args[5] = term17617;
        args[6] = term17619;
        args[7] = term17621;
        args[8] = term17623;
        args[9] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


