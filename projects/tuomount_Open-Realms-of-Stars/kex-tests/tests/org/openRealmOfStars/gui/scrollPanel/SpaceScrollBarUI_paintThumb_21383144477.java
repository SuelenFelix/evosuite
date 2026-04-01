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

public class SpaceScrollBarUI_paintThumb_21383144477 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3156;

    public SpaceScrollBarUI_paintThumb_21383144477() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3156 = newInstance(Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI"));
        setField(term3156, term3156.getClass(), "minimumThumbSize", null);
        setField(term3156, term3156.getClass(), "maximumThumbSize", null);
        setField(term3156, term3156.getClass(), "thumbHighlightColor", null);
        setField(term3156, term3156.getClass(), "thumbLightShadowColor", null);
        setField(term3156, term3156.getClass(), "thumbDarkShadowColor", null);
        setField(term3156, term3156.getClass(), "thumbColor", null);
        setField(term3156, term3156.getClass(), "trackColor", null);
        setField(term3156, term3156.getClass(), "trackHighlightColor", null);
        setField(term3156, term3156.getClass(), "scrollbar", null);
        setField(term3156, term3156.getClass(), "incrButton", null);
        setField(term3156, term3156.getClass(), "decrButton", null);
        setBooleanField(term3156, term3156.getClass(), "isDragging", false);
        setField(term3156, term3156.getClass(), "trackListener", null);
        setField(term3156, term3156.getClass(), "buttonListener", null);
        setField(term3156, term3156.getClass(), "modelListener", null);
        setField(term3156, term3156.getClass(), "thumbRect", null);
        setField(term3156, term3156.getClass(), "trackRect", null);
        setIntField(term3156, term3156.getClass(), "trackHighlight", 0);
        setField(term3156, term3156.getClass(), "scrollListener", null);
        setField(term3156, term3156.getClass(), "propertyChangeListener", null);
        setField(term3156, term3156.getClass(), "scrollTimer", null);
        setBooleanField(term3156, term3156.getClass(), "supportsAbsolutePositioning", false);
        setIntField(term3156, term3156.getClass(), "scrollBarWidth", 0);
        setField(term3156, term3156.getClass(), "handler", null);
        setBooleanField(term3156, term3156.getClass(), "thumbActive", false);
        setBooleanField(term3156, term3156.getClass(), "useCachedValue", false);
        setIntField(term3156, term3156.getClass(), "scrollBarValue", 0);
        setIntField(term3156, term3156.getClass(), "incrGap", 0);
        setIntField(term3156, term3156.getClass(), "decrGap", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.awt.Graphics");
        argTypes[1] = Class.forName("javax.swing.JComponent");
        argTypes[2] = Class.forName("java.awt.Rectangle");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "paintThumb", argTypes, term3156, args);
    }

};


