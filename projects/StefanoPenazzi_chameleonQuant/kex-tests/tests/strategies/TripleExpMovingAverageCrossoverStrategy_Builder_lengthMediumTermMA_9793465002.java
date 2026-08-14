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

public class TripleExpMovingAverageCrossoverStrategy_Builder_lengthMediumTermMA_9793465002 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9545;
     Object term9565;

    public TripleExpMovingAverageCrossoverStrategy_Builder_lengthMediumTermMA_9793465002() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9545 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9545, term9545.getClass(), "ts", null);
        setIntField(term9545, term9545.getClass(), "lengthStma", 229204365);
        setIntField(term9545, term9545.getClass(), "lengthMtma", -461771056);
        setIntField(term9545, term9545.getClass(), "lengthLtma", -243422082);
        setField(term9545, term9545.getClass(), "source", "RYdKCNNMBR");
        setDoubleField(term9545, term9545.getClass(), "smoothingStma", 0.7080134263823477);
        setDoubleField(term9545, term9545.getClass(), "smoothingMtma", 0.6059734092898602);
        setDoubleField(term9545, term9545.getClass(), "smoothingLtma", 0.3074693824288357);
        setDoubleField(term9545, term9545.getClass(), "targetRange", 0.1245258965512791);
        setField(term9545, term9545.getClass(), "ps", null);
        term9565 = new Integer(1384592638);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9565;
        callMethod(klass, "lengthMediumTermMA", argTypes, term9545, args);
    }

};


