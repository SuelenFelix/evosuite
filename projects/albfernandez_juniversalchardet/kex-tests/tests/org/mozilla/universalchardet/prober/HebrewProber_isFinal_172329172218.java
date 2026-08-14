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
import java.lang.Byte;

public class HebrewProber_isFinal_172329172218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97697;
     Object term97703;

    public HebrewProber_isFinal_172329172218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97697 = newInstance(Class.forName("org.mozilla.universalchardet.prober.HebrewProber"));
        setIntField(term97697, term97697.getClass(), "finalCharLogicalScore", 0);
        setIntField(term97697, term97697.getClass(), "finalCharVisualScore", 0);
        setByteField(term97697, term97697.getClass(), "prev", (byte) 0);
        setByteField(term97697, term97697.getClass(), "beforePrev", (byte) 0);
        setField(term97697, term97697.getClass(), "logicalProber", null);
        setField(term97697, term97697.getClass(), "visualProber", null);
        setBooleanField(term97697, term97697.getClass(), "active", false);
        term97703 = new Byte((byte) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.HebrewProber");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term97703;
        callMethod(klass, "isFinal", argTypes, term97697, args);
    }

};


