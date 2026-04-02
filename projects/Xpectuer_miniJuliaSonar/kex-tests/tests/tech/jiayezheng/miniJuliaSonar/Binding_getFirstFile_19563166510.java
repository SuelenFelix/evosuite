package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Binding_getFirstFile_19563166510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23246;

    public Binding_getFirstFile_19563166510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23329 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term23328 = ((Class) term23329).getDeclaredField((String) "METHOD");
        ((Field) term23328).setAccessible(true);
        Object enum69 = ((Field) term23328).get((Object) null);
        HashMap term23284 = new HashMap();
        Set<Object> term23568 =  ((Map) term23284).keySet();
        HashSet term23283 = new HashSet((Collection<? extends Object>) term23568);
        term23246 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term23246, term23246.getClass(), "isBuiltin", false);
        setBooleanField(term23246, term23246.getClass(), "isSynthetic", false);
        setField(term23246, term23246.getClass(), "name", "fOuOhBpldm");
        setField(term23246, term23246.getClass(), "node", null);
        setField(term23246, term23246.getClass(), "qname", "qQQRKGPyIM");
        setField(term23246, term23246.getClass(), "type", null);
        setField(term23246, term23246.getClass(), "kind", enum69);
        setField(term23246, term23246.getClass(), "refs", term23283);
        setIntField(term23246, term23246.getClass(), "start", -1239406390);
        setIntField(term23246, term23246.getClass(), "end", 1557431527);
        setIntField(term23246, term23246.getClass(), "bodyStart", -1504890659);
        setIntField(term23246, term23246.getClass(), "bodyEnd", 1358829571);
        setField(term23246, term23246.getClass(), "fileOrUrl", "lzcwhvjdFg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstFile", argTypes, term23246, args);
    }

};


