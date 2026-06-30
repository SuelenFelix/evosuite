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

public class CyclicB_setCyclicC_18318462601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54;
     Object term59;

    public CyclicB_setCyclicC_18318462601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term55 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term56 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term57 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term58 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        setField(term58, term58.getClass(), "cyclicA", null);
        setField(term57, term57.getClass(), "cyclicC", term58);
        setField(term56, term56.getClass(), "cyclicB", term57);
        setField(term55, term55.getClass(), "cyclicA", term56);
        setField(term54, term54.getClass(), "cyclicC", term55);
        term59 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term60 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        Object term61 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB"));
        Object term62 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC"));
        Object term63 = newInstance(Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicA"));
        setField(term63, term63.getClass(), "cyclicB", null);
        setField(term62, term62.getClass(), "cyclicA", term63);
        setField(term61, term61.getClass(), "cyclicC", term62);
        setField(term60, term60.getClass(), "cyclicB", term61);
        setField(term59, term59.getClass(), "cyclicA", term60);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicB");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("programmerzamannow.spring.core.data.cyclic.CyclicC");
        Object[] args = new Object[1];
        args[0] = term59;
        callMethod(klass, "setCyclicC", argTypes, term54, args);
    }

};


