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

public class Symbol_isAttribute_4764210381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31342;

    public Symbol_isAttribute_4764210381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31395 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term31394 = ((Class) term31395).getDeclaredField((String) "LOCAL");
        ((Field) term31394).setAccessible(true);
        Object enum103 = ((Field) term31394).get((Object) null);
        Class<? extends Object> term31642 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term31641 = ((Class) term31642).getDeclaredField((String) "AbstractType");
        ((Field) term31641).setAccessible(true);
        Object enum104 = ((Field) term31641).get((Object) null);
        term31342 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term31342, term31342.getClass(), "type", enum103);
        setField(term31342, term31342.getClass(), "nodeType", enum104);
        setIntField(term31342, term31342.getClass(), "start", -1618206977);
        setIntField(term31342, term31342.getClass(), "end", -1747406163);
        setField(term31342, term31342.getClass(), "file", "XJJNClzHRf");
        setField(term31342, term31342.getClass(), "parent", null);
        setField(term31342, term31342.getClass(), "name", "HDaezxQfQR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAttribute", argTypes, term31342, args);
    }

};


