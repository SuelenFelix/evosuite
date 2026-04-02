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
import java.util.LinkedList;

public class TupleType_setElementTypes_10477906715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37204;
     Object term37249;

    public TupleType_setElementTypes_10477906715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term37205 = new ArrayList();
        HashMap term37210 = new HashMap();
        Object term37217 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term37217, term37217.getClass(), "globalNames", null);
        setField(term37217, term37217.getClass(), "table", null);
        setField(term37217, term37217.getClass(), "parent", null);
        setField(term37217, term37217.getClass(), "forwarding", term37217);
        setField(term37217, term37217.getClass(), "supers", null);
        setField(term37217, term37217.getClass(), "globalSymbols", null);
        setField(term37217, term37217.getClass(), "stateType", null);
        setField(term37217, term37217.getClass(), "type", null);
        setField(term37217, term37217.getClass(), "path", null);
        ArrayList term37215 = new ArrayList();
        ((ArrayList) term37215).add(term37217);
        Class<? extends Object> term37253 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term37252 = ((Class) term37253).getDeclaredField((String) "GLOBAL");
        ((Field) term37252).setAccessible(true);
        Object enum127 = ((Field) term37252).get((Object) null);
        term37204 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        Object term37209 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term37204, term37204.getClass(), "eltTypes", term37205);
        setField(term37209, term37209.getClass(), "globalNames", null);
        setField(term37209, term37209.getClass(), "table", term37210);
        setField(term37209, term37209.getClass(), "parent", null);
        setField(term37209, term37209.getClass(), "forwarding", term37209);
        setField(term37209, term37209.getClass(), "supers", term37215);
        setField(term37209, term37209.getClass(), "globalSymbols", null);
        setField(term37209, term37209.getClass(), "stateType", enum127);
        setField(term37209, term37209.getClass(), "type", null);
        setField(term37209, term37209.getClass(), "path", "tuple");
        setField(term37204, term37204.getClass(), "table", term37209);
        setField(term37204, term37204.getClass(), "file", "OwPIiBRuKK");
        term37249 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term37249;
        callMethod(klass, "setElementTypes", argTypes, term37204, args);
    }

};


