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

public class SpaceScrollBarUI_paintTrack_18707826189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4210;

    public SpaceScrollBarUI_paintTrack_18707826189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4210 = newInstance(Class.forName("org.openRealmOfStars.gui.scrollPanel.SpaceScrollBarUI"));
        setField(term4210, term4210.getClass(), "minimumThumbSize", null);
        setField(term4210, term4210.getClass(), "maximumThumbSize", null);
        setField(term4210, term4210.getClass(), "thumbHighlightColor", null);
        setField(term4210, term4210.getClass(), "thumbLightShadowColor", null);
        setField(term4210, term4210.getClass(), "thumbDarkShadowColor", null);
        setField(term4210, term4210.getClass(), "thumbColor", null);
        setField(term4210, term4210.getClass(), "trackColor", null);
        setField(term4210, term4210.getClass(), "trackHighlightColor", null);
        setField(term4210, term4210.getClass(), "scrollbar", null);
        setField(term4210, term4210.getClass(), "incrButton", null);
        setField(term4210, term4210.getClass(), "decrButton", null);
        setBooleanField(term4210, term4210.getClass(), "isDragging", false);
        setField(term4210, term4210.getClass(), "trackListener", null);
        setField(term4210, term4210.getClass(), "buttonListener", null);
        setField(term4210, term4210.getClass(), "modelListener", null);
        setField(term4210, term4210.getClass(), "thumbRect", null);
        setField(term4210, term4210.getClass(), "trackRect", null);
        setIntField(term4210, term4210.getClass(), "trackHighlight", 0);
        setField(term4210, term4210.getClass(), "scrollListener", null);
        setField(term4210, term4210.getClass(), "propertyChangeListener", null);
        setField(term4210, term4210.getClass(), "scrollTimer", null);
        setBooleanField(term4210, term4210.getClass(), "supportsAbsolutePositioning", false);
        setIntField(term4210, term4210.getClass(), "scrollBarWidth", 0);
        setField(term4210, term4210.getClass(), "handler", null);
        setBooleanField(term4210, term4210.getClass(), "thumbActive", false);
        setBooleanField(term4210, term4210.getClass(), "useCachedValue", false);
        setIntField(term4210, term4210.getClass(), "scrollBarValue", 0);
        setIntField(term4210, term4210.getClass(), "incrGap", 0);
        setIntField(term4210, term4210.getClass(), "decrGap", 0);
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
        callMethod(klass, "paintTrack", argTypes, term4210, args);
    }

};


