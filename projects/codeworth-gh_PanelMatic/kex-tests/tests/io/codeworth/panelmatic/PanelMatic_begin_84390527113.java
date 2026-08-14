package io.codeworth.panelmatic;

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
import static io.codeworth.panelmatic.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class PanelMatic_begin_84390527113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32288;

    public PanelMatic_begin_84390527113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32288 = newInstance(Class.forName("io.codeworth.panelmatic.PanelMatic"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.PanelMatic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("io.codeworth.panelmatic.PanelMaticComponentCustomizer"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "begin", argTypes, term32288, args);
    }

};


