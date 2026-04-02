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
import java.util.ArrayList;

public class FuncDef_toString_8228166504 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44780;

    public FuncDef_toString_8228166504() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term44995 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term44994 = ((Class) term44995).getDeclaredField((String) "STRUCT");
        ((Field) term44994).setAccessible(true);
        Object enum149 = ((Field) term44994).get((Object) null);
        Class<? extends Object> term45245 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term45244 = ((Class) term45245).getDeclaredField((String) "KW");
        ((Field) term45244).setAccessible(true);
        Object enum150 = ((Field) term45244).get((Object) null);
        ArrayList term44824 = new ArrayList();
        ((ArrayList) term44824).add((Object)null);
        ((ArrayList) term44824).add((Object)null);
        ((ArrayList) term44824).add((Object)null);
        ((ArrayList) term44824).add((Object)null);
        ((ArrayList) term44824).add((Object)null);
        ArrayList term44828 = new ArrayList();
        Class<? extends Object> term45493 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term45492 = ((Class) term45493).getDeclaredField((String) "GLOBAL");
        ((Field) term45492).setAccessible(true);
        Object enum151 = ((Field) term45492).get((Object) null);
        Class<? extends Object> term45743 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term45742 = ((Class) term45743).getDeclaredField((String) "Dot");
        ((Field) term45742).setAccessible(true);
        Object enum152 = ((Field) term45742).get((Object) null);
        Class<? extends Object> term45994 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term45993 = ((Class) term45994).getDeclaredField((String) "JuliaModule");
        ((Field) term45993).setAccessible(true);
        Object enum153 = ((Field) term45993).get((Object) null);
        Class<? extends Object> term46269 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term46268 = ((Class) term46269).getDeclaredField((String) "Operator");
        ((Field) term46268).setAccessible(true);
        Object enum154 = ((Field) term46268).get((Object) null);
        Class<? extends Object> term46535 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term46534 = ((Class) term46535).getDeclaredField((String) "BinOp");
        ((Field) term46534).setAccessible(true);
        Object enum155 = ((Field) term46534).get((Object) null);
        term44780 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef"));
        Object term44781 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term44832 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term44876 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term44918 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.End"));
        setField(term44781, term44781.getClass(), "type", enum149);
        setField(term44781, term44781.getClass(), "nodeType", enum150);
        setIntField(term44781, term44781.getClass(), "start", 574481092);
        setIntField(term44781, term44781.getClass(), "end", -310528004);
        setField(term44781, term44781.getClass(), "file", "jDmhBrIoDa");
        setField(term44781, term44781.getClass(), "parent", null);
        setField(term44781, term44781.getClass(), "name", "SPtPatHeOm");
        setField(term44780, term44780.getClass(), "name", term44781);
        setField(term44780, term44780.getClass(), "params", term44824);
        setField(term44780, term44780.getClass(), "defaults", term44828);
        setField(term44832, term44832.getClass(), "type", enum151);
        setField(term44832, term44832.getClass(), "nodeType", enum152);
        setIntField(term44832, term44832.getClass(), "start", -634976996);
        setIntField(term44832, term44832.getClass(), "end", -1015274146);
        setField(term44832, term44832.getClass(), "file", "ywmcuThdfL");
        setField(term44832, term44832.getClass(), "parent", null);
        setField(term44832, term44832.getClass(), "name", "GBOEuByOfr");
        setField(term44780, term44780.getClass(), "vararg", term44832);
        setField(term44876, term44876.getClass(), "type", enum149);
        setField(term44876, term44876.getClass(), "nodeType", enum153);
        setIntField(term44876, term44876.getClass(), "start", -49052672);
        setIntField(term44876, term44876.getClass(), "end", 339372704);
        setField(term44876, term44876.getClass(), "file", "NHbOFFjyVK");
        setField(term44876, term44876.getClass(), "parent", null);
        setField(term44876, term44876.getClass(), "name", "zaloBqlrSo");
        setField(term44780, term44780.getClass(), "kwarg", term44876);
        setField(term44780, term44780.getClass(), "body", null);
        setField(term44918, term44918.getClass(), "nodeType", enum154);
        setIntField(term44918, term44918.getClass(), "start", -851097944);
        setIntField(term44918, term44918.getClass(), "end", 803925431);
        setField(term44918, term44918.getClass(), "file", "vvoLrMGCoN");
        setField(term44918, term44918.getClass(), "parent", null);
        setField(term44918, term44918.getClass(), "name", "pXdglvyrQe");
        setField(term44780, term44780.getClass(), "end", term44918);
        setBooleanField(term44780, term44780.getClass(), "called", false);
        setBooleanField(term44780, term44780.getClass(), "isLambda", false);
        setField(term44780, term44780.getClass(), "nodeType", enum155);
        setIntField(term44780, term44780.getClass(), "start", 76929641);
        setIntField(term44780, term44780.getClass(), "end", -2003192918);
        setField(term44780, term44780.getClass(), "file", "OcfNzHYdki");
        setField(term44780, term44780.getClass(), "parent", null);
        setField(term44780, term44780.getClass(), "name", "uPuCVuZYOI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.FuncDef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term44780, args);
    }

};


