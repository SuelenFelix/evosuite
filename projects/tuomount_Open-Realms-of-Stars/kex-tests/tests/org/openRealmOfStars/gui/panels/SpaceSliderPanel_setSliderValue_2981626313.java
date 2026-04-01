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

public class SpaceSliderPanel_setSliderValue_2981626313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10053;
     Object term10094;

    public SpaceSliderPanel_setSliderValue_2981626313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10053 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10053, term10053.getClass(), "btnMinus", null);
        setField(term10053, term10053.getClass(), "btnPlus", null);
        setField(term10053, term10053.getClass(), "label", null);
        setField(term10053, term10053.getClass(), "slider", null);
        setBooleanField(term10053, term10053.getClass(), "isAlignmentXSet", false);
        setFloatField(term10053, term10053.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10053, term10053.getClass(), "isAlignmentYSet", false);
        setFloatField(term10053, term10053.getClass(), "alignmentY", 0.0F);
        setField(term10053, term10053.getClass(), "ui", null);
        setField(term10053, term10053.getClass(), "listenerList", null);
        setField(term10053, term10053.getClass(), "clientProperties", null);
        setField(term10053, term10053.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10053, term10053.getClass(), "autoscrolls", false);
        setField(term10053, term10053.getClass(), "border", null);
        setIntField(term10053, term10053.getClass(), "flags", 0);
        setField(term10053, term10053.getClass(), "inputVerifier", null);
        setBooleanField(term10053, term10053.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10053, term10053.getClass(), "paintingChild", null);
        setField(term10053, term10053.getClass(), "popupMenu", null);
        setField(term10053, term10053.getClass(), "revalidateRunnableScheduled", null);
        setField(term10053, term10053.getClass(), "focusInputMap", null);
        setField(term10053, term10053.getClass(), "ancestorInputMap", null);
        setField(term10053, term10053.getClass(), "windowInputMap", null);
        setField(term10053, term10053.getClass(), "actionMap", null);
        setField(term10053, term10053.getClass(), "aaHint", null);
        setField(term10053, term10053.getClass(), "lcdRenderingHint", null);
        setField(term10053, term10053.getClass(), "component", null);
        setField(term10053, term10053.getClass(), "layoutMgr", null);
        setField(term10053, term10053.getClass(), "dispatcher", null);
        setField(term10053, term10053.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10053, term10053.getClass(), "focusCycleRoot", false);
        setBooleanField(term10053, term10053.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10053, term10053.getClass(), "printingThreads", null);
        setBooleanField(term10053, term10053.getClass(), "printing", false);
        setField(term10053, term10053.getClass(), "containerListener", null);
        setIntField(term10053, term10053.getClass(), "listeningChildren", 0);
        setIntField(term10053, term10053.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10053, term10053.getClass(), "descendantsCount", 0);
        setField(term10053, term10053.getClass(), "preserveBackgroundColor", null);
        setIntField(term10053, term10053.getClass(), "numOfHWComponents", 0);
        setIntField(term10053, term10053.getClass(), "numOfLWComponents", 0);
        setField(term10053, term10053.getClass(), "modalComp", null);
        setField(term10053, term10053.getClass(), "modalAppContext", null);
        setIntField(term10053, term10053.getClass(), "containerSerializedDataVersion", 0);
        setField(term10053, term10053.getClass(), "peer", null);
        setField(term10053, term10053.getClass(), "parent", null);
        setField(term10053, term10053.getClass(), "appContext", null);
        setIntField(term10053, term10053.getClass(), "x", 0);
        setIntField(term10053, term10053.getClass(), "y", 0);
        setIntField(term10053, term10053.getClass(), "width", 0);
        setIntField(term10053, term10053.getClass(), "height", 0);
        setField(term10053, term10053.getClass(), "foreground", null);
        setField(term10053, term10053.getClass(), "background", null);
        setField(term10053, term10053.getClass(), "font", null);
        setField(term10053, term10053.getClass(), "peerFont", null);
        setField(term10053, term10053.getClass(), "cursor", null);
        setField(term10053, term10053.getClass(), "locale", null);
        setField(term10053, term10053.getClass(), "graphicsConfig", null);
        setField(term10053, term10053.getClass(), "bufferStrategy", null);
        setBooleanField(term10053, term10053.getClass(), "ignoreRepaint", false);
        setBooleanField(term10053, term10053.getClass(), "visible", false);
        setBooleanField(term10053, term10053.getClass(), "enabled", false);
        setBooleanField(term10053, term10053.getClass(), "valid", false);
        setField(term10053, term10053.getClass(), "dropTarget", null);
        setField(term10053, term10053.getClass(), "popups", null);
        setField(term10053, term10053.getClass(), "name", null);
        setBooleanField(term10053, term10053.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10053, term10053.getClass(), "focusable", false);
        setIntField(term10053, term10053.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10053, term10053.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10053, term10053.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10053, term10053.getClass(), "acc", null);
        setField(term10053, term10053.getClass(), "minSize", null);
        setBooleanField(term10053, term10053.getClass(), "minSizeSet", false);
        setField(term10053, term10053.getClass(), "prefSize", null);
        setBooleanField(term10053, term10053.getClass(), "prefSizeSet", false);
        setField(term10053, term10053.getClass(), "maxSize", null);
        setBooleanField(term10053, term10053.getClass(), "maxSizeSet", false);
        setField(term10053, term10053.getClass(), "componentOrientation", null);
        setBooleanField(term10053, term10053.getClass(), "newEventsOnly", false);
        setField(term10053, term10053.getClass(), "componentListener", null);
        setField(term10053, term10053.getClass(), "focusListener", null);
        setField(term10053, term10053.getClass(), "hierarchyListener", null);
        setField(term10053, term10053.getClass(), "hierarchyBoundsListener", null);
        setField(term10053, term10053.getClass(), "keyListener", null);
        setField(term10053, term10053.getClass(), "mouseListener", null);
        setField(term10053, term10053.getClass(), "mouseMotionListener", null);
        setField(term10053, term10053.getClass(), "mouseWheelListener", null);
        setField(term10053, term10053.getClass(), "inputMethodListener", null);
        setLongField(term10053, term10053.getClass(), "eventMask", 0L);
        setField(term10053, term10053.getClass(), "changeSupport", null);
        setField(term10053, term10053.getClass(), "objectLock", null);
        setBooleanField(term10053, term10053.getClass(), "isPacked", false);
        setIntField(term10053, term10053.getClass(), "boundsOp", 0);
        setField(term10053, term10053.getClass(), "compoundShape", null);
        setField(term10053, term10053.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10053, term10053.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10053, term10053.getClass(), "backgroundEraseDisabled", false);
        setField(term10053, term10053.getClass(), "eventCache", null);
        setBooleanField(term10053, term10053.getClass(), "coalescingEnabled", false);
        setBooleanField(term10053, term10053.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10053, term10053.getClass(), "componentSerializedDataVersion", 0);
        setField(term10053, term10053.getClass(), "accessibleContext", null);
        term10094 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10094;
        callMethod(klass, "setSliderValue", argTypes, term10053, args);
    }

};


