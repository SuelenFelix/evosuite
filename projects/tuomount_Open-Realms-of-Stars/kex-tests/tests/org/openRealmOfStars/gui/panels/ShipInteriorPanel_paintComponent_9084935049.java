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

public class ShipInteriorPanel_paintComponent_9084935049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238169;

    public ShipInteriorPanel_paintComponent_9084935049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238169 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ShipInteriorPanel"));
        setField(term238169, term238169.getClass(), "race", null);
        setField(term238169, term238169.getClass(), "planetImage", null);
        setIntField(term238169, term238169.getClass(), "x", 0);
        setIntField(term238169, term238169.getClass(), "speed", 0);
        setIntField(term238169, term238169.getClass(), "offsetX", 0);
        setIntField(term238169, term238169.getClass(), "offsetY", 0);
        setIntField(term238169, term238169.getClass(), "glitchLine", 0);
        setBooleanField(term238169, term238169.getClass(), "isAlignmentXSet", false);
        setFloatField(term238169, term238169.getClass(), "alignmentX", 0.0F);
        setBooleanField(term238169, term238169.getClass(), "isAlignmentYSet", false);
        setFloatField(term238169, term238169.getClass(), "alignmentY", 0.0F);
        setField(term238169, term238169.getClass(), "ui", null);
        setField(term238169, term238169.getClass(), "listenerList", null);
        setField(term238169, term238169.getClass(), "clientProperties", null);
        setField(term238169, term238169.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term238169, term238169.getClass(), "autoscrolls", false);
        setField(term238169, term238169.getClass(), "border", null);
        setIntField(term238169, term238169.getClass(), "flags", 0);
        setField(term238169, term238169.getClass(), "inputVerifier", null);
        setBooleanField(term238169, term238169.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term238169, term238169.getClass(), "paintingChild", null);
        setField(term238169, term238169.getClass(), "popupMenu", null);
        setField(term238169, term238169.getClass(), "revalidateRunnableScheduled", null);
        setField(term238169, term238169.getClass(), "focusInputMap", null);
        setField(term238169, term238169.getClass(), "ancestorInputMap", null);
        setField(term238169, term238169.getClass(), "windowInputMap", null);
        setField(term238169, term238169.getClass(), "actionMap", null);
        setField(term238169, term238169.getClass(), "aaHint", null);
        setField(term238169, term238169.getClass(), "lcdRenderingHint", null);
        setField(term238169, term238169.getClass(), "component", null);
        setField(term238169, term238169.getClass(), "layoutMgr", null);
        setField(term238169, term238169.getClass(), "dispatcher", null);
        setField(term238169, term238169.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term238169, term238169.getClass(), "focusCycleRoot", false);
        setBooleanField(term238169, term238169.getClass(), "focusTraversalPolicyProvider", false);
        setField(term238169, term238169.getClass(), "printingThreads", null);
        setBooleanField(term238169, term238169.getClass(), "printing", false);
        setField(term238169, term238169.getClass(), "containerListener", null);
        setIntField(term238169, term238169.getClass(), "listeningChildren", 0);
        setIntField(term238169, term238169.getClass(), "listeningBoundsChildren", 0);
        setIntField(term238169, term238169.getClass(), "descendantsCount", 0);
        setField(term238169, term238169.getClass(), "preserveBackgroundColor", null);
        setIntField(term238169, term238169.getClass(), "numOfHWComponents", 0);
        setIntField(term238169, term238169.getClass(), "numOfLWComponents", 0);
        setField(term238169, term238169.getClass(), "modalComp", null);
        setField(term238169, term238169.getClass(), "modalAppContext", null);
        setIntField(term238169, term238169.getClass(), "containerSerializedDataVersion", 0);
        setField(term238169, term238169.getClass(), "peer", null);
        setField(term238169, term238169.getClass(), "parent", null);
        setField(term238169, term238169.getClass(), "appContext", null);
        setIntField(term238169, term238169.getClass(), "y", 0);
        setIntField(term238169, term238169.getClass(), "width", 0);
        setIntField(term238169, term238169.getClass(), "height", 0);
        setField(term238169, term238169.getClass(), "foreground", null);
        setField(term238169, term238169.getClass(), "background", null);
        setField(term238169, term238169.getClass(), "font", null);
        setField(term238169, term238169.getClass(), "peerFont", null);
        setField(term238169, term238169.getClass(), "cursor", null);
        setField(term238169, term238169.getClass(), "locale", null);
        setField(term238169, term238169.getClass(), "graphicsConfig", null);
        setField(term238169, term238169.getClass(), "bufferStrategy", null);
        setBooleanField(term238169, term238169.getClass(), "ignoreRepaint", false);
        setBooleanField(term238169, term238169.getClass(), "visible", false);
        setBooleanField(term238169, term238169.getClass(), "enabled", false);
        setBooleanField(term238169, term238169.getClass(), "valid", false);
        setField(term238169, term238169.getClass(), "dropTarget", null);
        setField(term238169, term238169.getClass(), "popups", null);
        setField(term238169, term238169.getClass(), "name", null);
        setBooleanField(term238169, term238169.getClass(), "nameExplicitlySet", false);
        setBooleanField(term238169, term238169.getClass(), "focusable", false);
        setIntField(term238169, term238169.getClass(), "isFocusTraversableOverridden", 0);
        setField(term238169, term238169.getClass(), "focusTraversalKeys", null);
        setBooleanField(term238169, term238169.getClass(), "focusTraversalKeysEnabled", false);
        setField(term238169, term238169.getClass(), "acc", null);
        setField(term238169, term238169.getClass(), "minSize", null);
        setBooleanField(term238169, term238169.getClass(), "minSizeSet", false);
        setField(term238169, term238169.getClass(), "prefSize", null);
        setBooleanField(term238169, term238169.getClass(), "prefSizeSet", false);
        setField(term238169, term238169.getClass(), "maxSize", null);
        setBooleanField(term238169, term238169.getClass(), "maxSizeSet", false);
        setField(term238169, term238169.getClass(), "componentOrientation", null);
        setBooleanField(term238169, term238169.getClass(), "newEventsOnly", false);
        setField(term238169, term238169.getClass(), "componentListener", null);
        setField(term238169, term238169.getClass(), "focusListener", null);
        setField(term238169, term238169.getClass(), "hierarchyListener", null);
        setField(term238169, term238169.getClass(), "hierarchyBoundsListener", null);
        setField(term238169, term238169.getClass(), "keyListener", null);
        setField(term238169, term238169.getClass(), "mouseListener", null);
        setField(term238169, term238169.getClass(), "mouseMotionListener", null);
        setField(term238169, term238169.getClass(), "mouseWheelListener", null);
        setField(term238169, term238169.getClass(), "inputMethodListener", null);
        setLongField(term238169, term238169.getClass(), "eventMask", 0L);
        setField(term238169, term238169.getClass(), "changeSupport", null);
        setField(term238169, term238169.getClass(), "objectLock", null);
        setBooleanField(term238169, term238169.getClass(), "isPacked", false);
        setIntField(term238169, term238169.getClass(), "boundsOp", 0);
        setField(term238169, term238169.getClass(), "compoundShape", null);
        setField(term238169, term238169.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term238169, term238169.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term238169, term238169.getClass(), "backgroundEraseDisabled", false);
        setField(term238169, term238169.getClass(), "eventCache", null);
        setBooleanField(term238169, term238169.getClass(), "coalescingEnabled", false);
        setBooleanField(term238169, term238169.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term238169, term238169.getClass(), "componentSerializedDataVersion", 0);
        setField(term238169, term238169.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ShipInteriorPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term238169, args);
    }

};


