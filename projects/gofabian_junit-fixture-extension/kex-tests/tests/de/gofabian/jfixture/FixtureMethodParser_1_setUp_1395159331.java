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
import java.util.LinkedList;

public class FixtureMethodParser_1_setUp_1395159331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2565;
     Object term2789;

    public FixtureMethodParser_1_setUp_1395159331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2567 = new ArrayList();
        Class<? extends Object> term2824 = Class.forName((String) "java.util.Formatter$DateTime");
        Class term2969 = char.class;
        Object[] term2970 = (Object[]) newArray("java.lang.Class", 1);
        setElement(term2970, 0, term2969);
        Method term2572 = ((Class) term2824).getDeclaredMethod((String) "isValid", (Class[]) term2970);
        ((Method) term2572).setAccessible(true);
        Class<? extends Object> term2980 = Class.forName((String) "de.gofabian.jfixture.Scope");
        Field term2979 = ((Class) term2980).getDeclaredField((String) "CLASS");
        ((Field) term2979).setAccessible(true);
        Object enum7 = ((Field) term2979).get((Object) null);
        Object term2780 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term2780, term2780.getClass(), "type", null);
        setField(term2780, term2780.getClass(), "name", "");
        Object term2782 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term2782, term2782.getClass(), "type", null);
        setField(term2782, term2782.getClass(), "name", "");
        Object term2784 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term2784, term2784.getClass(), "type", null);
        setField(term2784, term2784.getClass(), "name", "");
        ArrayList term2778 = new ArrayList();
        ((ArrayList) term2778).add(term2780);
        ((ArrayList) term2778).add(term2782);
        ((ArrayList) term2778).add(term2784);
        term2565 = newInstance(Class.forName("de.gofabian.jfixture.FixtureMethodParser$1"));
        Object term2566 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureContext"));
        Object[] term2571 = (Object[]) newArray("java.lang.Class", 8);
        Object term2754 = newInstance(Class.forName("java.lang.Object"));
        Object term2765 = newInstance(Class.forName("de.gofabian.jfixture.api.FixtureId"));
        setField(term2566, term2566.getClass(), "tearDowns", term2567);
        setField(term2565, term2565.getClass(), "context", term2566);
        setField(term2565, term2565.getClass(), "val$parameterTypes", term2571);
        setField(term2565, term2565.getClass(), "val$method", term2572);
        setField(term2565, term2565.getClass(), "val$instance", term2754);
        setField(term2565, term2565.getClass(), "this$0", null);
        setField(term2565, term2565.getClass(), "scope", enum7);
        setField(term2765, term2765.getClass(), "type", null);
        setField(term2765, term2765.getClass(), "name", "tShwQLRGNe");
        setField(term2565, term2565.getClass(), "id", term2765);
        setField(term2565, term2565.getClass(), "dependencyIds", term2778);
        setBooleanField(term2565, term2565.getClass(), "autoUse", true);
        Object term2792 = newInstance(Class.forName("java.lang.Object"));
        term2789 = new LinkedList();
        ((LinkedList) term2789).add(term2792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("de.gofabian.jfixture.FixtureMethodParser$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term2789;
        callMethod(klass, "setUp", argTypes, term2565, args);
    }

};


