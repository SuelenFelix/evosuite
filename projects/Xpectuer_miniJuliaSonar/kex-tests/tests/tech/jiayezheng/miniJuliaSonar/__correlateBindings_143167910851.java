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
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class __correlateBindings_143167910851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69756;

    public __correlateBindings_143167910851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69928 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term69927 = ((Class) term69928).getDeclaredField((String) "MODULE");
        ((Field) term69927).setAccessible(true);
        Object enum215 = ((Field) term69927).get((Object) null);
        HashMap term69790 = new HashMap();
        Set<Object> term70167 =  ((Map) term69790).keySet();
        HashSet term69789 = new HashSet((Collection<? extends Object>) term70167);
        Object term69759 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term69759, term69759.getClass(), "isBuiltin", false);
        setBooleanField(term69759, term69759.getClass(), "isSynthetic", false);
        setField(term69759, term69759.getClass(), "name", "vbRAJCwftU");
        setField(term69759, term69759.getClass(), "node", null);
        setField(term69759, term69759.getClass(), "qname", "baJbjUImxp");
        setField(term69759, term69759.getClass(), "type", null);
        setField(term69759, term69759.getClass(), "kind", enum215);
        setField(term69759, term69759.getClass(), "refs", term69789);
        setIntField(term69759, term69759.getClass(), "start", 1922684808);
        setIntField(term69759, term69759.getClass(), "end", -2005784375);
        setIntField(term69759, term69759.getClass(), "bodyStart", -288604325);
        setIntField(term69759, term69759.getClass(), "bodyEnd", -1268314569);
        setField(term69759, term69759.getClass(), "fileOrUrl", "lPERFqPpGz");
        HashSet term69817 = new HashSet();
        Object term69812 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term69812, term69812.getClass(), "isBuiltin", false);
        setBooleanField(term69812, term69812.getClass(), "isSynthetic", false);
        setField(term69812, term69812.getClass(), "name", "");
        setField(term69812, term69812.getClass(), "node", null);
        setField(term69812, term69812.getClass(), "qname", "");
        setField(term69812, term69812.getClass(), "type", null);
        setField(term69812, term69812.getClass(), "kind", enum215);
        setField(term69812, term69812.getClass(), "refs", term69817);
        setIntField(term69812, term69812.getClass(), "start", 877649659);
        setIntField(term69812, term69812.getClass(), "end", -1332748804);
        setIntField(term69812, term69812.getClass(), "bodyStart", 1774507971);
        setIntField(term69812, term69812.getClass(), "bodyEnd", -1420269858);
        setField(term69812, term69812.getClass(), "fileOrUrl", "");
        Object term69824 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term69824, term69824.getClass(), "isBuiltin", false);
        setBooleanField(term69824, term69824.getClass(), "isSynthetic", true);
        setField(term69824, term69824.getClass(), "name", null);
        setField(term69824, term69824.getClass(), "node", null);
        setField(term69824, term69824.getClass(), "qname", null);
        setField(term69824, term69824.getClass(), "type", null);
        setField(term69824, term69824.getClass(), "kind", null);
        setField(term69824, term69824.getClass(), "refs", null);
        setIntField(term69824, term69824.getClass(), "start", -2119545015);
        setIntField(term69824, term69824.getClass(), "end", 1272542218);
        setIntField(term69824, term69824.getClass(), "bodyStart", 1209799204);
        setIntField(term69824, term69824.getClass(), "bodyEnd", 1094107751);
        setField(term69824, term69824.getClass(), "fileOrUrl", null);
        term69756 = new LinkedList();
        ((LinkedList) term69756).add(term69759);
        ((LinkedList) term69756).add(term69812);
        ((LinkedList) term69756).add(term69824);
        ((LinkedList) term69756).add((Object)null);
        ((LinkedList) term69756).add((Object)null);
        ((LinkedList) term69756).add((Object)null);
        ((LinkedList) term69756).add((Object)null);
        ((LinkedList) term69756).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term69756;
        callMethod(klass, "correlateBindings", argTypes, null, args);
    }

};


