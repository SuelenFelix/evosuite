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
import java.lang.Boolean;

public class ResearchTechPanel_setEnableUpgradeButton_186091527219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134511;
     Object term134552;

    public ResearchTechPanel_setEnableUpgradeButton_186091527219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134511 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134511, term134511.getClass(), "btnMinus", null);
        setField(term134511, term134511.getClass(), "btnPlus", null);
        setField(term134511, term134511.getClass(), "label", null);
        setField(term134511, term134511.getClass(), "lvlLabel", null);
        setField(term134511, term134511.getClass(), "btnUpgrade", null);
        setField(term134511, term134511.getClass(), "slider", null);
        setBooleanField(term134511, term134511.getClass(), "isAlignmentXSet", false);
        setFloatField(term134511, term134511.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134511, term134511.getClass(), "isAlignmentYSet", false);
        setFloatField(term134511, term134511.getClass(), "alignmentY", 0.0F);
        setField(term134511, term134511.getClass(), "ui", null);
        setField(term134511, term134511.getClass(), "listenerList", null);
        setField(term134511, term134511.getClass(), "clientProperties", null);
        setField(term134511, term134511.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134511, term134511.getClass(), "autoscrolls", false);
        setField(term134511, term134511.getClass(), "border", null);
        setIntField(term134511, term134511.getClass(), "flags", 0);
        setField(term134511, term134511.getClass(), "inputVerifier", null);
        setBooleanField(term134511, term134511.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134511, term134511.getClass(), "paintingChild", null);
        setField(term134511, term134511.getClass(), "popupMenu", null);
        setField(term134511, term134511.getClass(), "revalidateRunnableScheduled", null);
        setField(term134511, term134511.getClass(), "focusInputMap", null);
        setField(term134511, term134511.getClass(), "ancestorInputMap", null);
        setField(term134511, term134511.getClass(), "windowInputMap", null);
        setField(term134511, term134511.getClass(), "actionMap", null);
        setField(term134511, term134511.getClass(), "aaHint", null);
        setField(term134511, term134511.getClass(), "lcdRenderingHint", null);
        setField(term134511, term134511.getClass(), "component", null);
        setField(term134511, term134511.getClass(), "layoutMgr", null);
        setField(term134511, term134511.getClass(), "dispatcher", null);
        setField(term134511, term134511.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134511, term134511.getClass(), "focusCycleRoot", false);
        setBooleanField(term134511, term134511.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134511, term134511.getClass(), "printingThreads", null);
        setBooleanField(term134511, term134511.getClass(), "printing", false);
        setField(term134511, term134511.getClass(), "containerListener", null);
        setIntField(term134511, term134511.getClass(), "listeningChildren", 0);
        setIntField(term134511, term134511.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134511, term134511.getClass(), "descendantsCount", 0);
        setField(term134511, term134511.getClass(), "preserveBackgroundColor", null);
        setIntField(term134511, term134511.getClass(), "numOfHWComponents", 0);
        setIntField(term134511, term134511.getClass(), "numOfLWComponents", 0);
        setField(term134511, term134511.getClass(), "modalComp", null);
        setField(term134511, term134511.getClass(), "modalAppContext", null);
        setIntField(term134511, term134511.getClass(), "containerSerializedDataVersion", 0);
        setField(term134511, term134511.getClass(), "peer", null);
        setField(term134511, term134511.getClass(), "parent", null);
        setField(term134511, term134511.getClass(), "appContext", null);
        setIntField(term134511, term134511.getClass(), "x", 0);
        setIntField(term134511, term134511.getClass(), "y", 0);
        setIntField(term134511, term134511.getClass(), "width", 0);
        setIntField(term134511, term134511.getClass(), "height", 0);
        setField(term134511, term134511.getClass(), "foreground", null);
        setField(term134511, term134511.getClass(), "background", null);
        setField(term134511, term134511.getClass(), "font", null);
        setField(term134511, term134511.getClass(), "peerFont", null);
        setField(term134511, term134511.getClass(), "cursor", null);
        setField(term134511, term134511.getClass(), "locale", null);
        setField(term134511, term134511.getClass(), "graphicsConfig", null);
        setField(term134511, term134511.getClass(), "bufferStrategy", null);
        setBooleanField(term134511, term134511.getClass(), "ignoreRepaint", false);
        setBooleanField(term134511, term134511.getClass(), "visible", false);
        setBooleanField(term134511, term134511.getClass(), "enabled", false);
        setBooleanField(term134511, term134511.getClass(), "valid", false);
        setField(term134511, term134511.getClass(), "dropTarget", null);
        setField(term134511, term134511.getClass(), "popups", null);
        setField(term134511, term134511.getClass(), "name", null);
        setBooleanField(term134511, term134511.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134511, term134511.getClass(), "focusable", false);
        setIntField(term134511, term134511.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134511, term134511.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134511, term134511.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134511, term134511.getClass(), "acc", null);
        setField(term134511, term134511.getClass(), "minSize", null);
        setBooleanField(term134511, term134511.getClass(), "minSizeSet", false);
        setField(term134511, term134511.getClass(), "prefSize", null);
        setBooleanField(term134511, term134511.getClass(), "prefSizeSet", false);
        setField(term134511, term134511.getClass(), "maxSize", null);
        setBooleanField(term134511, term134511.getClass(), "maxSizeSet", false);
        setField(term134511, term134511.getClass(), "componentOrientation", null);
        setBooleanField(term134511, term134511.getClass(), "newEventsOnly", false);
        setField(term134511, term134511.getClass(), "componentListener", null);
        setField(term134511, term134511.getClass(), "focusListener", null);
        setField(term134511, term134511.getClass(), "hierarchyListener", null);
        setField(term134511, term134511.getClass(), "hierarchyBoundsListener", null);
        setField(term134511, term134511.getClass(), "keyListener", null);
        setField(term134511, term134511.getClass(), "mouseListener", null);
        setField(term134511, term134511.getClass(), "mouseMotionListener", null);
        setField(term134511, term134511.getClass(), "mouseWheelListener", null);
        setField(term134511, term134511.getClass(), "inputMethodListener", null);
        setLongField(term134511, term134511.getClass(), "eventMask", 0L);
        setField(term134511, term134511.getClass(), "changeSupport", null);
        setField(term134511, term134511.getClass(), "objectLock", null);
        setBooleanField(term134511, term134511.getClass(), "isPacked", false);
        setIntField(term134511, term134511.getClass(), "boundsOp", 0);
        setField(term134511, term134511.getClass(), "compoundShape", null);
        setField(term134511, term134511.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134511, term134511.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134511, term134511.getClass(), "backgroundEraseDisabled", false);
        setField(term134511, term134511.getClass(), "eventCache", null);
        setBooleanField(term134511, term134511.getClass(), "coalescingEnabled", false);
        setBooleanField(term134511, term134511.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134511, term134511.getClass(), "componentSerializedDataVersion", 0);
        setField(term134511, term134511.getClass(), "accessibleContext", null);
        term134552 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term134552;
        callMethod(klass, "setEnableUpgradeButton", argTypes, term134511, args);
    }

};


