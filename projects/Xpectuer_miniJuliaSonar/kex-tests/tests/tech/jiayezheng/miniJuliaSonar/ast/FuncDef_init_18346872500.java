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
import java.lang.String;
import java.lang.Object;
import java.util.LinkedList;
import java.lang.Integer;

public class FuncDef_init_18346872500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39835;
     Object term39881;
     Object term39884;
     Object term39887;
     Object term39889;

    public FuncDef_init_18346872500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39904 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term39903 = ((Class) term39904).getDeclaredField((String) "STRUCT");
        ((Field) term39903).setAccessible(true);
        Object enum132 = ((Field) term39903).get((Object) null);
        Class<? extends Object> term40154 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term40153 = ((Class) term40154).getDeclaredField((String) "Comma");
        ((Field) term40153).setAccessible(true);
        Object enum133 = ((Field) term40153).get((Object) null);
        term39835 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term39835, term39835.getClass(), "type", enum132);
        setField(term39835, term39835.getClass(), "nodeType", enum133);
        setIntField(term39835, term39835.getClass(), "start", 199287428);
        setIntField(term39835, term39835.getClass(), "end", -1195339592);
        setField(term39835, term39835.getClass(), "file", "WBAOTqErtm");
        setField(term39835, term39835.getClass(), "parent", null);
        setField(term39835, term39835.getClass(), "name", "PqtVXXZMqK");
        term39881 = new LinkedList();
        term39884 = new LinkedList();
        term39887 = new Integer(-376422566);
        term39889 = new Integer(306847454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef");
        Class<?>[] argTypes = new Class<?>[7];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = Class.forName("java.lang.String");
        Object[] args = new Object[7];
        args[0] = term39835;
        args[1] = term39881;
        args[2] = term39884;
        args[3] = null;
        args[4] = term39887;
        args[5] = term39889;
        args[6] = "rYbtIDVdnd";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


