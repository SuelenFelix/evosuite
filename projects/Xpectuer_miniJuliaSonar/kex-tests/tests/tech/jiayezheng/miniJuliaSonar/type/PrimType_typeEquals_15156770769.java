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

public class PrimType_typeEquals_15156770769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61119;
     Object term61216;

    public PrimType_typeEquals_15156770769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term61121 = new ArrayList();
        ((ArrayList) term61121).add((Object)null);
        ((ArrayList) term61121).add((Object)null);
        ((ArrayList) term61121).add((Object)null);
        ((ArrayList) term61121).add((Object)null);
        ((ArrayList) term61121).add((Object)null);
        ((ArrayList) term61121).add((Object)null);
        ((ArrayList) term61121).add((Object)null);
        ((ArrayList) term61121).add((Object)null);
        HashMap term61127 = new HashMap();
        Set<Object> term61217 =  ((Map) term61127).keySet();
        HashSet term61126 = new HashSet((Collection<? extends Object>) term61217);
        HashMap term61132 = new HashMap();
        HashSet term61138 = new HashSet();
        HashMap term61139 = new HashMap();
        ArrayList term61146 = new ArrayList();
        ((ArrayList) term61146).add((Object)null);
        ((ArrayList) term61146).add((Object)null);
        ((ArrayList) term61146).add((Object)null);
        ((ArrayList) term61146).add((Object)null);
        ((ArrayList) term61146).add((Object)null);
        ((ArrayList) term61146).add((Object)null);
        ((ArrayList) term61146).add((Object)null);
        HashSet term61149 = new HashSet();
        Class<? extends Object> term61219 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term61218 = ((Class) term61219).getDeclaredField((String) "MODULE");
        ((Field) term61218).setAccessible(true);
        Object enum205 = ((Field) term61218).get((Object) null);
        HashSet term61153 = new HashSet();
        HashMap term61154 = new HashMap();
        ArrayList term61160 = new ArrayList();
        ((ArrayList) term61160).add((Object)null);
        ((ArrayList) term61160).add((Object)null);
        ((ArrayList) term61160).add((Object)null);
        ((ArrayList) term61160).add((Object)null);
        ((ArrayList) term61160).add((Object)null);
        ((ArrayList) term61160).add((Object)null);
        ((ArrayList) term61160).add((Object)null);
        ((ArrayList) term61160).add((Object)null);
        ((ArrayList) term61160).add((Object)null);
        HashSet term61163 = new HashSet();
        Class<? extends Object> term61474 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term61473 = ((Class) term61474).getDeclaredField((String) "STRUCT");
        ((Field) term61473).setAccessible(true);
        Object enum206 = ((Field) term61473).get((Object) null);
        ArrayList term61166 = new ArrayList();
        ((ArrayList) term61166).add((Object)null);
        ((ArrayList) term61166).add((Object)null);
        HashMap term61171 = new HashMap();
        Set<Object> term61728 =  ((Map) term61171).keySet();
        HashSet term61170 = new HashSet((Collection<? extends Object>) term61728);
        ArrayList term61200 = new ArrayList();
        ((ArrayList) term61200).add((Object)null);
        ((ArrayList) term61200).add((Object)null);
        ((ArrayList) term61200).add((Object)null);
        ((ArrayList) term61200).add((Object)null);
        ((ArrayList) term61200).add((Object)null);
        ((ArrayList) term61200).add((Object)null);
        ((ArrayList) term61200).add((Object)null);
        ((ArrayList) term61200).add((Object)null);
        term61119 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term61120 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term61125 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term61137 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term61144 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term61145 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term61152 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term61159 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term61120, term61120.getClass(), "ctype", null);
        setField(term61120, term61120.getClass(), "params", term61121);
        setField(term61125, term61125.getClass(), "globalNames", term61126);
        setField(term61125, term61125.getClass(), "table", term61132);
        setField(term61137, term61137.getClass(), "globalNames", term61138);
        setField(term61137, term61137.getClass(), "table", term61139);
        setField(term61144, term61144.getClass(), "globalNames", null);
        setField(term61144, term61144.getClass(), "table", null);
        setField(term61144, term61144.getClass(), "parent", null);
        setField(term61144, term61144.getClass(), "forwarding", null);
        setField(term61144, term61144.getClass(), "supers", null);
        setField(term61144, term61144.getClass(), "globalSymbols", null);
        setField(term61144, term61144.getClass(), "stateType", null);
        setField(term61144, term61144.getClass(), "type", null);
        setField(term61144, term61144.getClass(), "path", null);
        setField(term61137, term61137.getClass(), "parent", term61144);
        setField(term61145, term61145.getClass(), "globalNames", null);
        setField(term61145, term61145.getClass(), "table", null);
        setField(term61145, term61145.getClass(), "parent", null);
        setField(term61145, term61145.getClass(), "forwarding", null);
        setField(term61145, term61145.getClass(), "supers", null);
        setField(term61145, term61145.getClass(), "globalSymbols", null);
        setField(term61145, term61145.getClass(), "stateType", null);
        setField(term61145, term61145.getClass(), "type", null);
        setField(term61145, term61145.getClass(), "path", null);
        setField(term61137, term61137.getClass(), "forwarding", term61145);
        setField(term61137, term61137.getClass(), "supers", term61146);
        setField(term61137, term61137.getClass(), "globalSymbols", term61149);
        setField(term61137, term61137.getClass(), "stateType", enum205);
        setField(term61137, term61137.getClass(), "type", null);
        setField(term61137, term61137.getClass(), "path", null);
        setField(term61125, term61125.getClass(), "parent", term61137);
        setField(term61152, term61152.getClass(), "globalNames", term61153);
        setField(term61152, term61152.getClass(), "table", term61154);
        setField(term61159, term61159.getClass(), "globalNames", null);
        setField(term61159, term61159.getClass(), "table", null);
        setField(term61159, term61159.getClass(), "parent", null);
        setField(term61159, term61159.getClass(), "forwarding", term61145);
        setField(term61159, term61159.getClass(), "supers", null);
        setField(term61159, term61159.getClass(), "globalSymbols", null);
        setField(term61159, term61159.getClass(), "stateType", null);
        setField(term61159, term61159.getClass(), "type", null);
        setField(term61159, term61159.getClass(), "path", null);
        setField(term61152, term61152.getClass(), "parent", term61159);
        setField(term61152, term61152.getClass(), "forwarding", term61125);
        setField(term61152, term61152.getClass(), "supers", term61160);
        setField(term61152, term61152.getClass(), "globalSymbols", term61163);
        setField(term61152, term61152.getClass(), "stateType", enum206);
        setField(term61152, term61152.getClass(), "type", null);
        setField(term61152, term61152.getClass(), "path", null);
        setField(term61125, term61125.getClass(), "forwarding", term61152);
        setField(term61125, term61125.getClass(), "supers", term61166);
        setField(term61125, term61125.getClass(), "globalSymbols", term61170);
        setField(term61125, term61125.getClass(), "stateType", enum205);
        setField(term61125, term61125.getClass(), "type", null);
        setField(term61125, term61125.getClass(), "path", null);
        setField(term61120, term61120.getClass(), "table", term61125);
        setField(term61120, term61120.getClass(), "file", "RbXhBDZbRT");
        setField(term61119, term61119.getClass(), "instance", term61120);
        setField(term61119, term61119.getClass(), "name", "QDaTqkWnGj");
        setField(term61119, term61119.getClass(), "baseType", term61200);
        setField(term61119, term61119.getClass(), "table", term61137);
        setField(term61119, term61119.getClass(), "file", "vNObzQvzxo");
        term61216 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61216;
        callMethod(klass, "typeEquals", argTypes, term61119, args);
    }

};


