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

public class PrimitiveType_toString_16194331941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19017;

    public PrimitiveType_toString_16194331941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19136 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term19135 = ((Class) term19136).getDeclaredField((String) "LOCAL");
        ((Field) term19135).setAccessible(true);
        Object enum62 = ((Field) term19135).get((Object) null);
        Class<? extends Object> term19383 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term19382 = ((Class) term19383).getDeclaredField((String) "QuoteNode");
        ((Field) term19382).setAccessible(true);
        Object enum63 = ((Field) term19382).get((Object) null);
        Class<? extends Object> term19652 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term19651 = ((Class) term19652).getDeclaredField((String) "If");
        ((Field) term19651).setAccessible(true);
        Object enum64 = ((Field) term19651).get((Object) null);
        Class<? extends Object> term19900 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term19899 = ((Class) term19900).getDeclaredField((String) "Char");
        ((Field) term19899).setAccessible(true);
        Object enum65 = ((Field) term19899).get((Object) null);
        term19017 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.PrimitiveType"));
        Object term19018 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        Object term19067 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term19018, term19018.getClass(), "type", enum62);
        setField(term19018, term19018.getClass(), "nodeType", enum63);
        setIntField(term19018, term19018.getClass(), "start", 1474524152);
        setIntField(term19018, term19018.getClass(), "end", 568954359);
        setField(term19018, term19018.getClass(), "file", "qxSDVejjiY");
        setField(term19018, term19018.getClass(), "parent", null);
        setField(term19018, term19018.getClass(), "name", "xBsXSDjXYK");
        setField(term19017, term19017.getClass(), "name", term19018);
        setField(term19067, term19067.getClass(), "type", enum62);
        setField(term19067, term19067.getClass(), "nodeType", enum64);
        setIntField(term19067, term19067.getClass(), "start", 53410913);
        setIntField(term19067, term19067.getClass(), "end", -375014958);
        setField(term19067, term19067.getClass(), "file", "sEnIVFtZuQ");
        setField(term19067, term19067.getClass(), "parent", null);
        setField(term19067, term19067.getClass(), "name", "ZVecLZMLHF");
        setField(term19017, term19017.getClass(), "base", term19067);
        setIntField(term19017, term19017.getClass(), "size", 1107176718);
        setField(term19017, term19017.getClass(), "nodeType", enum65);
        setIntField(term19017, term19017.getClass(), "start", 480137250);
        setIntField(term19017, term19017.getClass(), "end", -341152642);
        setField(term19017, term19017.getClass(), "file", "fztQhjqwdP");
        setField(term19017, term19017.getClass(), "parent", null);
        setField(term19017, term19017.getClass(), "name", "eVpkWxjuki");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.PrimitiveType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term19017, args);
    }

};


