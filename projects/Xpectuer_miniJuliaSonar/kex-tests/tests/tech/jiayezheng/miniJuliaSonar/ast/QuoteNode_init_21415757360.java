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
import java.lang.Integer;

public class QuoteNode_init_21415757360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15748;
     Object term15792;
     Object term15794;

    public QuoteNode_init_21415757360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15809 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term15808 = ((Class) term15809).getDeclaredField((String) "STRUCT");
        ((Field) term15808).setAccessible(true);
        Object enum51 = ((Field) term15808).get((Object) null);
        Class<? extends Object> term16059 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term16058 = ((Class) term16059).getDeclaredField((String) "Ref");
        ((Field) term16058).setAccessible(true);
        Object enum52 = ((Field) term16058).get((Object) null);
        term15748 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term15748, term15748.getClass(), "type", enum51);
        setField(term15748, term15748.getClass(), "nodeType", enum52);
        setIntField(term15748, term15748.getClass(), "start", -894662986);
        setIntField(term15748, term15748.getClass(), "end", 304775596);
        setField(term15748, term15748.getClass(), "file", "PHvxnGHptP");
        setField(term15748, term15748.getClass(), "parent", null);
        setField(term15748, term15748.getClass(), "name", "TimdotUuNC");
        term15792 = new Integer(-1347665717);
        term15794 = new Integer(-1888585309);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.QuoteNode");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = term15748;
        args[1] = term15792;
        args[2] = term15794;
        args[3] = "PkWMRdJcBb";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


