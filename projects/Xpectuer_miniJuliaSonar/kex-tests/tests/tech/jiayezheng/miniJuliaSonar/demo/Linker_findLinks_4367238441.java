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

public class Linker_findLinks_4367238441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term223;

    public Linker_findLinks_4367238441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term224 = new HashMap();
        Class<? extends Object> term309 = Class.forName((String) "java.io.File$PathStatus");
        Field term308 = ((Class) term309).getDeclaredField((String) "INVALID");
        ((Field) term308).setAccessible(true);
        Object enum1 = ((Field) term308).get((Object) null);
        HashMap term267 = new HashMap();
        Set<Object> term461 =  ((Map) term267).keySet();
        HashSet term266 = new HashSet((Collection<? extends Object>) term461);
        HashMap term284 = new HashMap();
        Set<Object> term462 =  ((Map) term284).keySet();
        HashSet term283 = new HashSet((Collection<? extends Object>) term462);
        term223 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker"));
        Object term229 = newInstance(Class.forName("java.io.File"));
        setField(term223, term223.getClass(), "fileStyles", term224);
        setField(term229, term229.getClass(), "path", "MuLcgQHgqz");
        setField(term229, term229.getClass(), "status", enum1);
        setIntField(term229, term229.getClass(), "prefixLength", 1162663216);
        setField(term229, term229.getClass(), "filePath", null);
        setField(term223, term223.getClass(), "outDir", term229);
        setField(term223, term223.getClass(), "rootPath", "xxtlPwDYFs");
        setField(term223, term223.getClass(), "seenDef", term266);
        setField(term223, term223.getClass(), "seenRef", term283);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Linker");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Analyzer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "findLinks", argTypes, term223, args);
    }

};


