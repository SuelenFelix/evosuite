package programmerzamannow.spring.core.data.cyclic;

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
import static programmerzamannow.spring.core.data.cyclic.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CyclicA_setCyclicB_18318452371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102;
     Object term107;

    public CyclicA_setCyclicB_18318452371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term103 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term104 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term105 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term106 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        setField(term106, term106.getClass(), "cyclicC", null);
        setField(term105, term105.getClass(), "cyclicB", term106);
        setField(term104, term104.getClass(), "cyclicA", term105);
        setField(term103, term103.getClass(), "cyclicC", term104);
        setField(term102, term102.getClass(), "cyclicB", term103);
        term107 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term108 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term109 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term110 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term111 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        setField(term111, term111.getClass(), "cyclicA", null);
        setField(term110, term110.getClass(), "cyclicC", term111);
        setField(term109, term109.getClass(), "cyclicB", term110);
        setField(term108, term108.getClass(), "cyclicA", term109);
        setField(term107, term107.getClass(), "cyclicC", term108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB");
        Object[] args = new Object[1];
        args[0] = term107;
        callMethod(klass, "setCyclicB", argTypes, term102, args);
    }

};


