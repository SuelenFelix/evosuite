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

public class Linker_processDiagnostic_1387428952 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term463;
     Object term534;

    public Linker_processDiagnostic_1387428952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term464 = new HashMap();
        Class<? extends Object> term583 = Class.forName((String) "java.io.File$PathStatus");
        Field term582 = ((Class) term583).getDeclaredField((String) "INVALID");
        ((Field) term582).setAccessible(true);
        Object enum2 = ((Field) term582).get((Object) null);
        HashMap term507 = new HashMap();
        Set<Object> term735 =  ((Map) term507).keySet();
        HashSet term506 = new HashSet((Collection<? extends Object>) term735);
        HashMap term520 = new HashMap();
        Set<Object> term736 =  ((Map) term520).keySet();
        HashSet term519 = new HashSet((Collection<? extends Object>) term736);
        term463 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term469 = newInstance(Class.forName("java.io.File"));
        setField(term463, term463.getClass(), "fileStyles", term464);
        setField(term469, term469.getClass(), "path", "jJCZpVmanW");
        setField(term469, term469.getClass(), "status", enum2);
        setIntField(term469, term469.getClass(), "prefixLength", 1484323161);
        setField(term469, term469.getClass(), "filePath", null);
        setField(term463, term463.getClass(), "outDir", term469);
        setField(term463, term463.getClass(), "rootPath", "EGtDIRbSSb");
        setField(term463, term463.getClass(), "seenDef", term506);
        setField(term463, term463.getClass(), "seenRef", term519);
        Class<? extends Object> term776 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Diagnostic$Category");
        Field term775 = ((Class) term776).getDeclaredField((String) "WARNING");
        ((Field) term775).setAccessible(true);
        Object enum3 = ((Field) term775).get((Object) null);
        term534 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic"));
        setField(term534, term534.getClass(), "file", "SzjVpOQTyS");
        setField(term534, term534.getClass(), "category", enum3);
        setIntField(term534, term534.getClass(), "start", 391863371);
        setIntField(term534, term534.getClass(), "end", -1922583790);
        setField(term534, term534.getClass(), "msg", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic");
        Object[] args = new Object[1];
        args[0] = term534;
        callMethod(klass, "processDiagnostic", argTypes, term463, args);
    }

};


