package org.openRealmOfStars.gui.mapPanel;

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
import static org.openRealmOfStars.gui.mapPanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PopupPanel_splitText_184746169726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37625;
     Object term37627;
     Object term37629;

    public PopupPanel_splitText_184746169726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37625 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        setField(term37625, term37625.getClass(), "text", null);
        setField(term37625, term37625.getClass(), "title", null);
        setField(term37625, term37625.getClass(), "image", null);
        setField(term37625, term37625.getClass(), "scaledImage", null);
        setBooleanField(term37625, term37625.getClass(), "dismissed", false);
        setField(term37625, term37625.getClass(), "combat", null);
        term37627 = new Integer(0);
        term37629 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term37627;
        args[1] = term37629;
        callMethod(klass, "splitText", argTypes, term37625, args);
    }

};


