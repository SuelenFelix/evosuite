package com.iwamih31;

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
import static com.iwamih31.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class Action_getId_17200244420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12763;

    public Action_getId_17200244420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term12764 = new Integer(1134449235);
        Integer term12794 = new Integer(-883034806);
        Integer term12796 = new Integer(1585847225);
        term12763 = newInstance(Class.forName("com.iwamih31.Action"));
        Object term12766 = newInstance(Class.forName("java.time.LocalDate"));
        setField(term12763, term12763.getClass(), "id", term12764);
        setIntField(term12766, term12766.getClass(), "year", 2025);
        setShortField(term12766, term12766.getClass(), "month", (short) 4);
        setShortField(term12766, term12766.getClass(), "day", (short) 23);
        setField(term12763, term12763.getClass(), "date", term12766);
        setField(term12763, term12763.getClass(), "subject", "kVEZMHmRtR");
        setField(term12763, term12763.getClass(), "apply", "ekxGuOYIwi");
        setField(term12763, term12763.getClass(), "income", term12794);
        setField(term12763, term12763.getClass(), "spending", term12796);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.iwamih31.Action");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term12763, args);
    }

};


