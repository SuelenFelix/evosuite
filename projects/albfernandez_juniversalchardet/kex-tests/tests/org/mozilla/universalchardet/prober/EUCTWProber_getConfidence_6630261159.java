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

public class EUCTWProber_getConfidence_6630261159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216108;

    public EUCTWProber_getConfidence_6630261159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term216108 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCTWProber"));
        setField(term216108, term216108.getClass(), "codingSM", null);
        setField(term216108, term216108.getClass(), "state", null);
        setField(term216108, term216108.getClass(), "distributionAnalyzer", null);
        setField(term216108, term216108.getClass(), "lastChar", null);
        setBooleanField(term216108, term216108.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EUCTWProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term216108, args);
    }

};


