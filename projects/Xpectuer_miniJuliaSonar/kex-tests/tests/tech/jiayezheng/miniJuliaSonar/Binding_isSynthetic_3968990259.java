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

public class Binding_isSynthetic_3968990259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22904;

    public Binding_isSynthetic_3968990259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22987 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term22986 = ((Class) term22987).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term22986).setAccessible(true);
        Object enum68 = ((Field) term22986).get((Object) null);
        HashMap term22945 = new HashMap();
        Set<Object> term23235 =  ((Map) term22945).keySet();
        HashSet term22944 = new HashSet((Collection<? extends Object>) term23235);
        term22904 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term22904, term22904.getClass(), "isBuiltin", true);
        setBooleanField(term22904, term22904.getClass(), "isSynthetic", true);
        setField(term22904, term22904.getClass(), "name", "VAGkRppBem");
        setField(term22904, term22904.getClass(), "node", null);
        setField(term22904, term22904.getClass(), "qname", "eKcEJRxNSu");
        setField(term22904, term22904.getClass(), "type", null);
        setField(term22904, term22904.getClass(), "kind", enum68);
        setField(term22904, term22904.getClass(), "refs", term22944);
        setIntField(term22904, term22904.getClass(), "start", -1885090354);
        setIntField(term22904, term22904.getClass(), "end", -2066804303);
        setIntField(term22904, term22904.getClass(), "bodyStart", -1731761810);
        setIntField(term22904, term22904.getClass(), "bodyEnd", 197109649);
        setField(term22904, term22904.getClass(), "fileOrUrl", "NTXQPWFYSA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSynthetic", argTypes, term22904, args);
    }

};


