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

public class SpaceSliderPanel_getMaximumValue_84551510023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10469;

    public SpaceSliderPanel_getMaximumValue_84551510023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10469 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10469, term10469.getClass(), "btnMinus", null);
        setField(term10469, term10469.getClass(), "btnPlus", null);
        setField(term10469, term10469.getClass(), "label", null);
        setField(term10469, term10469.getClass(), "slider", null);
        setBooleanField(term10469, term10469.getClass(), "isAlignmentXSet", false);
        setFloatField(term10469, term10469.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10469, term10469.getClass(), "isAlignmentYSet", false);
        setFloatField(term10469, term10469.getClass(), "alignmentY", 0.0F);
        setField(term10469, term10469.getClass(), "ui", null);
        setField(term10469, term10469.getClass(), "listenerList", null);
        setField(term10469, term10469.getClass(), "clientProperties", null);
        setField(term10469, term10469.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10469, term10469.getClass(), "autoscrolls", false);
        setField(term10469, term10469.getClass(), "border", null);
        setIntField(term10469, term10469.getClass(), "flags", 0);
        setField(term10469, term10469.getClass(), "inputVerifier", null);
        setBooleanField(term10469, term10469.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10469, term10469.getClass(), "paintingChild", null);
        setField(term10469, term10469.getClass(), "popupMenu", null);
        setField(term10469, term10469.getClass(), "revalidateRunnableScheduled", null);
        setField(term10469, term10469.getClass(), "focusInputMap", null);
        setField(term10469, term10469.getClass(), "ancestorInputMap", null);
        setField(term10469, term10469.getClass(), "windowInputMap", null);
        setField(term10469, term10469.getClass(), "actionMap", null);
        setField(term10469, term10469.getClass(), "aaHint", null);
        setField(term10469, term10469.getClass(), "lcdRenderingHint", null);
        setField(term10469, term10469.getClass(), "component", null);
        setField(term10469, term10469.getClass(), "layoutMgr", null);
        setField(term10469, term10469.getClass(), "dispatcher", null);
        setField(term10469, term10469.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10469, term10469.getClass(), "focusCycleRoot", false);
        setBooleanField(term10469, term10469.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10469, term10469.getClass(), "printingThreads", null);
        setBooleanField(term10469, term10469.getClass(), "printing", false);
        setField(term10469, term10469.getClass(), "containerListener", null);
        setIntField(term10469, term10469.getClass(), "listeningChildren", 0);
        setIntField(term10469, term10469.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10469, term10469.getClass(), "descendantsCount", 0);
        setField(term10469, term10469.getClass(), "preserveBackgroundColor", null);
        setIntField(term10469, term10469.getClass(), "numOfHWComponents", 0);
        setIntField(term10469, term10469.getClass(), "numOfLWComponents", 0);
        setField(term10469, term10469.getClass(), "modalComp", null);
        setField(term10469, term10469.getClass(), "modalAppContext", null);
        setIntField(term10469, term10469.getClass(), "containerSerializedDataVersion", 0);
        setField(term10469, term10469.getClass(), "peer", null);
        setField(term10469, term10469.getClass(), "parent", null);
        setField(term10469, term10469.getClass(), "appContext", null);
        setIntField(term10469, term10469.getClass(), "x", 0);
        setIntField(term10469, term10469.getClass(), "y", 0);
        setIntField(term10469, term10469.getClass(), "width", 0);
        setIntField(term10469, term10469.getClass(), "height", 0);
        setField(term10469, term10469.getClass(), "foreground", null);
        setField(term10469, term10469.getClass(), "background", null);
        setField(term10469, term10469.getClass(), "font", null);
        setField(term10469, term10469.getClass(), "peerFont", null);
        setField(term10469, term10469.getClass(), "cursor", null);
        setField(term10469, term10469.getClass(), "locale", null);
        setField(term10469, term10469.getClass(), "graphicsConfig", null);
        setField(term10469, term10469.getClass(), "bufferStrategy", null);
        setBooleanField(term10469, term10469.getClass(), "ignoreRepaint", false);
        setBooleanField(term10469, term10469.getClass(), "visible", false);
        setBooleanField(term10469, term10469.getClass(), "enabled", false);
        setBooleanField(term10469, term10469.getClass(), "valid", false);
        setField(term10469, term10469.getClass(), "dropTarget", null);
        setField(term10469, term10469.getClass(), "popups", null);
        setField(term10469, term10469.getClass(), "name", null);
        setBooleanField(term10469, term10469.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10469, term10469.getClass(), "focusable", false);
        setIntField(term10469, term10469.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10469, term10469.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10469, term10469.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10469, term10469.getClass(), "acc", null);
        setField(term10469, term10469.getClass(), "minSize", null);
        setBooleanField(term10469, term10469.getClass(), "minSizeSet", false);
        setField(term10469, term10469.getClass(), "prefSize", null);
        setBooleanField(term10469, term10469.getClass(), "prefSizeSet", false);
        setField(term10469, term10469.getClass(), "maxSize", null);
        setBooleanField(term10469, term10469.getClass(), "maxSizeSet", false);
        setField(term10469, term10469.getClass(), "componentOrientation", null);
        setBooleanField(term10469, term10469.getClass(), "newEventsOnly", false);
        setField(term10469, term10469.getClass(), "componentListener", null);
        setField(term10469, term10469.getClass(), "focusListener", null);
        setField(term10469, term10469.getClass(), "hierarchyListener", null);
        setField(term10469, term10469.getClass(), "hierarchyBoundsListener", null);
        setField(term10469, term10469.getClass(), "keyListener", null);
        setField(term10469, term10469.getClass(), "mouseListener", null);
        setField(term10469, term10469.getClass(), "mouseMotionListener", null);
        setField(term10469, term10469.getClass(), "mouseWheelListener", null);
        setField(term10469, term10469.getClass(), "inputMethodListener", null);
        setLongField(term10469, term10469.getClass(), "eventMask", 0L);
        setField(term10469, term10469.getClass(), "changeSupport", null);
        setField(term10469, term10469.getClass(), "objectLock", null);
        setBooleanField(term10469, term10469.getClass(), "isPacked", false);
        setIntField(term10469, term10469.getClass(), "boundsOp", 0);
        setField(term10469, term10469.getClass(), "compoundShape", null);
        setField(term10469, term10469.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10469, term10469.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10469, term10469.getClass(), "backgroundEraseDisabled", false);
        setField(term10469, term10469.getClass(), "eventCache", null);
        setBooleanField(term10469, term10469.getClass(), "coalescingEnabled", false);
        setBooleanField(term10469, term10469.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10469, term10469.getClass(), "componentSerializedDataVersion", 0);
        setField(term10469, term10469.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumValue", argTypes, term10469, args);
    }

};


