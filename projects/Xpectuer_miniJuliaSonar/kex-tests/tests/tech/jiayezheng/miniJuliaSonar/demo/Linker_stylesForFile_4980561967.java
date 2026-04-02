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

public class Linker_stylesForFile_4980561967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3733;

    public Linker_stylesForFile_4980561967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3734 = new HashMap();
        Class<? extends Object> term3829 = Class.forName((String) "java.io.File$PathStatus");
        Field term3828 = ((Class) term3829).getDeclaredField((String) "CHECKED");
        ((Field) term3828).setAccessible(true);
        Object enum13 = ((Field) term3828).get((Object) null);
        HashMap term3777 = new HashMap();
        Set<Object> term3981 =  ((Map) term3777).keySet();
        HashSet term3776 = new HashSet((Collection<? extends Object>) term3981);
        HashMap term3798 = new HashMap();
        Set<Object> term3982 =  ((Map) term3798).keySet();
        HashSet term3797 = new HashSet((Collection<? extends Object>) term3982);
        term3733 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term3739 = newInstance(Class.forName("java.io.File"));
        setField(term3733, term3733.getClass(), "fileStyles", term3734);
        setField(term3739, term3739.getClass(), "path", "dEnhdmILtU");
        setField(term3739, term3739.getClass(), "status", enum13);
        setIntField(term3739, term3739.getClass(), "prefixLength", 933028652);
        setField(term3739, term3739.getClass(), "filePath", null);
        setField(term3733, term3733.getClass(), "outDir", term3739);
        setField(term3733, term3733.getClass(), "rootPath", "hoicvmsovO");
        setField(term3733, term3733.getClass(), "seenDef", term3776);
        setField(term3733, term3733.getClass(), "seenRef", term3797);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        callMethod(klass, "stylesForFile", argTypes, term3733, args);
    }

};


