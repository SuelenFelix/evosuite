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
import java.lang.Integer;

public class SBCSGroupProber_handleData_87941373711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term382720;
     Object term382723;
     Object term382725;

    public SBCSGroupProber_handleData_87941373711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term382720 = newInstance(Class.forName("org.mozilla.universalchardet.prober.SBCSGroupProber"));
        setField(term382720, term382720.getClass(), "state", null);
        setField(term382720, term382720.getClass(), "probers", null);
        setField(term382720, term382720.getClass(), "bestGuess", null);
        setIntField(term382720, term382720.getClass(), "activeNum", 0);
        setBooleanField(term382720, term382720.getClass(), "active", false);
        term382723 = new Integer(0);
        term382725 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.SBCSGroupProber");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term382723;
        args[2] = term382725;
        callMethod(klass, "handleData", argTypes, term382720, args);
    }

};


