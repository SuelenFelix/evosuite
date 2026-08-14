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

public class DualMovingAverageCrossoverStrategy_getStrategyName_14306247104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1496;

    public DualMovingAverageCrossoverStrategy_getStrategyName_14306247104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1496 = newInstance(Class.forName("strategies.DualMovingAverageCrossoverStrategy"));
        setField(term1496, term1496.getClass(), "itsRef", null);
        setField(term1496, term1496.getClass(), "stma", null);
        setField(term1496, term1496.getClass(), "ltma", null);
        setField(term1496, term1496.getClass(), "source", null);
        setField(term1496, term1496.getClass(), "positions", null);
        setField(term1496, term1496.getClass(), "positionSizing", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualMovingAverageCrossoverStrategy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStrategyName", argTypes, term1496, args);
    }

};


