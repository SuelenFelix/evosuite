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

public class VarArg_init_9854297830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50828;
     Object term50876;
     Object term50878;

    public VarArg_init_9854297830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term50893 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term50892 = ((Class) term50893).getDeclaredField((String) "STRUCT");
        ((Field) term50892).setAccessible(true);
        Object enum169 = ((Field) term50892).get((Object) null);
        Class<? extends Object> term51143 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term51142 = ((Class) term51143).getDeclaredField((String) "KeyWord");
        ((Field) term51142).setAccessible(true);
        Object enum170 = ((Field) term51142).get((Object) null);
        term50828 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term50828, term50828.getClass(), "type", enum169);
        setField(term50828, term50828.getClass(), "nodeType", enum170);
        setIntField(term50828, term50828.getClass(), "start", -1127721881);
        setIntField(term50828, term50828.getClass(), "end", 1074848808);
        setField(term50828, term50828.getClass(), "file", "THZSpzBRYP");
        setField(term50828, term50828.getClass(), "parent", null);
        setField(term50828, term50828.getClass(), "name", "ZfBIVGBQOE");
        term50876 = new Integer(-146054762);
        term50878 = new Integer(798043553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.VarArg");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term50828;
        args[1] = term50876;
        args[2] = term50878;
        args[3] = "QSrDQfEsTR";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


