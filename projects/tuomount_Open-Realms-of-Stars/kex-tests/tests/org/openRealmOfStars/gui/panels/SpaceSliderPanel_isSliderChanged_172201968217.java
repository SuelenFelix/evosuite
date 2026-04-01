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

public class SpaceSliderPanel_isSliderChanged_172201968217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10223;

    public SpaceSliderPanel_isSliderChanged_172201968217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10223 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10223, term10223.getClass(), "btnMinus", null);
        setField(term10223, term10223.getClass(), "btnPlus", null);
        setField(term10223, term10223.getClass(), "label", null);
        setField(term10223, term10223.getClass(), "slider", null);
        setBooleanField(term10223, term10223.getClass(), "isAlignmentXSet", false);
        setFloatField(term10223, term10223.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10223, term10223.getClass(), "isAlignmentYSet", false);
        setFloatField(term10223, term10223.getClass(), "alignmentY", 0.0F);
        setField(term10223, term10223.getClass(), "ui", null);
        setField(term10223, term10223.getClass(), "listenerList", null);
        setField(term10223, term10223.getClass(), "clientProperties", null);
        setField(term10223, term10223.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10223, term10223.getClass(), "autoscrolls", false);
        setField(term10223, term10223.getClass(), "border", null);
        setIntField(term10223, term10223.getClass(), "flags", 0);
        setField(term10223, term10223.getClass(), "inputVerifier", null);
        setBooleanField(term10223, term10223.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10223, term10223.getClass(), "paintingChild", null);
        setField(term10223, term10223.getClass(), "popupMenu", null);
        setField(term10223, term10223.getClass(), "revalidateRunnableScheduled", null);
        setField(term10223, term10223.getClass(), "focusInputMap", null);
        setField(term10223, term10223.getClass(), "ancestorInputMap", null);
        setField(term10223, term10223.getClass(), "windowInputMap", null);
        setField(term10223, term10223.getClass(), "actionMap", null);
        setField(term10223, term10223.getClass(), "aaHint", null);
        setField(term10223, term10223.getClass(), "lcdRenderingHint", null);
        setField(term10223, term10223.getClass(), "component", null);
        setField(term10223, term10223.getClass(), "layoutMgr", null);
        setField(term10223, term10223.getClass(), "dispatcher", null);
        setField(term10223, term10223.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10223, term10223.getClass(), "focusCycleRoot", false);
        setBooleanField(term10223, term10223.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10223, term10223.getClass(), "printingThreads", null);
        setBooleanField(term10223, term10223.getClass(), "printing", false);
        setField(term10223, term10223.getClass(), "containerListener", null);
        setIntField(term10223, term10223.getClass(), "listeningChildren", 0);
        setIntField(term10223, term10223.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10223, term10223.getClass(), "descendantsCount", 0);
        setField(term10223, term10223.getClass(), "preserveBackgroundColor", null);
        setIntField(term10223, term10223.getClass(), "numOfHWComponents", 0);
        setIntField(term10223, term10223.getClass(), "numOfLWComponents", 0);
        setField(term10223, term10223.getClass(), "modalComp", null);
        setField(term10223, term10223.getClass(), "modalAppContext", null);
        setIntField(term10223, term10223.getClass(), "containerSerializedDataVersion", 0);
        setField(term10223, term10223.getClass(), "peer", null);
        setField(term10223, term10223.getClass(), "parent", null);
        setField(term10223, term10223.getClass(), "appContext", null);
        setIntField(term10223, term10223.getClass(), "x", 0);
        setIntField(term10223, term10223.getClass(), "y", 0);
        setIntField(term10223, term10223.getClass(), "width", 0);
        setIntField(term10223, term10223.getClass(), "height", 0);
        setField(term10223, term10223.getClass(), "foreground", null);
        setField(term10223, term10223.getClass(), "background", null);
        setField(term10223, term10223.getClass(), "font", null);
        setField(term10223, term10223.getClass(), "peerFont", null);
        setField(term10223, term10223.getClass(), "cursor", null);
        setField(term10223, term10223.getClass(), "locale", null);
        setField(term10223, term10223.getClass(), "graphicsConfig", null);
        setField(term10223, term10223.getClass(), "bufferStrategy", null);
        setBooleanField(term10223, term10223.getClass(), "ignoreRepaint", false);
        setBooleanField(term10223, term10223.getClass(), "visible", false);
        setBooleanField(term10223, term10223.getClass(), "enabled", false);
        setBooleanField(term10223, term10223.getClass(), "valid", false);
        setField(term10223, term10223.getClass(), "dropTarget", null);
        setField(term10223, term10223.getClass(), "popups", null);
        setField(term10223, term10223.getClass(), "name", null);
        setBooleanField(term10223, term10223.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10223, term10223.getClass(), "focusable", false);
        setIntField(term10223, term10223.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10223, term10223.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10223, term10223.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10223, term10223.getClass(), "acc", null);
        setField(term10223, term10223.getClass(), "minSize", null);
        setBooleanField(term10223, term10223.getClass(), "minSizeSet", false);
        setField(term10223, term10223.getClass(), "prefSize", null);
        setBooleanField(term10223, term10223.getClass(), "prefSizeSet", false);
        setField(term10223, term10223.getClass(), "maxSize", null);
        setBooleanField(term10223, term10223.getClass(), "maxSizeSet", false);
        setField(term10223, term10223.getClass(), "componentOrientation", null);
        setBooleanField(term10223, term10223.getClass(), "newEventsOnly", false);
        setField(term10223, term10223.getClass(), "componentListener", null);
        setField(term10223, term10223.getClass(), "focusListener", null);
        setField(term10223, term10223.getClass(), "hierarchyListener", null);
        setField(term10223, term10223.getClass(), "hierarchyBoundsListener", null);
        setField(term10223, term10223.getClass(), "keyListener", null);
        setField(term10223, term10223.getClass(), "mouseListener", null);
        setField(term10223, term10223.getClass(), "mouseMotionListener", null);
        setField(term10223, term10223.getClass(), "mouseWheelListener", null);
        setField(term10223, term10223.getClass(), "inputMethodListener", null);
        setLongField(term10223, term10223.getClass(), "eventMask", 0L);
        setField(term10223, term10223.getClass(), "changeSupport", null);
        setField(term10223, term10223.getClass(), "objectLock", null);
        setBooleanField(term10223, term10223.getClass(), "isPacked", false);
        setIntField(term10223, term10223.getClass(), "boundsOp", 0);
        setField(term10223, term10223.getClass(), "compoundShape", null);
        setField(term10223, term10223.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10223, term10223.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10223, term10223.getClass(), "backgroundEraseDisabled", false);
        setField(term10223, term10223.getClass(), "eventCache", null);
        setBooleanField(term10223, term10223.getClass(), "coalescingEnabled", false);
        setBooleanField(term10223, term10223.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10223, term10223.getClass(), "componentSerializedDataVersion", 0);
        setField(term10223, term10223.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSliderChanged", argTypes, term10223, args);
    }

};


