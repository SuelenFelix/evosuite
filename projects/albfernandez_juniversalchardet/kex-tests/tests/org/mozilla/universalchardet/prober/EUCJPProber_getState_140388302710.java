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

public class EUCJPProber_getState_140388302710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55525;

    public EUCJPProber_getState_140388302710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55525 = newInstance(Class.forName("org.mozilla.universalchardet.prober.EUCJPProber"));
        setField(term55525, term55525.getClass(), "codingSM", null);
        setField(term55525, term55525.getClass(), "state", null);
        setField(term55525, term55525.getClass(), "contextAnalyzer", null);
        setField(term55525, term55525.getClass(), "distributionAnalyzer", null);
        setField(term55525, term55525.getClass(), "lastChar", null);
        setBooleanField(term55525, term55525.getClass(), "active", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mozilla.universalchardet.prober.EUCJPProber");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getState", argTypes, term55525, args);
    }

};


