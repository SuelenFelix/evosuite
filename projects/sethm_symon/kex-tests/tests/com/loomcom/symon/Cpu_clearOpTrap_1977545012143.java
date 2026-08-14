package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Cpu_clearOpTrap_1977545012143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term206579;

    public Cpu_clearOpTrap_1977545012143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term206579 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        setLongField(term206579, term206579.getClass(), "clockPeriodInNs", 0L);
        setField(term206579, term206579.getClass(), "behavior", null);
        setField(term206579, term206579.getClass(), "bus", null);
        setField(term206579, term206579.getClass(), "state", null);
        setLongField(term206579, term206579.getClass(), "opBeginTime", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearOpTrap", argTypes, term206579, args);
    }

};


