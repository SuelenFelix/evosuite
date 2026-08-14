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
import java.util.ArrayList;
import java.lang.String;

public class For_toString_20603476981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4232;

    public For_toString_20603476981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4234 = new ArrayList();
        Class<? extends Object> term4311 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term4310 = ((Class) term4311).getDeclaredField((String) "KeyWord");
        ((Field) term4310).setAccessible(true);
        Object enum12 = ((Field) term4310).get((Object) null);
        Class<? extends Object> term4574 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term4573 = ((Class) term4574).getDeclaredField((String) "DUMMY");
        ((Field) term4573).setAccessible(true);
        Object enum13 = ((Field) term4573).get((Object) null);
        term4232 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.For"));
        Object term4233 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term4232, term4232.getClass(), "target", null);
        setField(term4232, term4232.getClass(), "iter", null);
        setField(term4233, term4233.getClass(), "args", term4234);
        setField(term4233, term4233.getClass(), "nodeType", enum12);
        setIntField(term4233, term4233.getClass(), "start", -1530420153);
        setIntField(term4233, term4233.getClass(), "end", -469968304);
        setField(term4233, term4233.getClass(), "file", "TEParAifyi");
        setField(term4233, term4233.getClass(), "parent", null);
        setField(term4233, term4233.getClass(), "name", "OWDIEULEFu");
        setField(term4232, term4232.getClass(), "body", term4233);
        setField(term4232, term4232.getClass(), "nodeType", enum13);
        setIntField(term4232, term4232.getClass(), "start", -1145578966);
        setIntField(term4232, term4232.getClass(), "end", 679763016);
        setField(term4232, term4232.getClass(), "file", "dWRymuLBtr");
        setField(term4232, term4232.getClass(), "parent", null);
        setField(term4232, term4232.getClass(), "name", "AijpHYOFuy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.For");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term4232, args);
    }

};


