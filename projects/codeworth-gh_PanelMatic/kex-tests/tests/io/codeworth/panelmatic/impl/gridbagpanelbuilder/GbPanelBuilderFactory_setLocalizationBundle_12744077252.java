package io.codeworth.panelmatic.impl.gridbagpanelbuilder;

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
import static io.codeworth.panelmatic.impl.gridbagpanelbuilder.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GbPanelBuilderFactory_setLocalizationBundle_12744077252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8064;

    public GbPanelBuilderFactory_setLocalizationBundle_12744077252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8064 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilderFactory"));
        Object term8065 = newInstance(Class.forName("java.awt.ComponentOrientation"));
        setField(term8064, term8064.getClass(), "l10n", null);
        setIntField(term8065, term8065.getClass(), "orientation", 7);
        setField(term8064, term8064.getClass(), "orientation", term8065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilderFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.ResourceBundle");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLocalizationBundle", argTypes, term8064, args);
    }

};


