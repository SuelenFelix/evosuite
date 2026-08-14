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

public class GbPanelBuilder_getProduct_110286009617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8060;

    public GbPanelBuilder_getProduct_110286009617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8060 = newInstance(Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder"));
        setField(term8060, term8060.getClass(), "labelConstraints", null);
        setField(term8060, term8060.getClass(), "headerConstraints", null);
        setField(term8060, term8060.getClass(), "product", null);
        setField(term8060, term8060.getClass(), "componentFactory", null);
        setField(term8060, term8060.getClass(), "currentBuildCustomizers", null);
        setField(term8060, term8060.getClass(), "customizerChain", null);
        setField(term8060, term8060.getClass(), "baseComponentBehavior", null);
        setField(term8060, term8060.getClass(), "headerBehavior", null);
        setField(term8060, term8060.getClass(), "labelBehavior", null);
        setField(term8060, term8060.getClass(), "myPool", null);
        setField(term8060, term8060.getClass(), "resourceBundle", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.gridbagpanelbuilder.GbPanelBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProduct", argTypes, term8060, args);
    }

};


