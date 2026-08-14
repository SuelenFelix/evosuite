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

public class HebrewProber_setOption_7752907677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97641;

    public HebrewProber_setOption_7752907677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97641 = newInstance(Class.forName("org.mozilla.universalchardet.prober.HebrewProber"));
        setIntField(term97641, term97641.getClass(), "finalCharLogicalScore", -73683645);
        setIntField(term97641, term97641.getClass(), "finalCharVisualScore", -226514366);
        setByteField(term97641, term97641.getClass(), "prev", (byte) 32);
        setByteField(term97641, term97641.getClass(), "beforePrev", (byte) 32);
        setField(term97641, term97641.getClass(), "logicalProber", null);
        setField(term97641, term97641.getClass(), "visualProber", null);
        setBooleanField(term97641, term97641.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.HebrewProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOption", argTypes, term97641, args);
    }

};


