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

public class StructType_getInstances_12223982016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71006;

    public StructType_getInstances_12223982016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term71007 = new HashMap();
        ArrayList term71029 = new ArrayList();
        ((ArrayList) term71029).add((Object)null);
        ((ArrayList) term71029).add((Object)null);
        ((ArrayList) term71029).add((Object)null);
        ((ArrayList) term71029).add((Object)null);
        ((ArrayList) term71029).add((Object)null);
        ((ArrayList) term71029).add((Object)null);
        term71006 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType"));
        Object term71033 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term71006, term71006.getClass(), "instances", term71007);
        setField(term71006, term71006.getClass(), "name", "QqeCgeRpIS");
        setField(term71006, term71006.getClass(), "baseType", term71029);
        setField(term71033, term71033.getClass(), "globalNames", null);
        setField(term71033, term71033.getClass(), "table", null);
        setField(term71033, term71033.getClass(), "parent", null);
        setField(term71033, term71033.getClass(), "forwarding", null);
        setField(term71033, term71033.getClass(), "supers", null);
        setField(term71033, term71033.getClass(), "globalSymbols", null);
        setField(term71033, term71033.getClass(), "stateType", null);
        setField(term71033, term71033.getClass(), "type", null);
        setField(term71033, term71033.getClass(), "path", null);
        setField(term71006, term71006.getClass(), "table", term71033);
        setField(term71006, term71006.getClass(), "file", "xVwossmLda");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstances", argTypes, term71006, args);
    }

};


