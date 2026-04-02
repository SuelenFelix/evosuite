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

public class Linker_processDefDebug_13262016786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3158;
     Object term3235;

    public Linker_processDefDebug_13262016786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3159 = new HashMap();
        Class<? extends Object> term3308 = Class.forName((String) "java.io.File$PathStatus");
        Field term3307 = ((Class) term3308).getDeclaredField((String) "CHECKED");
        ((Field) term3307).setAccessible(true);
        Object enum11 = ((Field) term3307).get((Object) null);
        HashMap term3202 = new HashMap();
        Set<Object> term3460 =  ((Map) term3202).keySet();
        HashSet term3201 = new HashSet((Collection<? extends Object>) term3460);
        HashMap term3217 = new HashMap();
        Set<Object> term3461 =  ((Map) term3217).keySet();
        HashSet term3216 = new HashSet((Collection<? extends Object>) term3461);
        term3158 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term3164 = newInstance(Class.forName("java.io.File"));
        setField(term3158, term3158.getClass(), "fileStyles", term3159);
        setField(term3164, term3164.getClass(), "path", "ffYhPOzlUs");
        setField(term3164, term3164.getClass(), "status", enum11);
        setIntField(term3164, term3164.getClass(), "prefixLength", 1225272962);
        setField(term3164, term3164.getClass(), "filePath", null);
        setField(term3158, term3158.getClass(), "outDir", term3164);
        setField(term3158, term3158.getClass(), "rootPath", "MLqYREekMl");
        setField(term3158, term3158.getClass(), "seenDef", term3201);
        setField(term3158, term3158.getClass(), "seenRef", term3216);
        Class<? extends Object> term3483 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term3482 = ((Class) term3483).getDeclaredField((String) "MODULE");
        ((Field) term3482).setAccessible(true);
        Object enum12 = ((Field) term3482).get((Object) null);
        HashMap term3273 = new HashMap();
        Set<Object> term3722 =  ((Map) term3273).keySet();
        HashSet term3272 = new HashSet((Collection<? extends Object>) term3722);
        term3235 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term3235, term3235.getClass(), "isBuiltin", true);
        setBooleanField(term3235, term3235.getClass(), "isSynthetic", true);
        setField(term3235, term3235.getClass(), "name", "ytSBIKXogI");
        setField(term3235, term3235.getClass(), "node", null);
        setField(term3235, term3235.getClass(), "qname", "nHXjMycHlU");
        setField(term3235, term3235.getClass(), "type", null);
        setField(term3235, term3235.getClass(), "kind", enum12);
        setField(term3235, term3235.getClass(), "refs", term3272);
        setIntField(term3235, term3235.getClass(), "start", 1324040357);
        setIntField(term3235, term3235.getClass(), "end", -1588772968);
        setIntField(term3235, term3235.getClass(), "bodyStart", -93135961);
        setIntField(term3235, term3235.getClass(), "bodyEnd", -112921587);
        setField(term3235, term3235.getClass(), "fileOrUrl", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Object[] args = new Object[1];
        args[0] = term3235;
        callMethod(klass, "processDefDebug", argTypes, term3158, args);
    }

};


