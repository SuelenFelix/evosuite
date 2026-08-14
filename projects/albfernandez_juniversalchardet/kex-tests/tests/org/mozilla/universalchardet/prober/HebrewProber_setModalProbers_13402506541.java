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

public class HebrewProber_setModalProbers_13402506541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97586;

    public HebrewProber_setModalProbers_13402506541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97586 = newInstance(Class.forName("org.mozilla.universalchardet.prober.HebrewProber"));
        setIntField(term97586, term97586.getClass(), "finalCharLogicalScore", 1622346318);
        setIntField(term97586, term97586.getClass(), "finalCharVisualScore", 1048535127);
        setByteField(term97586, term97586.getClass(), "prev", (byte) 32);
        setByteField(term97586, term97586.getClass(), "beforePrev", (byte) 32);
        setField(term97586, term97586.getClass(), "logicalProber", null);
        setField(term97586, term97586.getClass(), "visualProber", null);
        setBooleanField(term97586, term97586.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.HebrewProber");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mozilla.universalchardet.prober.CharsetProber");
        argTypes[1] = Class.forName("org.mozilla.universalchardet.prober.CharsetProber");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "setModalProbers", argTypes, term97586, args);
    }

};


