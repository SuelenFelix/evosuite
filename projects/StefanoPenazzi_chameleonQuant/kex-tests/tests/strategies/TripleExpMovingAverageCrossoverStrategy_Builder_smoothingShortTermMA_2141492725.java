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

public class TripleExpMovingAverageCrossoverStrategy_Builder_smoothingShortTermMA_2141492725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9661;
     Object term9681;

    public TripleExpMovingAverageCrossoverStrategy_Builder_smoothingShortTermMA_2141492725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9661 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9661, term9661.getClass(), "ts", null);
        setIntField(term9661, term9661.getClass(), "lengthStma", 663292551);
        setIntField(term9661, term9661.getClass(), "lengthMtma", -1885090354);
        setIntField(term9661, term9661.getClass(), "lengthLtma", -2066804303);
        setField(term9661, term9661.getClass(), "source", "XylxrMBraH");
        setDoubleField(term9661, term9661.getClass(), "smoothingStma", 0.8777038609128434);
        setDoubleField(term9661, term9661.getClass(), "smoothingMtma", 0.008025683154629148);
        setDoubleField(term9661, term9661.getClass(), "smoothingLtma", 0.40598298281353484);
        setDoubleField(term9661, term9661.getClass(), "targetRange", 0.3710067290060264);
        setField(term9661, term9661.getClass(), "ps", null);
        term9681 = new Double(0.7818620200430967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9681;
        callMethod(klass, "smoothingShortTermMA", argTypes, term9661, args);
    }

};


