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
     Object term221714;

    public Builtins_CoreModule_init_932123600() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term221715 = new HashMap();
        ArrayList term221726 = new ArrayList();
        ((ArrayList) term221726).add((Object)null);
        ((ArrayList) term221726).add((Object)null);
        ((ArrayList) term221726).add((Object)null);
        ((ArrayList) term221726).add((Object)null);
        ((ArrayList) term221726).add((Object)null);
        ((ArrayList) term221726).add((Object)null);
        ((ArrayList) term221726).add((Object)null);
        ((ArrayList) term221726).add((Object)null);
        HashSet term221731 = new HashSet();
        HashMap term221732 = new HashMap();
        ArrayList term221739 = new ArrayList();
        ((ArrayList) term221739).add((Object)null);
        ((ArrayList) term221739).add((Object)null);
        ((ArrayList) term221739).add((Object)null);
        ((ArrayList) term221739).add((Object)null);
        ((ArrayList) term221739).add((Object)null);
        ((ArrayList) term221739).add((Object)null);
        ((ArrayList) term221739).add((Object)null);
        ((ArrayList) term221739).add((Object)null);
        HashSet term221742 = new HashSet();
        Class<? extends Object> term221822 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term221821 = ((Class) term221822).getDeclaredField((String) "MODULE");
        ((Field) term221821).setAccessible(true);
        Object enum725 = ((Field) term221821).get((Object) null);
        ArrayList term221769 = new ArrayList();
        ((ArrayList) term221769).add((Object)null);
        ((ArrayList) term221769).add((Object)null);
        ((ArrayList) term221769).add((Object)null);
        ((ArrayList) term221769).add((Object)null);
        ((ArrayList) term221769).add((Object)null);
        ((ArrayList) term221769).add((Object)null);
        ArrayList term221799 = new ArrayList();
        ((ArrayList) term221799).add((Object)null);
        ((ArrayList) term221799).add((Object)null);
        ((ArrayList) term221799).add((Object)null);
        ((ArrayList) term221799).add((Object)null);
        ((ArrayList) term221799).add((Object)null);
        term221714 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins"));
        Object term221724 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221725 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term221730 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term221737 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term221738 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term221785 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221786 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term221803 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        Object term221816 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.InstanceType"));
        Object term221817 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221818 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221819 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        Object term221820 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.PrimType"));
        setField(term221714, term221714.getClass(), "modules", term221715);
        setField(term221725, term221725.getClass(), "ctype", null);
        setField(term221725, term221725.getClass(), "params", term221726);
        setField(term221730, term221730.getClass(), "globalNames", term221731);
        setField(term221730, term221730.getClass(), "table", term221732);
        setField(term221737, term221737.getClass(), "globalNames", null);
        setField(term221737, term221737.getClass(), "table", null);
        setField(term221737, term221737.getClass(), "parent", null);
        setField(term221737, term221737.getClass(), "forwarding", null);
        setField(term221737, term221737.getClass(), "supers", null);
        setField(term221737, term221737.getClass(), "globalSymbols", null);
        setField(term221737, term221737.getClass(), "stateType", null);
        setField(term221737, term221737.getClass(), "type", null);
        setField(term221737, term221737.getClass(), "path", null);
        setField(term221730, term221730.getClass(), "parent", term221737);
        setField(term221738, term221738.getClass(), "globalNames", null);
        setField(term221738, term221738.getClass(), "table", null);
        setField(term221738, term221738.getClass(), "parent", null);
        setField(term221738, term221738.getClass(), "forwarding", null);
        setField(term221738, term221738.getClass(), "supers", null);
        setField(term221738, term221738.getClass(), "globalSymbols", null);
        setField(term221738, term221738.getClass(), "stateType", null);
        setField(term221738, term221738.getClass(), "type", null);
        setField(term221738, term221738.getClass(), "path", null);
        setField(term221730, term221730.getClass(), "forwarding", term221738);
        setField(term221730, term221730.getClass(), "supers", term221739);
        setField(term221730, term221730.getClass(), "globalSymbols", term221742);
        setField(term221730, term221730.getClass(), "stateType", enum725);
        setField(term221730, term221730.getClass(), "type", null);
        setField(term221730, term221730.getClass(), "path", null);
        setField(term221725, term221725.getClass(), "table", term221730);
        setField(term221725, term221725.getClass(), "file", "KPKvkukffl");
        setField(term221724, term221724.getClass(), "instance", term221725);
        setField(term221724, term221724.getClass(), "name", "DztkzYmExj");
        setField(term221724, term221724.getClass(), "baseType", term221769);
        setField(term221724, term221724.getClass(), "table", term221738);
        setField(term221724, term221724.getClass(), "file", "jgLlnOSDbQ");
        setField(term221714, term221714.getClass(), "BaseModule", term221724);
        setField(term221786, term221786.getClass(), "ctype", null);
        setField(term221786, term221786.getClass(), "params", null);
        setField(term221786, term221786.getClass(), "table", null);
        setField(term221786, term221786.getClass(), "file", null);
        setField(term221785, term221785.getClass(), "instance", term221786);
        setField(term221785, term221785.getClass(), "name", "KJGZNumCAL");
        setField(term221785, term221785.getClass(), "baseType", term221799);
        setField(term221803, term221803.getClass(), "globalNames", null);
        setField(term221803, term221803.getClass(), "table", null);
        setField(term221803, term221803.getClass(), "parent", null);
        setField(term221803, term221803.getClass(), "forwarding", null);
        setField(term221803, term221803.getClass(), "supers", null);
        setField(term221803, term221803.getClass(), "globalSymbols", null);
        setField(term221803, term221803.getClass(), "stateType", null);
        setField(term221803, term221803.getClass(), "type", null);
        setField(term221803, term221803.getClass(), "path", null);
        setField(term221785, term221785.getClass(), "table", term221803);
        setField(term221785, term221785.getClass(), "file", "iBvRhpQbES");
        setField(term221714, term221714.getClass(), "BaseVector", term221785);
        setField(term221816, term221816.getClass(), "ctype", null);
        setField(term221816, term221816.getClass(), "params", null);
        setField(term221816, term221816.getClass(), "table", null);
        setField(term221816, term221816.getClass(), "file", null);
        setField(term221714, term221714.getClass(), "BaseVectorInst", term221816);
        setField(term221817, term221817.getClass(), "instance", null);
        setField(term221817, term221817.getClass(), "name", null);
        setField(term221817, term221817.getClass(), "baseType", null);
        setField(term221817, term221817.getClass(), "table", null);
        setField(term221817, term221817.getClass(), "file", null);
        setField(term221714, term221714.getClass(), "BaseDict", term221817);
        setField(term221818, term221818.getClass(), "instance", null);
        setField(term221818, term221818.getClass(), "name", null);
        setField(term221818, term221818.getClass(), "baseType", null);
        setField(term221818, term221818.getClass(), "table", null);
        setField(term221818, term221818.getClass(), "file", null);
        setField(term221714, term221714.getClass(), "BaseTuple", term221818);
        setField(term221819, term221819.getClass(), "instance", null);
        setField(term221819, term221819.getClass(), "name", null);
        setField(term221819, term221819.getClass(), "baseType", null);
        setField(term221819, term221819.getClass(), "table", null);
        setField(term221819, term221819.getClass(), "file", null);
        setField(term221714, term221714.getClass(), "BaseStruct", term221819);
        setField(term221820, term221820.getClass(), "instance", null);
        setField(term221820, term221820.getClass(), "name", null);
        setField(term221820, term221820.getClass(), "baseType", null);
        setField(term221820, term221820.getClass(), "table", null);
        setField(term221820, term221820.getClass(), "file", null);
        setField(term221714, term221714.getClass(), "BaseFunction", term221820);
        setField(term221714, term221714.getClass(), "BasePair", null);
        setField(term221714, term221714.getClass(), "Builtin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins$CoreModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.Builtins");
        Object[] args = new Object[1];
        args[0] = term221714;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


