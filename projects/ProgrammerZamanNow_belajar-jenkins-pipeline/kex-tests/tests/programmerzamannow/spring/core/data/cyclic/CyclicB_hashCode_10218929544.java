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

public class CyclicB_hashCode_10218929544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76;

    public CyclicB_hashCode_10218929544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term77 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term78 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term79 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term80 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        setField(term80, term80.getClass(), "cyclicA", null);
        setField(term79, term79.getClass(), "cyclicC", term80);
        setField(term78, term78.getClass(), "cyclicB", term79);
        setField(term77, term77.getClass(), "cyclicA", term78);
        setField(term76, term76.getClass(), "cyclicC", term77);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term76, args);
    }

};


