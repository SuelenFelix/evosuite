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

public class EUCTWProber_setOption_148036727613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216120;

    public EUCTWProber_setOption_148036727613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216120 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCTWProber"));
        setField(term216120, term216120.getClass(), "codingSM", null);
        setField(term216120, term216120.getClass(), "state", null);
        setField(term216120, term216120.getClass(), "distributionAnalyzer", null);
        setField(term216120, term216120.getClass(), "lastChar", null);
        setBooleanField(term216120, term216120.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EUCTWProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setOption", argTypes, term216120, args);
    }

};


