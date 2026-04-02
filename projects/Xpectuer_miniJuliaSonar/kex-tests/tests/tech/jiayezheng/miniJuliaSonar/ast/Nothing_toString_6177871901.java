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

public class Nothing_toString_6177871901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52121;

    public Nothing_toString_6177871901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52159 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term52158 = ((Class) term52159).getDeclaredField((String) "VarArg");
        ((Field) term52158).setAccessible(true);
        Object enum173 = ((Field) term52158).get((Object) null);
        term52121 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Nothing"));
        setField(term52121, term52121.getClass(), "nodeType", enum173);
        setIntField(term52121, term52121.getClass(), "start", 1774507971);
        setIntField(term52121, term52121.getClass(), "end", -1420269858);
        setField(term52121, term52121.getClass(), "file", "aQFUvuaYxd");
        setField(term52121, term52121.getClass(), "parent", null);
        setField(term52121, term52121.getClass(), "name", "zNFLXMifnS");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Nothing");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term52121, args);
    }

};


