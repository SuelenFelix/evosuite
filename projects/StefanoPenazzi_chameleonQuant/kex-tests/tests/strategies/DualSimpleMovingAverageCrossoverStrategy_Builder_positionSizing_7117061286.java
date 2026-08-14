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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_positionSizing_7117061286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11438;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_positionSizing_7117061286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11438 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11438, term11438.getClass(), "ts", null);
        setIntField(term11438, term11438.getClass(), "lengthStma", -159494544);
        setIntField(term11438, term11438.getClass(), "lengthLtma", -75206835);
        setField(term11438, term11438.getClass(), "source", "fWKJoSoCwE");
        setIntField(term11438, term11438.getClass(), "offsetStma", -1618206977);
        setIntField(term11438, term11438.getClass(), "offsetLtma", -1747406163);
        setField(term11438, term11438.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "positionSizing", argTypes, term11438, args);
    }

};


