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
import java.util.ArrayList;

public class Linker_addFileStyle_14221767888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3993;
     Object term4080;

    public Linker_addFileStyle_14221767888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3994 = new HashMap();
        Class<? extends Object> term4171 = Class.forName((String) "java.io.File$PathStatus");
        Field term4170 = ((Class) term4171).getDeclaredField((String) "INVALID");
        ((Field) term4170).setAccessible(true);
        Object enum14 = ((Field) term4170).get((Object) null);
        HashMap term4037 = new HashMap();
        Set<Object> term4323 =  ((Map) term4037).keySet();
        HashSet term4036 = new HashSet((Collection<? extends Object>) term4323);
        HashMap term4054 = new HashMap();
        Set<Object> term4324 =  ((Map) term4054).keySet();
        HashSet term4053 = new HashSet((Collection<? extends Object>) term4324);
        term3993 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term3999 = newInstance(Class.forName("java.io.File"));
        setField(term3993, term3993.getClass(), "fileStyles", term3994);
        setField(term3999, term3999.getClass(), "path", "fhkbdRViHi");
        setField(term3999, term3999.getClass(), "status", enum14);
        setIntField(term3999, term3999.getClass(), "prefixLength", 287287233);
        setField(term3999, term3999.getClass(), "filePath", null);
        setField(term3993, term3993.getClass(), "outDir", term3999);
        setField(term3993, term3993.getClass(), "rootPath", "uWHnvSvaPl");
        setField(term3993, term3993.getClass(), "seenDef", term4036);
        setField(term3993, term3993.getClass(), "seenRef", term4053);
        Class<? extends Object> term4570 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term4569 = ((Class) term4570).getDeclaredField((String) "DELIMITER");
        ((Field) term4569).setAccessible(true);
        Object enum15 = ((Field) term4569).get((Object) null);
        ArrayList term4132 = new ArrayList();
        ((ArrayList) term4132).add("whBvTVIIlC");
        ((ArrayList) term4132).add("IgRJUzaCwW");
        term4080 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term4080, term4080.getClass(), "type", enum15);
        setIntField(term4080, term4080.getClass(), "start", 962840079);
        setIntField(term4080, term4080.getClass(), "end", 1540719661);
        setField(term4080, term4080.getClass(), "message", "TJmVBGfTML");
        setField(term4080, term4080.getClass(), "url", "tPlsykYBqO");
        setField(term4080, term4080.getClass(), "id", "bLPjGVBhlX");
        setField(term4080, term4080.getClass(), "highlight", term4132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[2];
        args[0] = "kBdSllIBVz";
        args[1] = term4080;
        callMethod(klass, "addFileStyle", argTypes, term3993, args);
    }

};


