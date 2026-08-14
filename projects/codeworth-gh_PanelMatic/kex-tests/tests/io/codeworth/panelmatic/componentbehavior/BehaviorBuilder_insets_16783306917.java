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

public class BehaviorBuilder_insets_16783306917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15420;
     Object term15450;

    public BehaviorBuilder_insets_16783306917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15456 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term15455 = ((Class) term15456).getDeclaredField((String) "CENTER");
        ((Field) term15455).setAccessible(true);
        Object enum52 = ((Field) term15455).get((Object) null);
        Class<? extends Object> term15736 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term15735 = ((Class) term15736).getDeclaredField((String) "MIDDLE");
        ((Field) term15735).setAccessible(true);
        Object enum53 = ((Field) term15735).get((Object) null);
        term15420 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term15421 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term15445 = newInstance(Class.forName("java.awt.Insets"));
        setField(term15421, term15421.getClass(), "lineAlign", enum52);
        setField(term15421, term15421.getClass(), "pageAlign", enum53);
        setBooleanField(term15421, term15421.getClass(), "pageStretch", false);
        setBooleanField(term15421, term15421.getClass(), "lineStretch", false);
        setDoubleField(term15421, term15421.getClass(), "pageGrowFactor", 0.0);
        setIntField(term15445, term15445.getClass(), "top", 0);
        setIntField(term15445, term15445.getClass(), "left", 0);
        setIntField(term15445, term15445.getClass(), "bottom", 0);
        setIntField(term15445, term15445.getClass(), "right", 0);
        setField(term15421, term15421.getClass(), "insets", term15445);
        setField(term15420, term15420.getClass(), "product", term15421);
        term15450 = newInstance(Class.forName("java.awt.Insets"));
        setIntField(term15450, term15450.getClass(), "top", -1922583790);
        setIntField(term15450, term15450.getClass(), "left", -616727354);
        setIntField(term15450, term15450.getClass(), "bottom", -1955890973);
        setIntField(term15450, term15450.getClass(), "right", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Insets");
        Object[] args = new Object[1];
        args[0] = term15450;
        callMethod(klass, "insets", argTypes, term15420, args);
    }

};


