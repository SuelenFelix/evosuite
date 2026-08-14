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

public class PrimitiveType_init_19504682940 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18135;
     Object term18185;
     Object term18219;
     Object term18221;
     Object term18223;

    public PrimitiveType_init_19504682940() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18238 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term18237 = ((Class) term18238).getDeclaredField((String) "STRUCT");
        ((Field) term18237).setAccessible(true);
        Object enum59 = ((Field) term18237).get((Object) null);
        Class<? extends Object> term18488 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term18487 = ((Class) term18488).getDeclaredField((String) "ParamType");
        ((Field) term18487).setAccessible(true);
        Object enum60 = ((Field) term18487).get((Object) null);
        term18135 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term18135, term18135.getClass(), "type", enum59);
        setField(term18135, term18135.getClass(), "nodeType", enum60);
        setIntField(term18135, term18135.getClass(), "start", -893623680);
        setIntField(term18135, term18135.getClass(), "end", -1963434938);
        setField(term18135, term18135.getClass(), "file", "SPpkrGcPRr");
        setField(term18135, term18135.getClass(), "parent", null);
        setField(term18135, term18135.getClass(), "name", "sEccwbJKYE");
        Class<? extends Object> term18757 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term18756 = ((Class) term18757).getDeclaredField((String) "Dot");
        ((Field) term18756).setAccessible(true);
        Object enum61 = ((Field) term18756).get((Object) null);
        term18185 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term18185, term18185.getClass(), "type", enum59);
        setField(term18185, term18185.getClass(), "nodeType", enum61);
        setIntField(term18185, term18185.getClass(), "start", 906181092);
        setIntField(term18185, term18185.getClass(), "end", 1045657203);
        setField(term18185, term18185.getClass(), "file", "AWRooQKkdW");
        setField(term18185, term18185.getClass(), "parent", null);
        setField(term18185, term18185.getClass(), "name", "vjxIhXHxGR");
        term18219 = new Integer(1386130016);
        term18221 = new Integer(1072005683);
        term18223 = new Integer(1861318859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.PrimitiveType");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = Class.forName("java.lang.String");
        Object[] args = new Object[6];
        args[0] = term18135;
        args[1] = term18185;
        args[2] = term18219;
        args[3] = term18221;
        args[4] = term18223;
        args[5] = "QXzGXbEXMu";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


