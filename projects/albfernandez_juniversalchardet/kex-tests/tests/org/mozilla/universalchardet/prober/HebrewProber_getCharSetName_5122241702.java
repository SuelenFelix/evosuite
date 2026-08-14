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

public class HebrewProber_getCharSetName_5122241702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97592;

    public HebrewProber_getCharSetName_5122241702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97592 = newInstance(Class.forName("org.mozilla.universalchardet.prober.HebrewProber"));
        setIntField(term97592, term97592.getClass(), "finalCharLogicalScore", -655067527);
        setIntField(term97592, term97592.getClass(), "finalCharVisualScore", -6029667);
        setByteField(term97592, term97592.getClass(), "prev", (byte) 32);
        setByteField(term97592, term97592.getClass(), "beforePrev", (byte) 32);
        setField(term97592, term97592.getClass(), "logicalProber", null);
        setField(term97592, term97592.getClass(), "visualProber", null);
        setBooleanField(term97592, term97592.getClass(), "active", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.HebrewProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCharSetName", argTypes, term97592, args);
    }

};


