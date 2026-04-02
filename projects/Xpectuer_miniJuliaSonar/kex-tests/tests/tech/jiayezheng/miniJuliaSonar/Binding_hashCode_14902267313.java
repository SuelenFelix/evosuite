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

public class Binding_hashCode_14902267313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24253;

    public Binding_hashCode_14902267313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24339 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term24338 = ((Class) term24339).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term24338).setAccessible(true);
        Object enum72 = ((Field) term24338).get((Object) null);
        HashMap term24294 = new HashMap();
        Set<Object> term24587 =  ((Map) term24294).keySet();
        HashSet term24293 = new HashSet((Collection<? extends Object>) term24587);
        term24253 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term24253, term24253.getClass(), "isBuiltin", true);
        setBooleanField(term24253, term24253.getClass(), "isSynthetic", true);
        setField(term24253, term24253.getClass(), "name", "TwaxeSHvnR");
        setField(term24253, term24253.getClass(), "node", null);
        setField(term24253, term24253.getClass(), "qname", "paPzDETzIq");
        setField(term24253, term24253.getClass(), "type", null);
        setField(term24253, term24253.getClass(), "kind", enum72);
        setField(term24253, term24253.getClass(), "refs", term24293);
        setIntField(term24253, term24253.getClass(), "start", 584893196);
        setIntField(term24253, term24253.getClass(), "end", 497269071);
        setIntField(term24253, term24253.getClass(), "bodyStart", -1899301124);
        setIntField(term24253, term24253.getClass(), "bodyEnd", -1882480155);
        setField(term24253, term24253.getClass(), "fileOrUrl", "fufeuGfwpN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term24253, args);
    }

};


