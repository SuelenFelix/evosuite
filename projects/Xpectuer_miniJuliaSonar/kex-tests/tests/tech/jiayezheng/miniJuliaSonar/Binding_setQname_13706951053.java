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

public class Binding_setQname_13706951053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20868;

    public Binding_setQname_13706951053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20963 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term20962 = ((Class) term20963).getDeclaredField((String) "METHOD");
        ((Field) term20962).setAccessible(true);
        Object enum62 = ((Field) term20962).get((Object) null);
        HashMap term20906 = new HashMap();
        Set<Object> term21202 =  ((Map) term20906).keySet();
        HashSet term20905 = new HashSet((Collection<? extends Object>) term21202);
        term20868 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term20868, term20868.getClass(), "isBuiltin", false);
        setBooleanField(term20868, term20868.getClass(), "isSynthetic", false);
        setField(term20868, term20868.getClass(), "name", "HegRNsidFg");
        setField(term20868, term20868.getClass(), "node", null);
        setField(term20868, term20868.getClass(), "qname", "udRdJkgXmH");
        setField(term20868, term20868.getClass(), "type", null);
        setField(term20868, term20868.getClass(), "kind", enum62);
        setField(term20868, term20868.getClass(), "refs", term20905);
        setIntField(term20868, term20868.getClass(), "start", 98922530);
        setIntField(term20868, term20868.getClass(), "end", -1388471422);
        setIntField(term20868, term20868.getClass(), "bodyStart", -1498296052);
        setIntField(term20868, term20868.getClass(), "bodyEnd", 2098647989);
        setField(term20868, term20868.getClass(), "fileOrUrl", "FBCXbjHVXO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dIWAnvmLiC";
        callMethod(klass, "setQname", argTypes, term20868, args);
    }

};


