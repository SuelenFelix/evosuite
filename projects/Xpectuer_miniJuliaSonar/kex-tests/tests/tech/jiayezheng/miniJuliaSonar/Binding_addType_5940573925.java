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

public class Binding_addType_5940573925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21574;

    public Binding_addType_5940573925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21657 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term21656 = ((Class) term21657).getDeclaredField((String) "MODULE");
        ((Field) term21656).setAccessible(true);
        Object enum64 = ((Field) term21656).get((Object) null);
        HashMap term21612 = new HashMap();
        Set<Object> term21896 =  ((Map) term21612).keySet();
        HashSet term21611 = new HashSet((Collection<? extends Object>) term21896);
        term21574 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term21574, term21574.getClass(), "isBuiltin", true);
        setBooleanField(term21574, term21574.getClass(), "isSynthetic", true);
        setField(term21574, term21574.getClass(), "name", "XmLHcnVsch");
        setField(term21574, term21574.getClass(), "node", null);
        setField(term21574, term21574.getClass(), "qname", "Yrvtdcltri");
        setField(term21574, term21574.getClass(), "type", null);
        setField(term21574, term21574.getClass(), "kind", enum64);
        setField(term21574, term21574.getClass(), "refs", term21611);
        setIntField(term21574, term21574.getClass(), "start", 1953277050);
        setIntField(term21574, term21574.getClass(), "end", 1283079251);
        setIntField(term21574, term21574.getClass(), "bodyStart", -523949691);
        setIntField(term21574, term21574.getClass(), "bodyEnd", 1398204340);
        setField(term21574, term21574.getClass(), "fileOrUrl", "RxrsjXRVcT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "addType", argTypes, term21574, args);
    }

};


