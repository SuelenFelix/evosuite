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
     Object term23579;

    public Binding_getURL_46832699011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23661 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term23660 = ((Class) term23661).getDeclaredField((String) "SCOPE");
        ((Field) term23660).setAccessible(true);
        Object enum70 = ((Field) term23660).get((Object) null);
        HashMap term23616 = new HashMap();
        Set<Object> term23897 =  ((Map) term23616).keySet();
        HashSet term23615 = new HashSet((Collection<? extends Object>) term23897);
        term23579 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term23579, term23579.getClass(), "isBuiltin", false);
        setBooleanField(term23579, term23579.getClass(), "isSynthetic", true);
        setField(term23579, term23579.getClass(), "name", "dfzWTjcjnI");
        setField(term23579, term23579.getClass(), "node", null);
        setField(term23579, term23579.getClass(), "qname", "bsnZXGEvFv");
        setField(term23579, term23579.getClass(), "type", null);
        setField(term23579, term23579.getClass(), "kind", enum70);
        setField(term23579, term23579.getClass(), "refs", term23615);
        setIntField(term23579, term23579.getClass(), "start", 991356662);
        setIntField(term23579, term23579.getClass(), "end", -506958186);
        setIntField(term23579, term23579.getClass(), "bodyStart", -507387516);
        setIntField(term23579, term23579.getClass(), "bodyEnd", -1970452551);
        setField(term23579, term23579.getClass(), "fileOrUrl", "osFrHWYeRy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getURL", argTypes, term23579, args);
    }

};


