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

public class ImagePanel_setImage_20059334909 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11145;

    public ImagePanel_setImage_20059334909() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11145 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ImagePanel"));
        setField(term11145, term11145.getClass(), "image", null);
        setField(term11145, term11145.getClass(), "text", null);
        setBooleanField(term11145, term11145.getClass(), "isAlignmentXSet", false);
        setFloatField(term11145, term11145.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11145, term11145.getClass(), "isAlignmentYSet", false);
        setFloatField(term11145, term11145.getClass(), "alignmentY", 0.0F);
        setField(term11145, term11145.getClass(), "ui", null);
        setField(term11145, term11145.getClass(), "listenerList", null);
        setField(term11145, term11145.getClass(), "clientProperties", null);
        setField(term11145, term11145.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11145, term11145.getClass(), "autoscrolls", false);
        setField(term11145, term11145.getClass(), "border", null);
        setIntField(term11145, term11145.getClass(), "flags", 0);
        setField(term11145, term11145.getClass(), "inputVerifier", null);
        setBooleanField(term11145, term11145.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11145, term11145.getClass(), "paintingChild", null);
        setField(term11145, term11145.getClass(), "popupMenu", null);
        setField(term11145, term11145.getClass(), "revalidateRunnableScheduled", null);
        setField(term11145, term11145.getClass(), "focusInputMap", null);
        setField(term11145, term11145.getClass(), "ancestorInputMap", null);
        setField(term11145, term11145.getClass(), "windowInputMap", null);
        setField(term11145, term11145.getClass(), "actionMap", null);
        setField(term11145, term11145.getClass(), "aaHint", null);
        setField(term11145, term11145.getClass(), "lcdRenderingHint", null);
        setField(term11145, term11145.getClass(), "component", null);
        setField(term11145, term11145.getClass(), "layoutMgr", null);
        setField(term11145, term11145.getClass(), "dispatcher", null);
        setField(term11145, term11145.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11145, term11145.getClass(), "focusCycleRoot", false);
        setBooleanField(term11145, term11145.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11145, term11145.getClass(), "printingThreads", null);
        setBooleanField(term11145, term11145.getClass(), "printing", false);
        setField(term11145, term11145.getClass(), "containerListener", null);
        setIntField(term11145, term11145.getClass(), "listeningChildren", 0);
        setIntField(term11145, term11145.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11145, term11145.getClass(), "descendantsCount", 0);
        setField(term11145, term11145.getClass(), "preserveBackgroundColor", null);
        setIntField(term11145, term11145.getClass(), "numOfHWComponents", 0);
        setIntField(term11145, term11145.getClass(), "numOfLWComponents", 0);
        setField(term11145, term11145.getClass(), "modalComp", null);
        setField(term11145, term11145.getClass(), "modalAppContext", null);
        setIntField(term11145, term11145.getClass(), "containerSerializedDataVersion", 0);
        setField(term11145, term11145.getClass(), "peer", null);
        setField(term11145, term11145.getClass(), "parent", null);
        setField(term11145, term11145.getClass(), "appContext", null);
        setIntField(term11145, term11145.getClass(), "x", 0);
        setIntField(term11145, term11145.getClass(), "y", 0);
        setIntField(term11145, term11145.getClass(), "width", 0);
        setIntField(term11145, term11145.getClass(), "height", 0);
        setField(term11145, term11145.getClass(), "foreground", null);
        setField(term11145, term11145.getClass(), "background", null);
        setField(term11145, term11145.getClass(), "font", null);
        setField(term11145, term11145.getClass(), "peerFont", null);
        setField(term11145, term11145.getClass(), "cursor", null);
        setField(term11145, term11145.getClass(), "locale", null);
        setField(term11145, term11145.getClass(), "graphicsConfig", null);
        setField(term11145, term11145.getClass(), "bufferStrategy", null);
        setBooleanField(term11145, term11145.getClass(), "ignoreRepaint", false);
        setBooleanField(term11145, term11145.getClass(), "visible", false);
        setBooleanField(term11145, term11145.getClass(), "enabled", false);
        setBooleanField(term11145, term11145.getClass(), "valid", false);
        setField(term11145, term11145.getClass(), "dropTarget", null);
        setField(term11145, term11145.getClass(), "popups", null);
        setField(term11145, term11145.getClass(), "name", null);
        setBooleanField(term11145, term11145.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11145, term11145.getClass(), "focusable", false);
        setIntField(term11145, term11145.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11145, term11145.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11145, term11145.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11145, term11145.getClass(), "acc", null);
        setField(term11145, term11145.getClass(), "minSize", null);
        setBooleanField(term11145, term11145.getClass(), "minSizeSet", false);
        setField(term11145, term11145.getClass(), "prefSize", null);
        setBooleanField(term11145, term11145.getClass(), "prefSizeSet", false);
        setField(term11145, term11145.getClass(), "maxSize", null);
        setBooleanField(term11145, term11145.getClass(), "maxSizeSet", false);
        setField(term11145, term11145.getClass(), "componentOrientation", null);
        setBooleanField(term11145, term11145.getClass(), "newEventsOnly", false);
        setField(term11145, term11145.getClass(), "componentListener", null);
        setField(term11145, term11145.getClass(), "focusListener", null);
        setField(term11145, term11145.getClass(), "hierarchyListener", null);
        setField(term11145, term11145.getClass(), "hierarchyBoundsListener", null);
        setField(term11145, term11145.getClass(), "keyListener", null);
        setField(term11145, term11145.getClass(), "mouseListener", null);
        setField(term11145, term11145.getClass(), "mouseMotionListener", null);
        setField(term11145, term11145.getClass(), "mouseWheelListener", null);
        setField(term11145, term11145.getClass(), "inputMethodListener", null);
        setLongField(term11145, term11145.getClass(), "eventMask", 0L);
        setField(term11145, term11145.getClass(), "changeSupport", null);
        setField(term11145, term11145.getClass(), "objectLock", null);
        setBooleanField(term11145, term11145.getClass(), "isPacked", false);
        setIntField(term11145, term11145.getClass(), "boundsOp", 0);
        setField(term11145, term11145.getClass(), "compoundShape", null);
        setField(term11145, term11145.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11145, term11145.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11145, term11145.getClass(), "backgroundEraseDisabled", false);
        setField(term11145, term11145.getClass(), "eventCache", null);
        setBooleanField(term11145, term11145.getClass(), "coalescingEnabled", false);
        setBooleanField(term11145, term11145.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11145, term11145.getClass(), "componentSerializedDataVersion", 0);
        setField(term11145, term11145.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ImagePanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.image.BufferedImage");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setImage", argTypes, term11145, args);
    }

};


