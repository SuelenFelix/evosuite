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

public class AbstractType_init_12068645770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7274;
     Object term7317;
     Object term7362;
     Object term7364;

    public AbstractType_init_12068645770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7379 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term7378 = ((Class) term7379).getDeclaredField((String) "GLOBAL");
        ((Field) term7378).setAccessible(true);
        Object enum22 = ((Field) term7378).get((Object) null);
        Class<? extends Object> term7629 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term7628 = ((Class) term7629).getDeclaredField((String) "If");
        ((Field) term7628).setAccessible(true);
        Object enum23 = ((Field) term7628).get((Object) null);
        term7274 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term7274, term7274.getClass(), "type", enum22);
        setField(term7274, term7274.getClass(), "nodeType", enum23);
        setIntField(term7274, term7274.getClass(), "start", 1596070772);
        setIntField(term7274, term7274.getClass(), "end", 97029295);
        setField(term7274, term7274.getClass(), "file", "nGKItKLYNC");
        setField(term7274, term7274.getClass(), "parent", null);
        setField(term7274, term7274.getClass(), "name", "UiUYnPrcCi");
        Class<? extends Object> term7877 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term7876 = ((Class) term7877).getDeclaredField((String) "LOCAL");
        ((Field) term7876).setAccessible(true);
        Object enum24 = ((Field) term7876).get((Object) null);
        Class<? extends Object> term8124 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term8123 = ((Class) term8124).getDeclaredField((String) "Catch");
        ((Field) term8123).setAccessible(true);
        Object enum25 = ((Field) term8123).get((Object) null);
        term7317 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term7317, term7317.getClass(), "type", enum24);
        setField(term7317, term7317.getClass(), "nodeType", enum25);
        setIntField(term7317, term7317.getClass(), "start", -1371869594);
        setIntField(term7317, term7317.getClass(), "end", -2095575670);
        setField(term7317, term7317.getClass(), "file", "UoYtihxVaS");
        setField(term7317, term7317.getClass(), "parent", null);
        setField(term7317, term7317.getClass(), "name", "JDswTTCZHV");
        term7362 = new Integer(1225272962);
        term7364 = new Integer(1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.AbstractType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term7274;
        args[1] = term7317;
        args[2] = term7362;
        args[3] = term7364;
        args[4] = "onpbIeEKoi";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


