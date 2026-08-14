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

public class TupleType_add_3778892866 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37522;

    public TupleType_add_3778892866() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37523 = new ArrayList();
        HashMap term37528 = new HashMap();
        Object term37535 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term37535, term37535.getClass(), "globalNames", null);
        setField(term37535, term37535.getClass(), "table", null);
        setField(term37535, term37535.getClass(), "parent", null);
        setField(term37535, term37535.getClass(), "forwarding", term37535);
        setField(term37535, term37535.getClass(), "supers", null);
        setField(term37535, term37535.getClass(), "globalSymbols", null);
        setField(term37535, term37535.getClass(), "stateType", null);
        setField(term37535, term37535.getClass(), "type", null);
        setField(term37535, term37535.getClass(), "path", null);
        ArrayList term37533 = new ArrayList();
        ((ArrayList) term37533).add(term37535);
        Class<? extends Object> term37568 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term37567 = ((Class) term37568).getDeclaredField((String) "GLOBAL");
        ((Field) term37567).setAccessible(true);
        Object enum128 = ((Field) term37567).get((Object) null);
        term37522 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        Object term37527 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term37522, term37522.getClass(), "eltTypes", term37523);
        setField(term37527, term37527.getClass(), "globalNames", null);
        setField(term37527, term37527.getClass(), "table", term37528);
        setField(term37527, term37527.getClass(), "parent", null);
        setField(term37527, term37527.getClass(), "forwarding", term37527);
        setField(term37527, term37527.getClass(), "supers", term37533);
        setField(term37527, term37527.getClass(), "globalSymbols", null);
        setField(term37527, term37527.getClass(), "stateType", enum128);
        setField(term37527, term37527.getClass(), "type", null);
        setField(term37527, term37527.getClass(), "path", "tuple");
        setField(term37522, term37522.getClass(), "table", term37527);
        setField(term37522, term37522.getClass(), "file", "sgfGySMODT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term37522, args);
    }

};


