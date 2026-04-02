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
     Object term5457;

    public Linker_getStyles_112688946510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5458 = new HashMap();
        Class<? extends Object> term5550 = Class.forName((String) "java.io.File$PathStatus");
        Field term5549 = ((Class) term5550).getDeclaredField((String) "INVALID");
        ((Field) term5549).setAccessible(true);
        Object enum18 = ((Field) term5549).get((Object) null);
        HashMap term5501 = new HashMap();
        Set<Object> term5702 =  ((Map) term5501).keySet();
        HashSet term5500 = new HashSet((Collection<? extends Object>) term5702);
        HashMap term5522 = new HashMap();
        Set<Object> term5703 =  ((Map) term5522).keySet();
        HashSet term5521 = new HashSet((Collection<? extends Object>) term5703);
        term5457 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term5463 = newInstance(Class.forName("java.io.File"));
        setField(term5457, term5457.getClass(), "fileStyles", term5458);
        setField(term5463, term5463.getClass(), "path", "OWKQODBLzb");
        setField(term5463, term5463.getClass(), "status", enum18);
        setIntField(term5463, term5463.getClass(), "prefixLength", 1375330971);
        setField(term5463, term5463.getClass(), "filePath", null);
        setField(term5457, term5457.getClass(), "outDir", term5463);
        setField(term5457, term5457.getClass(), "rootPath", "wGmYcqUkgE");
        setField(term5457, term5457.getClass(), "seenDef", term5500);
        setField(term5457, term5457.getClass(), "seenRef", term5521);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "idgaQsnJpQ";
        callMethod(klass, "getStyles", argTypes, term5457, args);
    }

};


