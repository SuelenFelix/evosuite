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

public class DualExpMovingAverageCrossoverStrategy_Builder_smoothingLongTermMA_74149056013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11792;
     Object term11797;

    public DualExpMovingAverageCrossoverStrategy_Builder_smoothingLongTermMA_74149056013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11792 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11792, term11792.getClass(), "ts", null);
        setIntField(term11792, term11792.getClass(), "lengthStma", 0);
        setIntField(term11792, term11792.getClass(), "lengthLtma", 0);
        setField(term11792, term11792.getClass(), "source", null);
        setDoubleField(term11792, term11792.getClass(), "smoothingStma", 0.0);
        setDoubleField(term11792, term11792.getClass(), "smoothingLtma", 0.0);
        setField(term11792, term11792.getClass(), "ps", null);
        term11797 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term11797;
        callMethod(klass, "smoothingLongTermMA", argTypes, term11792, args);
    }

};


