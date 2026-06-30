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

public class Connection_cloneNoNodes_9454778708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1906;

    public Connection_cloneNoNodes_9454778708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1965 = Class.forName((String) "nn.model.Type");
        Field term1964 = ((Class) term1965).getDeclaredField((String) "HIDDEN");
        ((Field) term1964).setAccessible(true);
        Object enum15 = ((Field) term1964).get((Object) null);
        Object term1921 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1921, term1921.getClass(), "in", null);
        setField(term1921, term1921.getClass(), "out", null);
        setFloatField(term1921, term1921.getClass(), "weight", 0.6805867F);
        setBooleanField(term1921, term1921.getClass(), "expressed", true);
        setIntField(term1921, term1921.getClass(), "innovation", -1388471422);
        ArrayList term1919 = new ArrayList();
        ((ArrayList) term1919).add(term1921);
        Class<? extends Object> term2055 = Class.forName((String) "nn.model.Type");
        Field term2054 = ((Class) term2055).getDeclaredField((String) "SENSOR");
        ((Field) term2054).setAccessible(true);
        Object enum16 = ((Field) term2054).get((Object) null);
        Object term1942 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1942, term1942.getClass(), "in", null);
        setField(term1942, term1942.getClass(), "out", null);
        setFloatField(term1942, term1942.getClass(), "weight", 0.0F);
        setBooleanField(term1942, term1942.getClass(), "expressed", false);
        setIntField(term1942, term1942.getClass(), "innovation", 0);
        Object term1946 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1946, term1946.getClass(), "in", null);
        setField(term1946, term1946.getClass(), "out", null);
        setFloatField(term1946, term1946.getClass(), "weight", 0.0F);
        setBooleanField(term1946, term1946.getClass(), "expressed", false);
        setIntField(term1946, term1946.getClass(), "innovation", 0);
        Object term1950 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1950, term1950.getClass(), "in", null);
        setField(term1950, term1950.getClass(), "out", null);
        setFloatField(term1950, term1950.getClass(), "weight", 0.0F);
        setBooleanField(term1950, term1950.getClass(), "expressed", false);
        setIntField(term1950, term1950.getClass(), "innovation", 0);
        Object term1954 = newInstance(Class.forName("nn.model.Connection"));
        setField(term1954, term1954.getClass(), "in", null);
        setField(term1954, term1954.getClass(), "out", null);
        setFloatField(term1954, term1954.getClass(), "weight", 0.30926234F);
        setBooleanField(term1954, term1954.getClass(), "expressed", false);
        setIntField(term1954, term1954.getClass(), "innovation", 1555897383);
        ArrayList term1940 = new ArrayList();
        ((ArrayList) term1940).add(term1942);
        ((ArrayList) term1940).add(term1946);
        ((ArrayList) term1940).add(term1950);
        ((ArrayList) term1940).add(term1921);
        ((ArrayList) term1940).add(term1954);
        ((ArrayList) term1940).add(term1942);
        term1906 = newInstance(Class.forName("nn.model.Connection"));
        Object term1907 = newInstance(Class.forName("nn.model.Node"));
        Object term1928 = newInstance(Class.forName("nn.model.Node"));
        setField(term1907, term1907.getClass(), "type", enum15);
        setIntField(term1907, term1907.getClass(), "innovation", -1222006000);
        setField(term1907, term1907.getClass(), "connections", term1919);
        setDoubleField(term1907, term1907.getClass(), "bias", 0.045893173090043815);
        setField(term1906, term1906.getClass(), "in", term1907);
        setField(term1928, term1928.getClass(), "type", enum16);
        setIntField(term1928, term1928.getClass(), "innovation", -1498296052);
        setField(term1928, term1928.getClass(), "connections", term1940);
        setDoubleField(term1928, term1928.getClass(), "bias", 0.3626177854778667);
        setField(term1906, term1906.getClass(), "out", term1928);
        setFloatField(term1906, term1906.getClass(), "weight", 0.51208574F);
        setBooleanField(term1906, term1906.getClass(), "expressed", true);
        setIntField(term1906, term1906.getClass(), "innovation", 2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("nn.model.Connection");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "cloneNoNodes", argTypes, term1906, args);
    }

};


