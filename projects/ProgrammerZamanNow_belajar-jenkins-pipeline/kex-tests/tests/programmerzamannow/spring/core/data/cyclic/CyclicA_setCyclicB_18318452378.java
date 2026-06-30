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

public class CyclicA_setCyclicB_18318452378 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140;

    public CyclicA_setCyclicB_18318452378() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        setField(term140, term140.getClass(), "cyclicB", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCyclicB", argTypes, term140, args);
    }

};


