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

public class Binding_isURL_17203746177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22236;

    public Binding_isURL_17203746177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22318 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term22317 = ((Class) term22318).getDeclaredField((String) "SCOPE");
        ((Field) term22317).setAccessible(true);
        Object enum66 = ((Field) term22317).get((Object) null);
        HashMap term22273 = new HashMap();
        Set<Object> term22554 =  ((Map) term22273).keySet();
        HashSet term22272 = new HashSet((Collection<? extends Object>) term22554);
        term22236 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term22236, term22236.getClass(), "isBuiltin", true);
        setBooleanField(term22236, term22236.getClass(), "isSynthetic", false);
        setField(term22236, term22236.getClass(), "name", "GuVQjhBxma");
        setField(term22236, term22236.getClass(), "node", null);
        setField(term22236, term22236.getClass(), "qname", "WAVMPPbIfL");
        setField(term22236, term22236.getClass(), "type", null);
        setField(term22236, term22236.getClass(), "kind", enum66);
        setField(term22236, term22236.getClass(), "refs", term22272);
        setIntField(term22236, term22236.getClass(), "start", -1002370457);
        setIntField(term22236, term22236.getClass(), "end", -2014576105);
        setIntField(term22236, term22236.getClass(), "bodyStart", 1296895584);
        setIntField(term22236, term22236.getClass(), "bodyEnd", 628918458);
        setField(term22236, term22236.getClass(), "fileOrUrl", "GISHLsgALf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isURL", argTypes, term22236, args);
    }

};


