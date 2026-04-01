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

public class SpaceSliderPanel_setMinusToolTip_114173702920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10346;

    public SpaceSliderPanel_setMinusToolTip_114173702920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10346 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10346, term10346.getClass(), "btnMinus", null);
        setField(term10346, term10346.getClass(), "btnPlus", null);
        setField(term10346, term10346.getClass(), "label", null);
        setField(term10346, term10346.getClass(), "slider", null);
        setBooleanField(term10346, term10346.getClass(), "isAlignmentXSet", false);
        setFloatField(term10346, term10346.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10346, term10346.getClass(), "isAlignmentYSet", false);
        setFloatField(term10346, term10346.getClass(), "alignmentY", 0.0F);
        setField(term10346, term10346.getClass(), "ui", null);
        setField(term10346, term10346.getClass(), "listenerList", null);
        setField(term10346, term10346.getClass(), "clientProperties", null);
        setField(term10346, term10346.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10346, term10346.getClass(), "autoscrolls", false);
        setField(term10346, term10346.getClass(), "border", null);
        setIntField(term10346, term10346.getClass(), "flags", 0);
        setField(term10346, term10346.getClass(), "inputVerifier", null);
        setBooleanField(term10346, term10346.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10346, term10346.getClass(), "paintingChild", null);
        setField(term10346, term10346.getClass(), "popupMenu", null);
        setField(term10346, term10346.getClass(), "revalidateRunnableScheduled", null);
        setField(term10346, term10346.getClass(), "focusInputMap", null);
        setField(term10346, term10346.getClass(), "ancestorInputMap", null);
        setField(term10346, term10346.getClass(), "windowInputMap", null);
        setField(term10346, term10346.getClass(), "actionMap", null);
        setField(term10346, term10346.getClass(), "aaHint", null);
        setField(term10346, term10346.getClass(), "lcdRenderingHint", null);
        setField(term10346, term10346.getClass(), "component", null);
        setField(term10346, term10346.getClass(), "layoutMgr", null);
        setField(term10346, term10346.getClass(), "dispatcher", null);
        setField(term10346, term10346.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10346, term10346.getClass(), "focusCycleRoot", false);
        setBooleanField(term10346, term10346.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10346, term10346.getClass(), "printingThreads", null);
        setBooleanField(term10346, term10346.getClass(), "printing", false);
        setField(term10346, term10346.getClass(), "containerListener", null);
        setIntField(term10346, term10346.getClass(), "listeningChildren", 0);
        setIntField(term10346, term10346.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10346, term10346.getClass(), "descendantsCount", 0);
        setField(term10346, term10346.getClass(), "preserveBackgroundColor", null);
        setIntField(term10346, term10346.getClass(), "numOfHWComponents", 0);
        setIntField(term10346, term10346.getClass(), "numOfLWComponents", 0);
        setField(term10346, term10346.getClass(), "modalComp", null);
        setField(term10346, term10346.getClass(), "modalAppContext", null);
        setIntField(term10346, term10346.getClass(), "containerSerializedDataVersion", 0);
        setField(term10346, term10346.getClass(), "peer", null);
        setField(term10346, term10346.getClass(), "parent", null);
        setField(term10346, term10346.getClass(), "appContext", null);
        setIntField(term10346, term10346.getClass(), "x", 0);
        setIntField(term10346, term10346.getClass(), "y", 0);
        setIntField(term10346, term10346.getClass(), "width", 0);
        setIntField(term10346, term10346.getClass(), "height", 0);
        setField(term10346, term10346.getClass(), "foreground", null);
        setField(term10346, term10346.getClass(), "background", null);
        setField(term10346, term10346.getClass(), "font", null);
        setField(term10346, term10346.getClass(), "peerFont", null);
        setField(term10346, term10346.getClass(), "cursor", null);
        setField(term10346, term10346.getClass(), "locale", null);
        setField(term10346, term10346.getClass(), "graphicsConfig", null);
        setField(term10346, term10346.getClass(), "bufferStrategy", null);
        setBooleanField(term10346, term10346.getClass(), "ignoreRepaint", false);
        setBooleanField(term10346, term10346.getClass(), "visible", false);
        setBooleanField(term10346, term10346.getClass(), "enabled", false);
        setBooleanField(term10346, term10346.getClass(), "valid", false);
        setField(term10346, term10346.getClass(), "dropTarget", null);
        setField(term10346, term10346.getClass(), "popups", null);
        setField(term10346, term10346.getClass(), "name", null);
        setBooleanField(term10346, term10346.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10346, term10346.getClass(), "focusable", false);
        setIntField(term10346, term10346.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10346, term10346.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10346, term10346.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10346, term10346.getClass(), "acc", null);
        setField(term10346, term10346.getClass(), "minSize", null);
        setBooleanField(term10346, term10346.getClass(), "minSizeSet", false);
        setField(term10346, term10346.getClass(), "prefSize", null);
        setBooleanField(term10346, term10346.getClass(), "prefSizeSet", false);
        setField(term10346, term10346.getClass(), "maxSize", null);
        setBooleanField(term10346, term10346.getClass(), "maxSizeSet", false);
        setField(term10346, term10346.getClass(), "componentOrientation", null);
        setBooleanField(term10346, term10346.getClass(), "newEventsOnly", false);
        setField(term10346, term10346.getClass(), "componentListener", null);
        setField(term10346, term10346.getClass(), "focusListener", null);
        setField(term10346, term10346.getClass(), "hierarchyListener", null);
        setField(term10346, term10346.getClass(), "hierarchyBoundsListener", null);
        setField(term10346, term10346.getClass(), "keyListener", null);
        setField(term10346, term10346.getClass(), "mouseListener", null);
        setField(term10346, term10346.getClass(), "mouseMotionListener", null);
        setField(term10346, term10346.getClass(), "mouseWheelListener", null);
        setField(term10346, term10346.getClass(), "inputMethodListener", null);
        setLongField(term10346, term10346.getClass(), "eventMask", 0L);
        setField(term10346, term10346.getClass(), "changeSupport", null);
        setField(term10346, term10346.getClass(), "objectLock", null);
        setBooleanField(term10346, term10346.getClass(), "isPacked", false);
        setIntField(term10346, term10346.getClass(), "boundsOp", 0);
        setField(term10346, term10346.getClass(), "compoundShape", null);
        setField(term10346, term10346.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10346, term10346.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10346, term10346.getClass(), "backgroundEraseDisabled", false);
        setField(term10346, term10346.getClass(), "eventCache", null);
        setBooleanField(term10346, term10346.getClass(), "coalescingEnabled", false);
        setBooleanField(term10346, term10346.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10346, term10346.getClass(), "componentSerializedDataVersion", 0);
        setField(term10346, term10346.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMinusToolTip", argTypes, term10346, args);
    }

};


