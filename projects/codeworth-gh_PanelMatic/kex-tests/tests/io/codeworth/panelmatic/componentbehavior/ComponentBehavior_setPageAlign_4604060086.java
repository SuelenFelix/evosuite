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

public class ComponentBehavior_setPageAlign_4604060086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3000;
     Object enum11;

    public ComponentBehavior_setPageAlign_4604060086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3030 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term3029 = ((Class) term3030).getDeclaredField((String) "CENTER");
        ((Field) term3029).setAccessible(true);
        Object enum10 = ((Field) term3029).get((Object) null);
        Class<? extends Object> term3310 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term3309 = ((Class) term3310).getDeclaredField((String) "MIDDLE");
        ((Field) term3309).setAccessible(true);
        enum11 = ((Field) term3309).get((Object) null);
        term3000 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term3024 = newInstance(Class.forName("java.awt.Insets"));
        setField(term3000, term3000.getClass(), "lineAlign", enum10);
        setField(term3000, term3000.getClass(), "pageAlign", enum11);
        setBooleanField(term3000, term3000.getClass(), "pageStretch", true);
        setBooleanField(term3000, term3000.getClass(), "lineStretch", false);
        setDoubleField(term3000, term3000.getClass(), "pageGrowFactor", 0.40176586625454525);
        setIntField(term3024, term3024.getClass(), "top", 0);
        setIntField(term3024, term3024.getClass(), "left", 0);
        setIntField(term3024, term3024.getClass(), "bottom", 0);
        setIntField(term3024, term3024.getClass(), "right", 0);
        setField(term3000, term3000.getClass(), "insets", term3024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.PageAlign");
        Object[] args = new Object[1];
        args[0] = enum11;
        callMethod(klass, "setPageAlign", argTypes, term3000, args);
    }

};


