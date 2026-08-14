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
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class PrimType_getInstance_14482105036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58946;

    public PrimType_getInstance_14482105036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term58948 = new ArrayList();
        ((ArrayList) term58948).add((Object)null);
        ((ArrayList) term58948).add((Object)null);
        HashMap term58954 = new HashMap();
        Set<Object> term59032 =  ((Map) term58954).keySet();
        HashSet term58953 = new HashSet((Collection<? extends Object>) term59032);
        HashMap term58959 = new HashMap();
        HashSet term58965 = new HashSet();
        HashMap term58966 = new HashMap();
        ArrayList term58973 = new ArrayList();
        HashSet term58976 = new HashSet();
        Class<? extends Object> term59034 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term59033 = ((Class) term59034).getDeclaredField((String) "STRUCT");
        ((Field) term59033).setAccessible(true);
        Object enum198 = ((Field) term59033).get((Object) null);
        ArrayList term58979 = new ArrayList();
        HashMap term58984 = new HashMap();
        Set<Object> term59288 =  ((Map) term58984).keySet();
        HashSet term58983 = new HashSet((Collection<? extends Object>) term59288);
        Class<? extends Object> term59290 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term59289 = ((Class) term59290).getDeclaredField((String) "GLOBAL");
        ((Field) term59289).setAccessible(true);
        Object enum199 = ((Field) term59289).get((Object) null);
        ArrayList term59016 = new ArrayList();
        ((ArrayList) term59016).add((Object)null);
        ((ArrayList) term59016).add((Object)null);
        ((ArrayList) term59016).add((Object)null);
        ((ArrayList) term59016).add((Object)null);
        ((ArrayList) term59016).add((Object)null);
        ((ArrayList) term59016).add((Object)null);
        ((ArrayList) term59016).add((Object)null);
        ((ArrayList) term59016).add((Object)null);
        term58946 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term58947 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term58952 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term58964 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term58971 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term58972 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term58947, term58947.getClass(), "ctype", null);
        setField(term58947, term58947.getClass(), "params", term58948);
        setField(term58952, term58952.getClass(), "globalNames", term58953);
        setField(term58952, term58952.getClass(), "table", term58959);
        setField(term58964, term58964.getClass(), "globalNames", term58965);
        setField(term58964, term58964.getClass(), "table", term58966);
        setField(term58971, term58971.getClass(), "globalNames", null);
        setField(term58971, term58971.getClass(), "table", null);
        setField(term58971, term58971.getClass(), "parent", null);
        setField(term58971, term58971.getClass(), "forwarding", null);
        setField(term58971, term58971.getClass(), "supers", null);
        setField(term58971, term58971.getClass(), "globalSymbols", null);
        setField(term58971, term58971.getClass(), "stateType", null);
        setField(term58971, term58971.getClass(), "type", null);
        setField(term58971, term58971.getClass(), "path", null);
        setField(term58964, term58964.getClass(), "parent", term58971);
        setField(term58972, term58972.getClass(), "globalNames", null);
        setField(term58972, term58972.getClass(), "table", null);
        setField(term58972, term58972.getClass(), "parent", null);
        setField(term58972, term58972.getClass(), "forwarding", null);
        setField(term58972, term58972.getClass(), "supers", null);
        setField(term58972, term58972.getClass(), "globalSymbols", null);
        setField(term58972, term58972.getClass(), "stateType", null);
        setField(term58972, term58972.getClass(), "type", null);
        setField(term58972, term58972.getClass(), "path", null);
        setField(term58964, term58964.getClass(), "forwarding", term58972);
        setField(term58964, term58964.getClass(), "supers", term58973);
        setField(term58964, term58964.getClass(), "globalSymbols", term58976);
        setField(term58964, term58964.getClass(), "stateType", enum198);
        setField(term58964, term58964.getClass(), "type", null);
        setField(term58964, term58964.getClass(), "path", null);
        setField(term58952, term58952.getClass(), "parent", term58964);
        setField(term58952, term58952.getClass(), "forwarding", term58972);
        setField(term58952, term58952.getClass(), "supers", term58979);
        setField(term58952, term58952.getClass(), "globalSymbols", term58983);
        setField(term58952, term58952.getClass(), "stateType", enum199);
        setField(term58952, term58952.getClass(), "type", null);
        setField(term58952, term58952.getClass(), "path", null);
        setField(term58947, term58947.getClass(), "table", term58952);
        setField(term58947, term58947.getClass(), "file", "LSrqDVjzEP");
        setField(term58946, term58946.getClass(), "instance", term58947);
        setField(term58946, term58946.getClass(), "name", "CPZCLJxTuA");
        setField(term58946, term58946.getClass(), "baseType", term59016);
        setField(term58946, term58946.getClass(), "table", term58964);
        setField(term58946, term58946.getClass(), "file", "ivAOXnVjmg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstance", argTypes, term58946, args);
    }

};


