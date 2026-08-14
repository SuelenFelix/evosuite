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
import java.lang.Boolean;

public class SingleByteCharsetProber_init_186767116310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148491;

    public SingleByteCharsetProber_init_186767116310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148491 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SingleByteCharsetProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.mozilla.universalchardet.prober.sequence.SequenceModel");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("org.mozilla.universalchardet.prober.CharsetProber");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term148491;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


