package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Linker_progressDef_16353739625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2265;
     Object term2323;

    public Linker_progressDef_16353739625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2266 = new HashMap();
        Class<? extends Object> term2487 = Class.forName((String) "java.io.File$PathStatus");
        Field term2486 = ((Class) term2487).getDeclaredField((String) "CHECKED");
        ((Field) term2486).setAccessible(true);
        Object enum8 = ((Field) term2486).get((Object) null);
        HashMap term2309 = new HashMap();
        Set<Object> term2639 =  ((Map) term2309).keySet();
        HashSet term2308 = new HashSet((Collection<? extends Object>) term2639);
        HashMap term2318 = new HashMap();
        Set<Object> term2640 =  ((Map) term2318).keySet();
        HashSet term2317 = new HashSet((Collection<? extends Object>) term2640);
        term2265 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term2271 = newInstance(Class.forName("java.io.File"));
        setField(term2265, term2265.getClass(), "fileStyles", term2266);
        setField(term2271, term2271.getClass(), "path", "OclPbYPkcH");
        setField(term2271, term2271.getClass(), "status", enum8);
        setIntField(term2271, term2271.getClass(), "prefixLength", 865208305);
        setField(term2271, term2271.getClass(), "filePath", null);
        setField(term2265, term2265.getClass(), "outDir", term2271);
        setField(term2265, term2265.getClass(), "rootPath", "IoAlmYsBwc");
        setField(term2265, term2265.getClass(), "seenDef", term2308);
        setField(term2265, term2265.getClass(), "seenRef", term2317);
        Class<? extends Object> term2662 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term2661 = ((Class) term2662).getDeclaredField((String) "FUNCTION");
        ((Field) term2661).setAccessible(true);
        Object enum9 = ((Field) term2661).get((Object) null);
        HashMap term2357 = new HashMap();
        Set<Object> term2907 =  ((Map) term2357).keySet();
        HashSet term2356 = new HashSet((Collection<? extends Object>) term2907);
        Object term2326 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term2326, term2326.getClass(), "isBuiltin", false);
        setBooleanField(term2326, term2326.getClass(), "isSynthetic", true);
        setField(term2326, term2326.getClass(), "name", "TEParAifyi");
        setField(term2326, term2326.getClass(), "node", null);
        setField(term2326, term2326.getClass(), "qname", "OWDIEULEFu");
        setField(term2326, term2326.getClass(), "type", null);
        setField(term2326, term2326.getClass(), "kind", enum9);
        setField(term2326, term2326.getClass(), "refs", term2356);
        setIntField(term2326, term2326.getClass(), "start", -1275173084);
        setIntField(term2326, term2326.getClass(), "end", -244121226);
        setIntField(term2326, term2326.getClass(), "bodyStart", -203030934);
        setIntField(term2326, term2326.getClass(), "bodyEnd", -1179120542);
        setField(term2326, term2326.getClass(), "fileOrUrl", "dWRymuLBtr");
        Class<? extends Object> term2919 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term2918 = ((Class) term2919).getDeclaredField((String) "MODULE");
        ((Field) term2918).setAccessible(true);
        Object enum10 = ((Field) term2918).get((Object) null);
        HashSet term2386 = new HashSet();
        Object term2379 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term2379, term2379.getClass(), "isBuiltin", false);
        setBooleanField(term2379, term2379.getClass(), "isSynthetic", true);
        setField(term2379, term2379.getClass(), "name", "");
        setField(term2379, term2379.getClass(), "node", null);
        setField(term2379, term2379.getClass(), "qname", "");
        setField(term2379, term2379.getClass(), "type", null);
        setField(term2379, term2379.getClass(), "kind", enum10);
        setField(term2379, term2379.getClass(), "refs", term2386);
        setIntField(term2379, term2379.getClass(), "start", -73683645);
        setIntField(term2379, term2379.getClass(), "end", -226514366);
        setIntField(term2379, term2379.getClass(), "bodyStart", 1193880199);
        setIntField(term2379, term2379.getClass(), "bodyEnd", -1087774327);
        setField(term2379, term2379.getClass(), "fileOrUrl", "");
        Object term2393 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term2393, term2393.getClass(), "isBuiltin", false);
        setBooleanField(term2393, term2393.getClass(), "isSynthetic", false);
        setField(term2393, term2393.getClass(), "name", null);
        setField(term2393, term2393.getClass(), "node", null);
        setField(term2393, term2393.getClass(), "qname", null);
        setField(term2393, term2393.getClass(), "type", null);
        setField(term2393, term2393.getClass(), "kind", null);
        setField(term2393, term2393.getClass(), "refs", null);
        setIntField(term2393, term2393.getClass(), "start", -1530420153);
        setIntField(term2393, term2393.getClass(), "end", -469968304);
        setIntField(term2393, term2393.getClass(), "bodyStart", -1145578966);
        setIntField(term2393, term2393.getClass(), "bodyEnd", 679763016);
        setField(term2393, term2393.getClass(), "fileOrUrl", null);
        term2323 = new LinkedList();
        ((LinkedList) term2323).add(term2326);
        ((LinkedList) term2323).add(term2379);
        ((LinkedList) term2323).add(term2393);
        ((LinkedList) term2323).add((Object)null);
        ((LinkedList) term2323).add((Object)null);
        ((LinkedList) term2323).add((Object)null);
        ((LinkedList) term2323).add((Object)null);
        ((LinkedList) term2323).add((Object)null);
        ((LinkedList) term2323).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2323;
        callMethod(klass, "progressDef", argTypes, term2265, args);
    }

};


