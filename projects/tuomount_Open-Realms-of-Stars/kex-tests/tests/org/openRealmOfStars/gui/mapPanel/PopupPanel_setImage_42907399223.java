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

public class PopupPanel_setImage_42907399223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37619;

    public PopupPanel_setImage_42907399223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37619 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        setField(term37619, term37619.getClass(), "text", null);
        setField(term37619, term37619.getClass(), "title", null);
        setField(term37619, term37619.getClass(), "image", null);
        setField(term37619, term37619.getClass(), "scaledImage", null);
        setBooleanField(term37619, term37619.getClass(), "dismissed", false);
        setField(term37619, term37619.getClass(), "combat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImage", argTypes, term37619, args);
    }

};


