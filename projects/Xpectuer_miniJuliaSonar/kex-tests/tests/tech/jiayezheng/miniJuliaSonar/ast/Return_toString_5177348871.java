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

public class Return_toString_5177348871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48416;

    public Return_toString_5177348871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48452 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term48451 = ((Class) term48452).getDeclaredField((String) "Call");
        ((Field) term48451).setAccessible(true);
        Object enum161 = ((Field) term48451).get((Object) null);
        term48416 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Return"));
        setField(term48416, term48416.getClass(), "value", null);
        setField(term48416, term48416.getClass(), "nodeType", enum161);
        setIntField(term48416, term48416.getClass(), "start", 2007134147);
        setIntField(term48416, term48416.getClass(), "end", 993388358);
        setField(term48416, term48416.getClass(), "file", "urCiQnUFBM");
        setField(term48416, term48416.getClass(), "parent", null);
        setField(term48416, term48416.getClass(), "name", "EKjQdtKxAM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Return");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term48416, args);
    }

};


