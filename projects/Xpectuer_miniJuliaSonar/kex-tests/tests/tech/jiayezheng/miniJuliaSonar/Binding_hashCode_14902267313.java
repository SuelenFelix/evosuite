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
     Object term24259;

    public Binding_hashCode_14902267313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24345 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term24344 = ((Class) term24345).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term24344).setAccessible(true);
        Object enum72 = ((Field) term24344).get((Object) null);
        HashMap term24300 = new HashMap();
        Set<Object> term24593 =  ((Map) term24300).keySet();
        HashSet term24299 = new HashSet((Collection<? extends Object>) term24593);
        term24259 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term24259, term24259.getClass(), "isBuiltin", true);
        setBooleanField(term24259, term24259.getClass(), "isSynthetic", true);
        setField(term24259, term24259.getClass(), "name", "TwaxeSHvnR");
        setField(term24259, term24259.getClass(), "node", null);
        setField(term24259, term24259.getClass(), "qname", "paPzDETzIq");
        setField(term24259, term24259.getClass(), "type", null);
        setField(term24259, term24259.getClass(), "kind", enum72);
        setField(term24259, term24259.getClass(), "refs", term24299);
        setIntField(term24259, term24259.getClass(), "start", 584893196);
        setIntField(term24259, term24259.getClass(), "end", 497269071);
        setIntField(term24259, term24259.getClass(), "bodyStart", -1899301124);
        setIntField(term24259, term24259.getClass(), "bodyEnd", -1882480155);
        setField(term24259, term24259.getClass(), "fileOrUrl", "fufeuGfwpN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term24259, args);
    }

};


