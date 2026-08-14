package org.mozilla.universalchardet.prober;

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
import static org.mozilla.universalchardet.prober.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class HebrewProber_handleData_26835234815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97675;
     Object term97681;
     Object term97683;

    public HebrewProber_handleData_26835234815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97675 = newInstance(Class.forName("org.mozilla.universalchardet.prober.HebrewProber"));
        setIntField(term97675, term97675.getClass(), "finalCharLogicalScore", 0);
        setIntField(term97675, term97675.getClass(), "finalCharVisualScore", 0);
        setByteField(term97675, term97675.getClass(), "prev", (byte) 0);
        setByteField(term97675, term97675.getClass(), "beforePrev", (byte) 0);
        setField(term97675, term97675.getClass(), "logicalProber", null);
        setField(term97675, term97675.getClass(), "visualProber", null);
        setBooleanField(term97675, term97675.getClass(), "active", false);
        term97681 = new Integer(0);
        term97683 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.HebrewProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term97681;
        args[2] = term97683;
        callMethod(klass, "handleData", argTypes, term97675, args);
    }

};


