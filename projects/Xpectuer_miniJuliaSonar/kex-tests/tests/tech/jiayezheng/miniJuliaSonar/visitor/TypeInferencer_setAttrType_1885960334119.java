package tech.jiayezheng.miniJuliaSonar.visitor;

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
import static tech.jiayezheng.miniJuliaSonar.visitor.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TypeInferencer_setAttrType_1885960334119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107321;
     Object term107322;

    public TypeInferencer_setAttrType_1885960334119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107321 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer"));
        Class<? extends Object> term107403 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term107402 = ((Class) term107403).getDeclaredField((String) "STRUCT");
        ((Field) term107402).setAccessible(true);
        Object enum362 = ((Field) term107402).get((Object) null);
        Class<? extends Object> term107653 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term107652 = ((Class) term107653).getDeclaredField((String) "Dot");
        ((Field) term107652).setAccessible(true);
        Object enum363 = ((Field) term107652).get((Object) null);
        Class<? extends Object> term107904 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term107903 = ((Class) term107904).getDeclaredField((String) "While");
        ((Field) term107903).setAccessible(true);
        Object enum364 = ((Field) term107903).get((Object) null);
        term107322 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot"));
        Object term107323 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term107322, term107322.getClass(), "target", null);
        setField(term107323, term107323.getClass(), "type", enum362);
        setField(term107323, term107323.getClass(), "nodeType", enum363);
        setIntField(term107323, term107323.getClass(), "start", -426764678);
        setIntField(term107323, term107323.getClass(), "end", -1222614956);
        setField(term107323, term107323.getClass(), "file", "qBnhTJalNA");
        setField(term107323, term107323.getClass(), "parent", null);
        setField(term107323, term107323.getClass(), "name", "sgpNzhEbZp");
        setField(term107322, term107322.getClass(), "attr", term107323);
        setField(term107322, term107322.getClass(), "nodeType", enum364);
        setIntField(term107322, term107322.getClass(), "start", -1870495012);
        setIntField(term107322, term107322.getClass(), "end", -1310015129);
        setField(term107322, term107322.getClass(), "file", "JrardfRgpb");
        setField(term107322, term107322.getClass(), "parent", null);
        setField(term107322, term107322.getClass(), "name", "LNnXYTWbVh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[3];
        args[0] = term107322;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "setAttrType", argTypes, term107321, args);
    }

};


