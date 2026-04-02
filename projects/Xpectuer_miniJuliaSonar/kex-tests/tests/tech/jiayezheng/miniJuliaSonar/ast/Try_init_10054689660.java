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

public class Try_init_10054689660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25947;
     Object term25984;
     Object term26032;
     Object term26071;
     Object term26073;

    public Try_init_10054689660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25948 = new ArrayList();
        ((ArrayList) term25948).add((Object)null);
        ((ArrayList) term25948).add((Object)null);
        ((ArrayList) term25948).add((Object)null);
        ((ArrayList) term25948).add((Object)null);
        ((ArrayList) term25948).add((Object)null);
        Class<? extends Object> term26088 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term26087 = ((Class) term26088).getDeclaredField((String) "If");
        ((Field) term26087).setAccessible(true);
        Object enum85 = ((Field) term26087).get((Object) null);
        term25947 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term25947, term25947.getClass(), "args", term25948);
        setField(term25947, term25947.getClass(), "nodeType", enum85);
        setIntField(term25947, term25947.getClass(), "start", 1557431527);
        setIntField(term25947, term25947.getClass(), "end", -1504890659);
        setField(term25947, term25947.getClass(), "file", "PtirvZmsGt");
        setField(term25947, term25947.getClass(), "parent", null);
        setField(term25947, term25947.getClass(), "name", "HWkpTmtlrc");
        ArrayList term25988 = new ArrayList();
        ((ArrayList) term25988).add((Object)null);
        ArrayList term25993 = new ArrayList();
        Class<? extends Object> term26336 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term26335 = ((Class) term26336).getDeclaredField((String) "KeyWord");
        ((Field) term26335).setAccessible(true);
        Object enum86 = ((Field) term26335).get((Object) null);
        Class<? extends Object> term26579 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term26578 = ((Class) term26579).getDeclaredField((String) "Continue");
        ((Field) term26578).setAccessible(true);
        Object enum87 = ((Field) term26578).get((Object) null);
        Object term25987 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Catch"));
        Object term25992 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term25987, term25987.getClass(), "binders", term25988);
        setField(term25992, term25992.getClass(), "args", term25993);
        setField(term25992, term25992.getClass(), "nodeType", enum86);
        setIntField(term25992, term25992.getClass(), "start", 1358829571);
        setIntField(term25992, term25992.getClass(), "end", 991356662);
        setField(term25992, term25992.getClass(), "file", "");
        setField(term25992, term25992.getClass(), "parent", null);
        setField(term25992, term25992.getClass(), "name", "");
        setField(term25987, term25987.getClass(), "body", term25992);
        setField(term25987, term25987.getClass(), "nodeType", enum87);
        setIntField(term25987, term25987.getClass(), "start", -506958186);
        setIntField(term25987, term25987.getClass(), "end", -507387516);
        setField(term25987, term25987.getClass(), "file", "aWYOWZFyaX");
        setField(term25987, term25987.getClass(), "parent", null);
        setField(term25987, term25987.getClass(), "name", "BRIVNtfUWU");
        term25984 = new LinkedList();
        ((LinkedList) term25984).add(term25987);
        ArrayList term26033 = new ArrayList();
        ((ArrayList) term26033).add((Object)null);
        ((ArrayList) term26033).add((Object)null);
        ((ArrayList) term26033).add((Object)null);
        ((ArrayList) term26033).add((Object)null);
        ((ArrayList) term26033).add((Object)null);
        ((ArrayList) term26033).add((Object)null);
        ((ArrayList) term26033).add((Object)null);
        ((ArrayList) term26033).add((Object)null);
        Class<? extends Object> term26845 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term26844 = ((Class) term26845).getDeclaredField((String) "Char");
        ((Field) term26844).setAccessible(true);
        Object enum88 = ((Field) term26844).get((Object) null);
        term26032 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term26032, term26032.getClass(), "args", term26033);
        setField(term26032, term26032.getClass(), "nodeType", enum88);
        setIntField(term26032, term26032.getClass(), "start", -1970452551);
        setIntField(term26032, term26032.getClass(), "end", -1896376975);
        setField(term26032, term26032.getClass(), "file", "DbiCVtPPCT");
        setField(term26032, term26032.getClass(), "parent", null);
        setField(term26032, term26032.getClass(), "name", "WzFopsaDuG");
        term26071 = new Integer(729658803);
        term26073 = new Integer(114754804);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Try");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term25947;
        args[1] = term25984;
        args[2] = term26032;
        args[3] = term26071;
        args[4] = term26073;
        args[5] = "PapWxkhEWe";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


