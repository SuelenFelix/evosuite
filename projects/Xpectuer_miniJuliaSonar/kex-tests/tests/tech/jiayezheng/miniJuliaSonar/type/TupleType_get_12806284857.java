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
import java.lang.Integer;

public class TupleType_get_12806284857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37837;
     Object term37882;

    public TupleType_get_12806284857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37838 = new ArrayList();
        HashMap term37843 = new HashMap();
        Object term37850 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term37850, term37850.getClass(), "globalNames", null);
        setField(term37850, term37850.getClass(), "table", null);
        setField(term37850, term37850.getClass(), "parent", null);
        setField(term37850, term37850.getClass(), "forwarding", term37850);
        setField(term37850, term37850.getClass(), "supers", null);
        setField(term37850, term37850.getClass(), "globalSymbols", null);
        setField(term37850, term37850.getClass(), "stateType", null);
        setField(term37850, term37850.getClass(), "type", null);
        setField(term37850, term37850.getClass(), "path", null);
        ArrayList term37848 = new ArrayList();
        ((ArrayList) term37848).add(term37850);
        Class<? extends Object> term37885 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term37884 = ((Class) term37885).getDeclaredField((String) "GLOBAL");
        ((Field) term37884).setAccessible(true);
        Object enum129 = ((Field) term37884).get((Object) null);
        term37837 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        Object term37842 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term37837, term37837.getClass(), "eltTypes", term37838);
        setField(term37842, term37842.getClass(), "globalNames", null);
        setField(term37842, term37842.getClass(), "table", term37843);
        setField(term37842, term37842.getClass(), "parent", null);
        setField(term37842, term37842.getClass(), "forwarding", term37842);
        setField(term37842, term37842.getClass(), "supers", term37848);
        setField(term37842, term37842.getClass(), "globalSymbols", null);
        setField(term37842, term37842.getClass(), "stateType", enum129);
        setField(term37842, term37842.getClass(), "type", null);
        setField(term37842, term37842.getClass(), "path", "tuple");
        setField(term37837, term37837.getClass(), "table", term37842);
        setField(term37837, term37837.getClass(), "file", "ndAITnOsny");
        term37882 = new Integer(-375014958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term37882;
        callMethod(klass, "get", argTypes, term37837, args);
    }

};


