package tech.jiayezheng.miniJuliaSonar;

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
import static tech.jiayezheng.miniJuliaSonar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Binding_initLocationInfo_19118217161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20181;

    public Binding_initLocationInfo_19118217161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20266 = Class.forName((String) "tech.jiayezheng.miniJuliaSonar.Binding$Kind");
        Field term20265 = ((Class) term20266).getDeclaredField((String) "DATATYPE");
        ((Field) term20265).setAccessible(true);
        Object enum60 = ((Field) term20265).get((Object) null);
        HashMap term20221 = new HashMap();
        Set<Object> term20511 =  ((Map) term20221).keySet();
        HashSet term20220 = new HashSet((Collection<? extends Object>) term20511);
        term20181 = newInstance(Class.forName("tech.jiayezheng.miniJuliaSonar.Binding"));
        setBooleanField(term20181, term20181.getClass(), "isBuiltin", true);
        setBooleanField(term20181, term20181.getClass(), "isSynthetic", true);
        setField(term20181, term20181.getClass(), "name", "hGTqHomrbc");
        setField(term20181, term20181.getClass(), "node", null);
        setField(term20181, term20181.getClass(), "qname", "NNMBrIWEBw");
        setField(term20181, term20181.getClass(), "type", null);
        setField(term20181, term20181.getClass(), "kind", enum60);
        setField(term20181, term20181.getClass(), "refs", term20220);
        setIntField(term20181, term20181.getClass(), "start", 344323424);
        setIntField(term20181, term20181.getClass(), "end", 9726679);
        setIntField(term20181, term20181.getClass(), "bodyStart", -25637976);
        setIntField(term20181, term20181.getClass(), "bodyEnd", 1555897383);
        setField(term20181, term20181.getClass(), "fileOrUrl", "GrTaccOQzl");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("tech.jiayezheng.miniJuliaSonar.Binding");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("tech.jiayezheng.miniJuliaSonar.ast.Node");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "initLocationInfo", argTypes, term20181, args);
    }

};


