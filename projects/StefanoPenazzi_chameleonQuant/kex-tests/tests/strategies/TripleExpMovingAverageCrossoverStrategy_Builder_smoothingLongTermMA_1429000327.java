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
import java.lang.Double;

public class TripleExpMovingAverageCrossoverStrategy_Builder_smoothingLongTermMA_1429000327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9725;
     Object term9745;

    public TripleExpMovingAverageCrossoverStrategy_Builder_smoothingLongTermMA_1429000327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9725 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9725, term9725.getClass(), "ts", null);
        setIntField(term9725, term9725.getClass(), "lengthStma", 1557431527);
        setIntField(term9725, term9725.getClass(), "lengthMtma", -1504890659);
        setIntField(term9725, term9725.getClass(), "lengthLtma", 1358829571);
        setField(term9725, term9725.getClass(), "source", "mXGCWJDOqA");
        setDoubleField(term9725, term9725.getClass(), "smoothingStma", 0.6142723998707854);
        setDoubleField(term9725, term9725.getClass(), "smoothingMtma", 0.4355627280318103);
        setDoubleField(term9725, term9725.getClass(), "smoothingLtma", 0.841460835734741);
        setDoubleField(term9725, term9725.getClass(), "targetRange", 0.7859316615744082);
        setField(term9725, term9725.getClass(), "ps", null);
        term9745 = new Double(0.6428742553484879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9745;
        callMethod(klass, "smoothingLongTermMA", argTypes, term9725, args);
    }

};


