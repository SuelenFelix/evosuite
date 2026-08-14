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

public class HebrewProber_getConfidence_136810262413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97663;

    public HebrewProber_getConfidence_136810262413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97663 = newInstance(Class.forName("org.mozilla.universalchardet.prober.HebrewProber"));
        setIntField(term97663, term97663.getClass(), "finalCharLogicalScore", 0);
        setIntField(term97663, term97663.getClass(), "finalCharVisualScore", 0);
        setByteField(term97663, term97663.getClass(), "prev", (byte) 0);
        setByteField(term97663, term97663.getClass(), "beforePrev", (byte) 0);
        setField(term97663, term97663.getClass(), "logicalProber", null);
        setField(term97663, term97663.getClass(), "visualProber", null);
        setBooleanField(term97663, term97663.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.HebrewProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term97663, args);
    }

};


