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
     Object term459;
     Object term530;

    public Linker_processDiagnostic_1387428952() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term460 = new HashMap();
        Class<? extends Object> term579 = Class.forName((String) "java.io.File$PathStatus");
        Field term578 = ((Class) term579).getDeclaredField((String) "INVALID");
        ((Field) term578).setAccessible(true);
        Object enum2 = ((Field) term578).get((Object) null);
        HashMap term503 = new HashMap();
        Set<Object> term731 =  ((Map) term503).keySet();
        HashSet term502 = new HashSet((Collection<? extends Object>) term731);
        HashMap term516 = new HashMap();
        Set<Object> term732 =  ((Map) term516).keySet();
        HashSet term515 = new HashSet((Collection<? extends Object>) term732);
        term459 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term465 = newInstance(Class.forName("java.io.File"));
        setField(term459, term459.getClass(), "fileStyles", term460);
        setField(term465, term465.getClass(), "path", "jJCZpVmanW");
        setField(term465, term465.getClass(), "status", enum2);
        setIntField(term465, term465.getClass(), "prefixLength", 1484323161);
        setField(term465, term465.getClass(), "filePath", null);
        setField(term459, term459.getClass(), "outDir", term465);
        setField(term459, term459.getClass(), "rootPath", "EGtDIRbSSb");
        setField(term459, term459.getClass(), "seenDef", term502);
        setField(term459, term459.getClass(), "seenRef", term515);
        Class<? extends Object> term772 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Diagnostic$Category");
        Field term771 = ((Class) term772).getDeclaredField((String) "WARNING");
        ((Field) term771).setAccessible(true);
        Object enum3 = ((Field) term771).get((Object) null);
        term530 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic"));
        setField(term530, term530.getClass(), "file", "SzjVpOQTyS");
        setField(term530, term530.getClass(), "category", enum3);
        setIntField(term530, term530.getClass(), "start", 391863371);
        setIntField(term530, term530.getClass(), "end", -1922583790);
        setField(term530, term530.getClass(), "msg", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Diagnostic");
        Object[] args = new Object[1];
        args[0] = term530;
        callMethod(klass, "processDiagnostic", argTypes, term459, args);
    }

};


