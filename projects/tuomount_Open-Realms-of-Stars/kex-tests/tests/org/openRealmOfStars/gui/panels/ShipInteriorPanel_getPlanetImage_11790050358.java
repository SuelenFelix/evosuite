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

public class ShipInteriorPanel_getPlanetImage_11790050358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238123;

    public ShipInteriorPanel_getPlanetImage_11790050358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238123 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ShipInteriorPanel"));
        setField(term238123, term238123.getClass(), "race", null);
        setField(term238123, term238123.getClass(), "planetImage", null);
        setIntField(term238123, term238123.getClass(), "x", 0);
        setIntField(term238123, term238123.getClass(), "speed", 0);
        setIntField(term238123, term238123.getClass(), "offsetX", 0);
        setIntField(term238123, term238123.getClass(), "offsetY", 0);
        setIntField(term238123, term238123.getClass(), "glitchLine", 0);
        setBooleanField(term238123, term238123.getClass(), "isAlignmentXSet", false);
        setFloatField(term238123, term238123.getClass(), "alignmentX", 0.0F);
        setBooleanField(term238123, term238123.getClass(), "isAlignmentYSet", false);
        setFloatField(term238123, term238123.getClass(), "alignmentY", 0.0F);
        setField(term238123, term238123.getClass(), "ui", null);
        setField(term238123, term238123.getClass(), "listenerList", null);
        setField(term238123, term238123.getClass(), "clientProperties", null);
        setField(term238123, term238123.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term238123, term238123.getClass(), "autoscrolls", false);
        setField(term238123, term238123.getClass(), "border", null);
        setIntField(term238123, term238123.getClass(), "flags", 0);
        setField(term238123, term238123.getClass(), "inputVerifier", null);
        setBooleanField(term238123, term238123.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term238123, term238123.getClass(), "paintingChild", null);
        setField(term238123, term238123.getClass(), "popupMenu", null);
        setField(term238123, term238123.getClass(), "revalidateRunnableScheduled", null);
        setField(term238123, term238123.getClass(), "focusInputMap", null);
        setField(term238123, term238123.getClass(), "ancestorInputMap", null);
        setField(term238123, term238123.getClass(), "windowInputMap", null);
        setField(term238123, term238123.getClass(), "actionMap", null);
        setField(term238123, term238123.getClass(), "aaHint", null);
        setField(term238123, term238123.getClass(), "lcdRenderingHint", null);
        setField(term238123, term238123.getClass(), "component", null);
        setField(term238123, term238123.getClass(), "layoutMgr", null);
        setField(term238123, term238123.getClass(), "dispatcher", null);
        setField(term238123, term238123.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term238123, term238123.getClass(), "focusCycleRoot", false);
        setBooleanField(term238123, term238123.getClass(), "focusTraversalPolicyProvider", false);
        setField(term238123, term238123.getClass(), "printingThreads", null);
        setBooleanField(term238123, term238123.getClass(), "printing", false);
        setField(term238123, term238123.getClass(), "containerListener", null);
        setIntField(term238123, term238123.getClass(), "listeningChildren", 0);
        setIntField(term238123, term238123.getClass(), "listeningBoundsChildren", 0);
        setIntField(term238123, term238123.getClass(), "descendantsCount", 0);
        setField(term238123, term238123.getClass(), "preserveBackgroundColor", null);
        setIntField(term238123, term238123.getClass(), "numOfHWComponents", 0);
        setIntField(term238123, term238123.getClass(), "numOfLWComponents", 0);
        setField(term238123, term238123.getClass(), "modalComp", null);
        setField(term238123, term238123.getClass(), "modalAppContext", null);
        setIntField(term238123, term238123.getClass(), "containerSerializedDataVersion", 0);
        setField(term238123, term238123.getClass(), "peer", null);
        setField(term238123, term238123.getClass(), "parent", null);
        setField(term238123, term238123.getClass(), "appContext", null);
        setIntField(term238123, term238123.getClass(), "y", 0);
        setIntField(term238123, term238123.getClass(), "width", 0);
        setIntField(term238123, term238123.getClass(), "height", 0);
        setField(term238123, term238123.getClass(), "foreground", null);
        setField(term238123, term238123.getClass(), "background", null);
        setField(term238123, term238123.getClass(), "font", null);
        setField(term238123, term238123.getClass(), "peerFont", null);
        setField(term238123, term238123.getClass(), "cursor", null);
        setField(term238123, term238123.getClass(), "locale", null);
        setField(term238123, term238123.getClass(), "graphicsConfig", null);
        setField(term238123, term238123.getClass(), "bufferStrategy", null);
        setBooleanField(term238123, term238123.getClass(), "ignoreRepaint", false);
        setBooleanField(term238123, term238123.getClass(), "visible", false);
        setBooleanField(term238123, term238123.getClass(), "enabled", false);
        setBooleanField(term238123, term238123.getClass(), "valid", false);
        setField(term238123, term238123.getClass(), "dropTarget", null);
        setField(term238123, term238123.getClass(), "popups", null);
        setField(term238123, term238123.getClass(), "name", null);
        setBooleanField(term238123, term238123.getClass(), "nameExplicitlySet", false);
        setBooleanField(term238123, term238123.getClass(), "focusable", false);
        setIntField(term238123, term238123.getClass(), "isFocusTraversableOverridden", 0);
        setField(term238123, term238123.getClass(), "focusTraversalKeys", null);
        setBooleanField(term238123, term238123.getClass(), "focusTraversalKeysEnabled", false);
        setField(term238123, term238123.getClass(), "acc", null);
        setField(term238123, term238123.getClass(), "minSize", null);
        setBooleanField(term238123, term238123.getClass(), "minSizeSet", false);
        setField(term238123, term238123.getClass(), "prefSize", null);
        setBooleanField(term238123, term238123.getClass(), "prefSizeSet", false);
        setField(term238123, term238123.getClass(), "maxSize", null);
        setBooleanField(term238123, term238123.getClass(), "maxSizeSet", false);
        setField(term238123, term238123.getClass(), "componentOrientation", null);
        setBooleanField(term238123, term238123.getClass(), "newEventsOnly", false);
        setField(term238123, term238123.getClass(), "componentListener", null);
        setField(term238123, term238123.getClass(), "focusListener", null);
        setField(term238123, term238123.getClass(), "hierarchyListener", null);
        setField(term238123, term238123.getClass(), "hierarchyBoundsListener", null);
        setField(term238123, term238123.getClass(), "keyListener", null);
        setField(term238123, term238123.getClass(), "mouseListener", null);
        setField(term238123, term238123.getClass(), "mouseMotionListener", null);
        setField(term238123, term238123.getClass(), "mouseWheelListener", null);
        setField(term238123, term238123.getClass(), "inputMethodListener", null);
        setLongField(term238123, term238123.getClass(), "eventMask", 0L);
        setField(term238123, term238123.getClass(), "changeSupport", null);
        setField(term238123, term238123.getClass(), "objectLock", null);
        setBooleanField(term238123, term238123.getClass(), "isPacked", false);
        setIntField(term238123, term238123.getClass(), "boundsOp", 0);
        setField(term238123, term238123.getClass(), "compoundShape", null);
        setField(term238123, term238123.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term238123, term238123.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term238123, term238123.getClass(), "backgroundEraseDisabled", false);
        setField(term238123, term238123.getClass(), "eventCache", null);
        setBooleanField(term238123, term238123.getClass(), "coalescingEnabled", false);
        setBooleanField(term238123, term238123.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term238123, term238123.getClass(), "componentSerializedDataVersion", 0);
        setField(term238123, term238123.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ShipInteriorPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetImage", argTypes, term238123, args);
    }

};


