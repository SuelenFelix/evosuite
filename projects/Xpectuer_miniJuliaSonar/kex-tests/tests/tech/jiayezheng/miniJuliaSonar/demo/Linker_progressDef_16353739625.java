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
     Object term2263;
     Object term2321;

    public Linker_progressDef_16353739625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2264 = new HashMap();
        Class<? extends Object> term2485 = Class.forName((String) "java.io.File$PathStatus");
        Field term2484 = ((Class) term2485).getDeclaredField((String) "CHECKED");
        ((Field) term2484).setAccessible(true);
        Object enum8 = ((Field) term2484).get((Object) null);
        HashMap term2307 = new HashMap();
        Set<Object> term2637 =  ((Map) term2307).keySet();
        HashSet term2306 = new HashSet((Collection<? extends Object>) term2637);
        HashMap term2316 = new HashMap();
        Set<Object> term2638 =  ((Map) term2316).keySet();
        HashSet term2315 = new HashSet((Collection<? extends Object>) term2638);
        term2263 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term2269 = newInstance(Class.forName("java.io.File"));
        setField(term2263, term2263.getClass(), "fileStyles", term2264);
        setField(term2269, term2269.getClass(), "path", "OclPbYPkcH");
        setField(term2269, term2269.getClass(), "status", enum8);
        setIntField(term2269, term2269.getClass(), "prefixLength", 865208305);
        setField(term2269, term2269.getClass(), "filePath", null);
        setField(term2263, term2263.getClass(), "outDir", term2269);
        setField(term2263, term2263.getClass(), "rootPath", "IoAlmYsBwc");
        setField(term2263, term2263.getClass(), "seenDef", term2306);
        setField(term2263, term2263.getClass(), "seenRef", term2315);
        Class<? extends Object> term2660 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term2659 = ((Class) term2660).getDeclaredField((String) "FUNCTION");
        ((Field) term2659).setAccessible(true);
        Object enum9 = ((Field) term2659).get((Object) null);
        HashMap term2355 = new HashMap();
        Set<Object> term2905 =  ((Map) term2355).keySet();
        HashSet term2354 = new HashSet((Collection<? extends Object>) term2905);
        Object term2324 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term2324, term2324.getClass(), "isBuiltin", false);
        setBooleanField(term2324, term2324.getClass(), "isSynthetic", true);
        setField(term2324, term2324.getClass(), "name", "TEParAifyi");
        setField(term2324, term2324.getClass(), "node", null);
        setField(term2324, term2324.getClass(), "qname", "OWDIEULEFu");
        setField(term2324, term2324.getClass(), "type", null);
        setField(term2324, term2324.getClass(), "kind", enum9);
        setField(term2324, term2324.getClass(), "refs", term2354);
        setIntField(term2324, term2324.getClass(), "start", -1275173084);
        setIntField(term2324, term2324.getClass(), "end", -244121226);
        setIntField(term2324, term2324.getClass(), "bodyStart", -203030934);
        setIntField(term2324, term2324.getClass(), "bodyEnd", -1179120542);
        setField(term2324, term2324.getClass(), "fileOrUrl", "dWRymuLBtr");
        Class<? extends Object> term2917 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term2916 = ((Class) term2917).getDeclaredField((String) "MODULE");
        ((Field) term2916).setAccessible(true);
        Object enum10 = ((Field) term2916).get((Object) null);
        HashSet term2384 = new HashSet();
        Object term2377 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term2377, term2377.getClass(), "isBuiltin", false);
        setBooleanField(term2377, term2377.getClass(), "isSynthetic", true);
        setField(term2377, term2377.getClass(), "name", "");
        setField(term2377, term2377.getClass(), "node", null);
        setField(term2377, term2377.getClass(), "qname", "");
        setField(term2377, term2377.getClass(), "type", null);
        setField(term2377, term2377.getClass(), "kind", enum10);
        setField(term2377, term2377.getClass(), "refs", term2384);
        setIntField(term2377, term2377.getClass(), "start", -73683645);
        setIntField(term2377, term2377.getClass(), "end", -226514366);
        setIntField(term2377, term2377.getClass(), "bodyStart", 1193880199);
        setIntField(term2377, term2377.getClass(), "bodyEnd", -1087774327);
        setField(term2377, term2377.getClass(), "fileOrUrl", "");
        Object term2391 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term2391, term2391.getClass(), "isBuiltin", false);
        setBooleanField(term2391, term2391.getClass(), "isSynthetic", false);
        setField(term2391, term2391.getClass(), "name", null);
        setField(term2391, term2391.getClass(), "node", null);
        setField(term2391, term2391.getClass(), "qname", null);
        setField(term2391, term2391.getClass(), "type", null);
        setField(term2391, term2391.getClass(), "kind", null);
        setField(term2391, term2391.getClass(), "refs", null);
        setIntField(term2391, term2391.getClass(), "start", -1530420153);
        setIntField(term2391, term2391.getClass(), "end", -469968304);
        setIntField(term2391, term2391.getClass(), "bodyStart", -1145578966);
        setIntField(term2391, term2391.getClass(), "bodyEnd", 679763016);
        setField(term2391, term2391.getClass(), "fileOrUrl", null);
        term2321 = new LinkedList();
        ((LinkedList) term2321).add(term2324);
        ((LinkedList) term2321).add(term2377);
        ((LinkedList) term2321).add(term2391);
        ((LinkedList) term2321).add((Object)null);
        ((LinkedList) term2321).add((Object)null);
        ((LinkedList) term2321).add((Object)null);
        ((LinkedList) term2321).add((Object)null);
        ((LinkedList) term2321).add((Object)null);
        ((LinkedList) term2321).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2321;
        callMethod(klass, "progressDef", argTypes, term2263, args);
    }

};


