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

public class DualExpMovingAverageCrossoverStrategy_Builder_positionSizing_16792522406 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11712;

    public DualExpMovingAverageCrossoverStrategy_Builder_positionSizing_16792522406() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11712 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11712, term11712.getClass(), "ts", null);
        setIntField(term11712, term11712.getClass(), "lengthStma", 534834644);
        setIntField(term11712, term11712.getClass(), "lengthLtma", 1959097203);
        setField(term11712, term11712.getClass(), "source", "pXOkjyeIRb");
        setDoubleField(term11712, term11712.getClass(), "smoothingStma", 0.9957585718901875);
        setDoubleField(term11712, term11712.getClass(), "smoothingLtma", 0.16755811343784477);
        setField(term11712, term11712.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "positionSizing", argTypes, term11712, args);
    }

};


