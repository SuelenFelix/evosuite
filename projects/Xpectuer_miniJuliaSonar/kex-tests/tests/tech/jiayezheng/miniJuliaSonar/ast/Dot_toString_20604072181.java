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
import java.lang.Object;
import java.lang.String;

public class Dot_toString_20604072181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35364;

    public Dot_toString_20604072181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35448 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term35447 = ((Class) term35448).getDeclaredField((String) "LOCAL");
        ((Field) term35447).setAccessible(true);
        Object enum116 = ((Field) term35447).get((Object) null);
        Class<? extends Object> term35695 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term35694 = ((Class) term35695).getDeclaredField((String) "DUMMY");
        ((Field) term35694).setAccessible(true);
        Object enum117 = ((Field) term35694).get((Object) null);
        Class<? extends Object> term35952 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term35951 = ((Class) term35952).getDeclaredField((String) "Nothing");
        ((Field) term35951).setAccessible(true);
        Object enum118 = ((Field) term35951).get((Object) null);
        term35364 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot"));
        Object term35365 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term35364, term35364.getClass(), "target", null);
        setField(term35365, term35365.getClass(), "type", enum116);
        setField(term35365, term35365.getClass(), "nodeType", enum117);
        setIntField(term35365, term35365.getClass(), "start", 1460722225);
        setIntField(term35365, term35365.getClass(), "end", 1743224434);
        setField(term35365, term35365.getClass(), "file", "GZdcJyZntS");
        setField(term35365, term35365.getClass(), "parent", null);
        setField(term35365, term35365.getClass(), "name", "OIHoJeysUi");
        setField(term35364, term35364.getClass(), "attr", term35365);
        setField(term35364, term35364.getClass(), "nodeType", enum118);
        setIntField(term35364, term35364.getClass(), "start", 842904495);
        setIntField(term35364, term35364.getClass(), "end", 1008080511);
        setField(term35364, term35364.getClass(), "file", "WXMWFDGcLB");
        setField(term35364, term35364.getClass(), "parent", null);
        setField(term35364, term35364.getClass(), "name", "wKWbJssZuG");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term35364, args);
    }

};


