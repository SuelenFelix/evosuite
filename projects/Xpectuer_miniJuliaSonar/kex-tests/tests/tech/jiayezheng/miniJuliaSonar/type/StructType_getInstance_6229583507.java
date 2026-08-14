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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedList;

public class StructType_getInstance_6229583507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71066;
     Object term71106;

    public StructType_getInstance_6229583507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term71067 = new HashMap();
        ArrayList term71089 = new ArrayList();
        ((ArrayList) term71089).add((Object)null);
        ((ArrayList) term71089).add((Object)null);
        ((ArrayList) term71089).add((Object)null);
        ((ArrayList) term71089).add((Object)null);
        ((ArrayList) term71089).add((Object)null);
        term71066 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType"));
        Object term71093 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term71066, term71066.getClass(), "instances", term71067);
        setField(term71066, term71066.getClass(), "name", "csnhUIxUaP");
        setField(term71066, term71066.getClass(), "baseType", term71089);
        setField(term71093, term71093.getClass(), "globalNames", null);
        setField(term71093, term71093.getClass(), "table", null);
        setField(term71093, term71093.getClass(), "parent", null);
        setField(term71093, term71093.getClass(), "forwarding", null);
        setField(term71093, term71093.getClass(), "supers", null);
        setField(term71093, term71093.getClass(), "globalSymbols", null);
        setField(term71093, term71093.getClass(), "stateType", null);
        setField(term71093, term71093.getClass(), "type", null);
        setField(term71093, term71093.getClass(), "path", null);
        setField(term71066, term71066.getClass(), "table", term71093);
        setField(term71066, term71066.getClass(), "file", "fmWYICGnwt");
        term71106 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term71106;
        callMethod(klass, "getInstance", argTypes, term71066, args);
    }

};


