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

public class CyclicConfiguration_cyclicB_11017953126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term672;

    public CyclicConfiguration_cyclicB_11017953126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term672 = newInstance(Class.forName("programmerzamannow.spring.core.CyclicConfiguration"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.CyclicConfiguration");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "cyclicB", argTypes, term672, args);
    }

};


