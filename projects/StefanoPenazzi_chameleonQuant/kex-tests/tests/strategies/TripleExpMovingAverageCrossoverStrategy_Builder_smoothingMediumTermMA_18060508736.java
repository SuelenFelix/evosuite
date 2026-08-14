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

public class TripleExpMovingAverageCrossoverStrategy_Builder_smoothingMediumTermMA_18060508736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9693;
     Object term9713;

    public TripleExpMovingAverageCrossoverStrategy_Builder_smoothingMediumTermMA_18060508736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9693 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9693, term9693.getClass(), "ts", null);
        setIntField(term9693, term9693.getClass(), "lengthStma", -1731761810);
        setIntField(term9693, term9693.getClass(), "lengthMtma", 197109649);
        setIntField(term9693, term9693.getClass(), "lengthLtma", -1239406390);
        setField(term9693, term9693.getClass(), "source", "pORebkoRdD");
        setDoubleField(term9693, term9693.getClass(), "smoothingStma", 0.04640022995603543);
        setDoubleField(term9693, term9693.getClass(), "smoothingMtma", 0.9123572866833729);
        setDoubleField(term9693, term9693.getClass(), "smoothingLtma", 0.40635376375558196);
        setDoubleField(term9693, term9693.getClass(), "targetRange", 0.4772043271031934);
        setField(term9693, term9693.getClass(), "ps", null);
        term9713 = new Double(0.2446504549754045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9713;
        callMethod(klass, "smoothingMediumTermMA", argTypes, term9693, args);
    }

};


