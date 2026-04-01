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
import java.lang.Integer;

public class SpaceSliderPanel_setSliderMinorTick_145517338215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10137;
     Object term10178;

    public SpaceSliderPanel_setSliderMinorTick_145517338215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10137 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10137, term10137.getClass(), "btnMinus", null);
        setField(term10137, term10137.getClass(), "btnPlus", null);
        setField(term10137, term10137.getClass(), "label", null);
        setField(term10137, term10137.getClass(), "slider", null);
        setBooleanField(term10137, term10137.getClass(), "isAlignmentXSet", false);
        setFloatField(term10137, term10137.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10137, term10137.getClass(), "isAlignmentYSet", false);
        setFloatField(term10137, term10137.getClass(), "alignmentY", 0.0F);
        setField(term10137, term10137.getClass(), "ui", null);
        setField(term10137, term10137.getClass(), "listenerList", null);
        setField(term10137, term10137.getClass(), "clientProperties", null);
        setField(term10137, term10137.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10137, term10137.getClass(), "autoscrolls", false);
        setField(term10137, term10137.getClass(), "border", null);
        setIntField(term10137, term10137.getClass(), "flags", 0);
        setField(term10137, term10137.getClass(), "inputVerifier", null);
        setBooleanField(term10137, term10137.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10137, term10137.getClass(), "paintingChild", null);
        setField(term10137, term10137.getClass(), "popupMenu", null);
        setField(term10137, term10137.getClass(), "revalidateRunnableScheduled", null);
        setField(term10137, term10137.getClass(), "focusInputMap", null);
        setField(term10137, term10137.getClass(), "ancestorInputMap", null);
        setField(term10137, term10137.getClass(), "windowInputMap", null);
        setField(term10137, term10137.getClass(), "actionMap", null);
        setField(term10137, term10137.getClass(), "aaHint", null);
        setField(term10137, term10137.getClass(), "lcdRenderingHint", null);
        setField(term10137, term10137.getClass(), "component", null);
        setField(term10137, term10137.getClass(), "layoutMgr", null);
        setField(term10137, term10137.getClass(), "dispatcher", null);
        setField(term10137, term10137.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10137, term10137.getClass(), "focusCycleRoot", false);
        setBooleanField(term10137, term10137.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10137, term10137.getClass(), "printingThreads", null);
        setBooleanField(term10137, term10137.getClass(), "printing", false);
        setField(term10137, term10137.getClass(), "containerListener", null);
        setIntField(term10137, term10137.getClass(), "listeningChildren", 0);
        setIntField(term10137, term10137.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10137, term10137.getClass(), "descendantsCount", 0);
        setField(term10137, term10137.getClass(), "preserveBackgroundColor", null);
        setIntField(term10137, term10137.getClass(), "numOfHWComponents", 0);
        setIntField(term10137, term10137.getClass(), "numOfLWComponents", 0);
        setField(term10137, term10137.getClass(), "modalComp", null);
        setField(term10137, term10137.getClass(), "modalAppContext", null);
        setIntField(term10137, term10137.getClass(), "containerSerializedDataVersion", 0);
        setField(term10137, term10137.getClass(), "peer", null);
        setField(term10137, term10137.getClass(), "parent", null);
        setField(term10137, term10137.getClass(), "appContext", null);
        setIntField(term10137, term10137.getClass(), "x", 0);
        setIntField(term10137, term10137.getClass(), "y", 0);
        setIntField(term10137, term10137.getClass(), "width", 0);
        setIntField(term10137, term10137.getClass(), "height", 0);
        setField(term10137, term10137.getClass(), "foreground", null);
        setField(term10137, term10137.getClass(), "background", null);
        setField(term10137, term10137.getClass(), "font", null);
        setField(term10137, term10137.getClass(), "peerFont", null);
        setField(term10137, term10137.getClass(), "cursor", null);
        setField(term10137, term10137.getClass(), "locale", null);
        setField(term10137, term10137.getClass(), "graphicsConfig", null);
        setField(term10137, term10137.getClass(), "bufferStrategy", null);
        setBooleanField(term10137, term10137.getClass(), "ignoreRepaint", false);
        setBooleanField(term10137, term10137.getClass(), "visible", false);
        setBooleanField(term10137, term10137.getClass(), "enabled", false);
        setBooleanField(term10137, term10137.getClass(), "valid", false);
        setField(term10137, term10137.getClass(), "dropTarget", null);
        setField(term10137, term10137.getClass(), "popups", null);
        setField(term10137, term10137.getClass(), "name", null);
        setBooleanField(term10137, term10137.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10137, term10137.getClass(), "focusable", false);
        setIntField(term10137, term10137.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10137, term10137.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10137, term10137.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10137, term10137.getClass(), "acc", null);
        setField(term10137, term10137.getClass(), "minSize", null);
        setBooleanField(term10137, term10137.getClass(), "minSizeSet", false);
        setField(term10137, term10137.getClass(), "prefSize", null);
        setBooleanField(term10137, term10137.getClass(), "prefSizeSet", false);
        setField(term10137, term10137.getClass(), "maxSize", null);
        setBooleanField(term10137, term10137.getClass(), "maxSizeSet", false);
        setField(term10137, term10137.getClass(), "componentOrientation", null);
        setBooleanField(term10137, term10137.getClass(), "newEventsOnly", false);
        setField(term10137, term10137.getClass(), "componentListener", null);
        setField(term10137, term10137.getClass(), "focusListener", null);
        setField(term10137, term10137.getClass(), "hierarchyListener", null);
        setField(term10137, term10137.getClass(), "hierarchyBoundsListener", null);
        setField(term10137, term10137.getClass(), "keyListener", null);
        setField(term10137, term10137.getClass(), "mouseListener", null);
        setField(term10137, term10137.getClass(), "mouseMotionListener", null);
        setField(term10137, term10137.getClass(), "mouseWheelListener", null);
        setField(term10137, term10137.getClass(), "inputMethodListener", null);
        setLongField(term10137, term10137.getClass(), "eventMask", 0L);
        setField(term10137, term10137.getClass(), "changeSupport", null);
        setField(term10137, term10137.getClass(), "objectLock", null);
        setBooleanField(term10137, term10137.getClass(), "isPacked", false);
        setIntField(term10137, term10137.getClass(), "boundsOp", 0);
        setField(term10137, term10137.getClass(), "compoundShape", null);
        setField(term10137, term10137.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10137, term10137.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10137, term10137.getClass(), "backgroundEraseDisabled", false);
        setField(term10137, term10137.getClass(), "eventCache", null);
        setBooleanField(term10137, term10137.getClass(), "coalescingEnabled", false);
        setBooleanField(term10137, term10137.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10137, term10137.getClass(), "componentSerializedDataVersion", 0);
        setField(term10137, term10137.getClass(), "accessibleContext", null);
        term10178 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10178;
        callMethod(klass, "setSliderMinorTick", argTypes, term10137, args);
    }

};


