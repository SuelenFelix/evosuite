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

public class TypeInferencer_getAttrType_581107124120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108160;
     Object term108161;

    public TypeInferencer_getAttrType_581107124120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108160 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer"));
        Class<? extends Object> term108244 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term108243 = ((Class) term108244).getDeclaredField((String) "LOCAL");
        ((Field) term108243).setAccessible(true);
        Object enum365 = ((Field) term108243).get((Object) null);
        Class<? extends Object> term108491 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term108490 = ((Class) term108491).getDeclaredField((String) "UnionType");
        ((Field) term108490).setAccessible(true);
        Object enum366 = ((Field) term108490).get((Object) null);
        Class<? extends Object> term108760 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term108759 = ((Class) term108760).getDeclaredField((String) "Do");
        ((Field) term108759).setAccessible(true);
        Object enum367 = ((Field) term108759).get((Object) null);
        term108161 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot"));
        Object term108162 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term108161, term108161.getClass(), "target", null);
        setField(term108162, term108162.getClass(), "type", enum365);
        setField(term108162, term108162.getClass(), "nodeType", enum366);
        setIntField(term108162, term108162.getClass(), "start", -2104981311);
        setIntField(term108162, term108162.getClass(), "end", -571169753);
        setField(term108162, term108162.getClass(), "file", "IsSVVsKoyt");
        setField(term108162, term108162.getClass(), "parent", null);
        setField(term108162, term108162.getClass(), "name", "JIYvHbwfiy");
        setField(term108161, term108161.getClass(), "attr", term108162);
        setField(term108161, term108161.getClass(), "nodeType", enum367);
        setIntField(term108161, term108161.getClass(), "start", 318591690);
        setIntField(term108161, term108161.getClass(), "end", -165587447);
        setField(term108161, term108161.getClass(), "file", "YheKvmZTNn");
        setField(term108161, term108161.getClass(), "parent", null);
        setField(term108161, term108161.getClass(), "name", "cLPBTxvmBL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.visitor.TypeInferencer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Dot");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[2];
        args[0] = term108161;
        args[1] = null;
        callMethod(klass, "getAttrType", argTypes, term108160, args);
    }

};


