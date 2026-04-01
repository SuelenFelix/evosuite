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
import java.lang.Object;

public class ResearchTechPanel_1_stateChanged_11718321341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240580;
     Object term240593;

    public ResearchTechPanel_1_stateChanged_11718321341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240580 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel$1"));
        setField(term240580, term240580.getClass(), "val$listener", null);
        setField(term240580, term240580.getClass(), "val$actionSlider", "QDpqtNZTXP");
        setField(term240580, term240580.getClass(), "this$0", null);
        term240593 = newInstance(Class.forName("javax.swing.event.ChangeEvent"));
        Object term240594 = newInstance(Class.forName("java.lang.Object"));
        setField(term240593, term240593.getClass(), "source", term240594);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel$1");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.event.ChangeEvent");
        Object[] args = new Object[1];
        args[0] = term240593;
        callMethod(klass, "stateChanged", argTypes, term240580, args);
    }

};


