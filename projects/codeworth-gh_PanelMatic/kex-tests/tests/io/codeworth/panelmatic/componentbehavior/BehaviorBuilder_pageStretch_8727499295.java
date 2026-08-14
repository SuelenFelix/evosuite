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
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class BehaviorBuilder_pageStretch_8727499295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14236;
     Object term14266;

    public BehaviorBuilder_pageStretch_8727499295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14269 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term14268 = ((Class) term14269).getDeclaredField((String) "CENTER");
        ((Field) term14268).setAccessible(true);
        Object enum48 = ((Field) term14268).get((Object) null);
        Class<? extends Object> term14549 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term14548 = ((Class) term14549).getDeclaredField((String) "MIDDLE");
        ((Field) term14548).setAccessible(true);
        Object enum49 = ((Field) term14548).get((Object) null);
        term14236 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term14237 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term14261 = newInstance(Class.forName("java.awt.Insets"));
        setField(term14237, term14237.getClass(), "lineAlign", enum48);
        setField(term14237, term14237.getClass(), "pageAlign", enum49);
        setBooleanField(term14237, term14237.getClass(), "pageStretch", false);
        setBooleanField(term14237, term14237.getClass(), "lineStretch", false);
        setDoubleField(term14237, term14237.getClass(), "pageGrowFactor", 0.0);
        setIntField(term14261, term14261.getClass(), "top", 0);
        setIntField(term14261, term14261.getClass(), "left", 0);
        setIntField(term14261, term14261.getClass(), "bottom", 0);
        setIntField(term14261, term14261.getClass(), "right", 0);
        setField(term14237, term14237.getClass(), "insets", term14261);
        setField(term14236, term14236.getClass(), "product", term14237);
        term14266 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term14266;
        callMethod(klass, "pageStretch", argTypes, term14236, args);
    }

};


