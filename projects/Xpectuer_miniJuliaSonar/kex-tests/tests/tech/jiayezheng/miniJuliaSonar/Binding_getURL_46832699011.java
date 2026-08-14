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

public class Binding_getURL_46832699011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23585;

    public Binding_getURL_46832699011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23667 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term23666 = ((Class) term23667).getDeclaredField((String) "SCOPE");
        ((Field) term23666).setAccessible(true);
        Object enum70 = ((Field) term23666).get((Object) null);
        HashMap term23622 = new HashMap();
        Set<Object> term23903 =  ((Map) term23622).keySet();
        HashSet term23621 = new HashSet((Collection<? extends Object>) term23903);
        term23585 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term23585, term23585.getClass(), "isBuiltin", false);
        setBooleanField(term23585, term23585.getClass(), "isSynthetic", true);
        setField(term23585, term23585.getClass(), "name", "dfzWTjcjnI");
        setField(term23585, term23585.getClass(), "node", null);
        setField(term23585, term23585.getClass(), "qname", "bsnZXGEvFv");
        setField(term23585, term23585.getClass(), "type", null);
        setField(term23585, term23585.getClass(), "kind", enum70);
        setField(term23585, term23585.getClass(), "refs", term23621);
        setIntField(term23585, term23585.getClass(), "start", 991356662);
        setIntField(term23585, term23585.getClass(), "end", -506958186);
        setIntField(term23585, term23585.getClass(), "bodyStart", -507387516);
        setIntField(term23585, term23585.getClass(), "bodyEnd", -1970452551);
        setField(term23585, term23585.getClass(), "fileOrUrl", "osFrHWYeRy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getURL", argTypes, term23585, args);
    }

};


