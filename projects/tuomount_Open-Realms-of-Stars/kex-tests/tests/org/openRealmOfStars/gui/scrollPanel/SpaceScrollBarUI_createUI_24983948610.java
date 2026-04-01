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

public class SpaceScrollBarUI_createUI_24983948610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4220;

    public SpaceScrollBarUI_createUI_24983948610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4220 = newInstance(Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI"));
        setField(term4220, term4220.getClass(), "minimumThumbSize", null);
        setField(term4220, term4220.getClass(), "maximumThumbSize", null);
        setField(term4220, term4220.getClass(), "thumbHighlightColor", null);
        setField(term4220, term4220.getClass(), "thumbLightShadowColor", null);
        setField(term4220, term4220.getClass(), "thumbDarkShadowColor", null);
        setField(term4220, term4220.getClass(), "thumbColor", null);
        setField(term4220, term4220.getClass(), "trackColor", null);
        setField(term4220, term4220.getClass(), "trackHighlightColor", null);
        setField(term4220, term4220.getClass(), "scrollbar", null);
        setField(term4220, term4220.getClass(), "incrButton", null);
        setField(term4220, term4220.getClass(), "decrButton", null);
        setBooleanField(term4220, term4220.getClass(), "isDragging", false);
        setField(term4220, term4220.getClass(), "trackListener", null);
        setField(term4220, term4220.getClass(), "buttonListener", null);
        setField(term4220, term4220.getClass(), "modelListener", null);
        setField(term4220, term4220.getClass(), "thumbRect", null);
        setField(term4220, term4220.getClass(), "trackRect", null);
        setIntField(term4220, term4220.getClass(), "trackHighlight", 0);
        setField(term4220, term4220.getClass(), "scrollListener", null);
        setField(term4220, term4220.getClass(), "propertyChangeListener", null);
        setField(term4220, term4220.getClass(), "scrollTimer", null);
        setBooleanField(term4220, term4220.getClass(), "supportsAbsolutePositioning", false);
        setIntField(term4220, term4220.getClass(), "scrollBarWidth", 0);
        setField(term4220, term4220.getClass(), "handler", null);
        setBooleanField(term4220, term4220.getClass(), "thumbActive", false);
        setBooleanField(term4220, term4220.getClass(), "useCachedValue", false);
        setIntField(term4220, term4220.getClass(), "scrollBarValue", 0);
        setIntField(term4220, term4220.getClass(), "incrGap", 0);
        setIntField(term4220, term4220.getClass(), "decrGap", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("javax.swing.JComponent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "createUI", argTypes, term4220, args);
    }

};


