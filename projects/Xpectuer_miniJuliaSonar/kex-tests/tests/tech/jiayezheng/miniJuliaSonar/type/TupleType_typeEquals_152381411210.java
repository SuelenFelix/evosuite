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

public class TupleType_typeEquals_152381411210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38784;
     Object term38829;

    public TupleType_typeEquals_152381411210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38785 = new ArrayList();
        HashMap term38790 = new HashMap();
        Object term38797 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term38797, term38797.getClass(), "globalNames", null);
        setField(term38797, term38797.getClass(), "table", null);
        setField(term38797, term38797.getClass(), "parent", null);
        setField(term38797, term38797.getClass(), "forwarding", term38797);
        setField(term38797, term38797.getClass(), "supers", null);
        setField(term38797, term38797.getClass(), "globalSymbols", null);
        setField(term38797, term38797.getClass(), "stateType", null);
        setField(term38797, term38797.getClass(), "type", null);
        setField(term38797, term38797.getClass(), "path", null);
        ArrayList term38795 = new ArrayList();
        ((ArrayList) term38795).add(term38797);
        Class<? extends Object> term38831 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term38830 = ((Class) term38831).getDeclaredField((String) "GLOBAL");
        ((Field) term38830).setAccessible(true);
        Object enum132 = ((Field) term38830).get((Object) null);
        term38784 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        Object term38789 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term38784, term38784.getClass(), "eltTypes", term38785);
        setField(term38789, term38789.getClass(), "globalNames", null);
        setField(term38789, term38789.getClass(), "table", term38790);
        setField(term38789, term38789.getClass(), "parent", null);
        setField(term38789, term38789.getClass(), "forwarding", term38789);
        setField(term38789, term38789.getClass(), "supers", term38795);
        setField(term38789, term38789.getClass(), "globalSymbols", null);
        setField(term38789, term38789.getClass(), "stateType", enum132);
        setField(term38789, term38789.getClass(), "type", null);
        setField(term38789, term38789.getClass(), "path", "tuple");
        setField(term38784, term38784.getClass(), "table", term38789);
        setField(term38784, term38784.getClass(), "file", "btBLMvHzJg");
        term38829 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term38829;
        callMethod(klass, "typeEquals", argTypes, term38784, args);
    }

};


