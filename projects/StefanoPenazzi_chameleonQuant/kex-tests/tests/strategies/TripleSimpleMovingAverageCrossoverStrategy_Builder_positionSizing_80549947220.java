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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_positionSizing_80549947220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8856;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_positionSizing_80549947220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8856 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8856, term8856.getClass(), "ts", null);
        setIntField(term8856, term8856.getClass(), "lengthStma", 0);
        setIntField(term8856, term8856.getClass(), "lengthMtma", 0);
        setIntField(term8856, term8856.getClass(), "lengthLtma", 0);
        setField(term8856, term8856.getClass(), "source", null);
        setIntField(term8856, term8856.getClass(), "offsetStma", 0);
        setIntField(term8856, term8856.getClass(), "offsetMtma", 0);
        setIntField(term8856, term8856.getClass(), "offsetLtma", 0);
        setField(term8856, term8856.getClass(), "ps", null);
        setDoubleField(term8856, term8856.getClass(), "targetRange", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("strategies.positionsizing.PositionSizingI");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "positionSizing", argTypes, term8856, args);
    }

};


