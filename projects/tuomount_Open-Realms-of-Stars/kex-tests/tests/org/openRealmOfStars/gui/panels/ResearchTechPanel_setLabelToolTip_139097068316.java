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

public class ResearchTechPanel_setLabelToolTip_139097068316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134388;

    public ResearchTechPanel_setLabelToolTip_139097068316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134388 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel"));
        setField(term134388, term134388.getClass(), "btnMinus", null);
        setField(term134388, term134388.getClass(), "btnPlus", null);
        setField(term134388, term134388.getClass(), "label", null);
        setField(term134388, term134388.getClass(), "lvlLabel", null);
        setField(term134388, term134388.getClass(), "btnUpgrade", null);
        setField(term134388, term134388.getClass(), "slider", null);
        setBooleanField(term134388, term134388.getClass(), "isAlignmentXSet", false);
        setFloatField(term134388, term134388.getClass(), "alignmentX", 0.0F);
        setBooleanField(term134388, term134388.getClass(), "isAlignmentYSet", false);
        setFloatField(term134388, term134388.getClass(), "alignmentY", 0.0F);
        setField(term134388, term134388.getClass(), "ui", null);
        setField(term134388, term134388.getClass(), "listenerList", null);
        setField(term134388, term134388.getClass(), "clientProperties", null);
        setField(term134388, term134388.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term134388, term134388.getClass(), "autoscrolls", false);
        setField(term134388, term134388.getClass(), "border", null);
        setIntField(term134388, term134388.getClass(), "flags", 0);
        setField(term134388, term134388.getClass(), "inputVerifier", null);
        setBooleanField(term134388, term134388.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term134388, term134388.getClass(), "paintingChild", null);
        setField(term134388, term134388.getClass(), "popupMenu", null);
        setField(term134388, term134388.getClass(), "revalidateRunnableScheduled", null);
        setField(term134388, term134388.getClass(), "focusInputMap", null);
        setField(term134388, term134388.getClass(), "ancestorInputMap", null);
        setField(term134388, term134388.getClass(), "windowInputMap", null);
        setField(term134388, term134388.getClass(), "actionMap", null);
        setField(term134388, term134388.getClass(), "aaHint", null);
        setField(term134388, term134388.getClass(), "lcdRenderingHint", null);
        setField(term134388, term134388.getClass(), "component", null);
        setField(term134388, term134388.getClass(), "layoutMgr", null);
        setField(term134388, term134388.getClass(), "dispatcher", null);
        setField(term134388, term134388.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term134388, term134388.getClass(), "focusCycleRoot", false);
        setBooleanField(term134388, term134388.getClass(), "focusTraversalPolicyProvider", false);
        setField(term134388, term134388.getClass(), "printingThreads", null);
        setBooleanField(term134388, term134388.getClass(), "printing", false);
        setField(term134388, term134388.getClass(), "containerListener", null);
        setIntField(term134388, term134388.getClass(), "listeningChildren", 0);
        setIntField(term134388, term134388.getClass(), "listeningBoundsChildren", 0);
        setIntField(term134388, term134388.getClass(), "descendantsCount", 0);
        setField(term134388, term134388.getClass(), "preserveBackgroundColor", null);
        setIntField(term134388, term134388.getClass(), "numOfHWComponents", 0);
        setIntField(term134388, term134388.getClass(), "numOfLWComponents", 0);
        setField(term134388, term134388.getClass(), "modalComp", null);
        setField(term134388, term134388.getClass(), "modalAppContext", null);
        setIntField(term134388, term134388.getClass(), "containerSerializedDataVersion", 0);
        setField(term134388, term134388.getClass(), "peer", null);
        setField(term134388, term134388.getClass(), "parent", null);
        setField(term134388, term134388.getClass(), "appContext", null);
        setIntField(term134388, term134388.getClass(), "x", 0);
        setIntField(term134388, term134388.getClass(), "y", 0);
        setIntField(term134388, term134388.getClass(), "width", 0);
        setIntField(term134388, term134388.getClass(), "height", 0);
        setField(term134388, term134388.getClass(), "foreground", null);
        setField(term134388, term134388.getClass(), "background", null);
        setField(term134388, term134388.getClass(), "font", null);
        setField(term134388, term134388.getClass(), "peerFont", null);
        setField(term134388, term134388.getClass(), "cursor", null);
        setField(term134388, term134388.getClass(), "locale", null);
        setField(term134388, term134388.getClass(), "graphicsConfig", null);
        setField(term134388, term134388.getClass(), "bufferStrategy", null);
        setBooleanField(term134388, term134388.getClass(), "ignoreRepaint", false);
        setBooleanField(term134388, term134388.getClass(), "visible", false);
        setBooleanField(term134388, term134388.getClass(), "enabled", false);
        setBooleanField(term134388, term134388.getClass(), "valid", false);
        setField(term134388, term134388.getClass(), "dropTarget", null);
        setField(term134388, term134388.getClass(), "popups", null);
        setField(term134388, term134388.getClass(), "name", null);
        setBooleanField(term134388, term134388.getClass(), "nameExplicitlySet", false);
        setBooleanField(term134388, term134388.getClass(), "focusable", false);
        setIntField(term134388, term134388.getClass(), "isFocusTraversableOverridden", 0);
        setField(term134388, term134388.getClass(), "focusTraversalKeys", null);
        setBooleanField(term134388, term134388.getClass(), "focusTraversalKeysEnabled", false);
        setField(term134388, term134388.getClass(), "acc", null);
        setField(term134388, term134388.getClass(), "minSize", null);
        setBooleanField(term134388, term134388.getClass(), "minSizeSet", false);
        setField(term134388, term134388.getClass(), "prefSize", null);
        setBooleanField(term134388, term134388.getClass(), "prefSizeSet", false);
        setField(term134388, term134388.getClass(), "maxSize", null);
        setBooleanField(term134388, term134388.getClass(), "maxSizeSet", false);
        setField(term134388, term134388.getClass(), "componentOrientation", null);
        setBooleanField(term134388, term134388.getClass(), "newEventsOnly", false);
        setField(term134388, term134388.getClass(), "componentListener", null);
        setField(term134388, term134388.getClass(), "focusListener", null);
        setField(term134388, term134388.getClass(), "hierarchyListener", null);
        setField(term134388, term134388.getClass(), "hierarchyBoundsListener", null);
        setField(term134388, term134388.getClass(), "keyListener", null);
        setField(term134388, term134388.getClass(), "mouseListener", null);
        setField(term134388, term134388.getClass(), "mouseMotionListener", null);
        setField(term134388, term134388.getClass(), "mouseWheelListener", null);
        setField(term134388, term134388.getClass(), "inputMethodListener", null);
        setLongField(term134388, term134388.getClass(), "eventMask", 0L);
        setField(term134388, term134388.getClass(), "changeSupport", null);
        setField(term134388, term134388.getClass(), "objectLock", null);
        setBooleanField(term134388, term134388.getClass(), "isPacked", false);
        setIntField(term134388, term134388.getClass(), "boundsOp", 0);
        setField(term134388, term134388.getClass(), "compoundShape", null);
        setField(term134388, term134388.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term134388, term134388.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term134388, term134388.getClass(), "backgroundEraseDisabled", false);
        setField(term134388, term134388.getClass(), "eventCache", null);
        setBooleanField(term134388, term134388.getClass(), "coalescingEnabled", false);
        setBooleanField(term134388, term134388.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term134388, term134388.getClass(), "componentSerializedDataVersion", 0);
        setField(term134388, term134388.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.ResearchTechPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLabelToolTip", argTypes, term134388, args);
    }

};


