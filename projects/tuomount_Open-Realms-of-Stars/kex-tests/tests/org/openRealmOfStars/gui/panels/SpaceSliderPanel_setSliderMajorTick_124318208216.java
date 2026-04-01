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

public class SpaceSliderPanel_setSliderMajorTick_124318208216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10180;
     Object term10221;

    public SpaceSliderPanel_setSliderMajorTick_124318208216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10180 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel"));
        setField(term10180, term10180.getClass(), "btnMinus", null);
        setField(term10180, term10180.getClass(), "btnPlus", null);
        setField(term10180, term10180.getClass(), "label", null);
        setField(term10180, term10180.getClass(), "slider", null);
        setBooleanField(term10180, term10180.getClass(), "isAlignmentXSet", false);
        setFloatField(term10180, term10180.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10180, term10180.getClass(), "isAlignmentYSet", false);
        setFloatField(term10180, term10180.getClass(), "alignmentY", 0.0F);
        setField(term10180, term10180.getClass(), "ui", null);
        setField(term10180, term10180.getClass(), "listenerList", null);
        setField(term10180, term10180.getClass(), "clientProperties", null);
        setField(term10180, term10180.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10180, term10180.getClass(), "autoscrolls", false);
        setField(term10180, term10180.getClass(), "border", null);
        setIntField(term10180, term10180.getClass(), "flags", 0);
        setField(term10180, term10180.getClass(), "inputVerifier", null);
        setBooleanField(term10180, term10180.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10180, term10180.getClass(), "paintingChild", null);
        setField(term10180, term10180.getClass(), "popupMenu", null);
        setField(term10180, term10180.getClass(), "revalidateRunnableScheduled", null);
        setField(term10180, term10180.getClass(), "focusInputMap", null);
        setField(term10180, term10180.getClass(), "ancestorInputMap", null);
        setField(term10180, term10180.getClass(), "windowInputMap", null);
        setField(term10180, term10180.getClass(), "actionMap", null);
        setField(term10180, term10180.getClass(), "aaHint", null);
        setField(term10180, term10180.getClass(), "lcdRenderingHint", null);
        setField(term10180, term10180.getClass(), "component", null);
        setField(term10180, term10180.getClass(), "layoutMgr", null);
        setField(term10180, term10180.getClass(), "dispatcher", null);
        setField(term10180, term10180.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10180, term10180.getClass(), "focusCycleRoot", false);
        setBooleanField(term10180, term10180.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10180, term10180.getClass(), "printingThreads", null);
        setBooleanField(term10180, term10180.getClass(), "printing", false);
        setField(term10180, term10180.getClass(), "containerListener", null);
        setIntField(term10180, term10180.getClass(), "listeningChildren", 0);
        setIntField(term10180, term10180.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10180, term10180.getClass(), "descendantsCount", 0);
        setField(term10180, term10180.getClass(), "preserveBackgroundColor", null);
        setIntField(term10180, term10180.getClass(), "numOfHWComponents", 0);
        setIntField(term10180, term10180.getClass(), "numOfLWComponents", 0);
        setField(term10180, term10180.getClass(), "modalComp", null);
        setField(term10180, term10180.getClass(), "modalAppContext", null);
        setIntField(term10180, term10180.getClass(), "containerSerializedDataVersion", 0);
        setField(term10180, term10180.getClass(), "peer", null);
        setField(term10180, term10180.getClass(), "parent", null);
        setField(term10180, term10180.getClass(), "appContext", null);
        setIntField(term10180, term10180.getClass(), "x", 0);
        setIntField(term10180, term10180.getClass(), "y", 0);
        setIntField(term10180, term10180.getClass(), "width", 0);
        setIntField(term10180, term10180.getClass(), "height", 0);
        setField(term10180, term10180.getClass(), "foreground", null);
        setField(term10180, term10180.getClass(), "background", null);
        setField(term10180, term10180.getClass(), "font", null);
        setField(term10180, term10180.getClass(), "peerFont", null);
        setField(term10180, term10180.getClass(), "cursor", null);
        setField(term10180, term10180.getClass(), "locale", null);
        setField(term10180, term10180.getClass(), "graphicsConfig", null);
        setField(term10180, term10180.getClass(), "bufferStrategy", null);
        setBooleanField(term10180, term10180.getClass(), "ignoreRepaint", false);
        setBooleanField(term10180, term10180.getClass(), "visible", false);
        setBooleanField(term10180, term10180.getClass(), "enabled", false);
        setBooleanField(term10180, term10180.getClass(), "valid", false);
        setField(term10180, term10180.getClass(), "dropTarget", null);
        setField(term10180, term10180.getClass(), "popups", null);
        setField(term10180, term10180.getClass(), "name", null);
        setBooleanField(term10180, term10180.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10180, term10180.getClass(), "focusable", false);
        setIntField(term10180, term10180.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10180, term10180.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10180, term10180.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10180, term10180.getClass(), "acc", null);
        setField(term10180, term10180.getClass(), "minSize", null);
        setBooleanField(term10180, term10180.getClass(), "minSizeSet", false);
        setField(term10180, term10180.getClass(), "prefSize", null);
        setBooleanField(term10180, term10180.getClass(), "prefSizeSet", false);
        setField(term10180, term10180.getClass(), "maxSize", null);
        setBooleanField(term10180, term10180.getClass(), "maxSizeSet", false);
        setField(term10180, term10180.getClass(), "componentOrientation", null);
        setBooleanField(term10180, term10180.getClass(), "newEventsOnly", false);
        setField(term10180, term10180.getClass(), "componentListener", null);
        setField(term10180, term10180.getClass(), "focusListener", null);
        setField(term10180, term10180.getClass(), "hierarchyListener", null);
        setField(term10180, term10180.getClass(), "hierarchyBoundsListener", null);
        setField(term10180, term10180.getClass(), "keyListener", null);
        setField(term10180, term10180.getClass(), "mouseListener", null);
        setField(term10180, term10180.getClass(), "mouseMotionListener", null);
        setField(term10180, term10180.getClass(), "mouseWheelListener", null);
        setField(term10180, term10180.getClass(), "inputMethodListener", null);
        setLongField(term10180, term10180.getClass(), "eventMask", 0L);
        setField(term10180, term10180.getClass(), "changeSupport", null);
        setField(term10180, term10180.getClass(), "objectLock", null);
        setBooleanField(term10180, term10180.getClass(), "isPacked", false);
        setIntField(term10180, term10180.getClass(), "boundsOp", 0);
        setField(term10180, term10180.getClass(), "compoundShape", null);
        setField(term10180, term10180.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10180, term10180.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10180, term10180.getClass(), "backgroundEraseDisabled", false);
        setField(term10180, term10180.getClass(), "eventCache", null);
        setBooleanField(term10180, term10180.getClass(), "coalescingEnabled", false);
        setBooleanField(term10180, term10180.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10180, term10180.getClass(), "componentSerializedDataVersion", 0);
        setField(term10180, term10180.getClass(), "accessibleContext", null);
        term10221 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.SpaceSliderPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term10221;
        callMethod(klass, "setSliderMajorTick", argTypes, term10180, args);
    }

};


