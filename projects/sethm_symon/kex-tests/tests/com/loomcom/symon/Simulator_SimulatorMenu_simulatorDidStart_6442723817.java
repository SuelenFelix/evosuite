package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Simulator_SimulatorMenu_simulatorDidStart_6442723817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68069;

    public Simulator_SimulatorMenu_simulatorDidStart_6442723817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68069 = newInstance(Class.forName("com.loomcom.symon.Simulator$SimulatorMenu"));
        setField(term68069, term68069.getClass(), "loadProgramItem", null);
        setField(term68069, term68069.getClass(), "loadRomItem", null);
        setField(term68069, term68069.getClass(), "this$0", null);
        setField(term68069, term68069.getClass(), "selectionModel", null);
        setBooleanField(term68069, term68069.getClass(), "paintBorder", false);
        setField(term68069, term68069.getClass(), "margin", null);
        setBooleanField(term68069, term68069.getClass(), "isAlignmentXSet", false);
        setFloatField(term68069, term68069.getClass(), "alignmentX", 0.0F);
        setBooleanField(term68069, term68069.getClass(), "isAlignmentYSet", false);
        setFloatField(term68069, term68069.getClass(), "alignmentY", 0.0F);
        setField(term68069, term68069.getClass(), "ui", null);
        setField(term68069, term68069.getClass(), "listenerList", null);
        setField(term68069, term68069.getClass(), "clientProperties", null);
        setField(term68069, term68069.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term68069, term68069.getClass(), "autoscrolls", false);
        setField(term68069, term68069.getClass(), "border", null);
        setIntField(term68069, term68069.getClass(), "flags", 0);
        setField(term68069, term68069.getClass(), "inputVerifier", null);
        setBooleanField(term68069, term68069.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term68069, term68069.getClass(), "paintingChild", null);
        setField(term68069, term68069.getClass(), "popupMenu", null);
        setField(term68069, term68069.getClass(), "revalidateRunnableScheduled", null);
        setField(term68069, term68069.getClass(), "focusInputMap", null);
        setField(term68069, term68069.getClass(), "ancestorInputMap", null);
        setField(term68069, term68069.getClass(), "windowInputMap", null);
        setField(term68069, term68069.getClass(), "actionMap", null);
        setField(term68069, term68069.getClass(), "aaHint", null);
        setField(term68069, term68069.getClass(), "lcdRenderingHint", null);
        setField(term68069, term68069.getClass(), "component", null);
        setField(term68069, term68069.getClass(), "layoutMgr", null);
        setField(term68069, term68069.getClass(), "dispatcher", null);
        setField(term68069, term68069.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term68069, term68069.getClass(), "focusCycleRoot", false);
        setBooleanField(term68069, term68069.getClass(), "focusTraversalPolicyProvider", false);
        setField(term68069, term68069.getClass(), "printingThreads", null);
        setBooleanField(term68069, term68069.getClass(), "printing", false);
        setField(term68069, term68069.getClass(), "containerListener", null);
        setIntField(term68069, term68069.getClass(), "listeningChildren", 0);
        setIntField(term68069, term68069.getClass(), "listeningBoundsChildren", 0);
        setIntField(term68069, term68069.getClass(), "descendantsCount", 0);
        setField(term68069, term68069.getClass(), "preserveBackgroundColor", null);
        setIntField(term68069, term68069.getClass(), "numOfHWComponents", 0);
        setIntField(term68069, term68069.getClass(), "numOfLWComponents", 0);
        setField(term68069, term68069.getClass(), "modalComp", null);
        setField(term68069, term68069.getClass(), "modalAppContext", null);
        setIntField(term68069, term68069.getClass(), "containerSerializedDataVersion", 0);
        setField(term68069, term68069.getClass(), "peer", null);
        setField(term68069, term68069.getClass(), "parent", null);
        setField(term68069, term68069.getClass(), "appContext", null);
        setIntField(term68069, term68069.getClass(), "x", 0);
        setIntField(term68069, term68069.getClass(), "y", 0);
        setIntField(term68069, term68069.getClass(), "width", 0);
        setIntField(term68069, term68069.getClass(), "height", 0);
        setField(term68069, term68069.getClass(), "foreground", null);
        setField(term68069, term68069.getClass(), "background", null);
        setField(term68069, term68069.getClass(), "font", null);
        setField(term68069, term68069.getClass(), "peerFont", null);
        setField(term68069, term68069.getClass(), "cursor", null);
        setField(term68069, term68069.getClass(), "locale", null);
        setField(term68069, term68069.getClass(), "graphicsConfig", null);
        setField(term68069, term68069.getClass(), "bufferStrategy", null);
        setBooleanField(term68069, term68069.getClass(), "ignoreRepaint", false);
        setBooleanField(term68069, term68069.getClass(), "visible", false);
        setBooleanField(term68069, term68069.getClass(), "enabled", false);
        setBooleanField(term68069, term68069.getClass(), "valid", false);
        setField(term68069, term68069.getClass(), "dropTarget", null);
        setField(term68069, term68069.getClass(), "popups", null);
        setField(term68069, term68069.getClass(), "name", null);
        setBooleanField(term68069, term68069.getClass(), "nameExplicitlySet", false);
        setBooleanField(term68069, term68069.getClass(), "focusable", false);
        setIntField(term68069, term68069.getClass(), "isFocusTraversableOverridden", 0);
        setField(term68069, term68069.getClass(), "focusTraversalKeys", null);
        setBooleanField(term68069, term68069.getClass(), "focusTraversalKeysEnabled", false);
        setField(term68069, term68069.getClass(), "acc", null);
        setField(term68069, term68069.getClass(), "minSize", null);
        setBooleanField(term68069, term68069.getClass(), "minSizeSet", false);
        setField(term68069, term68069.getClass(), "prefSize", null);
        setBooleanField(term68069, term68069.getClass(), "prefSizeSet", false);
        setField(term68069, term68069.getClass(), "maxSize", null);
        setBooleanField(term68069, term68069.getClass(), "maxSizeSet", false);
        setField(term68069, term68069.getClass(), "componentOrientation", null);
        setBooleanField(term68069, term68069.getClass(), "newEventsOnly", false);
        setField(term68069, term68069.getClass(), "componentListener", null);
        setField(term68069, term68069.getClass(), "focusListener", null);
        setField(term68069, term68069.getClass(), "hierarchyListener", null);
        setField(term68069, term68069.getClass(), "hierarchyBoundsListener", null);
        setField(term68069, term68069.getClass(), "keyListener", null);
        setField(term68069, term68069.getClass(), "mouseListener", null);
        setField(term68069, term68069.getClass(), "mouseMotionListener", null);
        setField(term68069, term68069.getClass(), "mouseWheelListener", null);
        setField(term68069, term68069.getClass(), "inputMethodListener", null);
        setLongField(term68069, term68069.getClass(), "eventMask", 0L);
        setField(term68069, term68069.getClass(), "changeSupport", null);
        setField(term68069, term68069.getClass(), "objectLock", null);
        setBooleanField(term68069, term68069.getClass(), "isPacked", false);
        setIntField(term68069, term68069.getClass(), "boundsOp", 0);
        setField(term68069, term68069.getClass(), "compoundShape", null);
        setField(term68069, term68069.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term68069, term68069.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term68069, term68069.getClass(), "backgroundEraseDisabled", false);
        setField(term68069, term68069.getClass(), "eventCache", null);
        setBooleanField(term68069, term68069.getClass(), "coalescingEnabled", false);
        setBooleanField(term68069, term68069.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term68069, term68069.getClass(), "componentSerializedDataVersion", 0);
        setField(term68069, term68069.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SimulatorMenu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "simulatorDidStart", argTypes, term68069, args);
    }

};


