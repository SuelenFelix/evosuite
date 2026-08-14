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

public class UnionType_printType_170997123311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55304;
     Object term55341;

    public UnionType_printType_170997123311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term55306 = new HashMap();
        Set<Object> term55357 =  ((Map) term55306).keySet();
        HashSet term55305 = new HashSet((Collection<? extends Object>) term55357);
        HashMap term55312 = new HashMap();
        Class<? extends Object> term55359 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term55358 = ((Class) term55359).getDeclaredField((String) "GLOBAL");
        ((Field) term55358).setAccessible(true);
        Object enum186 = ((Field) term55358).get((Object) null);
        term55304 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType"));
        Object term55311 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term55304, term55304.getClass(), "types", term55305);
        setField(term55311, term55311.getClass(), "globalNames", null);
        setField(term55311, term55311.getClass(), "table", term55312);
        setField(term55311, term55311.getClass(), "parent", null);
        setField(term55311, term55311.getClass(), "forwarding", term55311);
        setField(term55311, term55311.getClass(), "supers", null);
        setField(term55311, term55311.getClass(), "globalSymbols", null);
        setField(term55311, term55311.getClass(), "stateType", enum186);
        setField(term55311, term55311.getClass(), "type", null);
        setField(term55311, term55311.getClass(), "path", "");
        setField(term55304, term55304.getClass(), "table", term55311);
        setField(term55304, term55304.getClass(), "file", "hHNIOlOzJc");
        HashMap term55343 = new HashMap();
        HashMap term55349 = new HashMap();
        Set<Object> term55623 =  ((Map) term55349).keySet();
        HashSet term55348 = new HashSet((Collection<? extends Object>) term55623);
        term55341 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder"));
        setIntField(term55341, term55341.getClass(), "count", -343325701);
        setField(term55341, term55341.getClass(), "elements", term55343);
        setField(term55341, term55341.getClass(), "used", term55348);
        setField(term55341, term55341.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.UnionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder");
        Object[] args = new Object[1];
        args[0] = term55341;
        callMethod(klass, "printType", argTypes, term55304, args);
    }

};


