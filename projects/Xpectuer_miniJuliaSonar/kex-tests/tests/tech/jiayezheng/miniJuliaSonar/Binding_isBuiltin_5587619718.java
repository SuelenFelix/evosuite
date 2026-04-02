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

public class Binding_isBuiltin_5587619718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22559;

    public Binding_isBuiltin_5587619718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22645 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term22644 = ((Class) term22645).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term22644).setAccessible(true);
        Object enum67 = ((Field) term22644).get((Object) null);
        HashMap term22600 = new HashMap();
        Set<Object> term22893 =  ((Map) term22600).keySet();
        HashSet term22599 = new HashSet((Collection<? extends Object>) term22893);
        term22559 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term22559, term22559.getClass(), "isBuiltin", true);
        setBooleanField(term22559, term22559.getClass(), "isSynthetic", true);
        setField(term22559, term22559.getClass(), "name", "PVykkUSgBq");
        setField(term22559, term22559.getClass(), "node", null);
        setField(term22559, term22559.getClass(), "qname", "tnKbZaCsuj");
        setField(term22559, term22559.getClass(), "type", null);
        setField(term22559, term22559.getClass(), "kind", enum67);
        setField(term22559, term22559.getClass(), "refs", term22599);
        setIntField(term22559, term22559.getClass(), "start", -1274456137);
        setIntField(term22559, term22559.getClass(), "end", 1041916673);
        setIntField(term22559, term22559.getClass(), "bodyStart", -601863069);
        setIntField(term22559, term22559.getClass(), "bodyEnd", 663292551);
        setField(term22559, term22559.getClass(), "fileOrUrl", "ZFpcYBgLNC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBuiltin", argTypes, term22559, args);
    }

};


