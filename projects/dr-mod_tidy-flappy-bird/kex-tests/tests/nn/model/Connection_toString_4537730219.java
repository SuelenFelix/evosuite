package nn.model;

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
import static nn.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;

public class Connection_toString_4537730219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2144;

    public Connection_toString_4537730219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2203 = Class.forName((String) "nn.model.Type");
        Field term2202 = ((Class) term2203).getDeclaredField((String) "SENSOR");
        ((Field) term2202).setAccessible(true);
        Object enum17 = ((Field) term2202).get((Object) null);
        Object term2159 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2159, term2159.getClass(), "in", null);
        setField(term2159, term2159.getClass(), "out", null);
        setFloatField(term2159, term2159.getClass(), "weight", 0.97831506F);
        setBooleanField(term2159, term2159.getClass(), "expressed", true);
        setIntField(term2159, term2159.getClass(), "innovation", -1002370457);
        Object term2163 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2163, term2163.getClass(), "in", null);
        setField(term2163, term2163.getClass(), "out", null);
        setFloatField(term2163, term2163.getClass(), "weight", 0.0F);
        setBooleanField(term2163, term2163.getClass(), "expressed", false);
        setIntField(term2163, term2163.getClass(), "innovation", 0);
        ArrayList term2157 = new ArrayList();
        ((ArrayList) term2157).add(term2159);
        ((ArrayList) term2157).add(term2163);
        Class<? extends Object> term2293 = Class.forName((String) "nn.model.Type");
        Field term2292 = ((Class) term2293).getDeclaredField((String) "HIDDEN");
        ((Field) term2292).setAccessible(true);
        Object enum18 = ((Field) term2292).get((Object) null);
        Object term2184 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2184, term2184.getClass(), "in", null);
        setField(term2184, term2184.getClass(), "out", null);
        setFloatField(term2184, term2184.getClass(), "weight", 0.0F);
        setBooleanField(term2184, term2184.getClass(), "expressed", false);
        setIntField(term2184, term2184.getClass(), "innovation", 0);
        Object term2188 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2188, term2188.getClass(), "in", null);
        setField(term2188, term2188.getClass(), "out", null);
        setFloatField(term2188, term2188.getClass(), "weight", 0.0F);
        setBooleanField(term2188, term2188.getClass(), "expressed", false);
        setIntField(term2188, term2188.getClass(), "innovation", 0);
        Object term2192 = newInstance(Class.forName("nn.model.Connection"));
        setField(term2192, term2192.getClass(), "in", null);
        setField(term2192, term2192.getClass(), "out", null);
        setFloatField(term2192, term2192.getClass(), "weight", 0.28528106F);
        setBooleanField(term2192, term2192.getClass(), "expressed", false);
        setIntField(term2192, term2192.getClass(), "innovation", -523949691);
        ArrayList term2182 = new ArrayList();
        ((ArrayList) term2182).add(term2184);
        ((ArrayList) term2182).add(term2184);
        ((ArrayList) term2182).add(term2188);
        ((ArrayList) term2182).add(term2192);
        term2144 = newInstance(Class.forName("nn.model.Connection"));
        Object term2145 = newInstance(Class.forName("nn.model.Node"));
        Object term2170 = newInstance(Class.forName("nn.model.Node"));
        setField(term2145, term2145.getClass(), "type", enum17);
        setIntField(term2145, term2145.getClass(), "innovation", 1598895173);
        setField(term2145, term2145.getClass(), "connections", term2157);
        setDoubleField(term2145, term2145.getClass(), "bias", 0.268304014379393);
        setField(term2144, term2144.getClass(), "in", term2145);
        setField(term2170, term2170.getClass(), "type", enum18);
        setIntField(term2170, term2170.getClass(), "innovation", -2014576105);
        setField(term2170, term2170.getClass(), "connections", term2182);
        setDoubleField(term2170, term2170.getClass(), "bias", 0.7171972879282721);
        setField(term2144, term2144.getClass(), "out", term2170);
        setFloatField(term2144, term2144.getClass(), "weight", 0.9737084F);
        setBooleanField(term2144, term2144.getClass(), "expressed", true);
        setIntField(term2144, term2144.getClass(), "innovation", 1296895584);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2144, args);
    }

};


