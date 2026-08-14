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

public class PreferencesDialog_createUi_11021237202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51039;

    public PreferencesDialog_createUi_11021237202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51039 = newInstance(Class.forName("com.loomcom.symon.ui.PreferencesDialog"));
        setField(term51039, term51039.getClass(), "dialog", null);
        setField(term51039, term51039.getClass(), "haltOnBreakCheckBox", null);
        setField(term51039, term51039.getClass(), "programLoadAddressField", null);
        setIntField(term51039, term51039.getClass(), "programLoadAddress", 0);
        setBooleanField(term51039, term51039.getClass(), "haltOnBreak", false);
        setBooleanField(term51039, term51039.getClass(), "changed", false);
        setField(term51039, term51039.getClass(), "obs", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.PreferencesDialog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "createUi", argTypes, term51039, args);
    }

};


