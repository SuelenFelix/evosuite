package org.openRealmOfStars.gui.graphs;

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
import static org.openRealmOfStars.gui.graphs.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BridgeGraph_isCustomImage_21374141297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term308;

    public BridgeGraph_isCustomImage_21374141297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term308 = newInstance(Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph"));
        setField(term308, term308.getClass(), "bridgeImage", null);
        setIntField(term308, term308.getClass(), "yOffset", 0);
        setField(term308, term308.getClass(), "name", null);
        setBooleanField(term308, term308.getClass(), "customImage", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.graphs.BridgeGraph");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCustomImage", argTypes, term308, args);
    }

};


