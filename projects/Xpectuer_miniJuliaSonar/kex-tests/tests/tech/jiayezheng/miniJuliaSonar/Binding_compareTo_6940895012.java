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

public class Binding_compareTo_6940895012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20528;
     Object term20593;

    public Binding_compareTo_6940895012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20615 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term20614 = ((Class) term20615).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term20614).setAccessible(true);
        Object enum61 = ((Field) term20614).get((Object) null);
        HashMap term20569 = new HashMap();
        Set<Object> term20863 =  ((Map) term20569).keySet();
        HashSet term20568 = new HashSet((Collection<? extends Object>) term20863);
        term20528 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term20528, term20528.getClass(), "isBuiltin", true);
        setBooleanField(term20528, term20528.getClass(), "isSynthetic", true);
        setField(term20528, term20528.getClass(), "name", "uuSYOUCVHU");
        setField(term20528, term20528.getClass(), "node", null);
        setField(term20528, term20528.getClass(), "qname", "DfWwbodtVw");
        setField(term20528, term20528.getClass(), "type", null);
        setField(term20528, term20528.getClass(), "kind", enum61);
        setField(term20528, term20528.getClass(), "refs", term20568);
        setIntField(term20528, term20528.getClass(), "start", 202001407);
        setIntField(term20528, term20528.getClass(), "end", 158873461);
        setIntField(term20528, term20528.getClass(), "bodyStart", -430151637);
        setIntField(term20528, term20528.getClass(), "bodyEnd", -1697741339);
        setField(term20528, term20528.getClass(), "fileOrUrl", "kTbFMpVWqx");
        term20593 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term20593;
        callMethod(klass, "compareTo", argTypes, term20528, args);
    }

};


