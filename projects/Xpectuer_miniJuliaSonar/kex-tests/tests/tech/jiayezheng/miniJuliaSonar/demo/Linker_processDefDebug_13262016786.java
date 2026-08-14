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
     Object term3156;
     Object term3231;

    public Linker_processDefDebug_13262016786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3157 = new HashMap();
        Class<? extends Object> term3304 = Class.forName((String) "java.io.File$PathStatus");
        Field term3303 = ((Class) term3304).getDeclaredField((String) "CHECKED");
        ((Field) term3303).setAccessible(true);
        Object enum11 = ((Field) term3303).get((Object) null);
        HashMap term3200 = new HashMap();
        Set<Object> term3456 =  ((Map) term3200).keySet();
        HashSet term3199 = new HashSet((Collection<? extends Object>) term3456);
        HashMap term3215 = new HashMap();
        Set<Object> term3457 =  ((Map) term3215).keySet();
        HashSet term3214 = new HashSet((Collection<? extends Object>) term3457);
        term3156 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term3162 = newInstance(Class.forName("java.io.File"));
        setField(term3156, term3156.getClass(), "fileStyles", term3157);
        setField(term3162, term3162.getClass(), "path", "ffYhPOzlUs");
        setField(term3162, term3162.getClass(), "status", enum11);
        setIntField(term3162, term3162.getClass(), "prefixLength", 1225272962);
        setField(term3162, term3162.getClass(), "filePath", null);
        setField(term3156, term3156.getClass(), "outDir", term3162);
        setField(term3156, term3156.getClass(), "rootPath", "MLqYREekMl");
        setField(term3156, term3156.getClass(), "seenDef", term3199);
        setField(term3156, term3156.getClass(), "seenRef", term3214);
        Class<? extends Object> term3479 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term3478 = ((Class) term3479).getDeclaredField((String) "MODULE");
        ((Field) term3478).setAccessible(true);
        Object enum12 = ((Field) term3478).get((Object) null);
        HashMap term3269 = new HashMap();
        Set<Object> term3718 =  ((Map) term3269).keySet();
        HashSet term3268 = new HashSet((Collection<? extends Object>) term3718);
        term3231 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term3231, term3231.getClass(), "isBuiltin", true);
        setBooleanField(term3231, term3231.getClass(), "isSynthetic", true);
        setField(term3231, term3231.getClass(), "name", "ytSBIKXogI");
        setField(term3231, term3231.getClass(), "node", null);
        setField(term3231, term3231.getClass(), "qname", "nHXjMycHlU");
        setField(term3231, term3231.getClass(), "type", null);
        setField(term3231, term3231.getClass(), "kind", enum12);
        setField(term3231, term3231.getClass(), "refs", term3268);
        setIntField(term3231, term3231.getClass(), "start", 1324040357);
        setIntField(term3231, term3231.getClass(), "end", -1588772968);
        setIntField(term3231, term3231.getClass(), "bodyStart", -93135961);
        setIntField(term3231, term3231.getClass(), "bodyEnd", -112921587);
        setField(term3231, term3231.getClass(), "fileOrUrl", "ieCtQFdkii");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Object[] args = new Object[1];
        args[0] = term3231;
        callMethod(klass, "processDefDebug", argTypes, term3156, args);
    }

};


