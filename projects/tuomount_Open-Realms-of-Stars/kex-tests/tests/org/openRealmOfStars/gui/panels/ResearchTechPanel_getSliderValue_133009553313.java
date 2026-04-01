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

public class ResearchTechPanel_getSliderValue_133009553313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134265;

    public ResearchTechPanel_getSliderValue_133009553313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134265 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134265, term134265.getClass(), "btnMinus", null);
        setField(term134265, term134265.getClass(), "btnPlus", null);
        setField(term134265, term134265.getClass(), "label", null);
        setField(term134265, term134265.getClass(), "lvlLabel", null);
        setField(term134265, term134265.getClass(), "btnUpgrade", null);
        setField(term134265, term134265.getClass(), "slider", null);
        setBooleanField(term134265, term134265.getClass(), "isAlignmentXSet", false);
        setFloatField(term134265, term134265.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134265, term134265.getClass(), "isAlignmentYSet", false);
        setFloatField(term134265, term134265.getClass(), "alignmentY", 0.0F);
        setField(term134265, term134265.getClass(), "ui", null);
        setField(term134265, term134265.getClass(), "listenerList", null);
        setField(term134265, term134265.getClass(), "clientProperties", null);
        setField(term134265, term134265.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134265, term134265.getClass(), "autoscrolls", false);
        setField(term134265, term134265.getClass(), "border", null);
        setIntField(term134265, term134265.getClass(), "flags", 0);
        setField(term134265, term134265.getClass(), "inputVerifier", null);
        setBooleanField(term134265, term134265.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134265, term134265.getClass(), "paintingChild", null);
        setField(term134265, term134265.getClass(), "popupMenu", null);
        setField(term134265, term134265.getClass(), "revalidateRunnableScheduled", null);
        setField(term134265, term134265.getClass(), "focusInputMap", null);
        setField(term134265, term134265.getClass(), "ancestorInputMap", null);
        setField(term134265, term134265.getClass(), "windowInputMap", null);
        setField(term134265, term134265.getClass(), "actionMap", null);
        setField(term134265, term134265.getClass(), "aaHint", null);
        setField(term134265, term134265.getClass(), "lcdRenderingHint", null);
        setField(term134265, term134265.getClass(), "component", null);
        setField(term134265, term134265.getClass(), "layoutMgr", null);
        setField(term134265, term134265.getClass(), "dispatcher", null);
        setField(term134265, term134265.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134265, term134265.getClass(), "focusCycleRoot", false);
        setBooleanField(term134265, term134265.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134265, term134265.getClass(), "printingThreads", null);
        setBooleanField(term134265, term134265.getClass(), "printing", false);
        setField(term134265, term134265.getClass(), "containerListener", null);
        setIntField(term134265, term134265.getClass(), "listeningChildren", 0);
        setIntField(term134265, term134265.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134265, term134265.getClass(), "descendantsCount", 0);
        setField(term134265, term134265.getClass(), "preserveBackgroundColor", null);
        setIntField(term134265, term134265.getClass(), "numOfHWComponents", 0);
        setIntField(term134265, term134265.getClass(), "numOfLWComponents", 0);
        setField(term134265, term134265.getClass(), "modalComp", null);
        setField(term134265, term134265.getClass(), "modalAppContext", null);
        setIntField(term134265, term134265.getClass(), "containerSerializedDataVersion", 0);
        setField(term134265, term134265.getClass(), "peer", null);
        setField(term134265, term134265.getClass(), "parent", null);
        setField(term134265, term134265.getClass(), "appContext", null);
        setIntField(term134265, term134265.getClass(), "x", 0);
        setIntField(term134265, term134265.getClass(), "y", 0);
        setIntField(term134265, term134265.getClass(), "width", 0);
        setIntField(term134265, term134265.getClass(), "height", 0);
        setField(term134265, term134265.getClass(), "foreground", null);
        setField(term134265, term134265.getClass(), "background", null);
        setField(term134265, term134265.getClass(), "font", null);
        setField(term134265, term134265.getClass(), "peerFont", null);
        setField(term134265, term134265.getClass(), "cursor", null);
        setField(term134265, term134265.getClass(), "locale", null);
        setField(term134265, term134265.getClass(), "graphicsConfig", null);
        setField(term134265, term134265.getClass(), "bufferStrategy", null);
        setBooleanField(term134265, term134265.getClass(), "ignoreRepaint", false);
        setBooleanField(term134265, term134265.getClass(), "visible", false);
        setBooleanField(term134265, term134265.getClass(), "enabled", false);
        setBooleanField(term134265, term134265.getClass(), "valid", false);
        setField(term134265, term134265.getClass(), "dropTarget", null);
        setField(term134265, term134265.getClass(), "popups", null);
        setField(term134265, term134265.getClass(), "name", null);
        setBooleanField(term134265, term134265.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134265, term134265.getClass(), "focusable", false);
        setIntField(term134265, term134265.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134265, term134265.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134265, term134265.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134265, term134265.getClass(), "acc", null);
        setField(term134265, term134265.getClass(), "minSize", null);
        setBooleanField(term134265, term134265.getClass(), "minSizeSet", false);
        setField(term134265, term134265.getClass(), "prefSize", null);
        setBooleanField(term134265, term134265.getClass(), "prefSizeSet", false);
        setField(term134265, term134265.getClass(), "maxSize", null);
        setBooleanField(term134265, term134265.getClass(), "maxSizeSet", false);
        setField(term134265, term134265.getClass(), "componentOrientation", null);
        setBooleanField(term134265, term134265.getClass(), "newEventsOnly", false);
        setField(term134265, term134265.getClass(), "componentListener", null);
        setField(term134265, term134265.getClass(), "focusListener", null);
        setField(term134265, term134265.getClass(), "hierarchyListener", null);
        setField(term134265, term134265.getClass(), "hierarchyBoundsListener", null);
        setField(term134265, term134265.getClass(), "keyListener", null);
        setField(term134265, term134265.getClass(), "mouseListener", null);
        setField(term134265, term134265.getClass(), "mouseMotionListener", null);
        setField(term134265, term134265.getClass(), "mouseWheelListener", null);
        setField(term134265, term134265.getClass(), "inputMethodListener", null);
        setLongField(term134265, term134265.getClass(), "eventMask", 0L);
        setField(term134265, term134265.getClass(), "changeSupport", null);
        setField(term134265, term134265.getClass(), "objectLock", null);
        setBooleanField(term134265, term134265.getClass(), "isPacked", false);
        setIntField(term134265, term134265.getClass(), "boundsOp", 0);
        setField(term134265, term134265.getClass(), "compoundShape", null);
        setField(term134265, term134265.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134265, term134265.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134265, term134265.getClass(), "backgroundEraseDisabled", false);
        setField(term134265, term134265.getClass(), "eventCache", null);
        setBooleanField(term134265, term134265.getClass(), "coalescingEnabled", false);
        setBooleanField(term134265, term134265.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134265, term134265.getClass(), "componentSerializedDataVersion", 0);
        setField(term134265, term134265.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSliderValue", argTypes, term134265, args);
    }

};


