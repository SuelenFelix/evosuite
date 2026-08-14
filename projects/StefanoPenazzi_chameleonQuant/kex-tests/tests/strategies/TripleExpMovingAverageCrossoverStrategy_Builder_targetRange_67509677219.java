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

public class TripleExpMovingAverageCrossoverStrategy_Builder_targetRange_67509677219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9917;
     Object term9925;

    public TripleExpMovingAverageCrossoverStrategy_Builder_targetRange_67509677219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9917 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9917, term9917.getClass(), "ts", null);
        setIntField(term9917, term9917.getClass(), "lengthStma", 0);
        setIntField(term9917, term9917.getClass(), "lengthMtma", 0);
        setIntField(term9917, term9917.getClass(), "lengthLtma", 0);
        setField(term9917, term9917.getClass(), "source", null);
        setDoubleField(term9917, term9917.getClass(), "smoothingStma", 0.0);
        setDoubleField(term9917, term9917.getClass(), "smoothingMtma", 0.0);
        setDoubleField(term9917, term9917.getClass(), "smoothingLtma", 0.0);
        setDoubleField(term9917, term9917.getClass(), "targetRange", 0.0);
        setField(term9917, term9917.getClass(), "ps", null);
        term9925 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9925;
        callMethod(klass, "targetRange", argTypes, term9917, args);
    }

};


