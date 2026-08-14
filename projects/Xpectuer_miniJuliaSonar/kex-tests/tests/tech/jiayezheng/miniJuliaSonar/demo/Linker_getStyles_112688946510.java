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

public class Linker_getStyles_112688946510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5461;

    public Linker_getStyles_112688946510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5462 = new HashMap();
        Class<? extends Object> term5556 = Class.forName((String) "java.io.File$PathStatus");
        Field term5555 = ((Class) term5556).getDeclaredField((String) "INVALID");
        ((Field) term5555).setAccessible(true);
        Object enum18 = ((Field) term5555).get((Object) null);
        HashMap term5505 = new HashMap();
        Set<Object> term5708 =  ((Map) term5505).keySet();
        HashSet term5504 = new HashSet((Collection<? extends Object>) term5708);
        HashMap term5528 = new HashMap();
        Set<Object> term5709 =  ((Map) term5528).keySet();
        HashSet term5527 = new HashSet((Collection<? extends Object>) term5709);
        term5461 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term5467 = newInstance(Class.forName("java.io.File"));
        setField(term5461, term5461.getClass(), "fileStyles", term5462);
        setField(term5467, term5467.getClass(), "path", "OWKQODBLzb");
        setField(term5467, term5467.getClass(), "status", enum18);
        setIntField(term5467, term5467.getClass(), "prefixLength", 1375330971);
        setField(term5467, term5467.getClass(), "filePath", null);
        setField(term5461, term5461.getClass(), "outDir", term5467);
        setField(term5461, term5461.getClass(), "rootPath", "wGmYcqUkgE");
        setField(term5461, term5461.getClass(), "seenDef", term5504);
        setField(term5461, term5461.getClass(), "seenRef", term5527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "idgaQsnJpQ";
        callMethod(klass, "getStyles", argTypes, term5461, args);
    }

};


