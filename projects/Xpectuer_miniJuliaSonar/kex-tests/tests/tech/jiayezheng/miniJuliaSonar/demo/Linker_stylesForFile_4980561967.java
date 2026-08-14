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
     Object term3729;

    public Linker_stylesForFile_4980561967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3730 = new HashMap();
        Class<? extends Object> term3825 = Class.forName((String) "java.io.File$PathStatus");
        Field term3824 = ((Class) term3825).getDeclaredField((String) "CHECKED");
        ((Field) term3824).setAccessible(true);
        Object enum13 = ((Field) term3824).get((Object) null);
        HashMap term3773 = new HashMap();
        Set<Object> term3977 =  ((Map) term3773).keySet();
        HashSet term3772 = new HashSet((Collection<? extends Object>) term3977);
        HashMap term3794 = new HashMap();
        Set<Object> term3978 =  ((Map) term3794).keySet();
        HashSet term3793 = new HashSet((Collection<? extends Object>) term3978);
        term3729 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term3735 = newInstance(Class.forName("java.io.File"));
        setField(term3729, term3729.getClass(), "fileStyles", term3730);
        setField(term3735, term3735.getClass(), "path", "dEnhdmILtU");
        setField(term3735, term3735.getClass(), "status", enum13);
        setIntField(term3735, term3735.getClass(), "prefixLength", 933028652);
        setField(term3735, term3735.getClass(), "filePath", null);
        setField(term3729, term3729.getClass(), "outDir", term3735);
        setField(term3729, term3729.getClass(), "rootPath", "hoicvmsovO");
        setField(term3729, term3729.getClass(), "seenDef", term3772);
        setField(term3729, term3729.getClass(), "seenRef", term3793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "eqJfYWRaEL";
        callMethod(klass, "stylesForFile", argTypes, term3729, args);
    }

};


