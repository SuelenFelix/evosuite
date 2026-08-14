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

public class Binding_toString_65978236312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23914;

    public Binding_toString_65978236312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24000 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term23999 = ((Class) term24000).getDeclaredField((String) "PARAMETER");
        ((Field) term23999).setAccessible(true);
        Object enum71 = ((Field) term23999).get((Object) null);
        HashMap term23955 = new HashMap();
        Set<Object> term24248 =  ((Map) term23955).keySet();
        HashSet term23954 = new HashSet((Collection<? extends Object>) term24248);
        term23914 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term23914, term23914.getClass(), "isBuiltin", true);
        setBooleanField(term23914, term23914.getClass(), "isSynthetic", false);
        setField(term23914, term23914.getClass(), "name", "scpIQUfPKw");
        setField(term23914, term23914.getClass(), "node", null);
        setField(term23914, term23914.getClass(), "qname", "QKYBpCjuYt");
        setField(term23914, term23914.getClass(), "type", null);
        setField(term23914, term23914.getClass(), "kind", enum71);
        setField(term23914, term23914.getClass(), "refs", term23954);
        setIntField(term23914, term23914.getClass(), "start", -1896376975);
        setIntField(term23914, term23914.getClass(), "end", 729658803);
        setIntField(term23914, term23914.getClass(), "bodyStart", 114754804);
        setIntField(term23914, term23914.getClass(), "bodyEnd", 1687361082);
        setField(term23914, term23914.getClass(), "fileOrUrl", "vjiRfoGdkl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term23914, args);
    }

};


