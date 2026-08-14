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
import java.util.ArrayList;
import java.lang.Object;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class StructType_printType_183163340511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72455;
     Object term72530;

    public StructType_printType_183163340511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term72456 = new HashMap();
        ArrayList term72478 = new ArrayList();
        ((ArrayList) term72478).add((Object)null);
        ((ArrayList) term72478).add((Object)null);
        ((ArrayList) term72478).add((Object)null);
        ((ArrayList) term72478).add((Object)null);
        ((ArrayList) term72478).add((Object)null);
        HashMap term72484 = new HashMap();
        Set<Object> term72556 =  ((Map) term72484).keySet();
        HashSet term72483 = new HashSet((Collection<? extends Object>) term72556);
        HashMap term72490 = new HashMap();
        ArrayList term72497 = new ArrayList();
        HashMap term72502 = new HashMap();
        Set<Object> term72557 =  ((Map) term72502).keySet();
        HashSet term72501 = new HashSet((Collection<? extends Object>) term72557);
        Class<? extends Object> term72559 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term72558 = ((Class) term72559).getDeclaredField((String) "STRUCT");
        ((Field) term72558).setAccessible(true);
        Object enum241 = ((Field) term72558).get((Object) null);
        term72455 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType"));
        Object term72482 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term72495 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term72496 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term72455, term72455.getClass(), "instances", term72456);
        setField(term72455, term72455.getClass(), "name", "gyLdvdOJQs");
        setField(term72455, term72455.getClass(), "baseType", term72478);
        setField(term72482, term72482.getClass(), "globalNames", term72483);
        setField(term72482, term72482.getClass(), "table", term72490);
        setField(term72495, term72495.getClass(), "globalNames", null);
        setField(term72495, term72495.getClass(), "table", null);
        setField(term72495, term72495.getClass(), "parent", null);
        setField(term72495, term72495.getClass(), "forwarding", null);
        setField(term72495, term72495.getClass(), "supers", null);
        setField(term72495, term72495.getClass(), "globalSymbols", null);
        setField(term72495, term72495.getClass(), "stateType", null);
        setField(term72495, term72495.getClass(), "type", null);
        setField(term72495, term72495.getClass(), "path", null);
        setField(term72482, term72482.getClass(), "parent", term72495);
        setField(term72496, term72496.getClass(), "globalNames", null);
        setField(term72496, term72496.getClass(), "table", null);
        setField(term72496, term72496.getClass(), "parent", null);
        setField(term72496, term72496.getClass(), "forwarding", null);
        setField(term72496, term72496.getClass(), "supers", null);
        setField(term72496, term72496.getClass(), "globalSymbols", null);
        setField(term72496, term72496.getClass(), "stateType", null);
        setField(term72496, term72496.getClass(), "type", null);
        setField(term72496, term72496.getClass(), "path", null);
        setField(term72482, term72482.getClass(), "forwarding", term72496);
        setField(term72482, term72482.getClass(), "supers", term72497);
        setField(term72482, term72482.getClass(), "globalSymbols", term72501);
        setField(term72482, term72482.getClass(), "stateType", enum241);
        setField(term72482, term72482.getClass(), "type", null);
        setField(term72482, term72482.getClass(), "path", null);
        setField(term72455, term72455.getClass(), "table", term72482);
        setField(term72455, term72455.getClass(), "file", "PASAYkwcOc");
        HashMap term72532 = new HashMap();
        HashMap term72538 = new HashMap();
        Set<Object> term72823 =  ((Map) term72538).keySet();
        HashSet term72537 = new HashSet((Collection<? extends Object>) term72823);
        term72530 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder"));
        setIntField(term72530, term72530.getClass(), "count", -2015048153);
        setField(term72530, term72530.getClass(), "elements", term72532);
        setField(term72530, term72530.getClass(), "used", term72537);
        setField(term72530, term72530.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder");
        Object[] args = new Object[1];
        args[0] = term72530;
        callMethod(klass, "printType", argTypes, term72455, args);
    }

};


