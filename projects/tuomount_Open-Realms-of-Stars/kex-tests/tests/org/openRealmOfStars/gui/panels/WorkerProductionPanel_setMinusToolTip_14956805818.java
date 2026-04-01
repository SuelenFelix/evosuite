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

public class WorkerProductionPanel_setMinusToolTip_14956805818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239529;

    public WorkerProductionPanel_setMinusToolTip_14956805818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239529 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.WorkerProductionPanel"));
        setField(term239529, term239529.getClass(), "btnMinus", null);
        setField(term239529, term239529.getClass(), "btnPlus", null);
        setField(term239529, term239529.getClass(), "label", null);
        setBooleanField(term239529, term239529.getClass(), "isAlignmentXSet", false);
        setFloatField(term239529, term239529.getClass(), "alignmentX", 0.0F);
        setBooleanField(term239529, term239529.getClass(), "isAlignmentYSet", false);
        setFloatField(term239529, term239529.getClass(), "alignmentY", 0.0F);
        setField(term239529, term239529.getClass(), "ui", null);
        setField(term239529, term239529.getClass(), "listenerList", null);
        setField(term239529, term239529.getClass(), "clientProperties", null);
        setField(term239529, term239529.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term239529, term239529.getClass(), "autoscrolls", false);
        setField(term239529, term239529.getClass(), "border", null);
        setIntField(term239529, term239529.getClass(), "flags", 0);
        setField(term239529, term239529.getClass(), "inputVerifier", null);
        setBooleanField(term239529, term239529.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term239529, term239529.getClass(), "paintingChild", null);
        setField(term239529, term239529.getClass(), "popupMenu", null);
        setField(term239529, term239529.getClass(), "revalidateRunnableScheduled", null);
        setField(term239529, term239529.getClass(), "focusInputMap", null);
        setField(term239529, term239529.getClass(), "ancestorInputMap", null);
        setField(term239529, term239529.getClass(), "windowInputMap", null);
        setField(term239529, term239529.getClass(), "actionMap", null);
        setField(term239529, term239529.getClass(), "aaHint", null);
        setField(term239529, term239529.getClass(), "lcdRenderingHint", null);
        setField(term239529, term239529.getClass(), "component", null);
        setField(term239529, term239529.getClass(), "layoutMgr", null);
        setField(term239529, term239529.getClass(), "dispatcher", null);
        setField(term239529, term239529.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term239529, term239529.getClass(), "focusCycleRoot", false);
        setBooleanField(term239529, term239529.getClass(), "focusTraversalPolicyProvider", false);
        setField(term239529, term239529.getClass(), "printingThreads", null);
        setBooleanField(term239529, term239529.getClass(), "printing", false);
        setField(term239529, term239529.getClass(), "containerListener", null);
        setIntField(term239529, term239529.getClass(), "listeningChildren", 0);
        setIntField(term239529, term239529.getClass(), "listeningBoundsChildren", 0);
        setIntField(term239529, term239529.getClass(), "descendantsCount", 0);
        setField(term239529, term239529.getClass(), "preserveBackgroundColor", null);
        setIntField(term239529, term239529.getClass(), "numOfHWComponents", 0);
        setIntField(term239529, term239529.getClass(), "numOfLWComponents", 0);
        setField(term239529, term239529.getClass(), "modalComp", null);
        setField(term239529, term239529.getClass(), "modalAppContext", null);
        setIntField(term239529, term239529.getClass(), "containerSerializedDataVersion", 0);
        setField(term239529, term239529.getClass(), "peer", null);
        setField(term239529, term239529.getClass(), "parent", null);
        setField(term239529, term239529.getClass(), "appContext", null);
        setIntField(term239529, term239529.getClass(), "x", 0);
        setIntField(term239529, term239529.getClass(), "y", 0);
        setIntField(term239529, term239529.getClass(), "width", 0);
        setIntField(term239529, term239529.getClass(), "height", 0);
        setField(term239529, term239529.getClass(), "foreground", null);
        setField(term239529, term239529.getClass(), "background", null);
        setField(term239529, term239529.getClass(), "font", null);
        setField(term239529, term239529.getClass(), "peerFont", null);
        setField(term239529, term239529.getClass(), "cursor", null);
        setField(term239529, term239529.getClass(), "locale", null);
        setField(term239529, term239529.getClass(), "graphicsConfig", null);
        setField(term239529, term239529.getClass(), "bufferStrategy", null);
        setBooleanField(term239529, term239529.getClass(), "ignoreRepaint", false);
        setBooleanField(term239529, term239529.getClass(), "visible", false);
        setBooleanField(term239529, term239529.getClass(), "enabled", false);
        setBooleanField(term239529, term239529.getClass(), "valid", false);
        setField(term239529, term239529.getClass(), "dropTarget", null);
        setField(term239529, term239529.getClass(), "popups", null);
        setField(term239529, term239529.getClass(), "name", null);
        setBooleanField(term239529, term239529.getClass(), "nameExplicitlySet", false);
        setBooleanField(term239529, term239529.getClass(), "focusable", false);
        setIntField(term239529, term239529.getClass(), "isFocusTraversableOverridden", 0);
        setField(term239529, term239529.getClass(), "focusTraversalKeys", null);
        setBooleanField(term239529, term239529.getClass(), "focusTraversalKeysEnabled", false);
        setField(term239529, term239529.getClass(), "acc", null);
        setField(term239529, term239529.getClass(), "minSize", null);
        setBooleanField(term239529, term239529.getClass(), "minSizeSet", false);
        setField(term239529, term239529.getClass(), "prefSize", null);
        setBooleanField(term239529, term239529.getClass(), "prefSizeSet", false);
        setField(term239529, term239529.getClass(), "maxSize", null);
        setBooleanField(term239529, term239529.getClass(), "maxSizeSet", false);
        setField(term239529, term239529.getClass(), "componentOrientation", null);
        setBooleanField(term239529, term239529.getClass(), "newEventsOnly", false);
        setField(term239529, term239529.getClass(), "componentListener", null);
        setField(term239529, term239529.getClass(), "focusListener", null);
        setField(term239529, term239529.getClass(), "hierarchyListener", null);
        setField(term239529, term239529.getClass(), "hierarchyBoundsListener", null);
        setField(term239529, term239529.getClass(), "keyListener", null);
        setField(term239529, term239529.getClass(), "mouseListener", null);
        setField(term239529, term239529.getClass(), "mouseMotionListener", null);
        setField(term239529, term239529.getClass(), "mouseWheelListener", null);
        setField(term239529, term239529.getClass(), "inputMethodListener", null);
        setLongField(term239529, term239529.getClass(), "eventMask", 0L);
        setField(term239529, term239529.getClass(), "changeSupport", null);
        setField(term239529, term239529.getClass(), "objectLock", null);
        setBooleanField(term239529, term239529.getClass(), "isPacked", false);
        setIntField(term239529, term239529.getClass(), "boundsOp", 0);
        setField(term239529, term239529.getClass(), "compoundShape", null);
        setField(term239529, term239529.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term239529, term239529.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term239529, term239529.getClass(), "backgroundEraseDisabled", false);
        setField(term239529, term239529.getClass(), "eventCache", null);
        setBooleanField(term239529, term239529.getClass(), "coalescingEnabled", false);
        setBooleanField(term239529, term239529.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term239529, term239529.getClass(), "componentSerializedDataVersion", 0);
        setField(term239529, term239529.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.WorkerProductionPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setMinusToolTip", argTypes, term239529, args);
    }

};


