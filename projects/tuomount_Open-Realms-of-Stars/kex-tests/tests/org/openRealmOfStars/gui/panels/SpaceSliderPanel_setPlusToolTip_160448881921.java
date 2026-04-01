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

public class SpaceSliderPanel_setPlusToolTip_160448881921 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10387;

    public SpaceSliderPanel_setPlusToolTip_160448881921() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10387 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10387, term10387.getClass(), "btnMinus", null);
        setField(term10387, term10387.getClass(), "btnPlus", null);
        setField(term10387, term10387.getClass(), "label", null);
        setField(term10387, term10387.getClass(), "slider", null);
        setBooleanField(term10387, term10387.getClass(), "isAlignmentXSet", false);
        setFloatField(term10387, term10387.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10387, term10387.getClass(), "isAlignmentYSet", false);
        setFloatField(term10387, term10387.getClass(), "alignmentY", 0.0F);
        setField(term10387, term10387.getClass(), "ui", null);
        setField(term10387, term10387.getClass(), "listenerList", null);
        setField(term10387, term10387.getClass(), "clientProperties", null);
        setField(term10387, term10387.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10387, term10387.getClass(), "autoscrolls", false);
        setField(term10387, term10387.getClass(), "border", null);
        setIntField(term10387, term10387.getClass(), "flags", 0);
        setField(term10387, term10387.getClass(), "inputVerifier", null);
        setBooleanField(term10387, term10387.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10387, term10387.getClass(), "paintingChild", null);
        setField(term10387, term10387.getClass(), "popupMenu", null);
        setField(term10387, term10387.getClass(), "revalidateRunnableScheduled", null);
        setField(term10387, term10387.getClass(), "focusInputMap", null);
        setField(term10387, term10387.getClass(), "ancestorInputMap", null);
        setField(term10387, term10387.getClass(), "windowInputMap", null);
        setField(term10387, term10387.getClass(), "actionMap", null);
        setField(term10387, term10387.getClass(), "aaHint", null);
        setField(term10387, term10387.getClass(), "lcdRenderingHint", null);
        setField(term10387, term10387.getClass(), "component", null);
        setField(term10387, term10387.getClass(), "layoutMgr", null);
        setField(term10387, term10387.getClass(), "dispatcher", null);
        setField(term10387, term10387.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10387, term10387.getClass(), "focusCycleRoot", false);
        setBooleanField(term10387, term10387.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10387, term10387.getClass(), "printingThreads", null);
        setBooleanField(term10387, term10387.getClass(), "printing", false);
        setField(term10387, term10387.getClass(), "containerListener", null);
        setIntField(term10387, term10387.getClass(), "listeningChildren", 0);
        setIntField(term10387, term10387.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10387, term10387.getClass(), "descendantsCount", 0);
        setField(term10387, term10387.getClass(), "preserveBackgroundColor", null);
        setIntField(term10387, term10387.getClass(), "numOfHWComponents", 0);
        setIntField(term10387, term10387.getClass(), "numOfLWComponents", 0);
        setField(term10387, term10387.getClass(), "modalComp", null);
        setField(term10387, term10387.getClass(), "modalAppContext", null);
        setIntField(term10387, term10387.getClass(), "containerSerializedDataVersion", 0);
        setField(term10387, term10387.getClass(), "peer", null);
        setField(term10387, term10387.getClass(), "parent", null);
        setField(term10387, term10387.getClass(), "appContext", null);
        setIntField(term10387, term10387.getClass(), "x", 0);
        setIntField(term10387, term10387.getClass(), "y", 0);
        setIntField(term10387, term10387.getClass(), "width", 0);
        setIntField(term10387, term10387.getClass(), "height", 0);
        setField(term10387, term10387.getClass(), "foreground", null);
        setField(term10387, term10387.getClass(), "background", null);
        setField(term10387, term10387.getClass(), "font", null);
        setField(term10387, term10387.getClass(), "peerFont", null);
        setField(term10387, term10387.getClass(), "cursor", null);
        setField(term10387, term10387.getClass(), "locale", null);
        setField(term10387, term10387.getClass(), "graphicsConfig", null);
        setField(term10387, term10387.getClass(), "bufferStrategy", null);
        setBooleanField(term10387, term10387.getClass(), "ignoreRepaint", false);
        setBooleanField(term10387, term10387.getClass(), "visible", false);
        setBooleanField(term10387, term10387.getClass(), "enabled", false);
        setBooleanField(term10387, term10387.getClass(), "valid", false);
        setField(term10387, term10387.getClass(), "dropTarget", null);
        setField(term10387, term10387.getClass(), "popups", null);
        setField(term10387, term10387.getClass(), "name", null);
        setBooleanField(term10387, term10387.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10387, term10387.getClass(), "focusable", false);
        setIntField(term10387, term10387.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10387, term10387.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10387, term10387.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10387, term10387.getClass(), "acc", null);
        setField(term10387, term10387.getClass(), "minSize", null);
        setBooleanField(term10387, term10387.getClass(), "minSizeSet", false);
        setField(term10387, term10387.getClass(), "prefSize", null);
        setBooleanField(term10387, term10387.getClass(), "prefSizeSet", false);
        setField(term10387, term10387.getClass(), "maxSize", null);
        setBooleanField(term10387, term10387.getClass(), "maxSizeSet", false);
        setField(term10387, term10387.getClass(), "componentOrientation", null);
        setBooleanField(term10387, term10387.getClass(), "newEventsOnly", false);
        setField(term10387, term10387.getClass(), "componentListener", null);
        setField(term10387, term10387.getClass(), "focusListener", null);
        setField(term10387, term10387.getClass(), "hierarchyListener", null);
        setField(term10387, term10387.getClass(), "hierarchyBoundsListener", null);
        setField(term10387, term10387.getClass(), "keyListener", null);
        setField(term10387, term10387.getClass(), "mouseListener", null);
        setField(term10387, term10387.getClass(), "mouseMotionListener", null);
        setField(term10387, term10387.getClass(), "mouseWheelListener", null);
        setField(term10387, term10387.getClass(), "inputMethodListener", null);
        setLongField(term10387, term10387.getClass(), "eventMask", 0L);
        setField(term10387, term10387.getClass(), "changeSupport", null);
        setField(term10387, term10387.getClass(), "objectLock", null);
        setBooleanField(term10387, term10387.getClass(), "isPacked", false);
        setIntField(term10387, term10387.getClass(), "boundsOp", 0);
        setField(term10387, term10387.getClass(), "compoundShape", null);
        setField(term10387, term10387.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10387, term10387.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10387, term10387.getClass(), "backgroundEraseDisabled", false);
        setField(term10387, term10387.getClass(), "eventCache", null);
        setBooleanField(term10387, term10387.getClass(), "coalescingEnabled", false);
        setBooleanField(term10387, term10387.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10387, term10387.getClass(), "componentSerializedDataVersion", 0);
        setField(term10387, term10387.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlusToolTip", argTypes, term10387, args);
    }

};


