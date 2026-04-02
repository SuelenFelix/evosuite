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

public class Linker_progressRef_15964053013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1063;
     Object term1130;

    public Linker_progressRef_15964053013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1064 = new HashMap();
        Class<? extends Object> term1273 = Class.forName((String) "java.io.File$PathStatus");
        Field term1272 = ((Class) term1273).getDeclaredField((String) "INVALID");
        ((Field) term1272).setAccessible(true);
        Object enum4 = ((Field) term1272).get((Object) null);
        HashMap term1107 = new HashMap();
        Set<Object> term1425 =  ((Map) term1107).keySet();
        HashSet term1106 = new HashSet((Collection<? extends Object>) term1425);
        HashMap term1116 = new HashMap();
        Set<Object> term1426 =  ((Map) term1116).keySet();
        HashSet term1115 = new HashSet((Collection<? extends Object>) term1426);
        term1063 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term1069 = newInstance(Class.forName("java.io.File"));
        setField(term1063, term1063.getClass(), "fileStyles", term1064);
        setField(term1069, term1069.getClass(), "path", "hRNSzYYIrc");
        setField(term1069, term1069.getClass(), "status", enum4);
        setIntField(term1069, term1069.getClass(), "prefixLength", -616727354);
        setField(term1069, term1069.getClass(), "filePath", null);
        setField(term1063, term1063.getClass(), "outDir", term1069);
        setField(term1063, term1063.getClass(), "rootPath", "RMFIsYGgne");
        setField(term1063, term1063.getClass(), "seenDef", term1106);
        setField(term1063, term1063.getClass(), "seenRef", term1115);
        Class<? extends Object> term1549 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term1548 = ((Class) term1549).getDeclaredField((String) "METHOD");
        ((Field) term1548).setAccessible(true);
        Object enum5 = ((Field) term1548).get((Object) null);
        HashMap term1164 = new HashMap();
        Set<Object> term1788 =  ((Map) term1164).keySet();
        HashSet term1163 = new HashSet((Collection<? extends Object>) term1788);
        Object term1133 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term1133, term1133.getClass(), "isBuiltin", false);
        setBooleanField(term1133, term1133.getClass(), "isSynthetic", false);
        setField(term1133, term1133.getClass(), "name", "NRdvgJlhkX");
        setField(term1133, term1133.getClass(), "node", null);
        setField(term1133, term1133.getClass(), "qname", "uuaPigETmJ");
        setField(term1133, term1133.getClass(), "type", null);
        setField(term1133, term1133.getClass(), "kind", enum5);
        setField(term1133, term1133.getClass(), "refs", term1163);
        setIntField(term1133, term1133.getClass(), "start", -1955890973);
        setIntField(term1133, term1133.getClass(), "end", -2038273078);
        setIntField(term1133, term1133.getClass(), "bodyStart", 1227103734);
        setIntField(term1133, term1133.getClass(), "bodyEnd", -1339778481);
        setField(term1133, term1133.getClass(), "fileOrUrl", "MxlszYVzRf");
        Class<? extends Object> term1800 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term1799 = ((Class) term1800).getDeclaredField((String) "METHOD");
        ((Field) term1799).setAccessible(true);
        Object enum6 = ((Field) term1799).get((Object) null);
        HashSet term1193 = new HashSet();
        Object term1186 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term1186, term1186.getClass(), "isBuiltin", false);
        setBooleanField(term1186, term1186.getClass(), "isSynthetic", false);
        setField(term1186, term1186.getClass(), "name", "");
        setField(term1186, term1186.getClass(), "node", null);
        setField(term1186, term1186.getClass(), "qname", "");
        setField(term1186, term1186.getClass(), "type", null);
        setField(term1186, term1186.getClass(), "kind", enum6);
        setField(term1186, term1186.getClass(), "refs", term1193);
        setIntField(term1186, term1186.getClass(), "start", 1725571209);
        setIntField(term1186, term1186.getClass(), "end", -522618178);
        setIntField(term1186, term1186.getClass(), "bodyStart", 1134449235);
        setIntField(term1186, term1186.getClass(), "bodyEnd", -883034806);
        setField(term1186, term1186.getClass(), "fileOrUrl", "");
        Object term1200 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term1200, term1200.getClass(), "isBuiltin", true);
        setBooleanField(term1200, term1200.getClass(), "isSynthetic", true);
        setField(term1200, term1200.getClass(), "name", null);
        setField(term1200, term1200.getClass(), "node", null);
        setField(term1200, term1200.getClass(), "qname", null);
        setField(term1200, term1200.getClass(), "type", null);
        setField(term1200, term1200.getClass(), "kind", enum5);
        setField(term1200, term1200.getClass(), "refs", null);
        setIntField(term1200, term1200.getClass(), "start", 1585847225);
        setIntField(term1200, term1200.getClass(), "end", 597278769);
        setIntField(term1200, term1200.getClass(), "bodyStart", -1685132342);
        setIntField(term1200, term1200.getClass(), "bodyEnd", -1456670397);
        setField(term1200, term1200.getClass(), "fileOrUrl", null);
        term1130 = new LinkedList();
        ((LinkedList) term1130).add(term1133);
        ((LinkedList) term1130).add(term1186);
        ((LinkedList) term1130).add(term1200);
        ((LinkedList) term1130).add((Object)null);
        ((LinkedList) term1130).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1130;
        callMethod(klass, "progressRef", argTypes, term1063, args);
    }

};


