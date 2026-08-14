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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;
import java.lang.Integer;

public class Do_init_14087985910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21655;
     Object term21658;
     Object term21705;
     Object term21707;

    public Do_init_14087985910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21655 = new LinkedList();
        ArrayList term21659 = new ArrayList();
        ((ArrayList) term21659).add((Object)null);
        ((ArrayList) term21659).add((Object)null);
        ((ArrayList) term21659).add((Object)null);
        ((ArrayList) term21659).add((Object)null);
        ((ArrayList) term21659).add((Object)null);
        ((ArrayList) term21659).add((Object)null);
        Class<? extends Object> term21722 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term21721 = ((Class) term21722).getDeclaredField((String) "AbstractType");
        ((Field) term21721).setAccessible(true);
        Object enum71 = ((Field) term21721).get((Object) null);
        term21658 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term21658, term21658.getClass(), "args", term21659);
        setField(term21658, term21658.getClass(), "nodeType", enum71);
        setIntField(term21658, term21658.getClass(), "start", -2015048153);
        setIntField(term21658, term21658.getClass(), "end", -2063457669);
        setField(term21658, term21658.getClass(), "file", "pORebkoRdD");
        setField(term21658, term21658.getClass(), "parent", null);
        setField(term21658, term21658.getClass(), "name", "mXGCWJDOqA");
        term21705 = new Integer(-1222006000);
        term21707 = new Integer(2095798786);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Do");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term21655;
        args[2] = term21658;
        args[3] = term21705;
        args[4] = term21707;
        args[5] = "dpNsDgfPso";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


