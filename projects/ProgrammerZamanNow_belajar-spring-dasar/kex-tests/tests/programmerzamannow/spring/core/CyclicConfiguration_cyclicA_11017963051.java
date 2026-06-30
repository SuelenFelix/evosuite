package programmerzamannow.spring.core;

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
import static programmerzamannow.spring.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CyclicConfiguration_cyclicA_11017963051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653;
     Object term654;

    public CyclicConfiguration_cyclicA_11017963051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653 = newInstance(Class.forName("programmerzamannow.spring.core.CyclicConfiguration"));
        term654 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term655 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term656 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term657 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term658 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        setField(term658, term658.getClass(), "cyclicA", null);
        setField(term657, term657.getClass(), "cyclicC", term658);
        setField(term656, term656.getClass(), "cyclicB", term657);
        setField(term655, term655.getClass(), "cyclicA", term656);
        setField(term654, term654.getClass(), "cyclicC", term655);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.CyclicConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB");
        Object[] args = new Object[1];
        args[0] = term654;
        callMethod(klass, "cyclicA", argTypes, term653, args);
    }

};


