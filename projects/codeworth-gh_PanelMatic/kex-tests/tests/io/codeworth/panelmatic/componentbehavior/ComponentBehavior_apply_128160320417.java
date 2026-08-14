package io.codeworth.panelmatic.componentbehavior;

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
import static io.codeworth.panelmatic.componentbehavior.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class ComponentBehavior_apply_128160320417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9489;
     Object term9518;

    public ComponentBehavior_apply_128160320417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9520 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term9519 = ((Class) term9520).getDeclaredField((String) "CENTER");
        ((Field) term9519).setAccessible(true);
        Object enum32 = ((Field) term9519).get((Object) null);
        Class<? extends Object> term9800 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term9799 = ((Class) term9800).getDeclaredField((String) "MIDDLE");
        ((Field) term9799).setAccessible(true);
        Object enum33 = ((Field) term9799).get((Object) null);
        term9489 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term9513 = newInstance(Class.forName("java.awt.Insets"));
        setField(term9489, term9489.getClass(), "lineAlign", enum32);
        setField(term9489, term9489.getClass(), "pageAlign", enum33);
        setBooleanField(term9489, term9489.getClass(), "pageStretch", false);
        setBooleanField(term9489, term9489.getClass(), "lineStretch", true);
        setDoubleField(term9489, term9489.getClass(), "pageGrowFactor", 0.2779719046761513);
        setIntField(term9513, term9513.getClass(), "top", 0);
        setIntField(term9513, term9513.getClass(), "left", 0);
        setIntField(term9513, term9513.getClass(), "bottom", 0);
        setIntField(term9513, term9513.getClass(), "right", 0);
        setField(term9489, term9489.getClass(), "insets", term9513);
        term9518 = (Object[]) newArray("io.codeworth.panelmatic.componentbehavior.BehaviorModifier", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorModifier"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term9518;
        callMethod(klass, "apply", argTypes, term9489, args);
    }

};


