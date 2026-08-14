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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_source_121837821711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11506;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_source_121837821711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11506 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11506, term11506.getClass(), "ts", null);
        setIntField(term11506, term11506.getClass(), "lengthStma", 0);
        setIntField(term11506, term11506.getClass(), "lengthLtma", 0);
        setField(term11506, term11506.getClass(), "source", null);
        setIntField(term11506, term11506.getClass(), "offsetStma", 0);
        setIntField(term11506, term11506.getClass(), "offsetLtma", 0);
        setField(term11506, term11506.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "source", argTypes, term11506, args);
    }

};


