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

public class DualExpMovingAverageCrossoverStrategy_Builder_smoothingLongTermMA_7414905605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11683;
     Object term11700;

    public DualExpMovingAverageCrossoverStrategy_Builder_smoothingLongTermMA_7414905605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11683 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11683, term11683.getClass(), "ts", null);
        setIntField(term11683, term11683.getClass(), "lengthStma", 1320570890);
        setIntField(term11683, term11683.getClass(), "lengthLtma", -130649791);
        setField(term11683, term11683.getClass(), "source", "mvrkADEgpp");
        setDoubleField(term11683, term11683.getClass(), "smoothingStma", 0.6693176553622628);
        setDoubleField(term11683, term11683.getClass(), "smoothingLtma", 0.2962868255626906);
        setField(term11683, term11683.getClass(), "ps", null);
        term11700 = new Double(0.25474180574060834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term11700;
        callMethod(klass, "smoothingLongTermMA", argTypes, term11683, args);
    }

};


