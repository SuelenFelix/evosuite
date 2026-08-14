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

public class DualExpMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_27654797110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11773;
     Object term11778;

    public DualExpMovingAverageCrossoverStrategy_Builder_lengthLongTermMA_27654797110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11773 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11773, term11773.getClass(), "ts", null);
        setIntField(term11773, term11773.getClass(), "lengthStma", 0);
        setIntField(term11773, term11773.getClass(), "lengthLtma", 0);
        setField(term11773, term11773.getClass(), "source", null);
        setDoubleField(term11773, term11773.getClass(), "smoothingStma", 0.0);
        setDoubleField(term11773, term11773.getClass(), "smoothingLtma", 0.0);
        setField(term11773, term11773.getClass(), "ps", null);
        term11778 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11778;
        callMethod(klass, "lengthLongTermMA", argTypes, term11773, args);
    }

};


