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
     Object term4885;
     Object term4948;

    public Linker_toURL_2131381179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4886 = new HashMap();
        Class<? extends Object> term5029 = Class.forName((String) "java.io.File$PathStatus");
        Field term5028 = ((Class) term5029).getDeclaredField((String) "CHECKED");
        ((Field) term5028).setAccessible(true);
        Object enum16 = ((Field) term5028).get((Object) null);
        HashMap term4929 = new HashMap();
        Set<Object> term5181 =  ((Map) term4929).keySet();
        HashSet term4928 = new HashSet((Collection<? extends Object>) term5181);
        HashMap term4940 = new HashMap();
        Set<Object> term5182 =  ((Map) term4940).keySet();
        HashSet term4939 = new HashSet((Collection<? extends Object>) term5182);
        term4885 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term4891 = newInstance(Class.forName("java.io.File"));
        setField(term4885, term4885.getClass(), "fileStyles", term4886);
        setField(term4891, term4891.getClass(), "path", "JUmudUmaaV");
        setField(term4891, term4891.getClass(), "status", enum16);
        setIntField(term4891, term4891.getClass(), "prefixLength", 1265463001);
        setField(term4891, term4891.getClass(), "filePath", null);
        setField(term4885, term4885.getClass(), "outDir", term4891);
        setField(term4885, term4885.getClass(), "rootPath", "KoyGrUJeJW");
        setField(term4885, term4885.getClass(), "seenDef", term4928);
        setField(term4885, term4885.getClass(), "seenRef", term4939);
        Class<? extends Object> term5204 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term5203 = ((Class) term5204).getDeclaredField((String) "SCOPE");
        ((Field) term5203).setAccessible(true);
        Object enum17 = ((Field) term5203).get((Object) null);
        HashMap term4985 = new HashMap();
        Set<Object> term5440 =  ((Map) term4985).keySet();
        HashSet term4984 = new HashSet((Collection<? extends Object>) term5440);
        term4948 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term4948, term4948.getClass(), "isBuiltin", true);
        setBooleanField(term4948, term4948.getClass(), "isSynthetic", true);
        setField(term4948, term4948.getClass(), "name", "HqBOwkVqjD");
        setField(term4948, term4948.getClass(), "node", null);
        setField(term4948, term4948.getClass(), "qname", "MAcUBcBckh");
        setField(term4948, term4948.getClass(), "type", null);
        setField(term4948, term4948.getClass(), "kind", enum17);
        setField(term4948, term4948.getClass(), "refs", term4984);
        setIntField(term4948, term4948.getClass(), "start", 335112684);
        setIntField(term4948, term4948.getClass(), "end", 1551099402);
        setIntField(term4948, term4948.getClass(), "bodyStart", -2027534003);
        setIntField(term4948, term4948.getClass(), "bodyEnd", 1063420942);
        setField(term4948, term4948.getClass(), "fileOrUrl", "oVgzLbrsFr");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4948;
        args[1] = "vQVyKLdtaz";
        callMethod(klass, "toURL", argTypes, term4885, args);
    }

};


