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

public class MBCSGroupProber_getConfidence_10840410499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309435;

    public MBCSGroupProber_getConfidence_10840410499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309435 = newInstance(Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber"));
        setField(term309435, term309435.getClass(), "state", null);
        setField(term309435, term309435.getClass(), "probers", null);
        setField(term309435, term309435.getClass(), "bestGuess", null);
        setIntField(term309435, term309435.getClass(), "activeNum", 0);
        setBooleanField(term309435, term309435.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.MBCSGroupProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getConfidence", argTypes, term309435, args);
    }

};


