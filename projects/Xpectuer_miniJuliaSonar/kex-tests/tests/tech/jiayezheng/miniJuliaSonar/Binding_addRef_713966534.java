package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Binding_addRef_713966534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21223;

    public Binding_addRef_713966534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21309 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term21308 = ((Class) term21309).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term21308).setAccessible(true);
        Object enum63 = ((Field) term21308).get((Object) null);
        HashMap term21264 = new HashMap();
        Set<Object> term21557 =  ((Map) term21264).keySet();
        HashSet term21263 = new HashSet((Collection<? extends Object>) term21557);
        term21223 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term21223, term21223.getClass(), "isBuiltin", false);
        setBooleanField(term21223, term21223.getClass(), "isSynthetic", true);
        setField(term21223, term21223.getClass(), "name", "CuWebzZQjZ");
        setField(term21223, term21223.getClass(), "node", null);
        setField(term21223, term21223.getClass(), "qname", "wRVaaJxKYI");
        setField(term21223, term21223.getClass(), "type", null);
        setField(term21223, term21223.getClass(), "kind", enum63);
        setField(term21223, term21223.getClass(), "refs", term21263);
        setIntField(term21223, term21223.getClass(), "start", 1598895173);
        setIntField(term21223, term21223.getClass(), "end", 1830648570);
        setIntField(term21223, term21223.getClass(), "bodyStart", -227365013);
        setIntField(term21223, term21223.getClass(), "bodyEnd", 11724947);
        setField(term21223, term21223.getClass(), "fileOrUrl", "yOQuJXRvOo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addRef", argTypes, term21223, args);
    }

};


