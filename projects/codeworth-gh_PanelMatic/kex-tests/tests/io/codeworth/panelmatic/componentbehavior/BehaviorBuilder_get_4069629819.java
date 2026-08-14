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

public class BehaviorBuilder_get_4069629819 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16613;

    public BehaviorBuilder_get_4069629819() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16644 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.LineAlign");
        Field term16643 = ((Class) term16644).getDeclaredField((String) "CENTER");
        ((Field) term16643).setAccessible(true);
        Object enum56 = ((Field) term16643).get((Object) null);
        Class<? extends Object> term16924 = Class.forName((String) "io.codeworth.panelmatic.componentbehavior.PageAlign");
        Field term16923 = ((Class) term16924).getDeclaredField((String) "MIDDLE");
        ((Field) term16923).setAccessible(true);
        Object enum57 = ((Field) term16923).get((Object) null);
        term16613 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder"));
        Object term16614 = newInstance(Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior"));
        Object term16638 = newInstance(Class.forName("java.awt.Insets"));
        setField(term16614, term16614.getClass(), "lineAlign", enum56);
        setField(term16614, term16614.getClass(), "pageAlign", enum57);
        setBooleanField(term16614, term16614.getClass(), "pageStretch", false);
        setBooleanField(term16614, term16614.getClass(), "lineStretch", false);
        setDoubleField(term16614, term16614.getClass(), "pageGrowFactor", 0.0);
        setIntField(term16638, term16638.getClass(), "top", 0);
        setIntField(term16638, term16638.getClass(), "left", 0);
        setIntField(term16638, term16638.getClass(), "bottom", 0);
        setIntField(term16638, term16638.getClass(), "right", 0);
        setField(term16614, term16614.getClass(), "insets", term16638);
        setField(term16613, term16613.getClass(), "product", term16614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.componentbehavior.BehaviorBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "get", argTypes, term16613, args);
    }

};


