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
     Object term69762;

    public __correlateBindings_143167910851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term69934 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term69933 = ((Class) term69934).getDeclaredField((String) "MODULE");
        ((Field) term69933).setAccessible(true);
        Object enum215 = ((Field) term69933).get((Object) null);
        HashMap term69796 = new HashMap();
        Set<Object> term70173 =  ((Map) term69796).keySet();
        HashSet term69795 = new HashSet((Collection<? extends Object>) term70173);
        Object term69765 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term69765, term69765.getClass(), "isBuiltin", false);
        setBooleanField(term69765, term69765.getClass(), "isSynthetic", false);
        setField(term69765, term69765.getClass(), "name", "vbRAJCwftU");
        setField(term69765, term69765.getClass(), "node", null);
        setField(term69765, term69765.getClass(), "qname", "baJbjUImxp");
        setField(term69765, term69765.getClass(), "type", null);
        setField(term69765, term69765.getClass(), "kind", enum215);
        setField(term69765, term69765.getClass(), "refs", term69795);
        setIntField(term69765, term69765.getClass(), "start", 1922684808);
        setIntField(term69765, term69765.getClass(), "end", -2005784375);
        setIntField(term69765, term69765.getClass(), "bodyStart", -288604325);
        setIntField(term69765, term69765.getClass(), "bodyEnd", -1268314569);
        setField(term69765, term69765.getClass(), "fileOrUrl", "lPERFqPpGz");
        HashSet term69823 = new HashSet();
        Object term69818 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term69818, term69818.getClass(), "isBuiltin", false);
        setBooleanField(term69818, term69818.getClass(), "isSynthetic", false);
        setField(term69818, term69818.getClass(), "name", "");
        setField(term69818, term69818.getClass(), "node", null);
        setField(term69818, term69818.getClass(), "qname", "");
        setField(term69818, term69818.getClass(), "type", null);
        setField(term69818, term69818.getClass(), "kind", enum215);
        setField(term69818, term69818.getClass(), "refs", term69823);
        setIntField(term69818, term69818.getClass(), "start", 877649659);
        setIntField(term69818, term69818.getClass(), "end", -1332748804);
        setIntField(term69818, term69818.getClass(), "bodyStart", 1774507971);
        setIntField(term69818, term69818.getClass(), "bodyEnd", -1420269858);
        setField(term69818, term69818.getClass(), "fileOrUrl", "");
        Object term69830 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term69830, term69830.getClass(), "isBuiltin", false);
        setBooleanField(term69830, term69830.getClass(), "isSynthetic", true);
        setField(term69830, term69830.getClass(), "name", null);
        setField(term69830, term69830.getClass(), "node", null);
        setField(term69830, term69830.getClass(), "qname", null);
        setField(term69830, term69830.getClass(), "type", null);
        setField(term69830, term69830.getClass(), "kind", null);
        setField(term69830, term69830.getClass(), "refs", null);
        setIntField(term69830, term69830.getClass(), "start", -2119545015);
        setIntField(term69830, term69830.getClass(), "end", 1272542218);
        setIntField(term69830, term69830.getClass(), "bodyStart", 1209799204);
        setIntField(term69830, term69830.getClass(), "bodyEnd", 1094107751);
        setField(term69830, term69830.getClass(), "fileOrUrl", null);
        term69762 = new LinkedList();
        ((LinkedList) term69762).add(term69765);
        ((LinkedList) term69762).add(term69818);
        ((LinkedList) term69762).add(term69830);
        ((LinkedList) term69762).add((Object)null);
        ((LinkedList) term69762).add((Object)null);
        ((LinkedList) term69762).add((Object)null);
        ((LinkedList) term69762).add((Object)null);
        ((LinkedList) term69762).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.$");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term69762;
        callMethod(klass, "correlateBindings", argTypes, null, args);
    }

};


