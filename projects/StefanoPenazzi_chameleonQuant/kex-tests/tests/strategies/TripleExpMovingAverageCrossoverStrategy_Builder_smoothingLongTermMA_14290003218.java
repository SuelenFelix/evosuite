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

public class TripleExpMovingAverageCrossoverStrategy_Builder_smoothingLongTermMA_14290003218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9907;
     Object term9915;

    public TripleExpMovingAverageCrossoverStrategy_Builder_smoothingLongTermMA_14290003218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9907 = newInstance(Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder"));
        setField(term9907, term9907.getClass(), "ts", null);
        setIntField(term9907, term9907.getClass(), "lengthStma", 0);
        setIntField(term9907, term9907.getClass(), "lengthMtma", 0);
        setIntField(term9907, term9907.getClass(), "lengthLtma", 0);
        setField(term9907, term9907.getClass(), "source", null);
        setDoubleField(term9907, term9907.getClass(), "smoothingStma", 0.0);
        setDoubleField(term9907, term9907.getClass(), "smoothingMtma", 0.0);
        setDoubleField(term9907, term9907.getClass(), "smoothingLtma", 0.0);
        setDoubleField(term9907, term9907.getClass(), "targetRange", 0.0);
        setField(term9907, term9907.getClass(), "ps", null);
        term9915 = new Double(0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term9915;
        callMethod(klass, "smoothingLongTermMA", argTypes, term9907, args);
    }

};


