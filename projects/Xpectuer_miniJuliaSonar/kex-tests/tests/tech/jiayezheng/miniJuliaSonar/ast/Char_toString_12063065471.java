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

public class Char_toString_12063065471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30926;

    public Char_toString_12063065471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30989 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term30988 = ((Class) term30989).getDeclaredField((String) "StructDef");
        ((Field) term30988).setAccessible(true);
        Object enum102 = ((Field) term30988).get((Object) null);
        term30926 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Char"));
        setField(term30926, term30926.getClass(), "value", "OqbwYQfvAe");
        setField(term30926, term30926.getClass(), "nodeType", enum102);
        setIntField(term30926, term30926.getClass(), "start", 282916351);
        setIntField(term30926, term30926.getClass(), "end", 880977281);
        setField(term30926, term30926.getClass(), "file", "tRxZafjqIx");
        setField(term30926, term30926.getClass(), "parent", null);
        setField(term30926, term30926.getClass(), "name", "DhjNLmRMCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Char");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30926, args);
    }

};


