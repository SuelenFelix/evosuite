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

public class Call_toString_12061083953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2184;

    public Call_toString_12061083953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2185 = new ArrayList();
        ((ArrayList) term2185).add((Object)null);
        ((ArrayList) term2185).add((Object)null);
        ((ArrayList) term2185).add((Object)null);
        ((ArrayList) term2185).add((Object)null);
        Class<? extends Object> term2241 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term2240 = ((Class) term2241).getDeclaredField((String) "Try");
        ((Field) term2240).setAccessible(true);
        Object enum5 = ((Field) term2240).get((Object) null);
        Object term2191 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.KW"));
        Object term2192 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term2192, term2192.getClass(), "type", null);
        setField(term2192, term2192.getClass(), "nodeType", null);
        setIntField(term2192, term2192.getClass(), "start", -1685132342);
        setIntField(term2192, term2192.getClass(), "end", -1456670397);
        setField(term2192, term2192.getClass(), "file", null);
        setField(term2192, term2192.getClass(), "parent", null);
        setField(term2192, term2192.getClass(), "name", null);
        setField(term2191, term2191.getClass(), "key", term2192);
        setField(term2191, term2191.getClass(), "value", null);
        setField(term2191, term2191.getClass(), "nodeType", enum5);
        setIntField(term2191, term2191.getClass(), "start", 1622346318);
        setIntField(term2191, term2191.getClass(), "end", 1048535127);
        setField(term2191, term2191.getClass(), "file", "");
        setField(term2191, term2191.getClass(), "parent", null);
        setField(term2191, term2191.getClass(), "name", "");
        ArrayList term2189 = new ArrayList();
        ((ArrayList) term2189).add(term2191);
        Class<? extends Object> term2472 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term2471 = ((Class) term2472).getDeclaredField((String) "Symbol");
        ((Field) term2471).setAccessible(true);
        Object enum6 = ((Field) term2471).get((Object) null);
        term2184 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call"));
        setField(term2184, term2184.getClass(), "name", null);
        setField(term2184, term2184.getClass(), "args", term2185);
        setField(term2184, term2184.getClass(), "keywords", term2189);
        setBooleanField(term2184, term2184.getClass(), "isInit", false);
        setField(term2184, term2184.getClass(), "nodeType", enum6);
        setIntField(term2184, term2184.getClass(), "start", -655067527);
        setIntField(term2184, term2184.getClass(), "end", -6029667);
        setField(term2184, term2184.getClass(), "file", "aJlieCFVtF");
        setField(term2184, term2184.getClass(), "parent", null);
        setField(term2184, term2184.getClass(), "name", "ZiaGIbnzTs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Call");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2184, args);
    }

};


