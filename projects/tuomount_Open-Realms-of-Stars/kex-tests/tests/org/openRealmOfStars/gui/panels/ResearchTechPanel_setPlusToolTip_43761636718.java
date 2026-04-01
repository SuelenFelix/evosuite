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

public class ResearchTechPanel_setPlusToolTip_43761636718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134470;

    public ResearchTechPanel_setPlusToolTip_43761636718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134470 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134470, term134470.getClass(), "btnMinus", null);
        setField(term134470, term134470.getClass(), "btnPlus", null);
        setField(term134470, term134470.getClass(), "label", null);
        setField(term134470, term134470.getClass(), "lvlLabel", null);
        setField(term134470, term134470.getClass(), "btnUpgrade", null);
        setField(term134470, term134470.getClass(), "slider", null);
        setBooleanField(term134470, term134470.getClass(), "isAlignmentXSet", false);
        setFloatField(term134470, term134470.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134470, term134470.getClass(), "isAlignmentYSet", false);
        setFloatField(term134470, term134470.getClass(), "alignmentY", 0.0F);
        setField(term134470, term134470.getClass(), "ui", null);
        setField(term134470, term134470.getClass(), "listenerList", null);
        setField(term134470, term134470.getClass(), "clientProperties", null);
        setField(term134470, term134470.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134470, term134470.getClass(), "autoscrolls", false);
        setField(term134470, term134470.getClass(), "border", null);
        setIntField(term134470, term134470.getClass(), "flags", 0);
        setField(term134470, term134470.getClass(), "inputVerifier", null);
        setBooleanField(term134470, term134470.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134470, term134470.getClass(), "paintingChild", null);
        setField(term134470, term134470.getClass(), "popupMenu", null);
        setField(term134470, term134470.getClass(), "revalidateRunnableScheduled", null);
        setField(term134470, term134470.getClass(), "focusInputMap", null);
        setField(term134470, term134470.getClass(), "ancestorInputMap", null);
        setField(term134470, term134470.getClass(), "windowInputMap", null);
        setField(term134470, term134470.getClass(), "actionMap", null);
        setField(term134470, term134470.getClass(), "aaHint", null);
        setField(term134470, term134470.getClass(), "lcdRenderingHint", null);
        setField(term134470, term134470.getClass(), "component", null);
        setField(term134470, term134470.getClass(), "layoutMgr", null);
        setField(term134470, term134470.getClass(), "dispatcher", null);
        setField(term134470, term134470.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134470, term134470.getClass(), "focusCycleRoot", false);
        setBooleanField(term134470, term134470.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134470, term134470.getClass(), "printingThreads", null);
        setBooleanField(term134470, term134470.getClass(), "printing", false);
        setField(term134470, term134470.getClass(), "containerListener", null);
        setIntField(term134470, term134470.getClass(), "listeningChildren", 0);
        setIntField(term134470, term134470.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134470, term134470.getClass(), "descendantsCount", 0);
        setField(term134470, term134470.getClass(), "preserveBackgroundColor", null);
        setIntField(term134470, term134470.getClass(), "numOfHWComponents", 0);
        setIntField(term134470, term134470.getClass(), "numOfLWComponents", 0);
        setField(term134470, term134470.getClass(), "modalComp", null);
        setField(term134470, term134470.getClass(), "modalAppContext", null);
        setIntField(term134470, term134470.getClass(), "containerSerializedDataVersion", 0);
        setField(term134470, term134470.getClass(), "peer", null);
        setField(term134470, term134470.getClass(), "parent", null);
        setField(term134470, term134470.getClass(), "appContext", null);
        setIntField(term134470, term134470.getClass(), "x", 0);
        setIntField(term134470, term134470.getClass(), "y", 0);
        setIntField(term134470, term134470.getClass(), "width", 0);
        setIntField(term134470, term134470.getClass(), "height", 0);
        setField(term134470, term134470.getClass(), "foreground", null);
        setField(term134470, term134470.getClass(), "background", null);
        setField(term134470, term134470.getClass(), "font", null);
        setField(term134470, term134470.getClass(), "peerFont", null);
        setField(term134470, term134470.getClass(), "cursor", null);
        setField(term134470, term134470.getClass(), "locale", null);
        setField(term134470, term134470.getClass(), "graphicsConfig", null);
        setField(term134470, term134470.getClass(), "bufferStrategy", null);
        setBooleanField(term134470, term134470.getClass(), "ignoreRepaint", false);
        setBooleanField(term134470, term134470.getClass(), "visible", false);
        setBooleanField(term134470, term134470.getClass(), "enabled", false);
        setBooleanField(term134470, term134470.getClass(), "valid", false);
        setField(term134470, term134470.getClass(), "dropTarget", null);
        setField(term134470, term134470.getClass(), "popups", null);
        setField(term134470, term134470.getClass(), "name", null);
        setBooleanField(term134470, term134470.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134470, term134470.getClass(), "focusable", false);
        setIntField(term134470, term134470.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134470, term134470.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134470, term134470.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134470, term134470.getClass(), "acc", null);
        setField(term134470, term134470.getClass(), "minSize", null);
        setBooleanField(term134470, term134470.getClass(), "minSizeSet", false);
        setField(term134470, term134470.getClass(), "prefSize", null);
        setBooleanField(term134470, term134470.getClass(), "prefSizeSet", false);
        setField(term134470, term134470.getClass(), "maxSize", null);
        setBooleanField(term134470, term134470.getClass(), "maxSizeSet", false);
        setField(term134470, term134470.getClass(), "componentOrientation", null);
        setBooleanField(term134470, term134470.getClass(), "newEventsOnly", false);
        setField(term134470, term134470.getClass(), "componentListener", null);
        setField(term134470, term134470.getClass(), "focusListener", null);
        setField(term134470, term134470.getClass(), "hierarchyListener", null);
        setField(term134470, term134470.getClass(), "hierarchyBoundsListener", null);
        setField(term134470, term134470.getClass(), "keyListener", null);
        setField(term134470, term134470.getClass(), "mouseListener", null);
        setField(term134470, term134470.getClass(), "mouseMotionListener", null);
        setField(term134470, term134470.getClass(), "mouseWheelListener", null);
        setField(term134470, term134470.getClass(), "inputMethodListener", null);
        setLongField(term134470, term134470.getClass(), "eventMask", 0L);
        setField(term134470, term134470.getClass(), "changeSupport", null);
        setField(term134470, term134470.getClass(), "objectLock", null);
        setBooleanField(term134470, term134470.getClass(), "isPacked", false);
        setIntField(term134470, term134470.getClass(), "boundsOp", 0);
        setField(term134470, term134470.getClass(), "compoundShape", null);
        setField(term134470, term134470.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134470, term134470.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134470, term134470.getClass(), "backgroundEraseDisabled", false);
        setField(term134470, term134470.getClass(), "eventCache", null);
        setBooleanField(term134470, term134470.getClass(), "coalescingEnabled", false);
        setBooleanField(term134470, term134470.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134470, term134470.getClass(), "componentSerializedDataVersion", 0);
        setField(term134470, term134470.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setPlusToolTip", argTypes, term134470, args);
    }

};


