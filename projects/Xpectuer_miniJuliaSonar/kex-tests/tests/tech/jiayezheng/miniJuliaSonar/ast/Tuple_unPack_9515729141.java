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

public class Tuple_unPack_9515729141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9585;

    public Tuple_unPack_9515729141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9586 = new ArrayList();
        ((ArrayList) term9586).add((Object)null);
        ((ArrayList) term9586).add((Object)null);
        ((ArrayList) term9586).add((Object)null);
        ((ArrayList) term9586).add((Object)null);
        ((ArrayList) term9586).add((Object)null);
        ((ArrayList) term9586).add((Object)null);
        ((ArrayList) term9586).add((Object)null);
        Class<? extends Object> term9632 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term9631 = ((Class) term9632).getDeclaredField((String) "JuliaVector");
        ((Field) term9631).setAccessible(true);
        Object enum30 = ((Field) term9631).get((Object) null);
        term9585 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Tuple"));
        setField(term9585, term9585.getClass(), "elts", term9586);
        setField(term9585, term9585.getClass(), "nodeType", enum30);
        setIntField(term9585, term9585.getClass(), "start", 335112684);
        setIntField(term9585, term9585.getClass(), "end", 1551099402);
        setField(term9585, term9585.getClass(), "file", "hoicvmsovO");
        setField(term9585, term9585.getClass(), "parent", null);
        setField(term9585, term9585.getClass(), "name", "eqJfYWRaEL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Tuple");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unPack", argTypes, term9585, args);
    }

};


