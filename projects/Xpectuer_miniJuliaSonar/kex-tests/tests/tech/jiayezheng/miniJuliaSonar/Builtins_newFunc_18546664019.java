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
import java.util.HashMap;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.String;

public class Builtins_newFunc_18546664019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11709;

    public Builtins_newFunc_18546664019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term11710 = new HashMap();
        ArrayList term11721 = new ArrayList();
        ((ArrayList) term11721).add((Object)null);
        ((ArrayList) term11721).add((Object)null);
        ((ArrayList) term11721).add((Object)null);
        ((ArrayList) term11721).add((Object)null);
        ((ArrayList) term11721).add((Object)null);
        ((ArrayList) term11721).add((Object)null);
        ((ArrayList) term11721).add((Object)null);
        ((ArrayList) term11721).add((Object)null);
        HashSet term11726 = new HashSet();
        HashMap term11727 = new HashMap();
        ArrayList term11734 = new ArrayList();
        ((ArrayList) term11734).add((Object)null);
        ((ArrayList) term11734).add((Object)null);
        ((ArrayList) term11734).add((Object)null);
        ((ArrayList) term11734).add((Object)null);
        ((ArrayList) term11734).add((Object)null);
        ((ArrayList) term11734).add((Object)null);
        ((ArrayList) term11734).add((Object)null);
        HashSet term11737 = new HashSet();
        Class<? extends Object> term11818 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term11817 = ((Class) term11818).getDeclaredField((String) "INSTANCE");
        ((Field) term11817).setAccessible(true);
        Object enum34 = ((Field) term11817).get((Object) null);
        ArrayList term11764 = new ArrayList();
        ((ArrayList) term11764).add((Object)null);
        ((ArrayList) term11764).add((Object)null);
        ((ArrayList) term11764).add((Object)null);
        ((ArrayList) term11764).add((Object)null);
        ((ArrayList) term11764).add((Object)null);
        ArrayList term11795 = new ArrayList();
        ((ArrayList) term11795).add((Object)null);
        ((ArrayList) term11795).add((Object)null);
        ((ArrayList) term11795).add((Object)null);
        ((ArrayList) term11795).add((Object)null);
        ((ArrayList) term11795).add((Object)null);
        ((ArrayList) term11795).add((Object)null);
        ((ArrayList) term11795).add((Object)null);
        ((ArrayList) term11795).add((Object)null);
        ((ArrayList) term11795).add((Object)null);
        term11709 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        Object term11719 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11720 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term11725 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11732 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11733 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11768 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11781 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11782 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term11799 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term11812 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term11813 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11814 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11815 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term11816 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        setField(term11709, term11709.getClass(), "modules", term11710);
        setField(term11720, term11720.getClass(), "ctype", null);
        setField(term11720, term11720.getClass(), "params", term11721);
        setField(term11725, term11725.getClass(), "globalNames", term11726);
        setField(term11725, term11725.getClass(), "table", term11727);
        setField(term11732, term11732.getClass(), "globalNames", null);
        setField(term11732, term11732.getClass(), "table", null);
        setField(term11732, term11732.getClass(), "parent", null);
        setField(term11732, term11732.getClass(), "forwarding", null);
        setField(term11732, term11732.getClass(), "supers", null);
        setField(term11732, term11732.getClass(), "globalSymbols", null);
        setField(term11732, term11732.getClass(), "stateType", null);
        setField(term11732, term11732.getClass(), "type", null);
        setField(term11732, term11732.getClass(), "path", null);
        setField(term11725, term11725.getClass(), "parent", term11732);
        setField(term11733, term11733.getClass(), "globalNames", null);
        setField(term11733, term11733.getClass(), "table", null);
        setField(term11733, term11733.getClass(), "parent", null);
        setField(term11733, term11733.getClass(), "forwarding", null);
        setField(term11733, term11733.getClass(), "supers", null);
        setField(term11733, term11733.getClass(), "globalSymbols", null);
        setField(term11733, term11733.getClass(), "stateType", null);
        setField(term11733, term11733.getClass(), "type", null);
        setField(term11733, term11733.getClass(), "path", null);
        setField(term11725, term11725.getClass(), "forwarding", term11733);
        setField(term11725, term11725.getClass(), "supers", term11734);
        setField(term11725, term11725.getClass(), "globalSymbols", term11737);
        setField(term11725, term11725.getClass(), "stateType", enum34);
        setField(term11725, term11725.getClass(), "type", null);
        setField(term11725, term11725.getClass(), "path", null);
        setField(term11720, term11720.getClass(), "table", term11725);
        setField(term11720, term11720.getClass(), "file", "PNzNzzjSXM");
        setField(term11719, term11719.getClass(), "instance", term11720);
        setField(term11719, term11719.getClass(), "name", "ktKcSZiuGM");
        setField(term11719, term11719.getClass(), "baseType", term11764);
        setField(term11768, term11768.getClass(), "globalNames", null);
        setField(term11768, term11768.getClass(), "table", null);
        setField(term11768, term11768.getClass(), "parent", null);
        setField(term11768, term11768.getClass(), "forwarding", null);
        setField(term11768, term11768.getClass(), "supers", null);
        setField(term11768, term11768.getClass(), "globalSymbols", null);
        setField(term11768, term11768.getClass(), "stateType", null);
        setField(term11768, term11768.getClass(), "type", null);
        setField(term11768, term11768.getClass(), "path", null);
        setField(term11719, term11719.getClass(), "table", term11768);
        setField(term11719, term11719.getClass(), "file", "PSOttyUeqv");
        setField(term11709, term11709.getClass(), "BaseModule", term11719);
        setField(term11782, term11782.getClass(), "ctype", null);
        setField(term11782, term11782.getClass(), "params", null);
        setField(term11782, term11782.getClass(), "table", null);
        setField(term11782, term11782.getClass(), "file", null);
        setField(term11781, term11781.getClass(), "instance", term11782);
        setField(term11781, term11781.getClass(), "name", "HmEvTlmzXo");
        setField(term11781, term11781.getClass(), "baseType", term11795);
        setField(term11799, term11799.getClass(), "globalNames", null);
        setField(term11799, term11799.getClass(), "table", null);
        setField(term11799, term11799.getClass(), "parent", null);
        setField(term11799, term11799.getClass(), "forwarding", null);
        setField(term11799, term11799.getClass(), "supers", null);
        setField(term11799, term11799.getClass(), "globalSymbols", null);
        setField(term11799, term11799.getClass(), "stateType", null);
        setField(term11799, term11799.getClass(), "type", null);
        setField(term11799, term11799.getClass(), "path", null);
        setField(term11781, term11781.getClass(), "table", term11799);
        setField(term11781, term11781.getClass(), "file", "BMMonTIZgJ");
        setField(term11709, term11709.getClass(), "BaseVector", term11781);
        setField(term11812, term11812.getClass(), "ctype", null);
        setField(term11812, term11812.getClass(), "params", null);
        setField(term11812, term11812.getClass(), "table", null);
        setField(term11812, term11812.getClass(), "file", null);
        setField(term11709, term11709.getClass(), "BaseVectorInst", term11812);
        setField(term11813, term11813.getClass(), "instance", null);
        setField(term11813, term11813.getClass(), "name", null);
        setField(term11813, term11813.getClass(), "baseType", null);
        setField(term11813, term11813.getClass(), "table", null);
        setField(term11813, term11813.getClass(), "file", null);
        setField(term11709, term11709.getClass(), "BaseDict", term11813);
        setField(term11814, term11814.getClass(), "instance", null);
        setField(term11814, term11814.getClass(), "name", null);
        setField(term11814, term11814.getClass(), "baseType", null);
        setField(term11814, term11814.getClass(), "table", null);
        setField(term11814, term11814.getClass(), "file", null);
        setField(term11709, term11709.getClass(), "BaseTuple", term11814);
        setField(term11815, term11815.getClass(), "instance", null);
        setField(term11815, term11815.getClass(), "name", null);
        setField(term11815, term11815.getClass(), "baseType", null);
        setField(term11815, term11815.getClass(), "table", null);
        setField(term11815, term11815.getClass(), "file", null);
        setField(term11709, term11709.getClass(), "BaseStruct", term11815);
        setField(term11816, term11816.getClass(), "instance", null);
        setField(term11816, term11816.getClass(), "name", null);
        setField(term11816, term11816.getClass(), "baseType", null);
        setField(term11816, term11816.getClass(), "table", null);
        setField(term11816, term11816.getClass(), "file", null);
        setField(term11709, term11709.getClass(), "BaseFunction", term11816);
        setField(term11709, term11709.getClass(), "BasePair", null);
        setField(term11709, term11709.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "newFunc", argTypes, term11709, args);
    }

};


