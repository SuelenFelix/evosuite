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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class Catch_init_21258942820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23032;
     Object term23042;
     Object term23082;
     Object term23084;

    public Catch_init_21258942820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23032 = new LinkedList();
        ((LinkedList) term23032).add((Object)null);
        ((LinkedList) term23032).add((Object)null);
        ((LinkedList) term23032).add((Object)null);
        ((LinkedList) term23032).add((Object)null);
        ((LinkedList) term23032).add((Object)null);
        ((LinkedList) term23032).add((Object)null);
        ((LinkedList) term23032).add((Object)null);
        ArrayList term23043 = new ArrayList();
        ((ArrayList) term23043).add((Object)null);
        ((ArrayList) term23043).add((Object)null);
        ((ArrayList) term23043).add((Object)null);
        ((ArrayList) term23043).add((Object)null);
        ((ArrayList) term23043).add((Object)null);
        ((ArrayList) term23043).add((Object)null);
        ((ArrayList) term23043).add((Object)null);
        ((ArrayList) term23043).add((Object)null);
        ((ArrayList) term23043).add((Object)null);
        Class<? extends Object> term23099 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term23098 = ((Class) term23099).getDeclaredField((String) "Break");
        ((Field) term23098).setAccessible(true);
        Object enum75 = ((Field) term23098).get((Object) null);
        term23042 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term23042, term23042.getClass(), "args", term23043);
        setField(term23042, term23042.getClass(), "nodeType", enum75);
        setIntField(term23042, term23042.getClass(), "start", -1697741339);
        setIntField(term23042, term23042.getClass(), "end", 98922530);
        setField(term23042, term23042.getClass(), "file", "OJJtVNPyKZ");
        setField(term23042, term23042.getClass(), "parent", null);
        setField(term23042, term23042.getClass(), "name", "AKNapTAfmD");
        term23082 = new Integer(-1388471422);
        term23084 = new Integer(-1498296052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Catch");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.util.List");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term23032;
        args[1] = term23042;
        args[2] = term23082;
        args[3] = term23084;
        args[4] = "xJgPlLxpgC";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


