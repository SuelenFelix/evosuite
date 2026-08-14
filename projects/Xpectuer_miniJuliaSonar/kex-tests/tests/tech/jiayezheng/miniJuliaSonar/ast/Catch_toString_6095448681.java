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

public class Catch_toString_6095448681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23365;

    public Catch_toString_6095448681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term23366 = new ArrayList();
        ((ArrayList) term23366).add((Object)null);
        ((ArrayList) term23366).add((Object)null);
        ((ArrayList) term23366).add((Object)null);
        ((ArrayList) term23366).add((Object)null);
        ArrayList term23371 = new ArrayList();
        ((ArrayList) term23371).add((Object)null);
        ((ArrayList) term23371).add((Object)null);
        ((ArrayList) term23371).add((Object)null);
        ((ArrayList) term23371).add((Object)null);
        ((ArrayList) term23371).add((Object)null);
        ((ArrayList) term23371).add((Object)null);
        ((ArrayList) term23371).add((Object)null);
        Class<? extends Object> term23452 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term23451 = ((Class) term23452).getDeclaredField((String) "QuoteNode");
        ((Field) term23451).setAccessible(true);
        Object enum76 = ((Field) term23451).get((Object) null);
        Class<? extends Object> term23721 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term23720 = ((Class) term23721).getDeclaredField((String) "Nothing");
        ((Field) term23720).setAccessible(true);
        Object enum77 = ((Field) term23720).get((Object) null);
        term23365 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Catch"));
        Object term23370 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term23365, term23365.getClass(), "binders", term23366);
        setField(term23370, term23370.getClass(), "args", term23371);
        setField(term23370, term23370.getClass(), "nodeType", enum76);
        setIntField(term23370, term23370.getClass(), "start", 2098647989);
        setIntField(term23370, term23370.getClass(), "end", 1598895173);
        setField(term23370, term23370.getClass(), "file", "EYtfuJaxiM");
        setField(term23370, term23370.getClass(), "parent", null);
        setField(term23370, term23370.getClass(), "name", "gCWtLVKVVe");
        setField(term23365, term23365.getClass(), "body", term23370);
        setField(term23365, term23365.getClass(), "nodeType", enum77);
        setIntField(term23365, term23365.getClass(), "start", 1830648570);
        setIntField(term23365, term23365.getClass(), "end", -227365013);
        setField(term23365, term23365.getClass(), "file", "fWKJoSoCwE");
        setField(term23365, term23365.getClass(), "parent", null);
        setField(term23365, term23365.getClass(), "name", "wfaXBpWAUH");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Catch");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term23365, args);
    }

};


