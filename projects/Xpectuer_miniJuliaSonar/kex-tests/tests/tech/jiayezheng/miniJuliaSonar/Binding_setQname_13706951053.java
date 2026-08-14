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
     Object term20874;

    public Binding_setQname_13706951053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20969 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term20968 = ((Class) term20969).getDeclaredField((String) "METHOD");
        ((Field) term20968).setAccessible(true);
        Object enum62 = ((Field) term20968).get((Object) null);
        HashMap term20912 = new HashMap();
        Set<Object> term21208 =  ((Map) term20912).keySet();
        HashSet term20911 = new HashSet((Collection<? extends Object>) term21208);
        term20874 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term20874, term20874.getClass(), "isBuiltin", false);
        setBooleanField(term20874, term20874.getClass(), "isSynthetic", false);
        setField(term20874, term20874.getClass(), "name", "HegRNsidFg");
        setField(term20874, term20874.getClass(), "node", null);
        setField(term20874, term20874.getClass(), "qname", "udRdJkgXmH");
        setField(term20874, term20874.getClass(), "type", null);
        setField(term20874, term20874.getClass(), "kind", enum62);
        setField(term20874, term20874.getClass(), "refs", term20911);
        setIntField(term20874, term20874.getClass(), "start", 98922530);
        setIntField(term20874, term20874.getClass(), "end", -1388471422);
        setIntField(term20874, term20874.getClass(), "bodyStart", -1498296052);
        setIntField(term20874, term20874.getClass(), "bodyEnd", 2098647989);
        setField(term20874, term20874.getClass(), "fileOrUrl", "FBCXbjHVXO");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dIWAnvmLiC";
        callMethod(klass, "setQname", argTypes, term20874, args);
    }

};


