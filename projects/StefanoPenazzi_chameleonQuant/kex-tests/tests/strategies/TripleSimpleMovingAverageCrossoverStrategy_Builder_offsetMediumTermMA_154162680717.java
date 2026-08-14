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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetMediumTermMA_154162680717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8826;
     Object term8834;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetMediumTermMA_154162680717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8826 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8826, term8826.getClass(), "ts", null);
        setIntField(term8826, term8826.getClass(), "lengthStma", 0);
        setIntField(term8826, term8826.getClass(), "lengthMtma", 0);
        setIntField(term8826, term8826.getClass(), "lengthLtma", 0);
        setField(term8826, term8826.getClass(), "source", null);
        setIntField(term8826, term8826.getClass(), "offsetStma", 0);
        setIntField(term8826, term8826.getClass(), "offsetMtma", 0);
        setIntField(term8826, term8826.getClass(), "offsetLtma", 0);
        setField(term8826, term8826.getClass(), "ps", null);
        setDoubleField(term8826, term8826.getClass(), "targetRange", 0.0);
        term8834 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8834;
        callMethod(klass, "offsetMediumTermMA", argTypes, term8826, args);
    }

};


