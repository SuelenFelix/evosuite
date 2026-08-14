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

public class DualSimpleMovingAverageCrossoverStrategy_Builder_offsetShortTermMA_72886968612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11511;
     Object term11516;

    public DualSimpleMovingAverageCrossoverStrategy_Builder_offsetShortTermMA_72886968612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11511 = newInstance(Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder"));
        setField(term11511, term11511.getClass(), "ts", null);
        setIntField(term11511, term11511.getClass(), "lengthStma", 0);
        setIntField(term11511, term11511.getClass(), "lengthLtma", 0);
        setField(term11511, term11511.getClass(), "source", null);
        setIntField(term11511, term11511.getClass(), "offsetStma", 0);
        setIntField(term11511, term11511.getClass(), "offsetLtma", 0);
        setField(term11511, term11511.getClass(), "ps", null);
        term11516 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("strategies.DualSimpleMovingAverageCrossoverStrategy$Builder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term11516;
        callMethod(klass, "offsetShortTermMA", argTypes, term11511, args);
    }

};


