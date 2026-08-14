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

public class BaseType_init_8677395360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5169;
     Object term5214;
     Object term5267;
     Object term5269;

    public BaseType_init_8677395360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5284 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term5283 = ((Class) term5284).getDeclaredField((String) "LOCAL");
        ((Field) term5283).setAccessible(true);
        Object enum15 = ((Field) term5283).get((Object) null);
        Class<? extends Object> term5531 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term5530 = ((Class) term5531).getDeclaredField((String) "BinOp");
        ((Field) term5530).setAccessible(true);
        Object enum16 = ((Field) term5530).get((Object) null);
        term5169 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term5169, term5169.getClass(), "type", enum15);
        setField(term5169, term5169.getClass(), "nodeType", enum16);
        setIntField(term5169, term5169.getClass(), "start", 1876565163);
        setIntField(term5169, term5169.getClass(), "end", -817164822);
        setField(term5169, term5169.getClass(), "file", "xrwlQZdwCp");
        setField(term5169, term5169.getClass(), "parent", null);
        setField(term5169, term5169.getClass(), "name", "IDCWpPLRkE");
        Class<? extends Object> term5788 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term5787 = ((Class) term5788).getDeclaredField((String) "STRUCT");
        ((Field) term5787).setAccessible(true);
        Object enum17 = ((Field) term5787).get((Object) null);
        Class<? extends Object> term6038 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term6037 = ((Class) term6038).getDeclaredField((String) "AbstractType");
        ((Field) term6037).setAccessible(true);
        Object enum18 = ((Field) term6037).get((Object) null);
        term5214 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term5214, term5214.getClass(), "type", enum17);
        setField(term5214, term5214.getClass(), "nodeType", enum18);
        setIntField(term5214, term5214.getClass(), "start", -1016503459);
        setIntField(term5214, term5214.getClass(), "end", -1968847291);
        setField(term5214, term5214.getClass(), "file", "nyiiPDVjAc");
        setField(term5214, term5214.getClass(), "parent", null);
        setField(term5214, term5214.getClass(), "name", "aKnKipADSo");
        term5267 = new Integer(579005622);
        term5269 = new Integer(-14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.BaseType");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[1] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term5169;
        args[1] = term5214;
        args[2] = term5267;
        args[3] = term5269;
        args[4] = "wSQxaModmm";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


