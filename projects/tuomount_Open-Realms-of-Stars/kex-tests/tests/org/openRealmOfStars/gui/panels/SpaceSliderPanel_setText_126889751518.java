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

public class SpaceSliderPanel_setText_126889751518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10264;

    public SpaceSliderPanel_setText_126889751518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10264 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10264, term10264.getClass(), "btnMinus", null);
        setField(term10264, term10264.getClass(), "btnPlus", null);
        setField(term10264, term10264.getClass(), "label", null);
        setField(term10264, term10264.getClass(), "slider", null);
        setBooleanField(term10264, term10264.getClass(), "isAlignmentXSet", false);
        setFloatField(term10264, term10264.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10264, term10264.getClass(), "isAlignmentYSet", false);
        setFloatField(term10264, term10264.getClass(), "alignmentY", 0.0F);
        setField(term10264, term10264.getClass(), "ui", null);
        setField(term10264, term10264.getClass(), "listenerList", null);
        setField(term10264, term10264.getClass(), "clientProperties", null);
        setField(term10264, term10264.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10264, term10264.getClass(), "autoscrolls", false);
        setField(term10264, term10264.getClass(), "border", null);
        setIntField(term10264, term10264.getClass(), "flags", 0);
        setField(term10264, term10264.getClass(), "inputVerifier", null);
        setBooleanField(term10264, term10264.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10264, term10264.getClass(), "paintingChild", null);
        setField(term10264, term10264.getClass(), "popupMenu", null);
        setField(term10264, term10264.getClass(), "revalidateRunnableScheduled", null);
        setField(term10264, term10264.getClass(), "focusInputMap", null);
        setField(term10264, term10264.getClass(), "ancestorInputMap", null);
        setField(term10264, term10264.getClass(), "windowInputMap", null);
        setField(term10264, term10264.getClass(), "actionMap", null);
        setField(term10264, term10264.getClass(), "aaHint", null);
        setField(term10264, term10264.getClass(), "lcdRenderingHint", null);
        setField(term10264, term10264.getClass(), "component", null);
        setField(term10264, term10264.getClass(), "layoutMgr", null);
        setField(term10264, term10264.getClass(), "dispatcher", null);
        setField(term10264, term10264.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10264, term10264.getClass(), "focusCycleRoot", false);
        setBooleanField(term10264, term10264.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10264, term10264.getClass(), "printingThreads", null);
        setBooleanField(term10264, term10264.getClass(), "printing", false);
        setField(term10264, term10264.getClass(), "containerListener", null);
        setIntField(term10264, term10264.getClass(), "listeningChildren", 0);
        setIntField(term10264, term10264.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10264, term10264.getClass(), "descendantsCount", 0);
        setField(term10264, term10264.getClass(), "preserveBackgroundColor", null);
        setIntField(term10264, term10264.getClass(), "numOfHWComponents", 0);
        setIntField(term10264, term10264.getClass(), "numOfLWComponents", 0);
        setField(term10264, term10264.getClass(), "modalComp", null);
        setField(term10264, term10264.getClass(), "modalAppContext", null);
        setIntField(term10264, term10264.getClass(), "containerSerializedDataVersion", 0);
        setField(term10264, term10264.getClass(), "peer", null);
        setField(term10264, term10264.getClass(), "parent", null);
        setField(term10264, term10264.getClass(), "appContext", null);
        setIntField(term10264, term10264.getClass(), "x", 0);
        setIntField(term10264, term10264.getClass(), "y", 0);
        setIntField(term10264, term10264.getClass(), "width", 0);
        setIntField(term10264, term10264.getClass(), "height", 0);
        setField(term10264, term10264.getClass(), "foreground", null);
        setField(term10264, term10264.getClass(), "background", null);
        setField(term10264, term10264.getClass(), "font", null);
        setField(term10264, term10264.getClass(), "peerFont", null);
        setField(term10264, term10264.getClass(), "cursor", null);
        setField(term10264, term10264.getClass(), "locale", null);
        setField(term10264, term10264.getClass(), "graphicsConfig", null);
        setField(term10264, term10264.getClass(), "bufferStrategy", null);
        setBooleanField(term10264, term10264.getClass(), "ignoreRepaint", false);
        setBooleanField(term10264, term10264.getClass(), "visible", false);
        setBooleanField(term10264, term10264.getClass(), "enabled", false);
        setBooleanField(term10264, term10264.getClass(), "valid", false);
        setField(term10264, term10264.getClass(), "dropTarget", null);
        setField(term10264, term10264.getClass(), "popups", null);
        setField(term10264, term10264.getClass(), "name", null);
        setBooleanField(term10264, term10264.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10264, term10264.getClass(), "focusable", false);
        setIntField(term10264, term10264.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10264, term10264.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10264, term10264.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10264, term10264.getClass(), "acc", null);
        setField(term10264, term10264.getClass(), "minSize", null);
        setBooleanField(term10264, term10264.getClass(), "minSizeSet", false);
        setField(term10264, term10264.getClass(), "prefSize", null);
        setBooleanField(term10264, term10264.getClass(), "prefSizeSet", false);
        setField(term10264, term10264.getClass(), "maxSize", null);
        setBooleanField(term10264, term10264.getClass(), "maxSizeSet", false);
        setField(term10264, term10264.getClass(), "componentOrientation", null);
        setBooleanField(term10264, term10264.getClass(), "newEventsOnly", false);
        setField(term10264, term10264.getClass(), "componentListener", null);
        setField(term10264, term10264.getClass(), "focusListener", null);
        setField(term10264, term10264.getClass(), "hierarchyListener", null);
        setField(term10264, term10264.getClass(), "hierarchyBoundsListener", null);
        setField(term10264, term10264.getClass(), "keyListener", null);
        setField(term10264, term10264.getClass(), "mouseListener", null);
        setField(term10264, term10264.getClass(), "mouseMotionListener", null);
        setField(term10264, term10264.getClass(), "mouseWheelListener", null);
        setField(term10264, term10264.getClass(), "inputMethodListener", null);
        setLongField(term10264, term10264.getClass(), "eventMask", 0L);
        setField(term10264, term10264.getClass(), "changeSupport", null);
        setField(term10264, term10264.getClass(), "objectLock", null);
        setBooleanField(term10264, term10264.getClass(), "isPacked", false);
        setIntField(term10264, term10264.getClass(), "boundsOp", 0);
        setField(term10264, term10264.getClass(), "compoundShape", null);
        setField(term10264, term10264.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10264, term10264.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10264, term10264.getClass(), "backgroundEraseDisabled", false);
        setField(term10264, term10264.getClass(), "eventCache", null);
        setBooleanField(term10264, term10264.getClass(), "coalescingEnabled", false);
        setBooleanField(term10264, term10264.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10264, term10264.getClass(), "componentSerializedDataVersion", 0);
        setField(term10264, term10264.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term10264, args);
    }

};


