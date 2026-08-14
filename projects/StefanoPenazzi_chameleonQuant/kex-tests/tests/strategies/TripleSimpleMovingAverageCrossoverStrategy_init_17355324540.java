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

public class TripleSimpleMovingAverageCrossoverStrategy_init_17355324540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17575;
     Object term17577;
     Object term17579;
     Object term17593;
     Object term17595;
     Object term17597;
     Object term17599;

    public TripleSimpleMovingAverageCrossoverStrategy_init_17355324540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17575 = new Integer(1593461795);
        term17577 = new Integer(515182546);
        term17579 = new Integer(-936895502);
        term17593 = new Integer(-129547140);
        term17595 = new Integer(199287428);
        term17597 = new Integer(-1195339592);
        term17599 = new Double(0.4630082575704827);
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
        args[1] = term17575;
        args[2] = term17577;
        args[3] = term17579;
        args[4] = "cudZvLMQon";
        args[5] = term17593;
        args[6] = term17595;
        args[7] = term17597;
        args[8] = term17599;
        args[9] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


