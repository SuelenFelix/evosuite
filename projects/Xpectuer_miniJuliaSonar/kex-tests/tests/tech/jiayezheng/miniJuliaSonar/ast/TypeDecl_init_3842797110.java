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
import java.lang.Integer;

public class TypeDecl_init_3842797110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20163;
     Object term20217;
     Object term20219;

    public TypeDecl_init_3842797110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20234 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term20233 = ((Class) term20234).getDeclaredField((String) "STRUCT");
        ((Field) term20233).setAccessible(true);
        Object enum66 = ((Field) term20233).get((Object) null);
        Class<? extends Object> term20484 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term20483 = ((Class) term20484).getDeclaredField((String) "PrimitiveType");
        ((Field) term20483).setAccessible(true);
        Object enum67 = ((Field) term20483).get((Object) null);
        term20163 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term20163, term20163.getClass(), "type", enum66);
        setField(term20163, term20163.getClass(), "nodeType", enum67);
        setIntField(term20163, term20163.getClass(), "start", -2015854073);
        setIntField(term20163, term20163.getClass(), "end", 538259104);
        setField(term20163, term20163.getClass(), "file", "SJiQaLvSKv");
        setField(term20163, term20163.getClass(), "parent", null);
        setField(term20163, term20163.getClass(), "name", "OEXDRUKcFl");
        term20217 = new Integer(96566506);
        term20219 = new Integer(-343325701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.TypeDecl");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term20163;
        args[1] = null;
        args[2] = term20217;
        args[3] = term20219;
        args[4] = "RYdKCNNMBR";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


