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

public class JuliaVector_toString_8332905011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47178;

    public JuliaVector_toString_8332905011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term47179 = new ArrayList();
        ((ArrayList) term47179).add((Object)null);
        ((ArrayList) term47179).add((Object)null);
        Class<? extends Object> term47221 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term47220 = ((Class) term47221).getDeclaredField((String) "LSQUARE");
        ((Field) term47220).setAccessible(true);
        Object enum157 = ((Field) term47220).get((Object) null);
        term47178 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaVector"));
        setField(term47178, term47178.getClass(), "elts", term47179);
        setField(term47178, term47178.getClass(), "nodeType", enum157);
        setIntField(term47178, term47178.getClass(), "start", 579006268);
        setIntField(term47178, term47178.getClass(), "end", -1694747156);
        setField(term47178, term47178.getClass(), "file", "NJhGgctbdj");
        setField(term47178, term47178.getClass(), "parent", null);
        setField(term47178, term47178.getClass(), "name", "MYWYUeLGOp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.JuliaVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term47178, args);
    }

};


