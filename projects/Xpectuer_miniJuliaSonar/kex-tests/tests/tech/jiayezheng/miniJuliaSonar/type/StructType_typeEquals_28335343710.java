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

public class StructType_typeEquals_28335343710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72394;
     Object term72434;

    public StructType_typeEquals_28335343710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term72395 = new HashMap();
        ArrayList term72417 = new ArrayList();
        ((ArrayList) term72417).add((Object)null);
        ((ArrayList) term72417).add((Object)null);
        ((ArrayList) term72417).add((Object)null);
        term72394 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType"));
        Object term72421 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.State"));
        setField(term72394, term72394.getClass(), "instances", term72395);
        setField(term72394, term72394.getClass(), "name", "eEXpzGjDgl");
        setField(term72394, term72394.getClass(), "baseType", term72417);
        setField(term72421, term72421.getClass(), "globalNames", null);
        setField(term72421, term72421.getClass(), "table", null);
        setField(term72421, term72421.getClass(), "parent", null);
        setField(term72421, term72421.getClass(), "forwarding", null);
        setField(term72421, term72421.getClass(), "supers", null);
        setField(term72421, term72421.getClass(), "globalSymbols", null);
        setField(term72421, term72421.getClass(), "stateType", null);
        setField(term72421, term72421.getClass(), "type", null);
        setField(term72421, term72421.getClass(), "path", null);
        setField(term72394, term72394.getClass(), "table", term72421);
        setField(term72394, term72394.getClass(), "file", "vGLuBgtHzA");
        term72434 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.type.StructType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term72434;
        callMethod(klass, "typeEquals", argTypes, term72394, args);
    }

};


