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

public class CyclicA_equals_5732063102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112;
     Object term117;

    public CyclicA_equals_5732063102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term113 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term114 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term115 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term116 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        setField(term116, term116.getClass(), "cyclicC", null);
        setField(term115, term115.getClass(), "cyclicB", term116);
        setField(term114, term114.getClass(), "cyclicA", term115);
        setField(term113, term113.getClass(), "cyclicC", term114);
        setField(term112, term112.getClass(), "cyclicB", term113);
        term117 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term117;
        callMethod(klass, "equals", argTypes, term112, args);
    }

};


