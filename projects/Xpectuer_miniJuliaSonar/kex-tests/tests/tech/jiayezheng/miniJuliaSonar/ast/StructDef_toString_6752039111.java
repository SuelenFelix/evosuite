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

public class StructDef_toString_6752039111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49614;

    public StructDef_toString_6752039111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49753 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term49752 = ((Class) term49753).getDeclaredField((String) "GLOBAL");
        ((Field) term49752).setAccessible(true);
        Object enum165 = ((Field) term49752).get((Object) null);
        Class<? extends Object> term50003 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term50002 = ((Class) term50003).getDeclaredField((String) "JuliaVector");
        ((Field) term50002).setAccessible(true);
        Object enum166 = ((Field) term50002).get((Object) null);
        ArrayList term49669 = new ArrayList();
        ((ArrayList) term49669).add((Object)null);
        ((ArrayList) term49669).add((Object)null);
        ((ArrayList) term49669).add((Object)null);
        ((ArrayList) term49669).add((Object)null);
        ((ArrayList) term49669).add((Object)null);
        ((ArrayList) term49669).add((Object)null);
        ((ArrayList) term49669).add((Object)null);
        Class<? extends Object> term50278 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term50277 = ((Class) term50278).getDeclaredField((String) "RPAREN");
        ((Field) term50277).setAccessible(true);
        Object enum167 = ((Field) term50277).get((Object) null);
        Class<? extends Object> term50538 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term50537 = ((Class) term50538).getDeclaredField((String) "PrimitiveType");
        ((Field) term50537).setAccessible(true);
        Object enum168 = ((Field) term50537).get((Object) null);
        term49614 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.StructDef"));
        Object term49616 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term49668 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Block"));
        setBooleanField(term49614, term49614.getClass(), "mutable", true);
        setField(term49616, term49616.getClass(), "type", enum165);
        setField(term49616, term49616.getClass(), "nodeType", enum166);
        setIntField(term49616, term49616.getClass(), "start", -1422859977);
        setIntField(term49616, term49616.getClass(), "end", -1972436591);
        setField(term49616, term49616.getClass(), "file", "yUGCjlqgJE");
        setField(term49616, term49616.getClass(), "parent", null);
        setField(term49616, term49616.getClass(), "name", "PXdVZyoJyC");
        setField(term49614, term49614.getClass(), "name", term49616);
        setField(term49614, term49614.getClass(), "baseType", null);
        setField(term49668, term49668.getClass(), "args", term49669);
        setField(term49668, term49668.getClass(), "nodeType", enum167);
        setIntField(term49668, term49668.getClass(), "start", 68922753);
        setIntField(term49668, term49668.getClass(), "end", -220791533);
        setField(term49668, term49668.getClass(), "file", "vLerpqavFM");
        setField(term49668, term49668.getClass(), "parent", null);
        setField(term49668, term49668.getClass(), "name", "qnvxzwuGKX");
        setField(term49614, term49614.getClass(), "body", term49668);
        setField(term49614, term49614.getClass(), "nodeType", enum168);
        setIntField(term49614, term49614.getClass(), "start", 1741500243);
        setIntField(term49614, term49614.getClass(), "end", -2070466617);
        setField(term49614, term49614.getClass(), "file", "EdPAvpluZg");
        setField(term49614, term49614.getClass(), "parent", null);
        setField(term49614, term49614.getClass(), "name", "DzHVBMqWtE");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.StructDef");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term49614, args);
    }

};


