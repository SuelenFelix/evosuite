package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PreferencesDialog_hexToInt_2857351267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53668;

    public PreferencesDialog_hexToInt_2857351267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53668 = newInstance(Class.forName("com.loomcom.symon.ui.PreferencesDialog"));
        setField(term53668, term53668.getClass(), "dialog", null);
        setField(term53668, term53668.getClass(), "haltOnBreakCheckBox", null);
        setField(term53668, term53668.getClass(), "programLoadAddressField", null);
        setIntField(term53668, term53668.getClass(), "programLoadAddress", 0);
        setBooleanField(term53668, term53668.getClass(), "haltOnBreak", false);
        setBooleanField(term53668, term53668.getClass(), "changed", false);
        setField(term53668, term53668.getClass(), "obs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.PreferencesDialog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "hexToInt", argTypes, term53668, args);
    }

};


