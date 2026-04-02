package tech.jiayezheng.miniJuliaSonar.ast;

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
import static tech.jiayezheng.miniJuliaSonar.ast.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedList;

public class Call_setArgs_18619742894 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2731;
     Object term2778;

    public Call_setArgs_18619742894() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2732 = new ArrayList();
        ((ArrayList) term2732).add((Object)null);
        ((ArrayList) term2732).add((Object)null);
        ((ArrayList) term2732).add((Object)null);
        ((ArrayList) term2732).add((Object)null);
        ((ArrayList) term2732).add((Object)null);
        ((ArrayList) term2732).add((Object)null);
        ((ArrayList) term2732).add((Object)null);
        ((ArrayList) term2732).add((Object)null);
        ((ArrayList) term2732).add((Object)null);
        ArrayList term2736 = new ArrayList();
        Class<? extends Object> term2790 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term2789 = ((Class) term2790).getDeclaredField((String) "KeyWord");
        ((Field) term2789).setAccessible(true);
        Object enum7 = ((Field) term2789).get((Object) null);
        term2731 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call"));
        setField(term2731, term2731.getClass(), "name", null);
        setField(term2731, term2731.getClass(), "args", term2732);
        setField(term2731, term2731.getClass(), "keywords", term2736);
        setBooleanField(term2731, term2731.getClass(), "isInit", false);
        setField(term2731, term2731.getClass(), "nodeType", enum7);
        setIntField(term2731, term2731.getClass(), "start", -2068769794);
        setIntField(term2731, term2731.getClass(), "end", -117576464);
        setField(term2731, term2731.getClass(), "file", "tbcdzjIfER");
        setField(term2731, term2731.getClass(), "parent", null);
        setField(term2731, term2731.getClass(), "name", "HyxfbSQYBe");
        term2778 = new LinkedList();
        ((LinkedList) term2778).add((Object)null);
        ((LinkedList) term2778).add((Object)null);
        ((LinkedList) term2778).add((Object)null);
        ((LinkedList) term2778).add((Object)null);
        ((LinkedList) term2778).add((Object)null);
        ((LinkedList) term2778).add((Object)null);
        ((LinkedList) term2778).add((Object)null);
        ((LinkedList) term2778).add((Object)null);
        ((LinkedList) term2778).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2778;
        callMethod(klass, "setArgs", argTypes, term2731, args);
    }

};


