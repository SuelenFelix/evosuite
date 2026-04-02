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

public class BinOp_toString_6309835691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29642;

    public BinOp_toString_6309835691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29698 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.Op");
        Field term29697 = ((Class) term29698).getDeclaredField((String) "BwNand");
        ((Field) term29697).setAccessible(true);
        Object enum98 = ((Field) term29697).get((Object) null);
        Class<? extends Object> term29908 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term29907 = ((Class) term29908).getDeclaredField((String) "StructDef");
        ((Field) term29907).setAccessible(true);
        Object enum99 = ((Field) term29907).get((Object) null);
        term29642 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.BinOp"));
        setField(term29642, term29642.getClass(), "op", enum98);
        setField(term29642, term29642.getClass(), "left", null);
        setField(term29642, term29642.getClass(), "right", null);
        setBooleanField(term29642, term29642.getClass(), "vectorized", true);
        setField(term29642, term29642.getClass(), "nodeType", enum99);
        setIntField(term29642, term29642.getClass(), "start", -1347358701);
        setIntField(term29642, term29642.getClass(), "end", 806595993);
        setField(term29642, term29642.getClass(), "file", "ekxGuOYIwi");
        setField(term29642, term29642.getClass(), "parent", null);
        setField(term29642, term29642.getClass(), "name", "RbVQXSpxXy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.BinOp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29642, args);
    }

};


