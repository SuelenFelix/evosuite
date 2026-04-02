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
import java.lang.Integer;

public class For_init_17172695960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3901;
     Object term3943;
     Object term3945;

    public For_init_17172695960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3902 = new ArrayList();
        ((ArrayList) term3902).add((Object)null);
        ((ArrayList) term3902).add((Object)null);
        ((ArrayList) term3902).add((Object)null);
        ((ArrayList) term3902).add((Object)null);
        ((ArrayList) term3902).add((Object)null);
        ((ArrayList) term3902).add((Object)null);
        ((ArrayList) term3902).add((Object)null);
        Class<? extends Object> term3960 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term3959 = ((Class) term3960).getDeclaredField((String) "SubType");
        ((Field) term3959).setAccessible(true);
        Object enum11 = ((Field) term3959).get((Object) null);
        term3901 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term3901, term3901.getClass(), "args", term3902);
        setField(term3901, term3901.getClass(), "nodeType", enum11);
        setIntField(term3901, term3901.getClass(), "start", -73683645);
        setIntField(term3901, term3901.getClass(), "end", -226514366);
        setField(term3901, term3901.getClass(), "file", "flxyYxBRtu");
        setField(term3901, term3901.getClass(), "parent", null);
        setField(term3901, term3901.getClass(), "name", "OclPbYPkcH");
        term3943 = new Integer(1193880199);
        term3945 = new Integer(-1087774327);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.For");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[2] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = term3901;
        args[3] = term3943;
        args[4] = term3945;
        args[5] = "IoAlmYsBwc";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


