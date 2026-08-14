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
     Object term22910;

    public Binding_isSynthetic_3968990259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22993 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term22992 = ((Class) term22993).getDeclaredField((String) "ATTRIBUTE");
        ((Field) term22992).setAccessible(true);
        Object enum68 = ((Field) term22992).get((Object) null);
        HashMap term22951 = new HashMap();
        Set<Object> term23241 =  ((Map) term22951).keySet();
        HashSet term22950 = new HashSet((Collection<? extends Object>) term23241);
        term22910 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term22910, term22910.getClass(), "isBuiltin", true);
        setBooleanField(term22910, term22910.getClass(), "isSynthetic", true);
        setField(term22910, term22910.getClass(), "name", "VAGkRppBem");
        setField(term22910, term22910.getClass(), "node", null);
        setField(term22910, term22910.getClass(), "qname", "eKcEJRxNSu");
        setField(term22910, term22910.getClass(), "type", null);
        setField(term22910, term22910.getClass(), "kind", enum68);
        setField(term22910, term22910.getClass(), "refs", term22950);
        setIntField(term22910, term22910.getClass(), "start", -1885090354);
        setIntField(term22910, term22910.getClass(), "end", -2066804303);
        setIntField(term22910, term22910.getClass(), "bodyStart", -1731761810);
        setIntField(term22910, term22910.getClass(), "bodyEnd", 197109649);
        setField(term22910, term22910.getClass(), "fileOrUrl", "NTXQPWFYSA");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSynthetic", argTypes, term22910, args);
    }

};


