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

public class DualExpMovingAverageCrossoverStrategy_Builder_source_68563071111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11780;

    public DualExpMovingAverageCrossoverStrategy_Builder_source_68563071111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11780 = newInstance(Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder"));
        setField(term11780, term11780.getClass(), "ts", null);
        setIntField(term11780, term11780.getClass(), "lengthStma", 0);
        setIntField(term11780, term11780.getClass(), "lengthLtma", 0);
        setField(term11780, term11780.getClass(), "source", null);
        setDoubleField(term11780, term11780.getClass(), "smoothingStma", 0.0);
        setDoubleField(term11780, term11780.getClass(), "smoothingLtma", 0.0);
        setField(term11780, term11780.getClass(), "ps", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualExpMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "source", argTypes, term11780, args);
    }

};


