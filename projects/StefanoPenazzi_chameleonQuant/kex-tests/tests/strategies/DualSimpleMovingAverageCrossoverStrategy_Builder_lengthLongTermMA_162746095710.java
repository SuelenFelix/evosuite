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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_162746095710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11499;
     Object term11504;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_162746095710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11499 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11499, term11499.getClass(), "ts", null);
        setIntField(term11499, term11499.getClass(), "lengthStma", 0);
        setIntField(term11499, term11499.getClass(), "lengthLtma", 0);
        setField(term11499, term11499.getClass(), "source", null);
        setIntField(term11499, term11499.getClass(), "offsetStma", 0);
        setIntField(term11499, term11499.getClass(), "offsetLtma", 0);
        setField(term11499, term11499.getClass(), "ps", null);
        term11504 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11504;
        callMethod(klass, "lengthLongTermMA", argTypes, term11499, args);
    }

};


