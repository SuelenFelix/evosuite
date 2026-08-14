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

public class Linker_progressRefDebug_9961317624 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2037;
     Object term2095;

    public Linker_progressRefDebug_9961317624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2038 = new HashMap();
        Class<? extends Object> term2109 = Class.forName((String) "java.io.File$PathStatus");
        Field term2108 = ((Class) term2109).getDeclaredField((String) "CHECKED");
        ((Field) term2108).setAccessible(true);
        Object enum7 = ((Field) term2108).get((Object) null);
        HashMap term2081 = new HashMap();
        Set<Object> term2261 =  ((Map) term2081).keySet();
        HashSet term2080 = new HashSet((Collection<? extends Object>) term2261);
        HashMap term2090 = new HashMap();
        Set<Object> term2262 =  ((Map) term2090).keySet();
        HashSet term2089 = new HashSet((Collection<? extends Object>) term2262);
        term2037 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term2043 = newInstance(Class.forName("java.io.File"));
        setField(term2037, term2037.getClass(), "fileStyles", term2038);
        setField(term2043, term2043.getClass(), "path", "vrQLuWIDJX");
        setField(term2043, term2043.getClass(), "status", enum7);
        setIntField(term2043, term2043.getClass(), "prefixLength", 590364439);
        setField(term2043, term2043.getClass(), "filePath", null);
        setField(term2037, term2037.getClass(), "outDir", term2043);
        setField(term2037, term2037.getClass(), "rootPath", "flxyYxBRtu");
        setField(term2037, term2037.getClass(), "seenDef", term2080);
        setField(term2037, term2037.getClass(), "seenRef", term2089);
        term2095 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2095;
        callMethod(klass, "progressRefDebug", argTypes, term2037, args);
    }

};


