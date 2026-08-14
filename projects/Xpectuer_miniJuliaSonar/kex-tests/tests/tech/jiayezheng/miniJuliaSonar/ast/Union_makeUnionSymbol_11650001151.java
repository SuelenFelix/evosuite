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
import java.util.ArrayList;
import java.util.LinkedList;

public class Union_makeUnionSymbol_11650001151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47519;
     Object term47607;

    public Union_makeUnionSymbol_11650001151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47614 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term47613 = ((Class) term47614).getDeclaredField((String) "STRUCT");
        ((Field) term47613).setAccessible(true);
        Object enum158 = ((Field) term47613).get((Object) null);
        Class<? extends Object> term47864 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term47863 = ((Class) term47864).getDeclaredField((String) "Nothing");
        ((Field) term47863).setAccessible(true);
        Object enum159 = ((Field) term47863).get((Object) null);
        ArrayList term47568 = new ArrayList();
        ((ArrayList) term47568).add((Object)null);
        ((ArrayList) term47568).add((Object)null);
        ((ArrayList) term47568).add((Object)null);
        ((ArrayList) term47568).add((Object)null);
        Class<? extends Object> term48127 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term48126 = ((Class) term48127).getDeclaredField((String) "Break");
        ((Field) term48126).setAccessible(true);
        Object enum160 = ((Field) term48126).get((Object) null);
        term47519 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Union"));
        Object term47520 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term47520, term47520.getClass(), "type", enum158);
        setField(term47520, term47520.getClass(), "nodeType", enum159);
        setIntField(term47520, term47520.getClass(), "start", 1843268026);
        setIntField(term47520, term47520.getClass(), "end", 954660603);
        setField(term47520, term47520.getClass(), "file", "TtGbVmKcnX");
        setField(term47520, term47520.getClass(), "parent", null);
        setField(term47520, term47520.getClass(), "name", "GJVkUrCVdD");
        setField(term47519, term47519.getClass(), "name", term47520);
        setField(term47519, term47519.getClass(), "types", term47568);
        setField(term47519, term47519.getClass(), "nodeType", enum160);
        setIntField(term47519, term47519.getClass(), "start", -1351605385);
        setIntField(term47519, term47519.getClass(), "end", 278355793);
        setField(term47519, term47519.getClass(), "file", "zNdorvdUgu");
        setField(term47519, term47519.getClass(), "parent", null);
        setField(term47519, term47519.getClass(), "name", "oPxuZbkYio");
        term47607 = new LinkedList();
        ((LinkedList) term47607).add((Object)null);
        ((LinkedList) term47607).add((Object)null);
        ((LinkedList) term47607).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Union");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term47607;
        callMethod(klass, "makeUnionSymbol", argTypes, term47519, args);
    }

};


