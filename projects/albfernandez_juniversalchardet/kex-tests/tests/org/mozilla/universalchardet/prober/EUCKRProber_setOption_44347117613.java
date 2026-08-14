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

public class EUCKRProber_setOption_44347117613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term86806;

    public EUCKRProber_setOption_44347117613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term86806 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCKRProber"));
        setField(term86806, term86806.getClass(), "codingSM", null);
        setField(term86806, term86806.getClass(), "state", null);
        setField(term86806, term86806.getClass(), "distributionAnalyzer", null);
        setField(term86806, term86806.getClass(), "lastChar", null);
        setBooleanField(term86806, term86806.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EUCKRProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOption", argTypes, term86806, args);
    }

};


