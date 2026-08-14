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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TupleType_printType_59117273012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39415;
     Object term39460;

    public TupleType_printType_59117273012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term39416 = new ArrayList();
        HashMap term39421 = new HashMap();
        Object term39428 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term39428, term39428.getClass(), "globalNames", null);
        setField(term39428, term39428.getClass(), "table", null);
        setField(term39428, term39428.getClass(), "parent", null);
        setField(term39428, term39428.getClass(), "forwarding", term39428);
        setField(term39428, term39428.getClass(), "supers", null);
        setField(term39428, term39428.getClass(), "globalSymbols", null);
        setField(term39428, term39428.getClass(), "stateType", null);
        setField(term39428, term39428.getClass(), "type", null);
        setField(term39428, term39428.getClass(), "path", null);
        ArrayList term39426 = new ArrayList();
        ((ArrayList) term39426).add(term39428);
        Class<? extends Object> term39477 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term39476 = ((Class) term39477).getDeclaredField((String) "GLOBAL");
        ((Field) term39476).setAccessible(true);
        Object enum134 = ((Field) term39476).get((Object) null);
        term39415 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        Object term39420 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term39415, term39415.getClass(), "eltTypes", term39416);
        setField(term39420, term39420.getClass(), "globalNames", null);
        setField(term39420, term39420.getClass(), "table", term39421);
        setField(term39420, term39420.getClass(), "parent", null);
        setField(term39420, term39420.getClass(), "forwarding", term39420);
        setField(term39420, term39420.getClass(), "supers", term39426);
        setField(term39420, term39420.getClass(), "globalSymbols", null);
        setField(term39420, term39420.getClass(), "stateType", enum134);
        setField(term39420, term39420.getClass(), "type", null);
        setField(term39420, term39420.getClass(), "path", "tuple");
        setField(term39415, term39415.getClass(), "table", term39420);
        setField(term39415, term39415.getClass(), "file", "uWqXrwAsDU");
        HashMap term39462 = new HashMap();
        HashMap term39468 = new HashMap();
        Set<Object> term39746 =  ((Map) term39468).keySet();
        HashSet term39467 = new HashSet((Collection<? extends Object>) term39746);
        term39460 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder"));
        setIntField(term39460, term39460.getClass(), "count", 1107176718);
        setField(term39460, term39460.getClass(), "elements", term39462);
        setField(term39460, term39460.getClass(), "used", term39467);
        setField(term39460, term39460.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.type.Type$CyclicTypeRecorder");
        Object[] args = new Object[1];
        args[0] = term39460;
        callMethod(klass, "printType", argTypes, term39415, args);
    }

};


