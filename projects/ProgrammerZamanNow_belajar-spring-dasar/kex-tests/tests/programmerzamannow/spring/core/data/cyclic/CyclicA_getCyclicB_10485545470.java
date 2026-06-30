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

public class CyclicA_getCyclicB_10485545470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;

    public CyclicA_getCyclicB_10485545470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term98 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term99 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term100 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term101 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        setField(term101, term101.getClass(), "cyclicC", null);
        setField(term100, term100.getClass(), "cyclicB", term101);
        setField(term99, term99.getClass(), "cyclicA", term100);
        setField(term98, term98.getClass(), "cyclicC", term99);
        setField(term97, term97.getClass(), "cyclicB", term98);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCyclicB", argTypes, term97, args);
    }

};


