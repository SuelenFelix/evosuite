package de.gofabian.jfixture;

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
import static de.gofabian.jfixture.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class FixtureLifecycle_setUp_6459390284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1138;
     Object term1141;

    public FixtureLifecycle_setUp_6459390284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1138 = newInstance(Class.forName("de.gofabian.jfixture.FixtureLifecycle"));
        Object term1140 = newInstance(Class.forName("java.lang.Object"));
        setField(term1138, term1138.getClass(), "definition", null);
        setBooleanField(term1138, term1138.getClass(), "isSetUp", true);
        setField(term1138, term1138.getClass(), "object", term1140);
        Object term1144 = newInstance(Class.forName("java.lang.Object"));
        Object term1146 = newInstance(Class.forName("java.lang.Object"));
        Object term1148 = newInstance(Class.forName("java.lang.Object"));
        term1141 = new LinkedList();
        ((LinkedList) term1141).add(term1144);
        ((LinkedList) term1141).add(term1146);
        ((LinkedList) term1141).add(term1148);
        ((LinkedList) term1141).add((Object)null);
        ((LinkedList) term1141).add((Object)null);
        ((LinkedList) term1141).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureLifecycle");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term1141;
        callMethod(klass, "setUp", argTypes, term1138, args);
    }

};


