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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class Expr_toString_12086446601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4873;

    public Expr_toString_12086446601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4874 = new ArrayList();
        ((ArrayList) term4874).add((Object)null);
        ((ArrayList) term4874).add((Object)null);
        Class<? extends Object> term4912 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term4911 = ((Class) term4912).getDeclaredField((String) "End");
        ((Field) term4911).setAccessible(true);
        Object enum14 = ((Field) term4911).get((Object) null);
        term4873 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Expr"));
        setField(term4873, term4873.getClass(), "args", term4874);
        setField(term4873, term4873.getClass(), "nodeType", enum14);
        setIntField(term4873, term4873.getClass(), "start", -602026508);
        setIntField(term4873, term4873.getClass(), "end", -157887805);
        setField(term4873, term4873.getClass(), "file", "kuTXqwMtDB");
        setField(term4873, term4873.getClass(), "parent", null);
        setField(term4873, term4873.getClass(), "name", "Ghbwtircqb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Expr");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4873, args);
    }

};


