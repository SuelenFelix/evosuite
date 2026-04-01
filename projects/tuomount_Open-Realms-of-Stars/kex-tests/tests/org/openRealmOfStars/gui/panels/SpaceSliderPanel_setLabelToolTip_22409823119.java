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

public class SpaceSliderPanel_setLabelToolTip_22409823119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10305;

    public SpaceSliderPanel_setLabelToolTip_22409823119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10305 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10305, term10305.getClass(), "btnMinus", null);
        setField(term10305, term10305.getClass(), "btnPlus", null);
        setField(term10305, term10305.getClass(), "label", null);
        setField(term10305, term10305.getClass(), "slider", null);
        setBooleanField(term10305, term10305.getClass(), "isAlignmentXSet", false);
        setFloatField(term10305, term10305.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10305, term10305.getClass(), "isAlignmentYSet", false);
        setFloatField(term10305, term10305.getClass(), "alignmentY", 0.0F);
        setField(term10305, term10305.getClass(), "ui", null);
        setField(term10305, term10305.getClass(), "listenerList", null);
        setField(term10305, term10305.getClass(), "clientProperties", null);
        setField(term10305, term10305.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10305, term10305.getClass(), "autoscrolls", false);
        setField(term10305, term10305.getClass(), "border", null);
        setIntField(term10305, term10305.getClass(), "flags", 0);
        setField(term10305, term10305.getClass(), "inputVerifier", null);
        setBooleanField(term10305, term10305.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10305, term10305.getClass(), "paintingChild", null);
        setField(term10305, term10305.getClass(), "popupMenu", null);
        setField(term10305, term10305.getClass(), "revalidateRunnableScheduled", null);
        setField(term10305, term10305.getClass(), "focusInputMap", null);
        setField(term10305, term10305.getClass(), "ancestorInputMap", null);
        setField(term10305, term10305.getClass(), "windowInputMap", null);
        setField(term10305, term10305.getClass(), "actionMap", null);
        setField(term10305, term10305.getClass(), "aaHint", null);
        setField(term10305, term10305.getClass(), "lcdRenderingHint", null);
        setField(term10305, term10305.getClass(), "component", null);
        setField(term10305, term10305.getClass(), "layoutMgr", null);
        setField(term10305, term10305.getClass(), "dispatcher", null);
        setField(term10305, term10305.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10305, term10305.getClass(), "focusCycleRoot", false);
        setBooleanField(term10305, term10305.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10305, term10305.getClass(), "printingThreads", null);
        setBooleanField(term10305, term10305.getClass(), "printing", false);
        setField(term10305, term10305.getClass(), "containerListener", null);
        setIntField(term10305, term10305.getClass(), "listeningChildren", 0);
        setIntField(term10305, term10305.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10305, term10305.getClass(), "descendantsCount", 0);
        setField(term10305, term10305.getClass(), "preserveBackgroundColor", null);
        setIntField(term10305, term10305.getClass(), "numOfHWComponents", 0);
        setIntField(term10305, term10305.getClass(), "numOfLWComponents", 0);
        setField(term10305, term10305.getClass(), "modalComp", null);
        setField(term10305, term10305.getClass(), "modalAppContext", null);
        setIntField(term10305, term10305.getClass(), "containerSerializedDataVersion", 0);
        setField(term10305, term10305.getClass(), "peer", null);
        setField(term10305, term10305.getClass(), "parent", null);
        setField(term10305, term10305.getClass(), "appContext", null);
        setIntField(term10305, term10305.getClass(), "x", 0);
        setIntField(term10305, term10305.getClass(), "y", 0);
        setIntField(term10305, term10305.getClass(), "width", 0);
        setIntField(term10305, term10305.getClass(), "height", 0);
        setField(term10305, term10305.getClass(), "foreground", null);
        setField(term10305, term10305.getClass(), "background", null);
        setField(term10305, term10305.getClass(), "font", null);
        setField(term10305, term10305.getClass(), "peerFont", null);
        setField(term10305, term10305.getClass(), "cursor", null);
        setField(term10305, term10305.getClass(), "locale", null);
        setField(term10305, term10305.getClass(), "graphicsConfig", null);
        setField(term10305, term10305.getClass(), "bufferStrategy", null);
        setBooleanField(term10305, term10305.getClass(), "ignoreRepaint", false);
        setBooleanField(term10305, term10305.getClass(), "visible", false);
        setBooleanField(term10305, term10305.getClass(), "enabled", false);
        setBooleanField(term10305, term10305.getClass(), "valid", false);
        setField(term10305, term10305.getClass(), "dropTarget", null);
        setField(term10305, term10305.getClass(), "popups", null);
        setField(term10305, term10305.getClass(), "name", null);
        setBooleanField(term10305, term10305.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10305, term10305.getClass(), "focusable", false);
        setIntField(term10305, term10305.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10305, term10305.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10305, term10305.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10305, term10305.getClass(), "acc", null);
        setField(term10305, term10305.getClass(), "minSize", null);
        setBooleanField(term10305, term10305.getClass(), "minSizeSet", false);
        setField(term10305, term10305.getClass(), "prefSize", null);
        setBooleanField(term10305, term10305.getClass(), "prefSizeSet", false);
        setField(term10305, term10305.getClass(), "maxSize", null);
        setBooleanField(term10305, term10305.getClass(), "maxSizeSet", false);
        setField(term10305, term10305.getClass(), "componentOrientation", null);
        setBooleanField(term10305, term10305.getClass(), "newEventsOnly", false);
        setField(term10305, term10305.getClass(), "componentListener", null);
        setField(term10305, term10305.getClass(), "focusListener", null);
        setField(term10305, term10305.getClass(), "hierarchyListener", null);
        setField(term10305, term10305.getClass(), "hierarchyBoundsListener", null);
        setField(term10305, term10305.getClass(), "keyListener", null);
        setField(term10305, term10305.getClass(), "mouseListener", null);
        setField(term10305, term10305.getClass(), "mouseMotionListener", null);
        setField(term10305, term10305.getClass(), "mouseWheelListener", null);
        setField(term10305, term10305.getClass(), "inputMethodListener", null);
        setLongField(term10305, term10305.getClass(), "eventMask", 0L);
        setField(term10305, term10305.getClass(), "changeSupport", null);
        setField(term10305, term10305.getClass(), "objectLock", null);
        setBooleanField(term10305, term10305.getClass(), "isPacked", false);
        setIntField(term10305, term10305.getClass(), "boundsOp", 0);
        setField(term10305, term10305.getClass(), "compoundShape", null);
        setField(term10305, term10305.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10305, term10305.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10305, term10305.getClass(), "backgroundEraseDisabled", false);
        setField(term10305, term10305.getClass(), "eventCache", null);
        setBooleanField(term10305, term10305.getClass(), "coalescingEnabled", false);
        setBooleanField(term10305, term10305.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10305, term10305.getClass(), "componentSerializedDataVersion", 0);
        setField(term10305, term10305.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLabelToolTip", argTypes, term10305, args);
    }

};


