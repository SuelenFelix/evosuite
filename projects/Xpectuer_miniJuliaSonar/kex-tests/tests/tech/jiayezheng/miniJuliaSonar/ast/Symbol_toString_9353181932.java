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

public class Symbol_toString_9353181932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31919;

    public Symbol_toString_9353181932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31972 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term31971 = ((Class) term31972).getDeclaredField((String) "STRUCT");
        ((Field) term31971).setAccessible(true);
        Object enum105 = ((Field) term31971).get((Object) null);
        Class<? extends Object> term32222 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term32221 = ((Class) term32222).getDeclaredField((String) "FuncCombine");
        ((Field) term32221).setAccessible(true);
        Object enum106 = ((Field) term32221).get((Object) null);
        term31919 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term31919, term31919.getClass(), "type", enum105);
        setField(term31919, term31919.getClass(), "nodeType", enum106);
        setIntField(term31919, term31919.getClass(), "start", 388157121);
        setIntField(term31919, term31919.getClass(), "end", 1684998508);
        setField(term31919, term31919.getClass(), "file", "iikZEapDlu");
        setField(term31919, term31919.getClass(), "parent", null);
        setField(term31919, term31919.getClass(), "name", "nhoHrZfnIN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31919, args);
    }

};


