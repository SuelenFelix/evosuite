package tech.jiayezheng.miniJuliaSonar.demo;

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
import static tech.jiayezheng.miniJuliaSonar.demo.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class StyleApplier_init_13873688030 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9094;

    public StyleApplier_init_13873688030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9241 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term9240 = ((Class) term9241).getDeclaredField((String) "IDENTIFIER");
        ((Field) term9240).setAccessible(true);
        Object enum26 = ((Field) term9240).get((Object) null);
        ArrayList term9139 = new ArrayList();
        ((ArrayList) term9139).add((Object)null);
        ((ArrayList) term9139).add((Object)null);
        ((ArrayList) term9139).add((Object)null);
        Object term9097 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term9097, term9097.getClass(), "type", enum26);
        setIntField(term9097, term9097.getClass(), "start", -1888585309);
        setIntField(term9097, term9097.getClass(), "end", 683666002);
        setField(term9097, term9097.getClass(), "message", "pXOkjyeIRb");
        setField(term9097, term9097.getClass(), "url", "GgZWSjxjyE");
        setField(term9097, term9097.getClass(), "id", "EeBVbzjcCI");
        setField(term9097, term9097.getClass(), "highlight", term9139);
        Class<? extends Object> term9538 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term9537 = ((Class) term9538).getDeclaredField((String) "KEYWORD");
        ((Field) term9537).setAccessible(true);
        Object enum27 = ((Field) term9537).get((Object) null);
        ArrayList term9152 = new ArrayList();
        ((ArrayList) term9152).add((Object)null);
        ((ArrayList) term9152).add((Object)null);
        ((ArrayList) term9152).add((Object)null);
        ((ArrayList) term9152).add((Object)null);
        Object term9144 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term9144, term9144.getClass(), "type", enum27);
        setIntField(term9144, term9144.getClass(), "start", 1596213415);
        setIntField(term9144, term9144.getClass(), "end", -268815336);
        setField(term9144, term9144.getClass(), "message", "");
        setField(term9144, term9144.getClass(), "url", "");
        setField(term9144, term9144.getClass(), "id", "");
        setField(term9144, term9144.getClass(), "highlight", term9152);
        Object term9156 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term9156, term9156.getClass(), "type", null);
        setIntField(term9156, term9156.getClass(), "start", -1210583429);
        setIntField(term9156, term9156.getClass(), "end", -663691365);
        setField(term9156, term9156.getClass(), "message", null);
        setField(term9156, term9156.getClass(), "url", null);
        setField(term9156, term9156.getClass(), "id", null);
        setField(term9156, term9156.getClass(), "highlight", null);
        term9094 = new LinkedList();
        ((LinkedList) term9094).add(term9097);
        ((LinkedList) term9094).add(term9144);
        ((LinkedList) term9094).add(term9156);
        ((LinkedList) term9094).add((Object)null);
        ((LinkedList) term9094).add((Object)null);
        ((LinkedList) term9094).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.demo.StyleApplier");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.List");
        Object[] args = new Object[3];
        args[0] = "yVMkkQhvmN";
        args[1] = "mvrkADEgpp";
        args[2] = term9094;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


