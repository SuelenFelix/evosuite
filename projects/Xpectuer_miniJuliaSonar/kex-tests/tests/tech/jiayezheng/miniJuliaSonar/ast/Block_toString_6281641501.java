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

public class Block_toString_6281641501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52849;

    public Block_toString_6281641501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term52850 = new ArrayList();
        ((ArrayList) term52850).add((Object)null);
        ((ArrayList) term52850).add((Object)null);
        ((ArrayList) term52850).add((Object)null);
        ((ArrayList) term52850).add((Object)null);
        ((ArrayList) term52850).add((Object)null);
        ((ArrayList) term52850).add((Object)null);
        Class<? extends Object> term52893 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term52892 = ((Class) term52893).getDeclaredField((String) "TypeDecl");
        ((Field) term52892).setAccessible(true);
        Object enum175 = ((Field) term52892).get((Object) null);
        term52849 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term52849, term52849.getClass(), "args", term52850);
        setField(term52849, term52849.getClass(), "nodeType", enum175);
        setIntField(term52849, term52849.getClass(), "start", -1516995753);
        setIntField(term52849, term52849.getClass(), "end", -390501023);
        setField(term52849, term52849.getClass(), "file", "YAXkVjQZcV");
        setField(term52849, term52849.getClass(), "parent", null);
        setField(term52849, term52849.getClass(), "name", "pumvwBWvpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term52849, args);
    }

};


