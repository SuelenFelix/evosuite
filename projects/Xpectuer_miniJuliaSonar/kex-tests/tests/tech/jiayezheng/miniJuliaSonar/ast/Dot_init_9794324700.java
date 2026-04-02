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

public class Dot_init_9794324700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34777;
     Object term34825;
     Object term34827;

    public Dot_init_9794324700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34842 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term34841 = ((Class) term34842).getDeclaredField((String) "LOCAL");
        ((Field) term34841).setAccessible(true);
        Object enum114 = ((Field) term34841).get((Object) null);
        Class<? extends Object> term35089 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term35088 = ((Class) term35089).getDeclaredField((String) "Operator");
        ((Field) term35088).setAccessible(true);
        Object enum115 = ((Field) term35088).get((Object) null);
        term34777 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term34777, term34777.getClass(), "type", enum114);
        setField(term34777, term34777.getClass(), "nodeType", enum115);
        setIntField(term34777, term34777.getClass(), "start", -209654048);
        setIntField(term34777, term34777.getClass(), "end", 477625804);
        setField(term34777, term34777.getClass(), "file", "GrqozDKFOk");
        setField(term34777, term34777.getClass(), "parent", null);
        setField(term34777, term34777.getClass(), "name", "CFyoseFGLF");
        term34825 = new Integer(252575029);
        term34827 = new Integer(57189932);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term34777;
        args[2] = term34825;
        args[3] = term34827;
        args[4] = "SFqCrhEWLm";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


