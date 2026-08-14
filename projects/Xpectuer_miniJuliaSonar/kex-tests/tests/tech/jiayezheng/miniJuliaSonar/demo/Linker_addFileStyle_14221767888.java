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
     Object term3989;
     Object term4082;

    public Linker_addFileStyle_14221767888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3990 = new HashMap();
        Class<? extends Object> term4173 = Class.forName((String) "java.io.File$PathStatus");
        Field term4172 = ((Class) term4173).getDeclaredField((String) "INVALID");
        ((Field) term4172).setAccessible(true);
        Object enum14 = ((Field) term4172).get((Object) null);
        HashMap term4033 = new HashMap();
        Set<Object> term4325 =  ((Map) term4033).keySet();
        HashSet term4032 = new HashSet((Collection<? extends Object>) term4325);
        HashMap term4054 = new HashMap();
        Set<Object> term4326 =  ((Map) term4054).keySet();
        HashSet term4053 = new HashSet((Collection<? extends Object>) term4326);
        term3989 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term3995 = newInstance(Class.forName("java.io.File"));
        setField(term3989, term3989.getClass(), "fileStyles", term3990);
        setField(term3995, term3995.getClass(), "path", "fhkbdRViHi");
        setField(term3995, term3995.getClass(), "status", enum14);
        setIntField(term3995, term3995.getClass(), "prefixLength", 287287233);
        setField(term3995, term3995.getClass(), "filePath", null);
        setField(term3989, term3989.getClass(), "outDir", term3995);
        setField(term3989, term3989.getClass(), "rootPath", "uWHnvSvaPl");
        setField(term3989, term3989.getClass(), "seenDef", term4032);
        setField(term3989, term3989.getClass(), "seenRef", term4053);
        Class<? extends Object> term4572 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term4571 = ((Class) term4572).getDeclaredField((String) "DELIMITER");
        ((Field) term4571).setAccessible(true);
        Object enum15 = ((Field) term4571).get((Object) null);
        ArrayList term4134 = new ArrayList();
        ((ArrayList) term4134).add("whBvTVIIlC");
        ((ArrayList) term4134).add("IgRJUzaCwW");
        term4082 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term4082, term4082.getClass(), "type", enum15);
        setIntField(term4082, term4082.getClass(), "start", 962840079);
        setIntField(term4082, term4082.getClass(), "end", 1540719661);
        setField(term4082, term4082.getClass(), "message", "TJmVBGfTML");
        setField(term4082, term4082.getClass(), "url", "tPlsykYBqO");
        setField(term4082, term4082.getClass(), "id", "bLPjGVBhlX");
        setField(term4082, term4082.getClass(), "highlight", term4134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style");
        Object[] args = new Object[2];
        args[0] = "kBdSllIBVz";
        args[1] = term4082;
        callMethod(klass, "addFileStyle", argTypes, term3989, args);
    }

};


