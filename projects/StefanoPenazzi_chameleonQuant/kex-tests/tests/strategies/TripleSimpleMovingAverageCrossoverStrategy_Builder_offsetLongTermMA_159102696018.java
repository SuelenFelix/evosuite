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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetLongTermMA_159102696018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8836;
     Object term8844;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_offsetLongTermMA_159102696018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8836 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8836, term8836.getClass(), "ts", null);
        setIntField(term8836, term8836.getClass(), "lengthStma", 0);
        setIntField(term8836, term8836.getClass(), "lengthMtma", 0);
        setIntField(term8836, term8836.getClass(), "lengthLtma", 0);
        setField(term8836, term8836.getClass(), "source", null);
        setIntField(term8836, term8836.getClass(), "offsetStma", 0);
        setIntField(term8836, term8836.getClass(), "offsetMtma", 0);
        setIntField(term8836, term8836.getClass(), "offsetLtma", 0);
        setField(term8836, term8836.getClass(), "ps", null);
        setDoubleField(term8836, term8836.getClass(), "targetRange", 0.0);
        term8844 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8844;
        callMethod(klass, "offsetLongTermMA", argTypes, term8836, args);
    }

};


