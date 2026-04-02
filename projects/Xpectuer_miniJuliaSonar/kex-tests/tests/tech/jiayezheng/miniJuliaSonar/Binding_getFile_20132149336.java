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

public class Binding_getFile_20132149336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21901;

    public Binding_getFile_20132149336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21983 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term21982 = ((Class) term21983).getDeclaredField((String) "SCOPE");
        ((Field) term21982).setAccessible(true);
        Object enum65 = ((Field) term21982).get((Object) null);
        HashMap term21938 = new HashMap();
        Set<Object> term22219 =  ((Map) term21938).keySet();
        HashSet term21937 = new HashSet((Collection<? extends Object>) term22219);
        term21901 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term21901, term21901.getClass(), "isBuiltin", true);
        setBooleanField(term21901, term21901.getClass(), "isSynthetic", true);
        setField(term21901, term21901.getClass(), "name", "cfRimmJxqA");
        setField(term21901, term21901.getClass(), "node", null);
        setField(term21901, term21901.getClass(), "qname", "oOnRVGqFmy");
        setField(term21901, term21901.getClass(), "type", null);
        setField(term21901, term21901.getClass(), "kind", enum65);
        setField(term21901, term21901.getClass(), "refs", term21937);
        setIntField(term21901, term21901.getClass(), "start", 229204365);
        setIntField(term21901, term21901.getClass(), "end", -461771056);
        setIntField(term21901, term21901.getClass(), "bodyStart", -243422082);
        setIntField(term21901, term21901.getClass(), "bodyEnd", 1384592638);
        setField(term21901, term21901.getClass(), "fileOrUrl", "LaXzFIlWMk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFile", argTypes, term21901, args);
    }

};


