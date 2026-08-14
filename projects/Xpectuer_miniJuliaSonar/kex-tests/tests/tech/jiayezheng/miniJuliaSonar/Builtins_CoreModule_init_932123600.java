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

public class Builtins_CoreModule_init_932123600 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221720;

    public Builtins_CoreModule_init_932123600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term221721 = new HashMap();
        ArrayList term221732 = new ArrayList();
        ((ArrayList) term221732).add((Object)null);
        ((ArrayList) term221732).add((Object)null);
        ((ArrayList) term221732).add((Object)null);
        ((ArrayList) term221732).add((Object)null);
        ((ArrayList) term221732).add((Object)null);
        ((ArrayList) term221732).add((Object)null);
        ((ArrayList) term221732).add((Object)null);
        ((ArrayList) term221732).add((Object)null);
        HashSet term221737 = new HashSet();
        HashMap term221738 = new HashMap();
        ArrayList term221745 = new ArrayList();
        ((ArrayList) term221745).add((Object)null);
        ((ArrayList) term221745).add((Object)null);
        ((ArrayList) term221745).add((Object)null);
        ((ArrayList) term221745).add((Object)null);
        ((ArrayList) term221745).add((Object)null);
        ((ArrayList) term221745).add((Object)null);
        ((ArrayList) term221745).add((Object)null);
        ((ArrayList) term221745).add((Object)null);
        HashSet term221748 = new HashSet();
        Class<? extends Object> term221828 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term221827 = ((Class) term221828).getDeclaredField((String) "MODULE");
        ((Field) term221827).setAccessible(true);
        Object enum725 = ((Field) term221827).get((Object) null);
        ArrayList term221775 = new ArrayList();
        ((ArrayList) term221775).add((Object)null);
        ((ArrayList) term221775).add((Object)null);
        ((ArrayList) term221775).add((Object)null);
        ((ArrayList) term221775).add((Object)null);
        ((ArrayList) term221775).add((Object)null);
        ((ArrayList) term221775).add((Object)null);
        ArrayList term221805 = new ArrayList();
        ((ArrayList) term221805).add((Object)null);
        ((ArrayList) term221805).add((Object)null);
        ((ArrayList) term221805).add((Object)null);
        ((ArrayList) term221805).add((Object)null);
        ((ArrayList) term221805).add((Object)null);
        term221720 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        Object term221730 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221731 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term221736 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term221743 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term221744 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term221791 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221792 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term221809 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term221822 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term221823 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221824 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221825 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221826 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        setField(term221720, term221720.getClass(), "modules", term221721);
        setField(term221731, term221731.getClass(), "ctype", null);
        setField(term221731, term221731.getClass(), "params", term221732);
        setField(term221736, term221736.getClass(), "globalNames", term221737);
        setField(term221736, term221736.getClass(), "table", term221738);
        setField(term221743, term221743.getClass(), "globalNames", null);
        setField(term221743, term221743.getClass(), "table", null);
        setField(term221743, term221743.getClass(), "parent", null);
        setField(term221743, term221743.getClass(), "forwarding", null);
        setField(term221743, term221743.getClass(), "supers", null);
        setField(term221743, term221743.getClass(), "globalSymbols", null);
        setField(term221743, term221743.getClass(), "stateType", null);
        setField(term221743, term221743.getClass(), "type", null);
        setField(term221743, term221743.getClass(), "path", null);
        setField(term221736, term221736.getClass(), "parent", term221743);
        setField(term221744, term221744.getClass(), "globalNames", null);
        setField(term221744, term221744.getClass(), "table", null);
        setField(term221744, term221744.getClass(), "parent", null);
        setField(term221744, term221744.getClass(), "forwarding", null);
        setField(term221744, term221744.getClass(), "supers", null);
        setField(term221744, term221744.getClass(), "globalSymbols", null);
        setField(term221744, term221744.getClass(), "stateType", null);
        setField(term221744, term221744.getClass(), "type", null);
        setField(term221744, term221744.getClass(), "path", null);
        setField(term221736, term221736.getClass(), "forwarding", term221744);
        setField(term221736, term221736.getClass(), "supers", term221745);
        setField(term221736, term221736.getClass(), "globalSymbols", term221748);
        setField(term221736, term221736.getClass(), "stateType", enum725);
        setField(term221736, term221736.getClass(), "type", null);
        setField(term221736, term221736.getClass(), "path", null);
        setField(term221731, term221731.getClass(), "table", term221736);
        setField(term221731, term221731.getClass(), "file", "KPKvkukffl");
        setField(term221730, term221730.getClass(), "instance", term221731);
        setField(term221730, term221730.getClass(), "name", "DztkzYmExj");
        setField(term221730, term221730.getClass(), "baseType", term221775);
        setField(term221730, term221730.getClass(), "table", term221744);
        setField(term221730, term221730.getClass(), "file", "jgLlnOSDbQ");
        setField(term221720, term221720.getClass(), "BaseModule", term221730);
        setField(term221792, term221792.getClass(), "ctype", null);
        setField(term221792, term221792.getClass(), "params", null);
        setField(term221792, term221792.getClass(), "table", null);
        setField(term221792, term221792.getClass(), "file", null);
        setField(term221791, term221791.getClass(), "instance", term221792);
        setField(term221791, term221791.getClass(), "name", "KJGZNumCAL");
        setField(term221791, term221791.getClass(), "baseType", term221805);
        setField(term221809, term221809.getClass(), "globalNames", null);
        setField(term221809, term221809.getClass(), "table", null);
        setField(term221809, term221809.getClass(), "parent", null);
        setField(term221809, term221809.getClass(), "forwarding", null);
        setField(term221809, term221809.getClass(), "supers", null);
        setField(term221809, term221809.getClass(), "globalSymbols", null);
        setField(term221809, term221809.getClass(), "stateType", null);
        setField(term221809, term221809.getClass(), "type", null);
        setField(term221809, term221809.getClass(), "path", null);
        setField(term221791, term221791.getClass(), "table", term221809);
        setField(term221791, term221791.getClass(), "file", "iBvRhpQbES");
        setField(term221720, term221720.getClass(), "BaseVector", term221791);
        setField(term221822, term221822.getClass(), "ctype", null);
        setField(term221822, term221822.getClass(), "params", null);
        setField(term221822, term221822.getClass(), "table", null);
        setField(term221822, term221822.getClass(), "file", null);
        setField(term221720, term221720.getClass(), "BaseVectorInst", term221822);
        setField(term221823, term221823.getClass(), "instance", null);
        setField(term221823, term221823.getClass(), "name", null);
        setField(term221823, term221823.getClass(), "baseType", null);
        setField(term221823, term221823.getClass(), "table", null);
        setField(term221823, term221823.getClass(), "file", null);
        setField(term221720, term221720.getClass(), "BaseDict", term221823);
        setField(term221824, term221824.getClass(), "instance", null);
        setField(term221824, term221824.getClass(), "name", null);
        setField(term221824, term221824.getClass(), "baseType", null);
        setField(term221824, term221824.getClass(), "table", null);
        setField(term221824, term221824.getClass(), "file", null);
        setField(term221720, term221720.getClass(), "BaseTuple", term221824);
        setField(term221825, term221825.getClass(), "instance", null);
        setField(term221825, term221825.getClass(), "name", null);
        setField(term221825, term221825.getClass(), "baseType", null);
        setField(term221825, term221825.getClass(), "table", null);
        setField(term221825, term221825.getClass(), "file", null);
        setField(term221720, term221720.getClass(), "BaseStruct", term221825);
        setField(term221826, term221826.getClass(), "instance", null);
        setField(term221826, term221826.getClass(), "name", null);
        setField(term221826, term221826.getClass(), "baseType", null);
        setField(term221826, term221826.getClass(), "table", null);
        setField(term221826, term221826.getClass(), "file", null);
        setField(term221720, term221720.getClass(), "BaseFunction", term221826);
        setField(term221720, term221720.getClass(), "BasePair", null);
        setField(term221720, term221720.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins$CoreModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Object[] args = new Object[1];
        args[0] = term221720;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


