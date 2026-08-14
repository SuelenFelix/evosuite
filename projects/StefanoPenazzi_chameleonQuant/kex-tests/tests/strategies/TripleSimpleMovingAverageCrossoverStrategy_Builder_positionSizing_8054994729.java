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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_positionSizing_8054994729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8718;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_positionSizing_8054994729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8718 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8718, term8718.getClass(), "ts", null);
        setIntField(term8718, term8718.getClass(), "lengthStma", 2095798786);
        setIntField(term8718, term8718.getClass(), "lengthMtma", -1565502840);
        setIntField(term8718, term8718.getClass(), "lengthLtma", 344323424);
        setField(term8718, term8718.getClass(), "source", "sEnIVFtZuQ");
        setIntField(term8718, term8718.getClass(), "offsetStma", 9726679);
        setIntField(term8718, term8718.getClass(), "offsetMtma", -25637976);
        setIntField(term8718, term8718.getClass(), "offsetLtma", 1555897383);
        setField(term8718, term8718.getClass(), "ps", null);
        setDoubleField(term8718, term8718.getClass(), "targetRange", 0.07417792024383196);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "positionSizing", argTypes, term8718, args);
    }

};


