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

public class PopupPanel_drawGradientBorder_198679291027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37631;
     Object term37633;
     Object term37635;
     Object term37637;
     Object term37639;

    public PopupPanel_drawGradientBorder_198679291027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37631 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        setField(term37631, term37631.getClass(), "text", null);
        setField(term37631, term37631.getClass(), "title", null);
        setField(term37631, term37631.getClass(), "image", null);
        setField(term37631, term37631.getClass(), "scaledImage", null);
        setBooleanField(term37631, term37631.getClass(), "dismissed", false);
        setField(term37631, term37631.getClass(), "combat", null);
        term37633 = new Integer(0);
        term37635 = new Integer(0);
        term37637 = new Integer(0);
        term37639 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.awt.Graphics2D");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term37633;
        args[2] = term37635;
        args[3] = term37637;
        args[4] = term37639;
        callMethod(klass, "drawGradientBorder", argTypes, term37631, args);
    }

};


