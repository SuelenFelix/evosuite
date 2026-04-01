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

public class ResearchTechPanel_setUpgadeBtnToolTip_193634639121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134595;

    public ResearchTechPanel_setUpgadeBtnToolTip_193634639121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134595 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134595, term134595.getClass(), "btnMinus", null);
        setField(term134595, term134595.getClass(), "btnPlus", null);
        setField(term134595, term134595.getClass(), "label", null);
        setField(term134595, term134595.getClass(), "lvlLabel", null);
        setField(term134595, term134595.getClass(), "btnUpgrade", null);
        setField(term134595, term134595.getClass(), "slider", null);
        setBooleanField(term134595, term134595.getClass(), "isAlignmentXSet", false);
        setFloatField(term134595, term134595.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134595, term134595.getClass(), "isAlignmentYSet", false);
        setFloatField(term134595, term134595.getClass(), "alignmentY", 0.0F);
        setField(term134595, term134595.getClass(), "ui", null);
        setField(term134595, term134595.getClass(), "listenerList", null);
        setField(term134595, term134595.getClass(), "clientProperties", null);
        setField(term134595, term134595.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134595, term134595.getClass(), "autoscrolls", false);
        setField(term134595, term134595.getClass(), "border", null);
        setIntField(term134595, term134595.getClass(), "flags", 0);
        setField(term134595, term134595.getClass(), "inputVerifier", null);
        setBooleanField(term134595, term134595.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134595, term134595.getClass(), "paintingChild", null);
        setField(term134595, term134595.getClass(), "popupMenu", null);
        setField(term134595, term134595.getClass(), "revalidateRunnableScheduled", null);
        setField(term134595, term134595.getClass(), "focusInputMap", null);
        setField(term134595, term134595.getClass(), "ancestorInputMap", null);
        setField(term134595, term134595.getClass(), "windowInputMap", null);
        setField(term134595, term134595.getClass(), "actionMap", null);
        setField(term134595, term134595.getClass(), "aaHint", null);
        setField(term134595, term134595.getClass(), "lcdRenderingHint", null);
        setField(term134595, term134595.getClass(), "component", null);
        setField(term134595, term134595.getClass(), "layoutMgr", null);
        setField(term134595, term134595.getClass(), "dispatcher", null);
        setField(term134595, term134595.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134595, term134595.getClass(), "focusCycleRoot", false);
        setBooleanField(term134595, term134595.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134595, term134595.getClass(), "printingThreads", null);
        setBooleanField(term134595, term134595.getClass(), "printing", false);
        setField(term134595, term134595.getClass(), "containerListener", null);
        setIntField(term134595, term134595.getClass(), "listeningChildren", 0);
        setIntField(term134595, term134595.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134595, term134595.getClass(), "descendantsCount", 0);
        setField(term134595, term134595.getClass(), "preserveBackgroundColor", null);
        setIntField(term134595, term134595.getClass(), "numOfHWComponents", 0);
        setIntField(term134595, term134595.getClass(), "numOfLWComponents", 0);
        setField(term134595, term134595.getClass(), "modalComp", null);
        setField(term134595, term134595.getClass(), "modalAppContext", null);
        setIntField(term134595, term134595.getClass(), "containerSerializedDataVersion", 0);
        setField(term134595, term134595.getClass(), "peer", null);
        setField(term134595, term134595.getClass(), "parent", null);
        setField(term134595, term134595.getClass(), "appContext", null);
        setIntField(term134595, term134595.getClass(), "x", 0);
        setIntField(term134595, term134595.getClass(), "y", 0);
        setIntField(term134595, term134595.getClass(), "width", 0);
        setIntField(term134595, term134595.getClass(), "height", 0);
        setField(term134595, term134595.getClass(), "foreground", null);
        setField(term134595, term134595.getClass(), "background", null);
        setField(term134595, term134595.getClass(), "font", null);
        setField(term134595, term134595.getClass(), "peerFont", null);
        setField(term134595, term134595.getClass(), "cursor", null);
        setField(term134595, term134595.getClass(), "locale", null);
        setField(term134595, term134595.getClass(), "graphicsConfig", null);
        setField(term134595, term134595.getClass(), "bufferStrategy", null);
        setBooleanField(term134595, term134595.getClass(), "ignoreRepaint", false);
        setBooleanField(term134595, term134595.getClass(), "visible", false);
        setBooleanField(term134595, term134595.getClass(), "enabled", false);
        setBooleanField(term134595, term134595.getClass(), "valid", false);
        setField(term134595, term134595.getClass(), "dropTarget", null);
        setField(term134595, term134595.getClass(), "popups", null);
        setField(term134595, term134595.getClass(), "name", null);
        setBooleanField(term134595, term134595.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134595, term134595.getClass(), "focusable", false);
        setIntField(term134595, term134595.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134595, term134595.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134595, term134595.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134595, term134595.getClass(), "acc", null);
        setField(term134595, term134595.getClass(), "minSize", null);
        setBooleanField(term134595, term134595.getClass(), "minSizeSet", false);
        setField(term134595, term134595.getClass(), "prefSize", null);
        setBooleanField(term134595, term134595.getClass(), "prefSizeSet", false);
        setField(term134595, term134595.getClass(), "maxSize", null);
        setBooleanField(term134595, term134595.getClass(), "maxSizeSet", false);
        setField(term134595, term134595.getClass(), "componentOrientation", null);
        setBooleanField(term134595, term134595.getClass(), "newEventsOnly", false);
        setField(term134595, term134595.getClass(), "componentListener", null);
        setField(term134595, term134595.getClass(), "focusListener", null);
        setField(term134595, term134595.getClass(), "hierarchyListener", null);
        setField(term134595, term134595.getClass(), "hierarchyBoundsListener", null);
        setField(term134595, term134595.getClass(), "keyListener", null);
        setField(term134595, term134595.getClass(), "mouseListener", null);
        setField(term134595, term134595.getClass(), "mouseMotionListener", null);
        setField(term134595, term134595.getClass(), "mouseWheelListener", null);
        setField(term134595, term134595.getClass(), "inputMethodListener", null);
        setLongField(term134595, term134595.getClass(), "eventMask", 0L);
        setField(term134595, term134595.getClass(), "changeSupport", null);
        setField(term134595, term134595.getClass(), "objectLock", null);
        setBooleanField(term134595, term134595.getClass(), "isPacked", false);
        setIntField(term134595, term134595.getClass(), "boundsOp", 0);
        setField(term134595, term134595.getClass(), "compoundShape", null);
        setField(term134595, term134595.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134595, term134595.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134595, term134595.getClass(), "backgroundEraseDisabled", false);
        setField(term134595, term134595.getClass(), "eventCache", null);
        setBooleanField(term134595, term134595.getClass(), "coalescingEnabled", false);
        setBooleanField(term134595, term134595.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134595, term134595.getClass(), "componentSerializedDataVersion", 0);
        setField(term134595, term134595.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUpgadeBtnToolTip", argTypes, term134595, args);
    }

};


