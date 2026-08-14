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
import java.lang.Integer;

public class TripleExpMovingAverageCrossoverStrategy_Builder_lengthMediumTermMA_97934650013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9859;
     Object term9867;

    public TripleExpMovingAverageCrossoverStrategy_Builder_lengthMediumTermMA_97934650013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9859 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9859, term9859.getClass(), "ts", null);
        setIntField(term9859, term9859.getClass(), "lengthStma", 0);
        setIntField(term9859, term9859.getClass(), "lengthMtma", 0);
        setIntField(term9859, term9859.getClass(), "lengthLtma", 0);
        setField(term9859, term9859.getClass(), "source", null);
        setDoubleField(term9859, term9859.getClass(), "smoothingStma", 0.0);
        setDoubleField(term9859, term9859.getClass(), "smoothingMtma", 0.0);
        setDoubleField(term9859, term9859.getClass(), "smoothingLtma", 0.0);
        setDoubleField(term9859, term9859.getClass(), "targetRange", 0.0);
        setField(term9859, term9859.getClass(), "ps", null);
        term9867 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9867;
        callMethod(klass, "lengthMediumTermMA", argTypes, term9859, args);
    }

};


