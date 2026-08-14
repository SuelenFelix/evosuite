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

public class GbPanelBuilder_addImpl_71231422814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8057;

    public GbPanelBuilder_addImpl_71231422814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8057 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        setField(term8057, term8057.getClass(), "labelConstraints", null);
        setField(term8057, term8057.getClass(), "headerConstraints", null);
        setField(term8057, term8057.getClass(), "product", null);
        setField(term8057, term8057.getClass(), "componentFactory", null);
        setField(term8057, term8057.getClass(), "currentBuildCustomizers", null);
        setField(term8057, term8057.getClass(), "customizerChain", null);
        setField(term8057, term8057.getClass(), "baseComponentBehavior", null);
        setField(term8057, term8057.getClass(), "headerBehavior", null);
        setField(term8057, term8057.getClass(), "labelBehavior", null);
        setField(term8057, term8057.getClass(), "myPool", null);
        setField(term8057, term8057.getClass(), "resourceBundle", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("javax.swing.JComponent");
        argTypes[1] = Class.forName("javax.swing.JComponent");
        argTypes[2] = Class.forName("io.codeworth.panelmatic.componentbehavior.ComponentBehavior");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "addImpl", argTypes, term8057, args);
    }

};


