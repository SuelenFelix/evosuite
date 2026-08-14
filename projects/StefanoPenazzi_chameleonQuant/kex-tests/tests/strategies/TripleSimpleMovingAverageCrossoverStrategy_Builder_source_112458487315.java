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

public class TripleSimpleMovingAverageCrossoverStrategy_Builder_source_112458487315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8808;

    public TripleSimpleMovingAverageCrossoverStrategy_Builder_source_112458487315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8808 = newInstance(Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term8808, term8808.getClass(), "ts", null);
        setIntField(term8808, term8808.getClass(), "lengthStma", 0);
        setIntField(term8808, term8808.getClass(), "lengthMtma", 0);
        setIntField(term8808, term8808.getClass(), "lengthLtma", 0);
        setField(term8808, term8808.getClass(), "source", null);
        setIntField(term8808, term8808.getClass(), "offsetStma", 0);
        setIntField(term8808, term8808.getClass(), "offsetMtma", 0);
        setIntField(term8808, term8808.getClass(), "offsetLtma", 0);
        setField(term8808, term8808.getClass(), "ps", null);
        setDoubleField(term8808, term8808.getClass(), "targetRange", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.TripleSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "source", argTypes, term8808, args);
    }

};


