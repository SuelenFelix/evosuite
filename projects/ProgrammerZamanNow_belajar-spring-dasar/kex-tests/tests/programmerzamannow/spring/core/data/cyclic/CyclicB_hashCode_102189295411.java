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

public class CyclicB_hashCode_102189295411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95;

    public CyclicB_hashCode_102189295411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        setField(term95, term95.getClass(), "cyclicC", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term95, args);
    }

};


