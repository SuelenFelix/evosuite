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

public class JuliaModule_toString_563524981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13960;

    public JuliaModule_toString_563524981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14079 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term14078 = ((Class) term14079).getDeclaredField((String) "LOCAL");
        ((Field) term14078).setAccessible(true);
        Object enum45 = ((Field) term14078).get((Object) null);
        Class<? extends Object> term14326 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term14325 = ((Class) term14326).getDeclaredField((String) "BinOp");
        ((Field) term14325).setAccessible(true);
        Object enum46 = ((Field) term14325).get((Object) null);
        ArrayList term14007 = new ArrayList();
        ((ArrayList) term14007).add((Object)null);
        ((ArrayList) term14007).add((Object)null);
        ((ArrayList) term14007).add((Object)null);
        ((ArrayList) term14007).add((Object)null);
        ((ArrayList) term14007).add((Object)null);
        ((ArrayList) term14007).add((Object)null);
        ((ArrayList) term14007).add((Object)null);
        ((ArrayList) term14007).add((Object)null);
        ((ArrayList) term14007).add((Object)null);
        Class<? extends Object> term14583 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term14582 = ((Class) term14583).getDeclaredField((String) "Break");
        ((Field) term14582).setAccessible(true);
        Object enum47 = ((Field) term14582).get((Object) null);
        Class<? extends Object> term14840 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term14839 = ((Class) term14840).getDeclaredField((String) "Do");
        ((Field) term14839).setAccessible(true);
        Object enum48 = ((Field) term14839).get((Object) null);
        term13960 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaModule"));
        Object term13961 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term14006 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term13961, term13961.getClass(), "type", enum45);
        setField(term13961, term13961.getClass(), "nodeType", enum46);
        setIntField(term13961, term13961.getClass(), "start", -1547384488);
        setIntField(term13961, term13961.getClass(), "end", 1442160736);
        setField(term13961, term13961.getClass(), "file", "MAcUBcBckh");
        setField(term13961, term13961.getClass(), "parent", null);
        setField(term13961, term13961.getClass(), "name", "oVgzLbrsFr");
        setField(term13960, term13960.getClass(), "name", term13961);
        setField(term14006, term14006.getClass(), "args", term14007);
        setField(term14006, term14006.getClass(), "nodeType", enum47);
        setIntField(term14006, term14006.getClass(), "start", 1114000454);
        setIntField(term14006, term14006.getClass(), "end", -556405712);
        setField(term14006, term14006.getClass(), "file", "vQVyKLdtaz");
        setField(term14006, term14006.getClass(), "parent", null);
        setField(term14006, term14006.getClass(), "name", "OWKQODBLzb");
        setField(term13960, term13960.getClass(), "body", term14006);
        setField(term13960, term13960.getClass(), "nodeType", enum48);
        setIntField(term13960, term13960.getClass(), "start", -1772434990);
        setIntField(term13960, term13960.getClass(), "end", -1845499264);
        setField(term13960, term13960.getClass(), "file", "wGmYcqUkgE");
        setField(term13960, term13960.getClass(), "parent", null);
        setField(term13960, term13960.getClass(), "name", "idgaQsnJpQ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term13960, args);
    }

};


