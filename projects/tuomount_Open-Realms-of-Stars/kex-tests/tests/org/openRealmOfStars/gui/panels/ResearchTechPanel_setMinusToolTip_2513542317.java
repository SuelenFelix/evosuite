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

public class ResearchTechPanel_setMinusToolTip_2513542317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134429;

    public ResearchTechPanel_setMinusToolTip_2513542317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134429 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134429, term134429.getClass(), "btnMinus", null);
        setField(term134429, term134429.getClass(), "btnPlus", null);
        setField(term134429, term134429.getClass(), "label", null);
        setField(term134429, term134429.getClass(), "lvlLabel", null);
        setField(term134429, term134429.getClass(), "btnUpgrade", null);
        setField(term134429, term134429.getClass(), "slider", null);
        setBooleanField(term134429, term134429.getClass(), "isAlignmentXSet", false);
        setFloatField(term134429, term134429.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134429, term134429.getClass(), "isAlignmentYSet", false);
        setFloatField(term134429, term134429.getClass(), "alignmentY", 0.0F);
        setField(term134429, term134429.getClass(), "ui", null);
        setField(term134429, term134429.getClass(), "listenerList", null);
        setField(term134429, term134429.getClass(), "clientProperties", null);
        setField(term134429, term134429.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134429, term134429.getClass(), "autoscrolls", false);
        setField(term134429, term134429.getClass(), "border", null);
        setIntField(term134429, term134429.getClass(), "flags", 0);
        setField(term134429, term134429.getClass(), "inputVerifier", null);
        setBooleanField(term134429, term134429.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134429, term134429.getClass(), "paintingChild", null);
        setField(term134429, term134429.getClass(), "popupMenu", null);
        setField(term134429, term134429.getClass(), "revalidateRunnableScheduled", null);
        setField(term134429, term134429.getClass(), "focusInputMap", null);
        setField(term134429, term134429.getClass(), "ancestorInputMap", null);
        setField(term134429, term134429.getClass(), "windowInputMap", null);
        setField(term134429, term134429.getClass(), "actionMap", null);
        setField(term134429, term134429.getClass(), "aaHint", null);
        setField(term134429, term134429.getClass(), "lcdRenderingHint", null);
        setField(term134429, term134429.getClass(), "component", null);
        setField(term134429, term134429.getClass(), "layoutMgr", null);
        setField(term134429, term134429.getClass(), "dispatcher", null);
        setField(term134429, term134429.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134429, term134429.getClass(), "focusCycleRoot", false);
        setBooleanField(term134429, term134429.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134429, term134429.getClass(), "printingThreads", null);
        setBooleanField(term134429, term134429.getClass(), "printing", false);
        setField(term134429, term134429.getClass(), "containerListener", null);
        setIntField(term134429, term134429.getClass(), "listeningChildren", 0);
        setIntField(term134429, term134429.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134429, term134429.getClass(), "descendantsCount", 0);
        setField(term134429, term134429.getClass(), "preserveBackgroundColor", null);
        setIntField(term134429, term134429.getClass(), "numOfHWComponents", 0);
        setIntField(term134429, term134429.getClass(), "numOfLWComponents", 0);
        setField(term134429, term134429.getClass(), "modalComp", null);
        setField(term134429, term134429.getClass(), "modalAppContext", null);
        setIntField(term134429, term134429.getClass(), "containerSerializedDataVersion", 0);
        setField(term134429, term134429.getClass(), "peer", null);
        setField(term134429, term134429.getClass(), "parent", null);
        setField(term134429, term134429.getClass(), "appContext", null);
        setIntField(term134429, term134429.getClass(), "x", 0);
        setIntField(term134429, term134429.getClass(), "y", 0);
        setIntField(term134429, term134429.getClass(), "width", 0);
        setIntField(term134429, term134429.getClass(), "height", 0);
        setField(term134429, term134429.getClass(), "foreground", null);
        setField(term134429, term134429.getClass(), "background", null);
        setField(term134429, term134429.getClass(), "font", null);
        setField(term134429, term134429.getClass(), "peerFont", null);
        setField(term134429, term134429.getClass(), "cursor", null);
        setField(term134429, term134429.getClass(), "locale", null);
        setField(term134429, term134429.getClass(), "graphicsConfig", null);
        setField(term134429, term134429.getClass(), "bufferStrategy", null);
        setBooleanField(term134429, term134429.getClass(), "ignoreRepaint", false);
        setBooleanField(term134429, term134429.getClass(), "visible", false);
        setBooleanField(term134429, term134429.getClass(), "enabled", false);
        setBooleanField(term134429, term134429.getClass(), "valid", false);
        setField(term134429, term134429.getClass(), "dropTarget", null);
        setField(term134429, term134429.getClass(), "popups", null);
        setField(term134429, term134429.getClass(), "name", null);
        setBooleanField(term134429, term134429.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134429, term134429.getClass(), "focusable", false);
        setIntField(term134429, term134429.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134429, term134429.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134429, term134429.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134429, term134429.getClass(), "acc", null);
        setField(term134429, term134429.getClass(), "minSize", null);
        setBooleanField(term134429, term134429.getClass(), "minSizeSet", false);
        setField(term134429, term134429.getClass(), "prefSize", null);
        setBooleanField(term134429, term134429.getClass(), "prefSizeSet", false);
        setField(term134429, term134429.getClass(), "maxSize", null);
        setBooleanField(term134429, term134429.getClass(), "maxSizeSet", false);
        setField(term134429, term134429.getClass(), "componentOrientation", null);
        setBooleanField(term134429, term134429.getClass(), "newEventsOnly", false);
        setField(term134429, term134429.getClass(), "componentListener", null);
        setField(term134429, term134429.getClass(), "focusListener", null);
        setField(term134429, term134429.getClass(), "hierarchyListener", null);
        setField(term134429, term134429.getClass(), "hierarchyBoundsListener", null);
        setField(term134429, term134429.getClass(), "keyListener", null);
        setField(term134429, term134429.getClass(), "mouseListener", null);
        setField(term134429, term134429.getClass(), "mouseMotionListener", null);
        setField(term134429, term134429.getClass(), "mouseWheelListener", null);
        setField(term134429, term134429.getClass(), "inputMethodListener", null);
        setLongField(term134429, term134429.getClass(), "eventMask", 0L);
        setField(term134429, term134429.getClass(), "changeSupport", null);
        setField(term134429, term134429.getClass(), "objectLock", null);
        setBooleanField(term134429, term134429.getClass(), "isPacked", false);
        setIntField(term134429, term134429.getClass(), "boundsOp", 0);
        setField(term134429, term134429.getClass(), "compoundShape", null);
        setField(term134429, term134429.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134429, term134429.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134429, term134429.getClass(), "backgroundEraseDisabled", false);
        setField(term134429, term134429.getClass(), "eventCache", null);
        setBooleanField(term134429, term134429.getClass(), "coalescingEnabled", false);
        setBooleanField(term134429, term134429.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134429, term134429.getClass(), "componentSerializedDataVersion", 0);
        setField(term134429, term134429.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMinusToolTip", argTypes, term134429, args);
    }

};


