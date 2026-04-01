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

public class WorkerProductionPanel_setInteractive_6254694936 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239445;
     Object term239486;

    public WorkerProductionPanel_setInteractive_6254694936() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239445 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.WorkerProductionPanel"));
        setField(term239445, term239445.getClass(), "btnMinus", null);
        setField(term239445, term239445.getClass(), "btnPlus", null);
        setField(term239445, term239445.getClass(), "label", null);
        setBooleanField(term239445, term239445.getClass(), "isAlignmentXSet", false);
        setFloatField(term239445, term239445.getClass(), "alignmentX", 0.0F);
        setBooleanField(term239445, term239445.getClass(), "isAlignmentYSet", false);
        setFloatField(term239445, term239445.getClass(), "alignmentY", 0.0F);
        setField(term239445, term239445.getClass(), "ui", null);
        setField(term239445, term239445.getClass(), "listenerList", null);
        setField(term239445, term239445.getClass(), "clientProperties", null);
        setField(term239445, term239445.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term239445, term239445.getClass(), "autoscrolls", false);
        setField(term239445, term239445.getClass(), "border", null);
        setIntField(term239445, term239445.getClass(), "flags", 0);
        setField(term239445, term239445.getClass(), "inputVerifier", null);
        setBooleanField(term239445, term239445.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term239445, term239445.getClass(), "paintingChild", null);
        setField(term239445, term239445.getClass(), "popupMenu", null);
        setField(term239445, term239445.getClass(), "revalidateRunnableScheduled", null);
        setField(term239445, term239445.getClass(), "focusInputMap", null);
        setField(term239445, term239445.getClass(), "ancestorInputMap", null);
        setField(term239445, term239445.getClass(), "windowInputMap", null);
        setField(term239445, term239445.getClass(), "actionMap", null);
        setField(term239445, term239445.getClass(), "aaHint", null);
        setField(term239445, term239445.getClass(), "lcdRenderingHint", null);
        setField(term239445, term239445.getClass(), "component", null);
        setField(term239445, term239445.getClass(), "layoutMgr", null);
        setField(term239445, term239445.getClass(), "dispatcher", null);
        setField(term239445, term239445.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term239445, term239445.getClass(), "focusCycleRoot", false);
        setBooleanField(term239445, term239445.getClass(), "focusTraversalPolicyProvider", false);
        setField(term239445, term239445.getClass(), "printingThreads", null);
        setBooleanField(term239445, term239445.getClass(), "printing", false);
        setField(term239445, term239445.getClass(), "containerListener", null);
        setIntField(term239445, term239445.getClass(), "listeningChildren", 0);
        setIntField(term239445, term239445.getClass(), "listeningBoundsChildren", 0);
        setIntField(term239445, term239445.getClass(), "descendantsCount", 0);
        setField(term239445, term239445.getClass(), "preserveBackgroundColor", null);
        setIntField(term239445, term239445.getClass(), "numOfHWComponents", 0);
        setIntField(term239445, term239445.getClass(), "numOfLWComponents", 0);
        setField(term239445, term239445.getClass(), "modalComp", null);
        setField(term239445, term239445.getClass(), "modalAppContext", null);
        setIntField(term239445, term239445.getClass(), "containerSerializedDataVersion", 0);
        setField(term239445, term239445.getClass(), "peer", null);
        setField(term239445, term239445.getClass(), "parent", null);
        setField(term239445, term239445.getClass(), "appContext", null);
        setIntField(term239445, term239445.getClass(), "x", 0);
        setIntField(term239445, term239445.getClass(), "y", 0);
        setIntField(term239445, term239445.getClass(), "width", 0);
        setIntField(term239445, term239445.getClass(), "height", 0);
        setField(term239445, term239445.getClass(), "foreground", null);
        setField(term239445, term239445.getClass(), "background", null);
        setField(term239445, term239445.getClass(), "font", null);
        setField(term239445, term239445.getClass(), "peerFont", null);
        setField(term239445, term239445.getClass(), "cursor", null);
        setField(term239445, term239445.getClass(), "locale", null);
        setField(term239445, term239445.getClass(), "graphicsConfig", null);
        setField(term239445, term239445.getClass(), "bufferStrategy", null);
        setBooleanField(term239445, term239445.getClass(), "ignoreRepaint", false);
        setBooleanField(term239445, term239445.getClass(), "visible", false);
        setBooleanField(term239445, term239445.getClass(), "enabled", false);
        setBooleanField(term239445, term239445.getClass(), "valid", false);
        setField(term239445, term239445.getClass(), "dropTarget", null);
        setField(term239445, term239445.getClass(), "popups", null);
        setField(term239445, term239445.getClass(), "name", null);
        setBooleanField(term239445, term239445.getClass(), "nameExplicitlySet", false);
        setBooleanField(term239445, term239445.getClass(), "focusable", false);
        setIntField(term239445, term239445.getClass(), "isFocusTraversableOverridden", 0);
        setField(term239445, term239445.getClass(), "focusTraversalKeys", null);
        setBooleanField(term239445, term239445.getClass(), "focusTraversalKeysEnabled", false);
        setField(term239445, term239445.getClass(), "acc", null);
        setField(term239445, term239445.getClass(), "minSize", null);
        setBooleanField(term239445, term239445.getClass(), "minSizeSet", false);
        setField(term239445, term239445.getClass(), "prefSize", null);
        setBooleanField(term239445, term239445.getClass(), "prefSizeSet", false);
        setField(term239445, term239445.getClass(), "maxSize", null);
        setBooleanField(term239445, term239445.getClass(), "maxSizeSet", false);
        setField(term239445, term239445.getClass(), "componentOrientation", null);
        setBooleanField(term239445, term239445.getClass(), "newEventsOnly", false);
        setField(term239445, term239445.getClass(), "componentListener", null);
        setField(term239445, term239445.getClass(), "focusListener", null);
        setField(term239445, term239445.getClass(), "hierarchyListener", null);
        setField(term239445, term239445.getClass(), "hierarchyBoundsListener", null);
        setField(term239445, term239445.getClass(), "keyListener", null);
        setField(term239445, term239445.getClass(), "mouseListener", null);
        setField(term239445, term239445.getClass(), "mouseMotionListener", null);
        setField(term239445, term239445.getClass(), "mouseWheelListener", null);
        setField(term239445, term239445.getClass(), "inputMethodListener", null);
        setLongField(term239445, term239445.getClass(), "eventMask", 0L);
        setField(term239445, term239445.getClass(), "changeSupport", null);
        setField(term239445, term239445.getClass(), "objectLock", null);
        setBooleanField(term239445, term239445.getClass(), "isPacked", false);
        setIntField(term239445, term239445.getClass(), "boundsOp", 0);
        setField(term239445, term239445.getClass(), "compoundShape", null);
        setField(term239445, term239445.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term239445, term239445.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term239445, term239445.getClass(), "backgroundEraseDisabled", false);
        setField(term239445, term239445.getClass(), "eventCache", null);
        setBooleanField(term239445, term239445.getClass(), "coalescingEnabled", false);
        setBooleanField(term239445, term239445.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term239445, term239445.getClass(), "componentSerializedDataVersion", 0);
        setField(term239445, term239445.getClass(), "accessibleContext", null);
        term239486 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.WorkerProductionPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term239486;
        callMethod(klass, "setInteractive", argTypes, term239445, args);
    }

};


