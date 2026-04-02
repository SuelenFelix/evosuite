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

public class TypeDecl_toString_15970694451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20774;

    public TypeDecl_toString_15970694451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20864 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term20863 = ((Class) term20864).getDeclaredField((String) "STRUCT");
        ((Field) term20863).setAccessible(true);
        Object enum68 = ((Field) term20863).get((Object) null);
        Class<? extends Object> term21114 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term21113 = ((Class) term21114).getDeclaredField((String) "UnionType");
        ((Field) term21113).setAccessible(true);
        Object enum69 = ((Field) term21113).get((Object) null);
        Class<? extends Object> term21383 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term21382 = ((Class) term21383).getDeclaredField((String) "Operator");
        ((Field) term21382).setAccessible(true);
        Object enum70 = ((Field) term21382).get((Object) null);
        term20774 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.TypeDecl"));
        Object term20775 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term20775, term20775.getClass(), "type", enum68);
        setField(term20775, term20775.getClass(), "nodeType", enum69);
        setIntField(term20775, term20775.getClass(), "start", 107945604);
        setIntField(term20775, term20775.getClass(), "end", -1963464809);
        setField(term20775, term20775.getClass(), "file", "yGtHPyvYiQ");
        setField(term20775, term20775.getClass(), "parent", null);
        setField(term20775, term20775.getClass(), "name", "MvRIxilFMJ");
        setField(term20774, term20774.getClass(), "name", term20775);
        setField(term20774, term20774.getClass(), "type", null);
        setField(term20774, term20774.getClass(), "nodeType", enum70);
        setIntField(term20774, term20774.getClass(), "start", 71190297);
        setIntField(term20774, term20774.getClass(), "end", 1202361360);
        setField(term20774, term20774.getClass(), "file", "iNwOJRBEjp");
        setField(term20774, term20774.getClass(), "parent", null);
        setField(term20774, term20774.getClass(), "name", "XylxrMBraH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.TypeDecl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term20774, args);
    }

};


