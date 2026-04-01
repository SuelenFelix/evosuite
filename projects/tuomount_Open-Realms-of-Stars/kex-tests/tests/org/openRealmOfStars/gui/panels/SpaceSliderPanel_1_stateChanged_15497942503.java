package org.openRealmOfStars.gui.panels;

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
import static org.openRealmOfStars.gui.panels.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SpaceSliderPanel_1_stateChanged_15497942503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224879;

    public SpaceSliderPanel_1_stateChanged_15497942503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224879 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel$1"));
        setField(term224879, term224879.getClass(), "val$listener", null);
        setField(term224879, term224879.getClass(), "val$actionSlider", null);
        setField(term224879, term224879.getClass(), "this$0", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ChangeEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "stateChanged", argTypes, term224879, args);
    }

};


