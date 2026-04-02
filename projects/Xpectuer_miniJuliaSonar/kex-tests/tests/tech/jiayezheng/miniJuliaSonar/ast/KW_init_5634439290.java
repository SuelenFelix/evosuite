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

public class KW_init_5634439290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17205;
     Object term17253;
     Object term17255;

    public KW_init_5634439290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17270 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term17269 = ((Class) term17270).getDeclaredField((String) "GLOBAL");
        ((Field) term17269).setAccessible(true);
        Object enum56 = ((Field) term17269).get((Object) null);
        Class<? extends Object> term17520 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term17519 = ((Class) term17520).getDeclaredField((String) "UnaryOp");
        ((Field) term17519).setAccessible(true);
        Object enum57 = ((Field) term17519).get((Object) null);
        term17205 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term17205, term17205.getClass(), "type", enum56);
        setField(term17205, term17205.getClass(), "nodeType", enum57);
        setIntField(term17205, term17205.getClass(), "start", -615654495);
        setIntField(term17205, term17205.getClass(), "end", -1476117762);
        setField(term17205, term17205.getClass(), "file", "jiKYgYHqIS");
        setField(term17205, term17205.getClass(), "parent", null);
        setField(term17205, term17205.getClass(), "name", "DfISiziTgG");
        term17253 = new Integer(-341962980);
        term17255 = new Integer(1532716628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.KW");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term17205;
        args[1] = null;
        args[2] = term17253;
        args[3] = term17255;
        args[4] = "XqgfKFvPSD";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


