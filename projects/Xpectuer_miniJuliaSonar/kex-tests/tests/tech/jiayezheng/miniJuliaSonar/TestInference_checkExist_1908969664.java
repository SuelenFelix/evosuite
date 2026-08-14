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
     Object term304137;
     Object term304186;
     Object term304277;
     Object term304279;

    public TestInference_checkExist_1908969664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term304137 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.TestInference"));
        setField(term304137, term304137.getClass(), "testFile", "NxxpXdrIPo");
        setField(term304137, term304137.getClass(), "expecteRefsFile", "LoXDruySRx");
        setField(term304137, term304137.getClass(), "missingRefsFile", "NArqvBoreJ");
        setField(term304137, term304137.getClass(), "wrongTypeFile", "wNQBwmSlCW");
        Class<? extends Object> term304342 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term304341 = ((Class) term304342).getDeclaredField((String) "METHOD");
        ((Field) term304341).setAccessible(true);
        Object enum996 = ((Field) term304341).get((Object) null);
        HashMap term304220 = new HashMap();
        Set<Object> term304581 =  ((Map) term304220).keySet();
        HashSet term304219 = new HashSet((Collection<? extends Object>) term304581);
        Object term304189 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304189, term304189.getClass(), "isBuiltin", false);
        setBooleanField(term304189, term304189.getClass(), "isSynthetic", true);
        setField(term304189, term304189.getClass(), "name", "htETaiDMgw");
        setField(term304189, term304189.getClass(), "node", null);
        setField(term304189, term304189.getClass(), "qname", "UjqNGJSBEX");
        setField(term304189, term304189.getClass(), "type", null);
        setField(term304189, term304189.getClass(), "kind", enum996);
        setField(term304189, term304189.getClass(), "refs", term304219);
        setIntField(term304189, term304189.getClass(), "start", -1330529019);
        setIntField(term304189, term304189.getClass(), "end", 237134844);
        setIntField(term304189, term304189.getClass(), "bodyStart", 2076413861);
        setIntField(term304189, term304189.getClass(), "bodyEnd", 66817373);
        setField(term304189, term304189.getClass(), "fileOrUrl", "qWPcKUbGGx");
        Class<? extends Object> term304593 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term304592 = ((Class) term304593).getDeclaredField((String) "PARAMETER");
        ((Field) term304592).setAccessible(true);
        Object enum997 = ((Field) term304592).get((Object) null);
        HashSet term304249 = new HashSet();
        Object term304242 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304242, term304242.getClass(), "isBuiltin", false);
        setBooleanField(term304242, term304242.getClass(), "isSynthetic", false);
        setField(term304242, term304242.getClass(), "name", "");
        setField(term304242, term304242.getClass(), "node", null);
        setField(term304242, term304242.getClass(), "qname", "");
        setField(term304242, term304242.getClass(), "type", null);
        setField(term304242, term304242.getClass(), "kind", enum997);
        setField(term304242, term304242.getClass(), "refs", term304249);
        setIntField(term304242, term304242.getClass(), "start", 1459628013);
        setIntField(term304242, term304242.getClass(), "end", -1641507499);
        setIntField(term304242, term304242.getClass(), "bodyStart", -33436796);
        setIntField(term304242, term304242.getClass(), "bodyEnd", -1527326823);
        setField(term304242, term304242.getClass(), "fileOrUrl", "");
        Object term304256 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term304256, term304256.getClass(), "isBuiltin", true);
        setBooleanField(term304256, term304256.getClass(), "isSynthetic", true);
        setField(term304256, term304256.getClass(), "name", null);
        setField(term304256, term304256.getClass(), "node", null);
        setField(term304256, term304256.getClass(), "qname", null);
        setField(term304256, term304256.getClass(), "type", null);
        setField(term304256, term304256.getClass(), "kind", null);
        setField(term304256, term304256.getClass(), "refs", null);
        setIntField(term304256, term304256.getClass(), "start", 469871899);
        setIntField(term304256, term304256.getClass(), "end", -1348703436);
        setIntField(term304256, term304256.getClass(), "bodyStart", -2027012650);
        setIntField(term304256, term304256.getClass(), "bodyEnd", 1343432022);
        setField(term304256, term304256.getClass(), "fileOrUrl", null);
        term304186 = new LinkedList();
        ((LinkedList) term304186).add(term304189);
        ((LinkedList) term304186).add(term304242);
        ((LinkedList) term304186).add(term304256);
        ((LinkedList) term304186).add((Object)null);
        term304277 = new Integer(314478878);
        term304279 = new Integer(1425342686);
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
        args[0] = term304186;
        args[1] = "RkVhhbbrDb";
        args[2] = term304277;
        args[3] = term304279;
        callMethod(klass, "checkExist", argTypes, term304137, args);
    }

};


