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

public class Simulator_SimulatorMenu_makeCpuMenuItem_185002528712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68283;

    public Simulator_SimulatorMenu_makeCpuMenuItem_185002528712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68283 = newInstance(Class.forName("com.loomcom.symon.Simulator$SimulatorMenu"));
        setField(term68283, term68283.getClass(), "loadProgramItem", null);
        setField(term68283, term68283.getClass(), "loadRomItem", null);
        setField(term68283, term68283.getClass(), "this$0", null);
        setField(term68283, term68283.getClass(), "selectionModel", null);
        setBooleanField(term68283, term68283.getClass(), "paintBorder", false);
        setField(term68283, term68283.getClass(), "margin", null);
        setBooleanField(term68283, term68283.getClass(), "isAlignmentXSet", false);
        setFloatField(term68283, term68283.getClass(), "alignmentX", 0.0F);
        setBooleanField(term68283, term68283.getClass(), "isAlignmentYSet", false);
        setFloatField(term68283, term68283.getClass(), "alignmentY", 0.0F);
        setField(term68283, term68283.getClass(), "ui", null);
        setField(term68283, term68283.getClass(), "listenerList", null);
        setField(term68283, term68283.getClass(), "clientProperties", null);
        setField(term68283, term68283.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term68283, term68283.getClass(), "autoscrolls", false);
        setField(term68283, term68283.getClass(), "border", null);
        setIntField(term68283, term68283.getClass(), "flags", 0);
        setField(term68283, term68283.getClass(), "inputVerifier", null);
        setBooleanField(term68283, term68283.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term68283, term68283.getClass(), "paintingChild", null);
        setField(term68283, term68283.getClass(), "popupMenu", null);
        setField(term68283, term68283.getClass(), "revalidateRunnableScheduled", null);
        setField(term68283, term68283.getClass(), "focusInputMap", null);
        setField(term68283, term68283.getClass(), "ancestorInputMap", null);
        setField(term68283, term68283.getClass(), "windowInputMap", null);
        setField(term68283, term68283.getClass(), "actionMap", null);
        setField(term68283, term68283.getClass(), "aaHint", null);
        setField(term68283, term68283.getClass(), "lcdRenderingHint", null);
        setField(term68283, term68283.getClass(), "component", null);
        setField(term68283, term68283.getClass(), "layoutMgr", null);
        setField(term68283, term68283.getClass(), "dispatcher", null);
        setField(term68283, term68283.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term68283, term68283.getClass(), "focusCycleRoot", false);
        setBooleanField(term68283, term68283.getClass(), "focusTraversalPolicyProvider", false);
        setField(term68283, term68283.getClass(), "printingThreads", null);
        setBooleanField(term68283, term68283.getClass(), "printing", false);
        setField(term68283, term68283.getClass(), "containerListener", null);
        setIntField(term68283, term68283.getClass(), "listeningChildren", 0);
        setIntField(term68283, term68283.getClass(), "listeningBoundsChildren", 0);
        setIntField(term68283, term68283.getClass(), "descendantsCount", 0);
        setField(term68283, term68283.getClass(), "preserveBackgroundColor", null);
        setIntField(term68283, term68283.getClass(), "numOfHWComponents", 0);
        setIntField(term68283, term68283.getClass(), "numOfLWComponents", 0);
        setField(term68283, term68283.getClass(), "modalComp", null);
        setField(term68283, term68283.getClass(), "modalAppContext", null);
        setIntField(term68283, term68283.getClass(), "containerSerializedDataVersion", 0);
        setField(term68283, term68283.getClass(), "peer", null);
        setField(term68283, term68283.getClass(), "parent", null);
        setField(term68283, term68283.getClass(), "appContext", null);
        setIntField(term68283, term68283.getClass(), "x", 0);
        setIntField(term68283, term68283.getClass(), "y", 0);
        setIntField(term68283, term68283.getClass(), "width", 0);
        setIntField(term68283, term68283.getClass(), "height", 0);
        setField(term68283, term68283.getClass(), "foreground", null);
        setField(term68283, term68283.getClass(), "background", null);
        setField(term68283, term68283.getClass(), "font", null);
        setField(term68283, term68283.getClass(), "peerFont", null);
        setField(term68283, term68283.getClass(), "cursor", null);
        setField(term68283, term68283.getClass(), "locale", null);
        setField(term68283, term68283.getClass(), "graphicsConfig", null);
        setField(term68283, term68283.getClass(), "bufferStrategy", null);
        setBooleanField(term68283, term68283.getClass(), "ignoreRepaint", false);
        setBooleanField(term68283, term68283.getClass(), "visible", false);
        setBooleanField(term68283, term68283.getClass(), "enabled", false);
        setBooleanField(term68283, term68283.getClass(), "valid", false);
        setField(term68283, term68283.getClass(), "dropTarget", null);
        setField(term68283, term68283.getClass(), "popups", null);
        setField(term68283, term68283.getClass(), "name", null);
        setBooleanField(term68283, term68283.getClass(), "nameExplicitlySet", false);
        setBooleanField(term68283, term68283.getClass(), "focusable", false);
        setIntField(term68283, term68283.getClass(), "isFocusTraversableOverridden", 0);
        setField(term68283, term68283.getClass(), "focusTraversalKeys", null);
        setBooleanField(term68283, term68283.getClass(), "focusTraversalKeysEnabled", false);
        setField(term68283, term68283.getClass(), "acc", null);
        setField(term68283, term68283.getClass(), "minSize", null);
        setBooleanField(term68283, term68283.getClass(), "minSizeSet", false);
        setField(term68283, term68283.getClass(), "prefSize", null);
        setBooleanField(term68283, term68283.getClass(), "prefSizeSet", false);
        setField(term68283, term68283.getClass(), "maxSize", null);
        setBooleanField(term68283, term68283.getClass(), "maxSizeSet", false);
        setField(term68283, term68283.getClass(), "componentOrientation", null);
        setBooleanField(term68283, term68283.getClass(), "newEventsOnly", false);
        setField(term68283, term68283.getClass(), "componentListener", null);
        setField(term68283, term68283.getClass(), "focusListener", null);
        setField(term68283, term68283.getClass(), "hierarchyListener", null);
        setField(term68283, term68283.getClass(), "hierarchyBoundsListener", null);
        setField(term68283, term68283.getClass(), "keyListener", null);
        setField(term68283, term68283.getClass(), "mouseListener", null);
        setField(term68283, term68283.getClass(), "mouseMotionListener", null);
        setField(term68283, term68283.getClass(), "mouseWheelListener", null);
        setField(term68283, term68283.getClass(), "inputMethodListener", null);
        setLongField(term68283, term68283.getClass(), "eventMask", 0L);
        setField(term68283, term68283.getClass(), "changeSupport", null);
        setField(term68283, term68283.getClass(), "objectLock", null);
        setBooleanField(term68283, term68283.getClass(), "isPacked", false);
        setIntField(term68283, term68283.getClass(), "boundsOp", 0);
        setField(term68283, term68283.getClass(), "compoundShape", null);
        setField(term68283, term68283.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term68283, term68283.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term68283, term68283.getClass(), "backgroundEraseDisabled", false);
        setField(term68283, term68283.getClass(), "eventCache", null);
        setBooleanField(term68283, term68283.getClass(), "coalescingEnabled", false);
        setBooleanField(term68283, term68283.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term68283, term68283.getClass(), "componentSerializedDataVersion", 0);
        setField(term68283, term68283.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SimulatorMenu");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.loomcom.symon.InstructionTable$CpuBehavior");
        argTypes[2] = Class.forName("javax.swing.JMenu");
        argTypes[3] = Class.forName("javax.swing.ButtonGroup");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "makeCpuMenuItem", argTypes, term68283, args);
    }

};


