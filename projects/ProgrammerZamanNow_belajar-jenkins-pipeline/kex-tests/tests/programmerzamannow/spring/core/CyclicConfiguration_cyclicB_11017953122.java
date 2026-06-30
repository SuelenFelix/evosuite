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

public class CyclicConfiguration_cyclicB_11017953122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659;
     Object term660;

    public CyclicConfiguration_cyclicB_11017953122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659 = newInstance(Class.forName("programmerzamannow.spring.core.CyclicConfiguration"));
        term660 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term661 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term662 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term663 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term664 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        setField(term664, term664.getClass(), "cyclicB", null);
        setField(term663, term663.getClass(), "cyclicA", term664);
        setField(term662, term662.getClass(), "cyclicC", term663);
        setField(term661, term661.getClass(), "cyclicB", term662);
        setField(term660, term660.getClass(), "cyclicA", term661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.CyclicConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC");
        Object[] args = new Object[1];
        args[0] = term660;
        callMethod(klass, "cyclicB", argTypes, term659, args);
    }

};


