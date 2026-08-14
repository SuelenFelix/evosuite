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
import java.util.ArrayList;
import java.lang.Integer;

public class JuliaModule_init_11297932590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13080;
     Object term13126;
     Object term13167;
     Object term13169;

    public JuliaModule_init_11297932590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13184 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term13183 = ((Class) term13184).getDeclaredField((String) "STRUCT");
        ((Field) term13183).setAccessible(true);
        Object enum42 = ((Field) term13183).get((Object) null);
        Class<? extends Object> term13434 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term13433 = ((Class) term13434).getDeclaredField((String) "Comma");
        ((Field) term13433).setAccessible(true);
        Object enum43 = ((Field) term13433).get((Object) null);
        term13080 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term13080, term13080.getClass(), "type", enum42);
        setField(term13080, term13080.getClass(), "nodeType", enum43);
        setIntField(term13080, term13080.getClass(), "start", 972867650);
        setIntField(term13080, term13080.getClass(), "end", 1655935355);
        setField(term13080, term13080.getClass(), "file", "whBvTVIIlC");
        setField(term13080, term13080.getClass(), "parent", null);
        setField(term13080, term13080.getClass(), "name", "IgRJUzaCwW");
        ArrayList term13127 = new ArrayList();
        ((ArrayList) term13127).add((Object)null);
        Class<? extends Object> term13691 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term13690 = ((Class) term13691).getDeclaredField((String) "Symbol");
        ((Field) term13690).setAccessible(true);
        Object enum44 = ((Field) term13690).get((Object) null);
        term13126 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term13126, term13126.getClass(), "args", term13127);
        setField(term13126, term13126.getClass(), "nodeType", enum44);
        setIntField(term13126, term13126.getClass(), "start", -481533957);
        setIntField(term13126, term13126.getClass(), "end", 1240914516);
        setField(term13126, term13126.getClass(), "file", "JUmudUmaaV");
        setField(term13126, term13126.getClass(), "parent", null);
        setField(term13126, term13126.getClass(), "name", "KoyGrUJeJW");
        term13167 = new Integer(-1465035361);
        term13169 = new Integer(1090617576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaModule");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term13080;
        args[1] = term13126;
        args[2] = term13167;
        args[3] = term13169;
        args[4] = "HqBOwkVqjD";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


