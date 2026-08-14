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

public class TripleExpMovingAverageCrossoverStrategy_Builder_smoothingShortTermMA_21414927216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9887;
     Object term9895;

    public TripleExpMovingAverageCrossoverStrategy_Builder_smoothingShortTermMA_21414927216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9887 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9887, term9887.getClass(), "ts", null);
        setIntField(term9887, term9887.getClass(), "lengthStma", 0);
        setIntField(term9887, term9887.getClass(), "lengthMtma", 0);
        setIntField(term9887, term9887.getClass(), "lengthLtma", 0);
        setField(term9887, term9887.getClass(), "source", null);
        setDoubleField(term9887, term9887.getClass(), "smoothingStma", 0.0);
        setDoubleField(term9887, term9887.getClass(), "smoothingMtma", 0.0);
        setDoubleField(term9887, term9887.getClass(), "smoothingLtma", 0.0);
        setDoubleField(term9887, term9887.getClass(), "targetRange", 0.0);
        setField(term9887, term9887.getClass(), "ps", null);
        term9895 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9895;
        callMethod(klass, "smoothingShortTermMA", argTypes, term9887, args);
    }

};


