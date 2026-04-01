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

public class PopupPanel_getImage_21690640225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37623;

    public PopupPanel_getImage_21690640225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37623 = newInstance(Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel"));
        setField(term37623, term37623.getClass(), "text", null);
        setField(term37623, term37623.getClass(), "title", null);
        setField(term37623, term37623.getClass(), "image", null);
        setField(term37623, term37623.getClass(), "scaledImage", null);
        setBooleanField(term37623, term37623.getClass(), "dismissed", false);
        setField(term37623, term37623.getClass(), "combat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.mapPanel.PopupPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getImage", argTypes, term37623, args);
    }

};


