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
     Object term23252;

    public Binding_getFirstFile_19563166510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23335 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term23334 = ((Class) term23335).getDeclaredField((String) "METHOD");
        ((Field) term23334).setAccessible(true);
        Object enum69 = ((Field) term23334).get((Object) null);
        HashMap term23290 = new HashMap();
        Set<Object> term23574 =  ((Map) term23290).keySet();
        HashSet term23289 = new HashSet((Collection<? extends Object>) term23574);
        term23252 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term23252, term23252.getClass(), "isBuiltin", false);
        setBooleanField(term23252, term23252.getClass(), "isSynthetic", false);
        setField(term23252, term23252.getClass(), "name", "fOuOhBpldm");
        setField(term23252, term23252.getClass(), "node", null);
        setField(term23252, term23252.getClass(), "qname", "qQQRKGPyIM");
        setField(term23252, term23252.getClass(), "type", null);
        setField(term23252, term23252.getClass(), "kind", enum69);
        setField(term23252, term23252.getClass(), "refs", term23289);
        setIntField(term23252, term23252.getClass(), "start", -1239406390);
        setIntField(term23252, term23252.getClass(), "end", 1557431527);
        setIntField(term23252, term23252.getClass(), "bodyStart", -1504890659);
        setIntField(term23252, term23252.getClass(), "bodyEnd", 1358829571);
        setField(term23252, term23252.getClass(), "fileOrUrl", "lzcwhvjdFg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstFile", argTypes, term23252, args);
    }

};


