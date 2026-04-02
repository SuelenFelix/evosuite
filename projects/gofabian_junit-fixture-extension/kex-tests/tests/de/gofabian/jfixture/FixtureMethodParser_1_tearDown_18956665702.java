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
import java.util.ArrayList;
import java.lang.String;

public class FixtureMethodParser_1_tearDown_18956665702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3141;
     Object term3347;

    public FixtureMethodParser_1_tearDown_18956665702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3143 = new ArrayList();
        Class<? extends Object> term3375 = Class.forName((String) "java.lang.CharacterData00");
        Class term3523 = int.class;
        Object[] term3524 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term3524, 0, term3523);
        Method term3148 = ((Class) term3375).getDeclaredMethod((String) "getNumericValue", (Class[]) term3524);
        ((Method) term3148).setAccessible(true);
        Class<? extends Object> term3532 = Class.forName((String) "de.gofabian.jfixture.Scope");
        Field term3531 = ((Class) term3532).getDeclaredField((String) "METHOD");
        ((Field) term3531).setAccessible(true);
        Object enum8 = ((Field) term3531).get((Object) null);
        Object term3336 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term3336, term3336.getClass(), "type", null);
        setField(term3336, term3336.getClass(), "name", "");
        Object term3338 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term3338, term3338.getClass(), "type", null);
        setField(term3338, term3338.getClass(), "name", "");
        Object term3340 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term3340, term3340.getClass(), "type", null);
        setField(term3340, term3340.getClass(), "name", "");
        Object term3342 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term3342, term3342.getClass(), "type", null);
        setField(term3342, term3342.getClass(), "name", "");
        ArrayList term3334 = new ArrayList();
        ((ArrayList) term3334).add(term3336);
        ((ArrayList) term3334).add(term3338);
        ((ArrayList) term3334).add(term3340);
        ((ArrayList) term3334).add(term3342);
        term3141 = newInstance(Class.forName("de.gofabian.jfixture.FixtureMethodParser$1"));
        Object term3142 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureContext"));
        Object[] term3147 = (Object[]) newArray("java.lang.Class", 4);
        Object term3309 = newInstance(Class.forName("java.lang.Object"));
        Object term3321 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term3142, term3142.getClass(), "tearDowns", term3143);
        setField(term3141, term3141.getClass(), "context", term3142);
        setField(term3141, term3141.getClass(), "val$parameterTypes", term3147);
        setField(term3141, term3141.getClass(), "val$method", term3148);
        setField(term3141, term3141.getClass(), "val$instance", term3309);
        setField(term3141, term3141.getClass(), "this$0", null);
        setField(term3141, term3141.getClass(), "scope", enum8);
        setField(term3321, term3321.getClass(), "type", null);
        setField(term3321, term3321.getClass(), "name", "hoicvmsovO");
        setField(term3141, term3141.getClass(), "id", term3321);
        setField(term3141, term3141.getClass(), "dependencyIds", term3334);
        setBooleanField(term3141, term3141.getClass(), "autoUse", true);
        term3347 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureMethodParser$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3347;
        callMethod(klass, "tearDown", argTypes, term3141, args);
    }

};


