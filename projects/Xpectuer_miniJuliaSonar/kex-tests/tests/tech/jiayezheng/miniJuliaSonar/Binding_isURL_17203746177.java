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
     Object term22230;

    public Binding_isURL_17203746177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22312 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term22311 = ((Class) term22312).getDeclaredField((String) "SCOPE");
        ((Field) term22311).setAccessible(true);
        Object enum66 = ((Field) term22311).get((Object) null);
        HashMap term22267 = new HashMap();
        Set<Object> term22548 =  ((Map) term22267).keySet();
        HashSet term22266 = new HashSet((Collection<? extends Object>) term22548);
        term22230 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term22230, term22230.getClass(), "isBuiltin", true);
        setBooleanField(term22230, term22230.getClass(), "isSynthetic", false);
        setField(term22230, term22230.getClass(), "name", "GuVQjhBxma");
        setField(term22230, term22230.getClass(), "node", null);
        setField(term22230, term22230.getClass(), "qname", "WAVMPPbIfL");
        setField(term22230, term22230.getClass(), "type", null);
        setField(term22230, term22230.getClass(), "kind", enum66);
        setField(term22230, term22230.getClass(), "refs", term22266);
        setIntField(term22230, term22230.getClass(), "start", -1002370457);
        setIntField(term22230, term22230.getClass(), "end", -2014576105);
        setIntField(term22230, term22230.getClass(), "bodyStart", 1296895584);
        setIntField(term22230, term22230.getClass(), "bodyEnd", 628918458);
        setField(term22230, term22230.getClass(), "fileOrUrl", "GISHLsgALf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isURL", argTypes, term22230, args);
    }

};


