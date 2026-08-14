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

public class TupleType_toVectorType_2925047609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38469;

    public TupleType_toVectorType_2925047609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38470 = new ArrayList();
        HashMap term38475 = new HashMap();
        Object term38482 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term38482, term38482.getClass(), "globalNames", null);
        setField(term38482, term38482.getClass(), "table", null);
        setField(term38482, term38482.getClass(), "parent", null);
        setField(term38482, term38482.getClass(), "forwarding", term38482);
        setField(term38482, term38482.getClass(), "supers", null);
        setField(term38482, term38482.getClass(), "globalSymbols", null);
        setField(term38482, term38482.getClass(), "stateType", null);
        setField(term38482, term38482.getClass(), "type", null);
        setField(term38482, term38482.getClass(), "path", null);
        ArrayList term38480 = new ArrayList();
        ((ArrayList) term38480).add(term38482);
        Class<? extends Object> term38515 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term38514 = ((Class) term38515).getDeclaredField((String) "GLOBAL");
        ((Field) term38514).setAccessible(true);
        Object enum131 = ((Field) term38514).get((Object) null);
        term38469 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        Object term38474 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term38469, term38469.getClass(), "eltTypes", term38470);
        setField(term38474, term38474.getClass(), "globalNames", null);
        setField(term38474, term38474.getClass(), "table", term38475);
        setField(term38474, term38474.getClass(), "parent", null);
        setField(term38474, term38474.getClass(), "forwarding", term38474);
        setField(term38474, term38474.getClass(), "supers", term38480);
        setField(term38474, term38474.getClass(), "globalSymbols", null);
        setField(term38474, term38474.getClass(), "stateType", enum131);
        setField(term38474, term38474.getClass(), "type", null);
        setField(term38474, term38474.getClass(), "path", "tuple");
        setField(term38469, term38469.getClass(), "table", term38474);
        setField(term38469, term38469.getClass(), "file", "ecHEQufXoq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toVectorType", argTypes, term38469, args);
    }

};


