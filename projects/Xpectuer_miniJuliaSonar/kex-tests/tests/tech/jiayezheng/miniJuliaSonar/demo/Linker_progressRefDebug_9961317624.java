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
     Object term2039;
     Object term2097;

    public Linker_progressRefDebug_9961317624() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2040 = new HashMap();
        Class<? extends Object> term2111 = Class.forName((String) "java.io.File$PathStatus");
        Field term2110 = ((Class) term2111).getDeclaredField((String) "CHECKED");
        ((Field) term2110).setAccessible(true);
        Object enum7 = ((Field) term2110).get((Object) null);
        HashMap term2083 = new HashMap();
        Set<Object> term2263 =  ((Map) term2083).keySet();
        HashSet term2082 = new HashSet((Collection<? extends Object>) term2263);
        HashMap term2092 = new HashMap();
        Set<Object> term2264 =  ((Map) term2092).keySet();
        HashSet term2091 = new HashSet((Collection<? extends Object>) term2264);
        term2039 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term2045 = newInstance(Class.forName("java.io.File"));
        setField(term2039, term2039.getClass(), "fileStyles", term2040);
        setField(term2045, term2045.getClass(), "path", "vrQLuWIDJX");
        setField(term2045, term2045.getClass(), "status", enum7);
        setIntField(term2045, term2045.getClass(), "prefixLength", 590364439);
        setField(term2045, term2045.getClass(), "filePath", null);
        setField(term2039, term2039.getClass(), "outDir", term2045);
        setField(term2039, term2039.getClass(), "rootPath", "flxyYxBRtu");
        setField(term2039, term2039.getClass(), "seenDef", term2082);
        setField(term2039, term2039.getClass(), "seenRef", term2091);
        term2097 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("java.util.List");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term2097;
        callMethod(klass, "progressRefDebug", argTypes, term2039, args);
    }

};


