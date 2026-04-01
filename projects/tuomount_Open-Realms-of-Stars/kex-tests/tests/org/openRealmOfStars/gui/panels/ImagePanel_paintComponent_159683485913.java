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

public class ImagePanel_paintComponent_159683485913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11309;

    public ImagePanel_paintComponent_159683485913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11309 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ImagePanel"));
        setField(term11309, term11309.getClass(), "image", null);
        setField(term11309, term11309.getClass(), "text", null);
        setBooleanField(term11309, term11309.getClass(), "isAlignmentXSet", false);
        setFloatField(term11309, term11309.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11309, term11309.getClass(), "isAlignmentYSet", false);
        setFloatField(term11309, term11309.getClass(), "alignmentY", 0.0F);
        setField(term11309, term11309.getClass(), "ui", null);
        setField(term11309, term11309.getClass(), "listenerList", null);
        setField(term11309, term11309.getClass(), "clientProperties", null);
        setField(term11309, term11309.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11309, term11309.getClass(), "autoscrolls", false);
        setField(term11309, term11309.getClass(), "border", null);
        setIntField(term11309, term11309.getClass(), "flags", 0);
        setField(term11309, term11309.getClass(), "inputVerifier", null);
        setBooleanField(term11309, term11309.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11309, term11309.getClass(), "paintingChild", null);
        setField(term11309, term11309.getClass(), "popupMenu", null);
        setField(term11309, term11309.getClass(), "revalidateRunnableScheduled", null);
        setField(term11309, term11309.getClass(), "focusInputMap", null);
        setField(term11309, term11309.getClass(), "ancestorInputMap", null);
        setField(term11309, term11309.getClass(), "windowInputMap", null);
        setField(term11309, term11309.getClass(), "actionMap", null);
        setField(term11309, term11309.getClass(), "aaHint", null);
        setField(term11309, term11309.getClass(), "lcdRenderingHint", null);
        setField(term11309, term11309.getClass(), "component", null);
        setField(term11309, term11309.getClass(), "layoutMgr", null);
        setField(term11309, term11309.getClass(), "dispatcher", null);
        setField(term11309, term11309.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11309, term11309.getClass(), "focusCycleRoot", false);
        setBooleanField(term11309, term11309.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11309, term11309.getClass(), "printingThreads", null);
        setBooleanField(term11309, term11309.getClass(), "printing", false);
        setField(term11309, term11309.getClass(), "containerListener", null);
        setIntField(term11309, term11309.getClass(), "listeningChildren", 0);
        setIntField(term11309, term11309.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11309, term11309.getClass(), "descendantsCount", 0);
        setField(term11309, term11309.getClass(), "preserveBackgroundColor", null);
        setIntField(term11309, term11309.getClass(), "numOfHWComponents", 0);
        setIntField(term11309, term11309.getClass(), "numOfLWComponents", 0);
        setField(term11309, term11309.getClass(), "modalComp", null);
        setField(term11309, term11309.getClass(), "modalAppContext", null);
        setIntField(term11309, term11309.getClass(), "containerSerializedDataVersion", 0);
        setField(term11309, term11309.getClass(), "peer", null);
        setField(term11309, term11309.getClass(), "parent", null);
        setField(term11309, term11309.getClass(), "appContext", null);
        setIntField(term11309, term11309.getClass(), "x", 0);
        setIntField(term11309, term11309.getClass(), "y", 0);
        setIntField(term11309, term11309.getClass(), "width", 0);
        setIntField(term11309, term11309.getClass(), "height", 0);
        setField(term11309, term11309.getClass(), "foreground", null);
        setField(term11309, term11309.getClass(), "background", null);
        setField(term11309, term11309.getClass(), "font", null);
        setField(term11309, term11309.getClass(), "peerFont", null);
        setField(term11309, term11309.getClass(), "cursor", null);
        setField(term11309, term11309.getClass(), "locale", null);
        setField(term11309, term11309.getClass(), "graphicsConfig", null);
        setField(term11309, term11309.getClass(), "bufferStrategy", null);
        setBooleanField(term11309, term11309.getClass(), "ignoreRepaint", false);
        setBooleanField(term11309, term11309.getClass(), "visible", false);
        setBooleanField(term11309, term11309.getClass(), "enabled", false);
        setBooleanField(term11309, term11309.getClass(), "valid", false);
        setField(term11309, term11309.getClass(), "dropTarget", null);
        setField(term11309, term11309.getClass(), "popups", null);
        setField(term11309, term11309.getClass(), "name", null);
        setBooleanField(term11309, term11309.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11309, term11309.getClass(), "focusable", false);
        setIntField(term11309, term11309.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11309, term11309.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11309, term11309.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11309, term11309.getClass(), "acc", null);
        setField(term11309, term11309.getClass(), "minSize", null);
        setBooleanField(term11309, term11309.getClass(), "minSizeSet", false);
        setField(term11309, term11309.getClass(), "prefSize", null);
        setBooleanField(term11309, term11309.getClass(), "prefSizeSet", false);
        setField(term11309, term11309.getClass(), "maxSize", null);
        setBooleanField(term11309, term11309.getClass(), "maxSizeSet", false);
        setField(term11309, term11309.getClass(), "componentOrientation", null);
        setBooleanField(term11309, term11309.getClass(), "newEventsOnly", false);
        setField(term11309, term11309.getClass(), "componentListener", null);
        setField(term11309, term11309.getClass(), "focusListener", null);
        setField(term11309, term11309.getClass(), "hierarchyListener", null);
        setField(term11309, term11309.getClass(), "hierarchyBoundsListener", null);
        setField(term11309, term11309.getClass(), "keyListener", null);
        setField(term11309, term11309.getClass(), "mouseListener", null);
        setField(term11309, term11309.getClass(), "mouseMotionListener", null);
        setField(term11309, term11309.getClass(), "mouseWheelListener", null);
        setField(term11309, term11309.getClass(), "inputMethodListener", null);
        setLongField(term11309, term11309.getClass(), "eventMask", 0L);
        setField(term11309, term11309.getClass(), "changeSupport", null);
        setField(term11309, term11309.getClass(), "objectLock", null);
        setBooleanField(term11309, term11309.getClass(), "isPacked", false);
        setIntField(term11309, term11309.getClass(), "boundsOp", 0);
        setField(term11309, term11309.getClass(), "compoundShape", null);
        setField(term11309, term11309.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11309, term11309.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11309, term11309.getClass(), "backgroundEraseDisabled", false);
        setField(term11309, term11309.getClass(), "eventCache", null);
        setBooleanField(term11309, term11309.getClass(), "coalescingEnabled", false);
        setBooleanField(term11309, term11309.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11309, term11309.getClass(), "componentSerializedDataVersion", 0);
        setField(term11309, term11309.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term11309, args);
    }

};


