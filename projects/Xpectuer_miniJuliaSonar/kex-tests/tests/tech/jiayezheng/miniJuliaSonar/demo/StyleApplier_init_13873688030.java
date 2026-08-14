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
     Object term9100;

    public StyleApplier_init_13873688030() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9247 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term9246 = ((Class) term9247).getDeclaredField((String) "IDENTIFIER");
        ((Field) term9246).setAccessible(true);
        Object enum26 = ((Field) term9246).get((Object) null);
        ArrayList term9145 = new ArrayList();
        ((ArrayList) term9145).add((Object)null);
        ((ArrayList) term9145).add((Object)null);
        ((ArrayList) term9145).add((Object)null);
        Object term9103 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term9103, term9103.getClass(), "type", enum26);
        setIntField(term9103, term9103.getClass(), "start", -1888585309);
        setIntField(term9103, term9103.getClass(), "end", 683666002);
        setField(term9103, term9103.getClass(), "message", "pXOkjyeIRb");
        setField(term9103, term9103.getClass(), "url", "GgZWSjxjyE");
        setField(term9103, term9103.getClass(), "id", "EeBVbzjcCI");
        setField(term9103, term9103.getClass(), "highlight", term9145);
        Class<? extends Object> term9544 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.demo.Style$Type");
        Field term9543 = ((Class) term9544).getDeclaredField((String) "KEYWORD");
        ((Field) term9543).setAccessible(true);
        Object enum27 = ((Field) term9543).get((Object) null);
        ArrayList term9158 = new ArrayList();
        ((ArrayList) term9158).add((Object)null);
        ((ArrayList) term9158).add((Object)null);
        ((ArrayList) term9158).add((Object)null);
        ((ArrayList) term9158).add((Object)null);
        Object term9150 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term9150, term9150.getClass(), "type", enum27);
        setIntField(term9150, term9150.getClass(), "start", 1596213415);
        setIntField(term9150, term9150.getClass(), "end", -268815336);
        setField(term9150, term9150.getClass(), "message", "");
        setField(term9150, term9150.getClass(), "url", "");
        setField(term9150, term9150.getClass(), "id", "");
        setField(term9150, term9150.getClass(), "highlight", term9158);
        Object term9162 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.demo.Style"));
        setField(term9162, term9162.getClass(), "type", null);
        setIntField(term9162, term9162.getClass(), "start", -1210583429);
        setIntField(term9162, term9162.getClass(), "end", -663691365);
        setField(term9162, term9162.getClass(), "message", null);
        setField(term9162, term9162.getClass(), "url", null);
        setField(term9162, term9162.getClass(), "id", null);
        setField(term9162, term9162.getClass(), "highlight", null);
        term9100 = new LinkedList();
        ((LinkedList) term9100).add(term9103);
        ((LinkedList) term9100).add(term9150);
        ((LinkedList) term9100).add(term9162);
        ((LinkedList) term9100).add((Object)null);
        ((LinkedList) term9100).add((Object)null);
        ((LinkedList) term9100).add((Object)null);
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
        args[2] = term9100;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


