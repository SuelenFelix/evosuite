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

public class TupleType_size_10959673358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38154;

    public TupleType_size_10959673358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38155 = new ArrayList();
        HashMap term38160 = new HashMap();
        Object term38167 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term38167, term38167.getClass(), "globalNames", null);
        setField(term38167, term38167.getClass(), "table", null);
        setField(term38167, term38167.getClass(), "parent", null);
        setField(term38167, term38167.getClass(), "forwarding", term38167);
        setField(term38167, term38167.getClass(), "supers", null);
        setField(term38167, term38167.getClass(), "globalSymbols", null);
        setField(term38167, term38167.getClass(), "stateType", null);
        setField(term38167, term38167.getClass(), "type", null);
        setField(term38167, term38167.getClass(), "path", null);
        ArrayList term38165 = new ArrayList();
        ((ArrayList) term38165).add(term38167);
        Class<? extends Object> term38200 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.State$StateType");
        Field term38199 = ((Class) term38200).getDeclaredField((String) "GLOBAL");
        ((Field) term38199).setAccessible(true);
        Object enum130 = ((Field) term38199).get((Object) null);
        term38154 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType"));
        Object term38159 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term38154, term38154.getClass(), "eltTypes", term38155);
        setField(term38159, term38159.getClass(), "globalNames", null);
        setField(term38159, term38159.getClass(), "table", term38160);
        setField(term38159, term38159.getClass(), "parent", null);
        setField(term38159, term38159.getClass(), "forwarding", term38159);
        setField(term38159, term38159.getClass(), "supers", term38165);
        setField(term38159, term38159.getClass(), "globalSymbols", null);
        setField(term38159, term38159.getClass(), "stateType", enum130);
        setField(term38159, term38159.getClass(), "type", null);
        setField(term38159, term38159.getClass(), "path", "tuple");
        setField(term38154, term38154.getClass(), "table", term38159);
        setField(term38154, term38154.getClass(), "file", "CVZnTiJucs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.TupleType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "size", argTypes, term38154, args);
    }

};


