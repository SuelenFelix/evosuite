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

public class TripleExpMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_32204255714 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9869;
     Object term9877;

    public TripleExpMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_32204255714() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9869 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9869, term9869.getClass(), "ts", null);
        setIntField(term9869, term9869.getClass(), "lengthStma", 0);
        setIntField(term9869, term9869.getClass(), "lengthMtma", 0);
        setIntField(term9869, term9869.getClass(), "lengthLtma", 0);
        setField(term9869, term9869.getClass(), "source", null);
        setDoubleField(term9869, term9869.getClass(), "smoothingStma", 0.0);
        setDoubleField(term9869, term9869.getClass(), "smoothingMtma", 0.0);
        setDoubleField(term9869, term9869.getClass(), "smoothingLtma", 0.0);
        setDoubleField(term9869, term9869.getClass(), "targetRange", 0.0);
        setField(term9869, term9869.getClass(), "ps", null);
        term9877 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term9877;
        callMethod(klass, "lengthLongTermMA", argTypes, term9869, args);
    }

};


