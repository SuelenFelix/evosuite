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

public class SpaceScrollBarUI_createIncreaseButton_20457595485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2109;
     Object term2119;

    public SpaceScrollBarUI_createIncreaseButton_20457595485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2109 = newInstance(Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI"));
        setField(term2109, term2109.getClass(), "minimumThumbSize", null);
        setField(term2109, term2109.getClass(), "maximumThumbSize", null);
        setField(term2109, term2109.getClass(), "thumbHighlightColor", null);
        setField(term2109, term2109.getClass(), "thumbLightShadowColor", null);
        setField(term2109, term2109.getClass(), "thumbDarkShadowColor", null);
        setField(term2109, term2109.getClass(), "thumbColor", null);
        setField(term2109, term2109.getClass(), "trackColor", null);
        setField(term2109, term2109.getClass(), "trackHighlightColor", null);
        setField(term2109, term2109.getClass(), "scrollbar", null);
        setField(term2109, term2109.getClass(), "incrButton", null);
        setField(term2109, term2109.getClass(), "decrButton", null);
        setBooleanField(term2109, term2109.getClass(), "isDragging", false);
        setField(term2109, term2109.getClass(), "trackListener", null);
        setField(term2109, term2109.getClass(), "buttonListener", null);
        setField(term2109, term2109.getClass(), "modelListener", null);
        setField(term2109, term2109.getClass(), "thumbRect", null);
        setField(term2109, term2109.getClass(), "trackRect", null);
        setIntField(term2109, term2109.getClass(), "trackHighlight", 0);
        setField(term2109, term2109.getClass(), "scrollListener", null);
        setField(term2109, term2109.getClass(), "propertyChangeListener", null);
        setField(term2109, term2109.getClass(), "scrollTimer", null);
        setBooleanField(term2109, term2109.getClass(), "supportsAbsolutePositioning", false);
        setIntField(term2109, term2109.getClass(), "scrollBarWidth", 0);
        setField(term2109, term2109.getClass(), "handler", null);
        setBooleanField(term2109, term2109.getClass(), "thumbActive", false);
        setBooleanField(term2109, term2109.getClass(), "useCachedValue", false);
        setIntField(term2109, term2109.getClass(), "scrollBarValue", 0);
        setIntField(term2109, term2109.getClass(), "incrGap", 0);
        setIntField(term2109, term2109.getClass(), "decrGap", 0);
        term2119 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2119;
        callMethod(klass, "createIncreaseButton", argTypes, term2109, args);
    }

};


