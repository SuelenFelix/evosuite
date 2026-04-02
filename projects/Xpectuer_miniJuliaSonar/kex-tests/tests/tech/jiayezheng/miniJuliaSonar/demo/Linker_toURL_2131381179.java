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

public class Linker_toURL_2131381179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4883;
     Object term4944;

    public Linker_toURL_2131381179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4884 = new HashMap();
        Class<? extends Object> term5025 = Class.forName((String) "java.io.File$PathStatus");
        Field term5024 = ((Class) term5025).getDeclaredField((String) "CHECKED");
        ((Field) term5024).setAccessible(true);
        Object enum16 = ((Field) term5024).get((Object) null);
        HashMap term4927 = new HashMap();
        Set<Object> term5177 =  ((Map) term4927).keySet();
        HashSet term4926 = new HashSet((Collection<? extends Object>) term5177);
        HashMap term4936 = new HashMap();
        Set<Object> term5178 =  ((Map) term4936).keySet();
        HashSet term4935 = new HashSet((Collection<? extends Object>) term5178);
        term4883 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term4889 = newInstance(Class.forName("java.io.File"));
        setField(term4883, term4883.getClass(), "fileStyles", term4884);
        setField(term4889, term4889.getClass(), "path", "JUmudUmaaV");
        setField(term4889, term4889.getClass(), "status", enum16);
        setIntField(term4889, term4889.getClass(), "prefixLength", 1265463001);
        setField(term4889, term4889.getClass(), "filePath", null);
        setField(term4883, term4883.getClass(), "outDir", term4889);
        setField(term4883, term4883.getClass(), "rootPath", "KoyGrUJeJW");
        setField(term4883, term4883.getClass(), "seenDef", term4926);
        setField(term4883, term4883.getClass(), "seenRef", term4935);
        Class<? extends Object> term5200 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term5199 = ((Class) term5200).getDeclaredField((String) "SCOPE");
        ((Field) term5199).setAccessible(true);
        Object enum17 = ((Field) term5199).get((Object) null);
        HashMap term4981 = new HashMap();
        Set<Object> term5436 =  ((Map) term4981).keySet();
        HashSet term4980 = new HashSet((Collection<? extends Object>) term5436);
        term4944 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term4944, term4944.getClass(), "isBuiltin", true);
        setBooleanField(term4944, term4944.getClass(), "isSynthetic", true);
        setField(term4944, term4944.getClass(), "name", "HqBOwkVqjD");
        setField(term4944, term4944.getClass(), "node", null);
        setField(term4944, term4944.getClass(), "qname", "MAcUBcBckh");
        setField(term4944, term4944.getClass(), "type", null);
        setField(term4944, term4944.getClass(), "kind", enum17);
        setField(term4944, term4944.getClass(), "refs", term4980);
        setIntField(term4944, term4944.getClass(), "start", 335112684);
        setIntField(term4944, term4944.getClass(), "end", 1551099402);
        setIntField(term4944, term4944.getClass(), "bodyStart", -2027534003);
        setIntField(term4944, term4944.getClass(), "bodyEnd", 1063420942);
        setField(term4944, term4944.getClass(), "fileOrUrl", "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4944;
        args[1] = "vQVyKLdtaz";
        callMethod(klass, "toURL", argTypes, term4883, args);
    }

};


