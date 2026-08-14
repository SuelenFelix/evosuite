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
     Object term1059;
     Object term1128;

    public Linker_progressRef_15964053013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1060 = new HashMap();
        Class<? extends Object> term1271 = Class.forName((String) "java.io.File$PathStatus");
        Field term1270 = ((Class) term1271).getDeclaredField((String) "INVALID");
        ((Field) term1270).setAccessible(true);
        Object enum4 = ((Field) term1270).get((Object) null);
        HashMap term1103 = new HashMap();
        Set<Object> term1423 =  ((Map) term1103).keySet();
        HashSet term1102 = new HashSet((Collection<? extends Object>) term1423);
        HashMap term1112 = new HashMap();
        Set<Object> term1424 =  ((Map) term1112).keySet();
        HashSet term1111 = new HashSet((Collection<? extends Object>) term1424);
        term1059 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term1065 = newInstance(Class.forName("java.io.File"));
        setField(term1059, term1059.getClass(), "fileStyles", term1060);
        setField(term1065, term1065.getClass(), "path", "hRNSzYYIrc");
        setField(term1065, term1065.getClass(), "status", enum4);
        setIntField(term1065, term1065.getClass(), "prefixLength", -616727354);
        setField(term1065, term1065.getClass(), "filePath", null);
        setField(term1059, term1059.getClass(), "outDir", term1065);
        setField(term1059, term1059.getClass(), "rootPath", "RMFIsYGgne");
        setField(term1059, term1059.getClass(), "seenDef", term1102);
        setField(term1059, term1059.getClass(), "seenRef", term1111);
        Class<? extends Object> term1547 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term1546 = ((Class) term1547).getDeclaredField((String) "METHOD");
        ((Field) term1546).setAccessible(true);
        Object enum5 = ((Field) term1546).get((Object) null);
        HashMap term1162 = new HashMap();
        Set<Object> term1786 =  ((Map) term1162).keySet();
        HashSet term1161 = new HashSet((Collection<? extends Object>) term1786);
        Object term1131 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term1131, term1131.getClass(), "isBuiltin", false);
        setBooleanField(term1131, term1131.getClass(), "isSynthetic", false);
        setField(term1131, term1131.getClass(), "name", "NRdvgJlhkX");
        setField(term1131, term1131.getClass(), "node", null);
        setField(term1131, term1131.getClass(), "qname", "uuaPigETmJ");
        setField(term1131, term1131.getClass(), "type", null);
        setField(term1131, term1131.getClass(), "kind", enum5);
        setField(term1131, term1131.getClass(), "refs", term1161);
        setIntField(term1131, term1131.getClass(), "start", -1955890973);
        setIntField(term1131, term1131.getClass(), "end", -2038273078);
        setIntField(term1131, term1131.getClass(), "bodyStart", 1227103734);
        setIntField(term1131, term1131.getClass(), "bodyEnd", -1339778481);
        setField(term1131, term1131.getClass(), "fileOrUrl", "MxlszYVzRf");
        Class<? extends Object> term1798 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term1797 = ((Class) term1798).getDeclaredField((String) "METHOD");
        ((Field) term1797).setAccessible(true);
        Object enum6 = ((Field) term1797).get((Object) null);
        HashSet term1191 = new HashSet();
        Object term1184 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term1184, term1184.getClass(), "isBuiltin", false);
        setBooleanField(term1184, term1184.getClass(), "isSynthetic", false);
        setField(term1184, term1184.getClass(), "name", "");
        setField(term1184, term1184.getClass(), "node", null);
        setField(term1184, term1184.getClass(), "qname", "");
        setField(term1184, term1184.getClass(), "type", null);
        setField(term1184, term1184.getClass(), "kind", enum6);
        setField(term1184, term1184.getClass(), "refs", term1191);
        setIntField(term1184, term1184.getClass(), "start", 1725571209);
        setIntField(term1184, term1184.getClass(), "end", -522618178);
        setIntField(term1184, term1184.getClass(), "bodyStart", 1134449235);
        setIntField(term1184, term1184.getClass(), "bodyEnd", -883034806);
        setField(term1184, term1184.getClass(), "fileOrUrl", "");
        Object term1198 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term1198, term1198.getClass(), "isBuiltin", true);
        setBooleanField(term1198, term1198.getClass(), "isSynthetic", true);
        setField(term1198, term1198.getClass(), "name", null);
        setField(term1198, term1198.getClass(), "node", null);
        setField(term1198, term1198.getClass(), "qname", null);
        setField(term1198, term1198.getClass(), "type", null);
        setField(term1198, term1198.getClass(), "kind", enum5);
        setField(term1198, term1198.getClass(), "refs", null);
        setIntField(term1198, term1198.getClass(), "start", 1585847225);
        setIntField(term1198, term1198.getClass(), "end", 597278769);
        setIntField(term1198, term1198.getClass(), "bodyStart", -1685132342);
        setIntField(term1198, term1198.getClass(), "bodyEnd", -1456670397);
        setField(term1198, term1198.getClass(), "fileOrUrl", null);
        term1128 = new LinkedList();
        ((LinkedList) term1128).add(term1131);
        ((LinkedList) term1128).add(term1184);
        ((LinkedList) term1128).add(term1198);
        ((LinkedList) term1128).add((Object)null);
        ((LinkedList) term1128).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1128;
        callMethod(klass, "progressRef", argTypes, term1059, args);
    }

};


