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

public class ParamType_init_19255802550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31;
     Object term79;
     Object term87;
     Object term89;

    public ParamType_init_19255802550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term133 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term132 = ((Class) term133).getDeclaredField((String) "STRUCT");
        ((Field) term132).setAccessible(true);
        Object enum0 = ((Field) term132).get((Object) null);
        Class<? extends Object> term967 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term966 = ((Class) term967).getDeclaredField((String) "RSQUARE");
        ((Field) term966).setAccessible(true);
        Object enum1 = ((Field) term966).get((Object) null);
        term31 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term31, term31.getClass(), "type", enum0);
        setField(term31, term31.getClass(), "nodeType", enum1);
        setIntField(term31, term31.getClass(), "start", 1484323161);
        setIntField(term31, term31.getClass(), "end", 391863371);
        setField(term31, term31.getClass(), "file", "sjlJAEtRrb");
        setField(term31, term31.getClass(), "parent", null);
        setField(term31, term31.getClass(), "name", "MuLcgQHgqz");
        term79 = new LinkedList();
        ((LinkedList) term79).add((Object)null);
        ((LinkedList) term79).add((Object)null);
        ((LinkedList) term79).add((Object)null);
        ((LinkedList) term79).add((Object)null);
        ((LinkedList) term79).add((Object)null);
        term87 = new Integer(-1922583790);
        term89 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.ParamType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term31;
        args[1] = term79;
        args[2] = term87;
        args[3] = term89;
        args[4] = "xxtlPwDYFs";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


