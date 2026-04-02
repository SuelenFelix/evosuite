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
import java.lang.Integer;

public class TestInference_checkExist_1908969664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304131;
     Object term304180;
     Object term304271;
     Object term304273;

    public TestInference_checkExist_1908969664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304131 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference"));
        setField(term304131, term304131.getClass(), "testFile", "NxxpXdrIPo");
        setField(term304131, term304131.getClass(), "expecteRefsFile", "LoXDruySRx");
        setField(term304131, term304131.getClass(), "missingRefsFile", "NArqvBoreJ");
        setField(term304131, term304131.getClass(), "wrongTypeFile", "wNQBwmSlCW");
        Class<? extends Object> term304336 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term304335 = ((Class) term304336).getDeclaredField((String) "METHOD");
        ((Field) term304335).setAccessible(true);
        Object enum996 = ((Field) term304335).get((Object) null);
        HashMap term304214 = new HashMap();
        Set<Object> term304575 =  ((Map) term304214).keySet();
        HashSet term304213 = new HashSet((Collection<? extends Object>) term304575);
        Object term304183 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304183, term304183.getClass(), "isBuiltin", false);
        setBooleanField(term304183, term304183.getClass(), "isSynthetic", true);
        setField(term304183, term304183.getClass(), "name", "htETaiDMgw");
        setField(term304183, term304183.getClass(), "node", null);
        setField(term304183, term304183.getClass(), "qname", "UjqNGJSBEX");
        setField(term304183, term304183.getClass(), "type", null);
        setField(term304183, term304183.getClass(), "kind", enum996);
        setField(term304183, term304183.getClass(), "refs", term304213);
        setIntField(term304183, term304183.getClass(), "start", -1330529019);
        setIntField(term304183, term304183.getClass(), "end", 237134844);
        setIntField(term304183, term304183.getClass(), "bodyStart", 2076413861);
        setIntField(term304183, term304183.getClass(), "bodyEnd", 66817373);
        setField(term304183, term304183.getClass(), "fileOrUrl", "qWPcKUbGGx");
        Class<? extends Object> term304587 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term304586 = ((Class) term304587).getDeclaredField((String) "PARAMETER");
        ((Field) term304586).setAccessible(true);
        Object enum997 = ((Field) term304586).get((Object) null);
        HashSet term304243 = new HashSet();
        Object term304236 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304236, term304236.getClass(), "isBuiltin", false);
        setBooleanField(term304236, term304236.getClass(), "isSynthetic", false);
        setField(term304236, term304236.getClass(), "name", "");
        setField(term304236, term304236.getClass(), "node", null);
        setField(term304236, term304236.getClass(), "qname", "");
        setField(term304236, term304236.getClass(), "type", null);
        setField(term304236, term304236.getClass(), "kind", enum997);
        setField(term304236, term304236.getClass(), "refs", term304243);
        setIntField(term304236, term304236.getClass(), "start", 1459628013);
        setIntField(term304236, term304236.getClass(), "end", -1641507499);
        setIntField(term304236, term304236.getClass(), "bodyStart", -33436796);
        setIntField(term304236, term304236.getClass(), "bodyEnd", -1527326823);
        setField(term304236, term304236.getClass(), "fileOrUrl", "");
        Object term304250 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304250, term304250.getClass(), "isBuiltin", true);
        setBooleanField(term304250, term304250.getClass(), "isSynthetic", true);
        setField(term304250, term304250.getClass(), "name", null);
        setField(term304250, term304250.getClass(), "node", null);
        setField(term304250, term304250.getClass(), "qname", null);
        setField(term304250, term304250.getClass(), "type", null);
        setField(term304250, term304250.getClass(), "kind", null);
        setField(term304250, term304250.getClass(), "refs", null);
        setIntField(term304250, term304250.getClass(), "start", 469871899);
        setIntField(term304250, term304250.getClass(), "end", -1348703436);
        setIntField(term304250, term304250.getClass(), "bodyStart", -2027012650);
        setIntField(term304250, term304250.getClass(), "bodyEnd", 1343432022);
        setField(term304250, term304250.getClass(), "fileOrUrl", null);
        term304180 = new LinkedList();
        ((LinkedList) term304180).add(term304183);
        ((LinkedList) term304180).add(term304236);
        ((LinkedList) term304180).add(term304250);
        ((LinkedList) term304180).add((Object)null);
        term304271 = new Integer(314478878);
        term304273 = new Integer(1425342686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term304180;
        args[1] = "RkVhhbbrDb";
        args[2] = term304271;
        args[3] = term304273;
        callMethod(klass, "checkExist", argTypes, term304131, args);
    }

};


