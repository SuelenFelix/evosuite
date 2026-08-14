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

public class BehaviorBuilder_lineAlign_13147563812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11904;
     Object enum42;

    public BehaviorBuilder_lineAlign_13147563812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11942 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term11941 = ((Class) term11942).getDeclaredField((String) "CENTER");
        ((Field) term11941).setAccessible(true);
        Object enum40 = ((Field) term11941).get((Object) null);
        Class<? extends Object> term12222 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term12221 = ((Class) term12222).getDeclaredField((String) "MIDDLE");
        ((Field) term12221).setAccessible(true);
        Object enum41 = ((Field) term12221).get((Object) null);
        term11904 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term11905 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term11929 = newInstance(Class.forName("java.awt.Insets"));
        setField(term11905, term11905.getClass(), "lineAlign", enum40);
        setField(term11905, term11905.getClass(), "pageAlign", enum41);
        setBooleanField(term11905, term11905.getClass(), "pageStretch", false);
        setBooleanField(term11905, term11905.getClass(), "lineStretch", false);
        setDoubleField(term11905, term11905.getClass(), "pageGrowFactor", 0.0);
        setIntField(term11929, term11929.getClass(), "top", 0);
        setIntField(term11929, term11929.getClass(), "left", 0);
        setIntField(term11929, term11929.getClass(), "bottom", 0);
        setIntField(term11929, term11929.getClass(), "right", 0);
        setField(term11905, term11905.getClass(), "insets", term11929);
        setField(term11904, term11904.getClass(), "product", term11905);
        Class<? extends Object> term12502 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term12501 = ((Class) term12502).getDeclaredField((String) "END");
        ((Field) term12501).setAccessible(true);
        enum42 = ((Field) term12501).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("io.codeworth.panelmatic.componentbehavior.LineAlign");
        Object[] args = new Object[1];
        args[0] = enum42;
        callMethod(klass, "lineAlign", argTypes, term11904, args);
    }

};


