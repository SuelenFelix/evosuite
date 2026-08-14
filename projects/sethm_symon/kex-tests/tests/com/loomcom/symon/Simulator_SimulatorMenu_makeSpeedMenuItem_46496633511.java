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
import java.lang.Integer;

public class Simulator_SimulatorMenu_makeSpeedMenuItem_46496633511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68239;
     Object term68281;

    public Simulator_SimulatorMenu_makeSpeedMenuItem_46496633511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68239 = newInstance(Class.forName("com.loomcom.symon.Simulator$SimulatorMenu"));
        setField(term68239, term68239.getClass(), "loadProgramItem", null);
        setField(term68239, term68239.getClass(), "loadRomItem", null);
        setField(term68239, term68239.getClass(), "this$0", null);
        setField(term68239, term68239.getClass(), "selectionModel", null);
        setBooleanField(term68239, term68239.getClass(), "paintBorder", false);
        setField(term68239, term68239.getClass(), "margin", null);
        setBooleanField(term68239, term68239.getClass(), "isAlignmentXSet", false);
        setFloatField(term68239, term68239.getClass(), "alignmentX", 0.0F);
        setBooleanField(term68239, term68239.getClass(), "isAlignmentYSet", false);
        setFloatField(term68239, term68239.getClass(), "alignmentY", 0.0F);
        setField(term68239, term68239.getClass(), "ui", null);
        setField(term68239, term68239.getClass(), "listenerList", null);
        setField(term68239, term68239.getClass(), "clientProperties", null);
        setField(term68239, term68239.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term68239, term68239.getClass(), "autoscrolls", false);
        setField(term68239, term68239.getClass(), "border", null);
        setIntField(term68239, term68239.getClass(), "flags", 0);
        setField(term68239, term68239.getClass(), "inputVerifier", null);
        setBooleanField(term68239, term68239.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term68239, term68239.getClass(), "paintingChild", null);
        setField(term68239, term68239.getClass(), "popupMenu", null);
        setField(term68239, term68239.getClass(), "revalidateRunnableScheduled", null);
        setField(term68239, term68239.getClass(), "focusInputMap", null);
        setField(term68239, term68239.getClass(), "ancestorInputMap", null);
        setField(term68239, term68239.getClass(), "windowInputMap", null);
        setField(term68239, term68239.getClass(), "actionMap", null);
        setField(term68239, term68239.getClass(), "aaHint", null);
        setField(term68239, term68239.getClass(), "lcdRenderingHint", null);
        setField(term68239, term68239.getClass(), "component", null);
        setField(term68239, term68239.getClass(), "layoutMgr", null);
        setField(term68239, term68239.getClass(), "dispatcher", null);
        setField(term68239, term68239.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term68239, term68239.getClass(), "focusCycleRoot", false);
        setBooleanField(term68239, term68239.getClass(), "focusTraversalPolicyProvider", false);
        setField(term68239, term68239.getClass(), "printingThreads", null);
        setBooleanField(term68239, term68239.getClass(), "printing", false);
        setField(term68239, term68239.getClass(), "containerListener", null);
        setIntField(term68239, term68239.getClass(), "listeningChildren", 0);
        setIntField(term68239, term68239.getClass(), "listeningBoundsChildren", 0);
        setIntField(term68239, term68239.getClass(), "descendantsCount", 0);
        setField(term68239, term68239.getClass(), "preserveBackgroundColor", null);
        setIntField(term68239, term68239.getClass(), "numOfHWComponents", 0);
        setIntField(term68239, term68239.getClass(), "numOfLWComponents", 0);
        setField(term68239, term68239.getClass(), "modalComp", null);
        setField(term68239, term68239.getClass(), "modalAppContext", null);
        setIntField(term68239, term68239.getClass(), "containerSerializedDataVersion", 0);
        setField(term68239, term68239.getClass(), "peer", null);
        setField(term68239, term68239.getClass(), "parent", null);
        setField(term68239, term68239.getClass(), "appContext", null);
        setIntField(term68239, term68239.getClass(), "x", 0);
        setIntField(term68239, term68239.getClass(), "y", 0);
        setIntField(term68239, term68239.getClass(), "width", 0);
        setIntField(term68239, term68239.getClass(), "height", 0);
        setField(term68239, term68239.getClass(), "foreground", null);
        setField(term68239, term68239.getClass(), "background", null);
        setField(term68239, term68239.getClass(), "font", null);
        setField(term68239, term68239.getClass(), "peerFont", null);
        setField(term68239, term68239.getClass(), "cursor", null);
        setField(term68239, term68239.getClass(), "locale", null);
        setField(term68239, term68239.getClass(), "graphicsConfig", null);
        setField(term68239, term68239.getClass(), "bufferStrategy", null);
        setBooleanField(term68239, term68239.getClass(), "ignoreRepaint", false);
        setBooleanField(term68239, term68239.getClass(), "visible", false);
        setBooleanField(term68239, term68239.getClass(), "enabled", false);
        setBooleanField(term68239, term68239.getClass(), "valid", false);
        setField(term68239, term68239.getClass(), "dropTarget", null);
        setField(term68239, term68239.getClass(), "popups", null);
        setField(term68239, term68239.getClass(), "name", null);
        setBooleanField(term68239, term68239.getClass(), "nameExplicitlySet", false);
        setBooleanField(term68239, term68239.getClass(), "focusable", false);
        setIntField(term68239, term68239.getClass(), "isFocusTraversableOverridden", 0);
        setField(term68239, term68239.getClass(), "focusTraversalKeys", null);
        setBooleanField(term68239, term68239.getClass(), "focusTraversalKeysEnabled", false);
        setField(term68239, term68239.getClass(), "acc", null);
        setField(term68239, term68239.getClass(), "minSize", null);
        setBooleanField(term68239, term68239.getClass(), "minSizeSet", false);
        setField(term68239, term68239.getClass(), "prefSize", null);
        setBooleanField(term68239, term68239.getClass(), "prefSizeSet", false);
        setField(term68239, term68239.getClass(), "maxSize", null);
        setBooleanField(term68239, term68239.getClass(), "maxSizeSet", false);
        setField(term68239, term68239.getClass(), "componentOrientation", null);
        setBooleanField(term68239, term68239.getClass(), "newEventsOnly", false);
        setField(term68239, term68239.getClass(), "componentListener", null);
        setField(term68239, term68239.getClass(), "focusListener", null);
        setField(term68239, term68239.getClass(), "hierarchyListener", null);
        setField(term68239, term68239.getClass(), "hierarchyBoundsListener", null);
        setField(term68239, term68239.getClass(), "keyListener", null);
        setField(term68239, term68239.getClass(), "mouseListener", null);
        setField(term68239, term68239.getClass(), "mouseMotionListener", null);
        setField(term68239, term68239.getClass(), "mouseWheelListener", null);
        setField(term68239, term68239.getClass(), "inputMethodListener", null);
        setLongField(term68239, term68239.getClass(), "eventMask", 0L);
        setField(term68239, term68239.getClass(), "changeSupport", null);
        setField(term68239, term68239.getClass(), "objectLock", null);
        setBooleanField(term68239, term68239.getClass(), "isPacked", false);
        setIntField(term68239, term68239.getClass(), "boundsOp", 0);
        setField(term68239, term68239.getClass(), "compoundShape", null);
        setField(term68239, term68239.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term68239, term68239.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term68239, term68239.getClass(), "backgroundEraseDisabled", false);
        setField(term68239, term68239.getClass(), "eventCache", null);
        setBooleanField(term68239, term68239.getClass(), "coalescingEnabled", false);
        setBooleanField(term68239, term68239.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term68239, term68239.getClass(), "componentSerializedDataVersion", 0);
        setField(term68239, term68239.getClass(), "accessibleContext", null);
        term68281 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SimulatorMenu");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("javax.swing.JMenu");
        argTypes[2] = Class.forName("javax.swing.ButtonGroup");
        Object[] args = new Object[3];
        args[0] = term68281;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "makeSpeedMenuItem", argTypes, term68239, args);
    }

};


