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

public class ParamType_toString_9347647201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1239;

    public ParamType_toString_9347647201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1326 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.SymbolKind");
        Field term1325 = ((Class) term1326).getDeclaredField((String) "GLOBAL");
        ((Field) term1325).setAccessible(true);
        Object enum2 = ((Field) term1325).get((Object) null);
        Class<? extends Object> term1576 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term1575 = ((Class) term1576).getDeclaredField((String) "BaseType");
        ((Field) term1575).setAccessible(true);
        Object enum3 = ((Field) term1575).get((Object) null);
        ArrayList term1289 = new ArrayList();
        ((ArrayList) term1289).add((Object)null);
        ((ArrayList) term1289).add((Object)null);
        ((ArrayList) term1289).add((Object)null);
        ((ArrayList) term1289).add((Object)null);
        ((ArrayList) term1289).add((Object)null);
        ((ArrayList) term1289).add((Object)null);
        ((ArrayList) term1289).add((Object)null);
        ((ArrayList) term1289).add((Object)null);
        ((ArrayList) term1289).add((Object)null);
        Class<? extends Object> term1842 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.ast.NodeType");
        Field term1841 = ((Class) term1842).getDeclaredField((String) "KW");
        ((Field) term1841).setAccessible(true);
        Object enum4 = ((Field) term1841).get((Object) null);
        term1239 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.ParamType"));
        Object term1240 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Symbol"));
        setField(term1240, term1240.getClass(), "type", enum2);
        setField(term1240, term1240.getClass(), "nodeType", enum3);
        setIntField(term1240, term1240.getClass(), "start", -1955890973);
        setIntField(term1240, term1240.getClass(), "end", -2038273078);
        setField(term1240, term1240.getClass(), "file", "jJCZpVmanW");
        setField(term1240, term1240.getClass(), "parent", null);
        setField(term1240, term1240.getClass(), "name", "EGtDIRbSSb");
        setField(term1239, term1239.getClass(), "type", term1240);
        setField(term1239, term1239.getClass(), "params", term1289);
        setField(term1239, term1239.getClass(), "nodeType", enum4);
        setIntField(term1239, term1239.getClass(), "start", 1227103734);
        setIntField(term1239, term1239.getClass(), "end", -1339778481);
        setField(term1239, term1239.getClass(), "file", "SzjVpOQTyS");
        setField(term1239, term1239.getClass(), "parent", null);
        setField(term1239, term1239.getClass(), "name", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.ParamType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1239, args);
    }

};


