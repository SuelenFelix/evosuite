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

public class Symbol_toDisplay_12141508363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32496;

    public Symbol_toDisplay_12141508363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32547 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term32546 = ((Class) term32547).getDeclaredField((String) "STRUCT");
        ((Field) term32546).setAccessible(true);
        Object enum107 = ((Field) term32546).get((Object) null);
        Class<? extends Object> term32797 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term32796 = ((Class) term32797).getDeclaredField((String) "Imaginary");
        ((Field) term32796).setAccessible(true);
        Object enum108 = ((Field) term32796).get((Object) null);
        term32496 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term32496, term32496.getClass(), "type", enum107);
        setField(term32496, term32496.getClass(), "nodeType", enum108);
        setIntField(term32496, term32496.getClass(), "start", -1476644457);
        setIntField(term32496, term32496.getClass(), "end", 1270666529);
        setField(term32496, term32496.getClass(), "file", "ZkMALXpEAZ");
        setField(term32496, term32496.getClass(), "parent", null);
        setField(term32496, term32496.getClass(), "name", "tXfQjSqDzN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toDisplay", argTypes, term32496, args);
    }

};


