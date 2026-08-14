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
import java.lang.String;

public class QuoteNode_toString_17582208891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16319;

    public QuoteNode_toString_17582208891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16402 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term16401 = ((Class) term16402).getDeclaredField((String) "LOCAL");
        ((Field) term16401).setAccessible(true);
        Object enum53 = ((Field) term16401).get((Object) null);
        Class<? extends Object> term16649 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term16648 = ((Class) term16649).getDeclaredField((String) "Ref");
        ((Field) term16648).setAccessible(true);
        Object enum54 = ((Field) term16648).get((Object) null);
        Class<? extends Object> term16900 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term16899 = ((Class) term16900).getDeclaredField((String) "TypeDecl");
        ((Field) term16899).setAccessible(true);
        Object enum55 = ((Field) term16899).get((Object) null);
        term16319 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.QuoteNode"));
        Object term16320 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term16320, term16320.getClass(), "type", enum53);
        setField(term16320, term16320.getClass(), "nodeType", enum54);
        setIntField(term16320, term16320.getClass(), "start", 683666002);
        setIntField(term16320, term16320.getClass(), "end", 1596213415);
        setField(term16320, term16320.getClass(), "file", "jSpAteRute");
        setField(term16320, term16320.getClass(), "parent", null);
        setField(term16320, term16320.getClass(), "name", "swZVeJAxjt");
        setField(term16319, term16319.getClass(), "name", term16320);
        setField(term16319, term16319.getClass(), "nodeType", enum55);
        setIntField(term16319, term16319.getClass(), "start", -268815336);
        setIntField(term16319, term16319.getClass(), "end", -1210583429);
        setField(term16319, term16319.getClass(), "file", "xOcJIiQQDu");
        setField(term16319, term16319.getClass(), "parent", null);
        setField(term16319, term16319.getClass(), "name", "GVizqqzXpy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.QuoteNode");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term16319, args);
    }

};


