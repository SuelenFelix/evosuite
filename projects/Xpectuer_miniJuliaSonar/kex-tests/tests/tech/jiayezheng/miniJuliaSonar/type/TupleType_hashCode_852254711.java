package tech.jiayezheng.miniJuliaSonar.type;

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
import static tech.jiayezheng.miniJuliaSonar.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;

public class TupleType_hashCode_852254711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39100;

    public TupleType_hashCode_852254711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39101 = new ArrayList();
        HashMap term39106 = new HashMap();
        Object term39113 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term39113, term39113.getClass(), "globalNames", null);
        setField(term39113, term39113.getClass(), "table", null);
        setField(term39113, term39113.getClass(), "parent", null);
        setField(term39113, term39113.getClass(), "forwarding", term39113);
        setField(term39113, term39113.getClass(), "supers", null);
        setField(term39113, term39113.getClass(), "globalSymbols", null);
        setField(term39113, term39113.getClass(), "stateType", null);
        setField(term39113, term39113.getClass(), "type", null);
        setField(term39113, term39113.getClass(), "path", null);
        ArrayList term39111 = new ArrayList();
        ((ArrayList) term39111).add(term39113);
        Class<? extends Object> term39146 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term39145 = ((Class) term39146).getDeclaredField((String) "GLOBAL");
        ((Field) term39145).setAccessible(true);
        Object enum133 = ((Field) term39145).get((Object) null);
        term39100 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        Object term39105 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term39100, term39100.getClass(), "eltTypes", term39101);
        setField(term39105, term39105.getClass(), "globalNames", null);
        setField(term39105, term39105.getClass(), "table", term39106);
        setField(term39105, term39105.getClass(), "parent", null);
        setField(term39105, term39105.getClass(), "forwarding", term39105);
        setField(term39105, term39105.getClass(), "supers", term39111);
        setField(term39105, term39105.getClass(), "globalSymbols", null);
        setField(term39105, term39105.getClass(), "stateType", enum133);
        setField(term39105, term39105.getClass(), "type", null);
        setField(term39105, term39105.getClass(), "path", "tuple");
        setField(term39100, term39100.getClass(), "table", term39105);
        setField(term39100, term39100.getClass(), "file", "JdOMfNWgLP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term39100, args);
    }

};


