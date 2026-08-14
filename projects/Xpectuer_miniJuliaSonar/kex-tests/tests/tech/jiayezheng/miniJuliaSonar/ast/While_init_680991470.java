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

public class While_init_680991470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28300;
     Object term28343;
     Object term28345;

    public While_init_680991470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28301 = new ArrayList();
        ((ArrayList) term28301).add((Object)null);
        ((ArrayList) term28301).add((Object)null);
        ((ArrayList) term28301).add((Object)null);
        ((ArrayList) term28301).add((Object)null);
        ((ArrayList) term28301).add((Object)null);
        ((ArrayList) term28301).add((Object)null);
        Class<? extends Object> term28360 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term28359 = ((Class) term28360).getDeclaredField((String) "BaseType");
        ((Field) term28359).setAccessible(true);
        Object enum93 = ((Field) term28359).get((Object) null);
        term28300 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setField(term28300, term28300.getClass(), "args", term28301);
        setField(term28300, term28300.getClass(), "nodeType", enum93);
        setIntField(term28300, term28300.getClass(), "start", -1214628358);
        setIntField(term28300, term28300.getClass(), "end", 1102721075);
        setField(term28300, term28300.getClass(), "file", "lihXWlGDxk");
        setField(term28300, term28300.getClass(), "parent", null);
        setField(term28300, term28300.getClass(), "name", "JmcmxoGhIK");
        term28343 = new Integer(-426764678);
        term28345 = new Integer(-1222614956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.While");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term28300;
        args[2] = term28343;
        args[3] = term28345;
        args[4] = "jXzmYyrnnT";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


