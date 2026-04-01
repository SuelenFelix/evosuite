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

public class ShipInteriorPanel_getRace_8159582756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238031;

    public ShipInteriorPanel_getRace_8159582756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238031 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ShipInteriorPanel"));
        setField(term238031, term238031.getClass(), "race", null);
        setField(term238031, term238031.getClass(), "planetImage", null);
        setIntField(term238031, term238031.getClass(), "x", 0);
        setIntField(term238031, term238031.getClass(), "speed", 0);
        setIntField(term238031, term238031.getClass(), "offsetX", 0);
        setIntField(term238031, term238031.getClass(), "offsetY", 0);
        setIntField(term238031, term238031.getClass(), "glitchLine", 0);
        setBooleanField(term238031, term238031.getClass(), "isAlignmentXSet", false);
        setFloatField(term238031, term238031.getClass(), "alignmentX", 0.0F);
        setBooleanField(term238031, term238031.getClass(), "isAlignmentYSet", false);
        setFloatField(term238031, term238031.getClass(), "alignmentY", 0.0F);
        setField(term238031, term238031.getClass(), "ui", null);
        setField(term238031, term238031.getClass(), "listenerList", null);
        setField(term238031, term238031.getClass(), "clientProperties", null);
        setField(term238031, term238031.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term238031, term238031.getClass(), "autoscrolls", false);
        setField(term238031, term238031.getClass(), "border", null);
        setIntField(term238031, term238031.getClass(), "flags", 0);
        setField(term238031, term238031.getClass(), "inputVerifier", null);
        setBooleanField(term238031, term238031.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term238031, term238031.getClass(), "paintingChild", null);
        setField(term238031, term238031.getClass(), "popupMenu", null);
        setField(term238031, term238031.getClass(), "revalidateRunnableScheduled", null);
        setField(term238031, term238031.getClass(), "focusInputMap", null);
        setField(term238031, term238031.getClass(), "ancestorInputMap", null);
        setField(term238031, term238031.getClass(), "windowInputMap", null);
        setField(term238031, term238031.getClass(), "actionMap", null);
        setField(term238031, term238031.getClass(), "aaHint", null);
        setField(term238031, term238031.getClass(), "lcdRenderingHint", null);
        setField(term238031, term238031.getClass(), "component", null);
        setField(term238031, term238031.getClass(), "layoutMgr", null);
        setField(term238031, term238031.getClass(), "dispatcher", null);
        setField(term238031, term238031.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term238031, term238031.getClass(), "focusCycleRoot", false);
        setBooleanField(term238031, term238031.getClass(), "focusTraversalPolicyProvider", false);
        setField(term238031, term238031.getClass(), "printingThreads", null);
        setBooleanField(term238031, term238031.getClass(), "printing", false);
        setField(term238031, term238031.getClass(), "containerListener", null);
        setIntField(term238031, term238031.getClass(), "listeningChildren", 0);
        setIntField(term238031, term238031.getClass(), "listeningBoundsChildren", 0);
        setIntField(term238031, term238031.getClass(), "descendantsCount", 0);
        setField(term238031, term238031.getClass(), "preserveBackgroundColor", null);
        setIntField(term238031, term238031.getClass(), "numOfHWComponents", 0);
        setIntField(term238031, term238031.getClass(), "numOfLWComponents", 0);
        setField(term238031, term238031.getClass(), "modalComp", null);
        setField(term238031, term238031.getClass(), "modalAppContext", null);
        setIntField(term238031, term238031.getClass(), "containerSerializedDataVersion", 0);
        setField(term238031, term238031.getClass(), "peer", null);
        setField(term238031, term238031.getClass(), "parent", null);
        setField(term238031, term238031.getClass(), "appContext", null);
        setIntField(term238031, term238031.getClass(), "y", 0);
        setIntField(term238031, term238031.getClass(), "width", 0);
        setIntField(term238031, term238031.getClass(), "height", 0);
        setField(term238031, term238031.getClass(), "foreground", null);
        setField(term238031, term238031.getClass(), "background", null);
        setField(term238031, term238031.getClass(), "font", null);
        setField(term238031, term238031.getClass(), "peerFont", null);
        setField(term238031, term238031.getClass(), "cursor", null);
        setField(term238031, term238031.getClass(), "locale", null);
        setField(term238031, term238031.getClass(), "graphicsConfig", null);
        setField(term238031, term238031.getClass(), "bufferStrategy", null);
        setBooleanField(term238031, term238031.getClass(), "ignoreRepaint", false);
        setBooleanField(term238031, term238031.getClass(), "visible", false);
        setBooleanField(term238031, term238031.getClass(), "enabled", false);
        setBooleanField(term238031, term238031.getClass(), "valid", false);
        setField(term238031, term238031.getClass(), "dropTarget", null);
        setField(term238031, term238031.getClass(), "popups", null);
        setField(term238031, term238031.getClass(), "name", null);
        setBooleanField(term238031, term238031.getClass(), "nameExplicitlySet", false);
        setBooleanField(term238031, term238031.getClass(), "focusable", false);
        setIntField(term238031, term238031.getClass(), "isFocusTraversableOverridden", 0);
        setField(term238031, term238031.getClass(), "focusTraversalKeys", null);
        setBooleanField(term238031, term238031.getClass(), "focusTraversalKeysEnabled", false);
        setField(term238031, term238031.getClass(), "acc", null);
        setField(term238031, term238031.getClass(), "minSize", null);
        setBooleanField(term238031, term238031.getClass(), "minSizeSet", false);
        setField(term238031, term238031.getClass(), "prefSize", null);
        setBooleanField(term238031, term238031.getClass(), "prefSizeSet", false);
        setField(term238031, term238031.getClass(), "maxSize", null);
        setBooleanField(term238031, term238031.getClass(), "maxSizeSet", false);
        setField(term238031, term238031.getClass(), "componentOrientation", null);
        setBooleanField(term238031, term238031.getClass(), "newEventsOnly", false);
        setField(term238031, term238031.getClass(), "componentListener", null);
        setField(term238031, term238031.getClass(), "focusListener", null);
        setField(term238031, term238031.getClass(), "hierarchyListener", null);
        setField(term238031, term238031.getClass(), "hierarchyBoundsListener", null);
        setField(term238031, term238031.getClass(), "keyListener", null);
        setField(term238031, term238031.getClass(), "mouseListener", null);
        setField(term238031, term238031.getClass(), "mouseMotionListener", null);
        setField(term238031, term238031.getClass(), "mouseWheelListener", null);
        setField(term238031, term238031.getClass(), "inputMethodListener", null);
        setLongField(term238031, term238031.getClass(), "eventMask", 0L);
        setField(term238031, term238031.getClass(), "changeSupport", null);
        setField(term238031, term238031.getClass(), "objectLock", null);
        setBooleanField(term238031, term238031.getClass(), "isPacked", false);
        setIntField(term238031, term238031.getClass(), "boundsOp", 0);
        setField(term238031, term238031.getClass(), "compoundShape", null);
        setField(term238031, term238031.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term238031, term238031.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term238031, term238031.getClass(), "backgroundEraseDisabled", false);
        setField(term238031, term238031.getClass(), "eventCache", null);
        setBooleanField(term238031, term238031.getClass(), "coalescingEnabled", false);
        setBooleanField(term238031, term238031.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term238031, term238031.getClass(), "componentSerializedDataVersion", 0);
        setField(term238031, term238031.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ShipInteriorPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRace", argTypes, term238031, args);
    }

};


