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
import java.lang.Integer;

public class PreferencesDialog_intToHex_1171694526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53140;
     Object term53144;

    public PreferencesDialog_intToHex_1171694526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53140 = newInstance(Class.forName("com.loomcom.symon.ui.PreferencesDialog"));
        setField(term53140, term53140.getClass(), "dialog", null);
        setField(term53140, term53140.getClass(), "haltOnBreakCheckBox", null);
        setField(term53140, term53140.getClass(), "programLoadAddressField", null);
        setIntField(term53140, term53140.getClass(), "programLoadAddress", 0);
        setBooleanField(term53140, term53140.getClass(), "haltOnBreak", false);
        setBooleanField(term53140, term53140.getClass(), "changed", false);
        setField(term53140, term53140.getClass(), "obs", null);
        term53144 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.PreferencesDialog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53144;
        callMethod(klass, "intToHex", argTypes, term53140, args);
    }

};


