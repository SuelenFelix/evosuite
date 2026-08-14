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

public class SBCSGroupProber_getCharSetName_988372198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382711;

    public SBCSGroupProber_getCharSetName_988372198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382711 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SBCSGroupProber"));
        setField(term382711, term382711.getClass(), "state", null);
        setField(term382711, term382711.getClass(), "probers", null);
        setField(term382711, term382711.getClass(), "bestGuess", null);
        setIntField(term382711, term382711.getClass(), "activeNum", 0);
        setBooleanField(term382711, term382711.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SBCSGroupProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharSetName", argTypes, term382711, args);
    }

};


