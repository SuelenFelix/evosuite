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

public class Binding_initLocationInfo_19118217161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20187;

    public Binding_initLocationInfo_19118217161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20272 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term20271 = ((Class) term20272).getDeclaredField((String) "DATATYPE");
        ((Field) term20271).setAccessible(true);
        Object enum60 = ((Field) term20271).get((Object) null);
        HashMap term20227 = new HashMap();
        Set<Object> term20517 =  ((Map) term20227).keySet();
        HashSet term20226 = new HashSet((Collection<? extends Object>) term20517);
        term20187 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term20187, term20187.getClass(), "isBuiltin", true);
        setBooleanField(term20187, term20187.getClass(), "isSynthetic", true);
        setField(term20187, term20187.getClass(), "name", "hGTqHomrbc");
        setField(term20187, term20187.getClass(), "node", null);
        setField(term20187, term20187.getClass(), "qname", "NNMBrIWEBw");
        setField(term20187, term20187.getClass(), "type", null);
        setField(term20187, term20187.getClass(), "kind", enum60);
        setField(term20187, term20187.getClass(), "refs", term20226);
        setIntField(term20187, term20187.getClass(), "start", 344323424);
        setIntField(term20187, term20187.getClass(), "end", 9726679);
        setIntField(term20187, term20187.getClass(), "bodyStart", -25637976);
        setIntField(term20187, term20187.getClass(), "bodyEnd", 1555897383);
        setField(term20187, term20187.getClass(), "fileOrUrl", "GrTaccOQzl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "initLocationInfo", argTypes, term20187, args);
    }

};


