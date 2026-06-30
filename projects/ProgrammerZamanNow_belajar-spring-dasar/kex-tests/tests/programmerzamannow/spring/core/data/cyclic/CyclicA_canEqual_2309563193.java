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

public class CyclicA_canEqual_2309563193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118;
     Object term123;

    public CyclicA_canEqual_2309563193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term119 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term120 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term121 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term122 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        setField(term122, term122.getClass(), "cyclicC", null);
        setField(term121, term121.getClass(), "cyclicB", term122);
        setField(term120, term120.getClass(), "cyclicA", term121);
        setField(term119, term119.getClass(), "cyclicC", term120);
        setField(term118, term118.getClass(), "cyclicB", term119);
        term123 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term123;
        callMethod(klass, "canEqual", argTypes, term118, args);
    }

};


