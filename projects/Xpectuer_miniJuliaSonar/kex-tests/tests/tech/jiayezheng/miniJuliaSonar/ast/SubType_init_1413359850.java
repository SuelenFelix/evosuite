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

public class SubType_init_1413359850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37342;
     Object term37384;
     Object term37430;
     Object term37432;

    public SubType_init_1413359850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37447 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term37446 = ((Class) term37447).getDeclaredField((String) "LOCAL");
        ((Field) term37446).setAccessible(true);
        Object enum123 = ((Field) term37446).get((Object) null);
        Class<? extends Object> term37694 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term37693 = ((Class) term37694).getDeclaredField((String) "KW");
        ((Field) term37693).setAccessible(true);
        Object enum124 = ((Field) term37693).get((Object) null);
        term37342 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term37342, term37342.getClass(), "type", enum123);
        setField(term37342, term37342.getClass(), "nodeType", enum124);
        setIntField(term37342, term37342.getClass(), "start", -1497710478);
        setIntField(term37342, term37342.getClass(), "end", 49950830);
        setField(term37342, term37342.getClass(), "file", "xvkbvaEGYd");
        setField(term37342, term37342.getClass(), "parent", null);
        setField(term37342, term37342.getClass(), "name", "HBGNxdNURv");
        Class<? extends Object> term37942 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term37941 = ((Class) term37942).getDeclaredField((String) "STRUCT");
        ((Field) term37941).setAccessible(true);
        Object enum125 = ((Field) term37941).get((Object) null);
        Class<? extends Object> term38192 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term38191 = ((Class) term38192).getDeclaredField((String) "BinOp");
        ((Field) term38191).setAccessible(true);
        Object enum126 = ((Field) term38191).get((Object) null);
        term37384 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term37384, term37384.getClass(), "type", enum125);
        setField(term37384, term37384.getClass(), "nodeType", enum126);
        setIntField(term37384, term37384.getClass(), "start", -525257914);
        setIntField(term37384, term37384.getClass(), "end", 147209682);
        setField(term37384, term37384.getClass(), "file", "mfCpTPPQQm");
        setField(term37384, term37384.getClass(), "parent", null);
        setField(term37384, term37384.getClass(), "name", "OcJCIDNIXA");
        term37430 = new Integer(34470066);
        term37432 = new Integer(2058711405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.SubType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term37342;
        args[1] = term37384;
        args[2] = term37430;
        args[3] = term37432;
        args[4] = "XfRABIFVEp";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


