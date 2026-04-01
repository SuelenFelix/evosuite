package org.openRealmOfStars.gui.scrollPanel;

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
import static org.openRealmOfStars.gui.scrollPanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SpaceScrollBarUI_createDecreaseButton_1761530563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1094;
     Object term1104;

    public SpaceScrollBarUI_createDecreaseButton_1761530563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1094 = newInstance(Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI"));
        setField(term1094, term1094.getClass(), "minimumThumbSize", null);
        setField(term1094, term1094.getClass(), "maximumThumbSize", null);
        setField(term1094, term1094.getClass(), "thumbHighlightColor", null);
        setField(term1094, term1094.getClass(), "thumbLightShadowColor", null);
        setField(term1094, term1094.getClass(), "thumbDarkShadowColor", null);
        setField(term1094, term1094.getClass(), "thumbColor", null);
        setField(term1094, term1094.getClass(), "trackColor", null);
        setField(term1094, term1094.getClass(), "trackHighlightColor", null);
        setField(term1094, term1094.getClass(), "scrollbar", null);
        setField(term1094, term1094.getClass(), "incrButton", null);
        setField(term1094, term1094.getClass(), "decrButton", null);
        setBooleanField(term1094, term1094.getClass(), "isDragging", false);
        setField(term1094, term1094.getClass(), "trackListener", null);
        setField(term1094, term1094.getClass(), "buttonListener", null);
        setField(term1094, term1094.getClass(), "modelListener", null);
        setField(term1094, term1094.getClass(), "thumbRect", null);
        setField(term1094, term1094.getClass(), "trackRect", null);
        setIntField(term1094, term1094.getClass(), "trackHighlight", 0);
        setField(term1094, term1094.getClass(), "scrollListener", null);
        setField(term1094, term1094.getClass(), "propertyChangeListener", null);
        setField(term1094, term1094.getClass(), "scrollTimer", null);
        setBooleanField(term1094, term1094.getClass(), "supportsAbsolutePositioning", false);
        setIntField(term1094, term1094.getClass(), "scrollBarWidth", 0);
        setField(term1094, term1094.getClass(), "handler", null);
        setBooleanField(term1094, term1094.getClass(), "thumbActive", false);
        setBooleanField(term1094, term1094.getClass(), "useCachedValue", false);
        setIntField(term1094, term1094.getClass(), "scrollBarValue", 0);
        setIntField(term1094, term1094.getClass(), "incrGap", 0);
        setIntField(term1094, term1094.getClass(), "decrGap", 0);
        term1104 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term1104;
        callMethod(klass, "createDecreaseButton", argTypes, term1094, args);
    }

};


