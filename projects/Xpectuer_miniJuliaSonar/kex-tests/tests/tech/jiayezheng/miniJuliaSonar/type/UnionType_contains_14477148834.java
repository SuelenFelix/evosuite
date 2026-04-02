package tech.jiayezheng.miniJuliaSonar.type;

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
import static tech.jiayezheng.miniJuliaSonar.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class UnionType_contains_14477148834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54392;

    public UnionType_contains_14477148834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term54394 = new HashMap();
        Set<Object> term54429 =  ((Map) term54394).keySet();
        HashSet term54393 = new HashSet((Collection<? extends Object>) term54429);
        HashMap term54400 = new HashMap();
        Class<? extends Object> term54431 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term54430 = ((Class) term54431).getDeclaredField((String) "GLOBAL");
        ((Field) term54430).setAccessible(true);
        Object enum183 = ((Field) term54430).get((Object) null);
        term54392 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType"));
        Object term54399 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term54392, term54392.getClass(), "types", term54393);
        setField(term54399, term54399.getClass(), "globalNames", null);
        setField(term54399, term54399.getClass(), "table", term54400);
        setField(term54399, term54399.getClass(), "parent", null);
        setField(term54399, term54399.getClass(), "forwarding", term54399);
        setField(term54399, term54399.getClass(), "supers", null);
        setField(term54399, term54399.getClass(), "globalSymbols", null);
        setField(term54399, term54399.getClass(), "stateType", enum183);
        setField(term54399, term54399.getClass(), "type", null);
        setField(term54399, term54399.getClass(), "path", "");
        setField(term54392, term54392.getClass(), "table", term54399);
        setField(term54392, term54392.getClass(), "file", "NeEetzFhTt");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "contains", argTypes, term54392, args);
    }

};


