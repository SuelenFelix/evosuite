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

public class SpaceSliderPanel_getMinimumValue_150243115022 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10428;

    public SpaceSliderPanel_getMinimumValue_150243115022() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10428 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10428, term10428.getClass(), "btnMinus", null);
        setField(term10428, term10428.getClass(), "btnPlus", null);
        setField(term10428, term10428.getClass(), "label", null);
        setField(term10428, term10428.getClass(), "slider", null);
        setBooleanField(term10428, term10428.getClass(), "isAlignmentXSet", false);
        setFloatField(term10428, term10428.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10428, term10428.getClass(), "isAlignmentYSet", false);
        setFloatField(term10428, term10428.getClass(), "alignmentY", 0.0F);
        setField(term10428, term10428.getClass(), "ui", null);
        setField(term10428, term10428.getClass(), "listenerList", null);
        setField(term10428, term10428.getClass(), "clientProperties", null);
        setField(term10428, term10428.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10428, term10428.getClass(), "autoscrolls", false);
        setField(term10428, term10428.getClass(), "border", null);
        setIntField(term10428, term10428.getClass(), "flags", 0);
        setField(term10428, term10428.getClass(), "inputVerifier", null);
        setBooleanField(term10428, term10428.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10428, term10428.getClass(), "paintingChild", null);
        setField(term10428, term10428.getClass(), "popupMenu", null);
        setField(term10428, term10428.getClass(), "revalidateRunnableScheduled", null);
        setField(term10428, term10428.getClass(), "focusInputMap", null);
        setField(term10428, term10428.getClass(), "ancestorInputMap", null);
        setField(term10428, term10428.getClass(), "windowInputMap", null);
        setField(term10428, term10428.getClass(), "actionMap", null);
        setField(term10428, term10428.getClass(), "aaHint", null);
        setField(term10428, term10428.getClass(), "lcdRenderingHint", null);
        setField(term10428, term10428.getClass(), "component", null);
        setField(term10428, term10428.getClass(), "layoutMgr", null);
        setField(term10428, term10428.getClass(), "dispatcher", null);
        setField(term10428, term10428.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10428, term10428.getClass(), "focusCycleRoot", false);
        setBooleanField(term10428, term10428.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10428, term10428.getClass(), "printingThreads", null);
        setBooleanField(term10428, term10428.getClass(), "printing", false);
        setField(term10428, term10428.getClass(), "containerListener", null);
        setIntField(term10428, term10428.getClass(), "listeningChildren", 0);
        setIntField(term10428, term10428.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10428, term10428.getClass(), "descendantsCount", 0);
        setField(term10428, term10428.getClass(), "preserveBackgroundColor", null);
        setIntField(term10428, term10428.getClass(), "numOfHWComponents", 0);
        setIntField(term10428, term10428.getClass(), "numOfLWComponents", 0);
        setField(term10428, term10428.getClass(), "modalComp", null);
        setField(term10428, term10428.getClass(), "modalAppContext", null);
        setIntField(term10428, term10428.getClass(), "containerSerializedDataVersion", 0);
        setField(term10428, term10428.getClass(), "peer", null);
        setField(term10428, term10428.getClass(), "parent", null);
        setField(term10428, term10428.getClass(), "appContext", null);
        setIntField(term10428, term10428.getClass(), "x", 0);
        setIntField(term10428, term10428.getClass(), "y", 0);
        setIntField(term10428, term10428.getClass(), "width", 0);
        setIntField(term10428, term10428.getClass(), "height", 0);
        setField(term10428, term10428.getClass(), "foreground", null);
        setField(term10428, term10428.getClass(), "background", null);
        setField(term10428, term10428.getClass(), "font", null);
        setField(term10428, term10428.getClass(), "peerFont", null);
        setField(term10428, term10428.getClass(), "cursor", null);
        setField(term10428, term10428.getClass(), "locale", null);
        setField(term10428, term10428.getClass(), "graphicsConfig", null);
        setField(term10428, term10428.getClass(), "bufferStrategy", null);
        setBooleanField(term10428, term10428.getClass(), "ignoreRepaint", false);
        setBooleanField(term10428, term10428.getClass(), "visible", false);
        setBooleanField(term10428, term10428.getClass(), "enabled", false);
        setBooleanField(term10428, term10428.getClass(), "valid", false);
        setField(term10428, term10428.getClass(), "dropTarget", null);
        setField(term10428, term10428.getClass(), "popups", null);
        setField(term10428, term10428.getClass(), "name", null);
        setBooleanField(term10428, term10428.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10428, term10428.getClass(), "focusable", false);
        setIntField(term10428, term10428.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10428, term10428.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10428, term10428.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10428, term10428.getClass(), "acc", null);
        setField(term10428, term10428.getClass(), "minSize", null);
        setBooleanField(term10428, term10428.getClass(), "minSizeSet", false);
        setField(term10428, term10428.getClass(), "prefSize", null);
        setBooleanField(term10428, term10428.getClass(), "prefSizeSet", false);
        setField(term10428, term10428.getClass(), "maxSize", null);
        setBooleanField(term10428, term10428.getClass(), "maxSizeSet", false);
        setField(term10428, term10428.getClass(), "componentOrientation", null);
        setBooleanField(term10428, term10428.getClass(), "newEventsOnly", false);
        setField(term10428, term10428.getClass(), "componentListener", null);
        setField(term10428, term10428.getClass(), "focusListener", null);
        setField(term10428, term10428.getClass(), "hierarchyListener", null);
        setField(term10428, term10428.getClass(), "hierarchyBoundsListener", null);
        setField(term10428, term10428.getClass(), "keyListener", null);
        setField(term10428, term10428.getClass(), "mouseListener", null);
        setField(term10428, term10428.getClass(), "mouseMotionListener", null);
        setField(term10428, term10428.getClass(), "mouseWheelListener", null);
        setField(term10428, term10428.getClass(), "inputMethodListener", null);
        setLongField(term10428, term10428.getClass(), "eventMask", 0L);
        setField(term10428, term10428.getClass(), "changeSupport", null);
        setField(term10428, term10428.getClass(), "objectLock", null);
        setBooleanField(term10428, term10428.getClass(), "isPacked", false);
        setIntField(term10428, term10428.getClass(), "boundsOp", 0);
        setField(term10428, term10428.getClass(), "compoundShape", null);
        setField(term10428, term10428.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10428, term10428.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10428, term10428.getClass(), "backgroundEraseDisabled", false);
        setField(term10428, term10428.getClass(), "eventCache", null);
        setBooleanField(term10428, term10428.getClass(), "coalescingEnabled", false);
        setBooleanField(term10428, term10428.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10428, term10428.getClass(), "componentSerializedDataVersion", 0);
        setField(term10428, term10428.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumValue", argTypes, term10428, args);
    }

};


