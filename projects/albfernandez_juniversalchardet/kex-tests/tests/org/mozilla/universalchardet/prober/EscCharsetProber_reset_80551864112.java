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

public class EscCharsetProber_reset_80551864112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312581;

    public EscCharsetProber_reset_80551864112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312581 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber"));
        setField(term312581, term312581.getClass(), "codingSM", null);
        setIntField(term312581, term312581.getClass(), "activeSM", 0);
        setField(term312581, term312581.getClass(), "state", null);
        setField(term312581, term312581.getClass(), "detectedCharset", null);
        setBooleanField(term312581, term312581.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EscCharsetProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term312581, args);
    }

};


