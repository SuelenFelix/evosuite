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

public class WorkerProductionPanel_setText_13685200957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239488;

    public WorkerProductionPanel_setText_13685200957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term239488 = newInstance(Class.forName("org.openRealmOfStars.gui.panels.WorkerProductionPanel"));
        setField(term239488, term239488.getClass(), "btnMinus", null);
        setField(term239488, term239488.getClass(), "btnPlus", null);
        setField(term239488, term239488.getClass(), "label", null);
        setBooleanField(term239488, term239488.getClass(), "isAlignmentXSet", false);
        setFloatField(term239488, term239488.getClass(), "alignmentX", 0.0F);
        setBooleanField(term239488, term239488.getClass(), "isAlignmentYSet", false);
        setFloatField(term239488, term239488.getClass(), "alignmentY", 0.0F);
        setField(term239488, term239488.getClass(), "ui", null);
        setField(term239488, term239488.getClass(), "listenerList", null);
        setField(term239488, term239488.getClass(), "clientProperties", null);
        setField(term239488, term239488.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term239488, term239488.getClass(), "autoscrolls", false);
        setField(term239488, term239488.getClass(), "border", null);
        setIntField(term239488, term239488.getClass(), "flags", 0);
        setField(term239488, term239488.getClass(), "inputVerifier", null);
        setBooleanField(term239488, term239488.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term239488, term239488.getClass(), "paintingChild", null);
        setField(term239488, term239488.getClass(), "popupMenu", null);
        setField(term239488, term239488.getClass(), "revalidateRunnableScheduled", null);
        setField(term239488, term239488.getClass(), "focusInputMap", null);
        setField(term239488, term239488.getClass(), "ancestorInputMap", null);
        setField(term239488, term239488.getClass(), "windowInputMap", null);
        setField(term239488, term239488.getClass(), "actionMap", null);
        setField(term239488, term239488.getClass(), "aaHint", null);
        setField(term239488, term239488.getClass(), "lcdRenderingHint", null);
        setField(term239488, term239488.getClass(), "component", null);
        setField(term239488, term239488.getClass(), "layoutMgr", null);
        setField(term239488, term239488.getClass(), "dispatcher", null);
        setField(term239488, term239488.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term239488, term239488.getClass(), "focusCycleRoot", false);
        setBooleanField(term239488, term239488.getClass(), "focusTraversalPolicyProvider", false);
        setField(term239488, term239488.getClass(), "printingThreads", null);
        setBooleanField(term239488, term239488.getClass(), "printing", false);
        setField(term239488, term239488.getClass(), "containerListener", null);
        setIntField(term239488, term239488.getClass(), "listeningChildren", 0);
        setIntField(term239488, term239488.getClass(), "listeningBoundsChildren", 0);
        setIntField(term239488, term239488.getClass(), "descendantsCount", 0);
        setField(term239488, term239488.getClass(), "preserveBackgroundColor", null);
        setIntField(term239488, term239488.getClass(), "numOfHWComponents", 0);
        setIntField(term239488, term239488.getClass(), "numOfLWComponents", 0);
        setField(term239488, term239488.getClass(), "modalComp", null);
        setField(term239488, term239488.getClass(), "modalAppContext", null);
        setIntField(term239488, term239488.getClass(), "containerSerializedDataVersion", 0);
        setField(term239488, term239488.getClass(), "peer", null);
        setField(term239488, term239488.getClass(), "parent", null);
        setField(term239488, term239488.getClass(), "appContext", null);
        setIntField(term239488, term239488.getClass(), "x", 0);
        setIntField(term239488, term239488.getClass(), "y", 0);
        setIntField(term239488, term239488.getClass(), "width", 0);
        setIntField(term239488, term239488.getClass(), "height", 0);
        setField(term239488, term239488.getClass(), "foreground", null);
        setField(term239488, term239488.getClass(), "background", null);
        setField(term239488, term239488.getClass(), "font", null);
        setField(term239488, term239488.getClass(), "peerFont", null);
        setField(term239488, term239488.getClass(), "cursor", null);
        setField(term239488, term239488.getClass(), "locale", null);
        setField(term239488, term239488.getClass(), "graphicsConfig", null);
        setField(term239488, term239488.getClass(), "bufferStrategy", null);
        setBooleanField(term239488, term239488.getClass(), "ignoreRepaint", false);
        setBooleanField(term239488, term239488.getClass(), "visible", false);
        setBooleanField(term239488, term239488.getClass(), "enabled", false);
        setBooleanField(term239488, term239488.getClass(), "valid", false);
        setField(term239488, term239488.getClass(), "dropTarget", null);
        setField(term239488, term239488.getClass(), "popups", null);
        setField(term239488, term239488.getClass(), "name", null);
        setBooleanField(term239488, term239488.getClass(), "nameExplicitlySet", false);
        setBooleanField(term239488, term239488.getClass(), "focusable", false);
        setIntField(term239488, term239488.getClass(), "isFocusTraversableOverridden", 0);
        setField(term239488, term239488.getClass(), "focusTraversalKeys", null);
        setBooleanField(term239488, term239488.getClass(), "focusTraversalKeysEnabled", false);
        setField(term239488, term239488.getClass(), "acc", null);
        setField(term239488, term239488.getClass(), "minSize", null);
        setBooleanField(term239488, term239488.getClass(), "minSizeSet", false);
        setField(term239488, term239488.getClass(), "prefSize", null);
        setBooleanField(term239488, term239488.getClass(), "prefSizeSet", false);
        setField(term239488, term239488.getClass(), "maxSize", null);
        setBooleanField(term239488, term239488.getClass(), "maxSizeSet", false);
        setField(term239488, term239488.getClass(), "componentOrientation", null);
        setBooleanField(term239488, term239488.getClass(), "newEventsOnly", false);
        setField(term239488, term239488.getClass(), "componentListener", null);
        setField(term239488, term239488.getClass(), "focusListener", null);
        setField(term239488, term239488.getClass(), "hierarchyListener", null);
        setField(term239488, term239488.getClass(), "hierarchyBoundsListener", null);
        setField(term239488, term239488.getClass(), "keyListener", null);
        setField(term239488, term239488.getClass(), "mouseListener", null);
        setField(term239488, term239488.getClass(), "mouseMotionListener", null);
        setField(term239488, term239488.getClass(), "mouseWheelListener", null);
        setField(term239488, term239488.getClass(), "inputMethodListener", null);
        setLongField(term239488, term239488.getClass(), "eventMask", 0L);
        setField(term239488, term239488.getClass(), "changeSupport", null);
        setField(term239488, term239488.getClass(), "objectLock", null);
        setBooleanField(term239488, term239488.getClass(), "isPacked", false);
        setIntField(term239488, term239488.getClass(), "boundsOp", 0);
        setField(term239488, term239488.getClass(), "compoundShape", null);
        setField(term239488, term239488.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term239488, term239488.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term239488, term239488.getClass(), "backgroundEraseDisabled", false);
        setField(term239488, term239488.getClass(), "eventCache", null);
        setBooleanField(term239488, term239488.getClass(), "coalescingEnabled", false);
        setBooleanField(term239488, term239488.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term239488, term239488.getClass(), "componentSerializedDataVersion", 0);
        setField(term239488, term239488.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.panels.WorkerProductionPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setText", argTypes, term239488, args);
    }

};


