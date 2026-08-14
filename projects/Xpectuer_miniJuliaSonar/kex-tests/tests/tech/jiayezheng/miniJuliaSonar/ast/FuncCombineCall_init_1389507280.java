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
import java.lang.Integer;

public class FuncCombineCall_init_1389507280 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51753;
     Object term51796;
     Object term51799;
     Object term51801;

    public FuncCombineCall_init_1389507280() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term51754 = new ArrayList();
        ((ArrayList) term51754).add((Object)null);
        ((ArrayList) term51754).add((Object)null);
        ((ArrayList) term51754).add((Object)null);
        ((ArrayList) term51754).add((Object)null);
        ((ArrayList) term51754).add((Object)null);
        ((ArrayList) term51754).add((Object)null);
        ((ArrayList) term51754).add((Object)null);
        ((ArrayList) term51754).add((Object)null);
        ((ArrayList) term51754).add((Object)null);
        Class<? extends Object> term51816 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term51815 = ((Class) term51816).getDeclaredField((String) "Continue");
        ((Field) term51815).setAccessible(true);
        Object enum172 = ((Field) term51815).get((Object) null);
        term51753 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term51753, term51753.getClass(), "args", term51754);
        setField(term51753, term51753.getClass(), "nodeType", enum172);
        setIntField(term51753, term51753.getClass(), "start", 1922684808);
        setIntField(term51753, term51753.getClass(), "end", -2005784375);
        setField(term51753, term51753.getClass(), "file", "WxYUTuqmIq");
        setField(term51753, term51753.getClass(), "parent", null);
        setField(term51753, term51753.getClass(), "name", "OeQLvhVERT");
        term51796 = new LinkedList();
        term51799 = new Integer(-288604325);
        term51801 = new Integer(-1268314569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncCombineCall");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term51753;
        args[1] = term51796;
        args[2] = term51799;
        args[3] = term51801;
        args[4] = "IlvgFINwIa";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


