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

public class Simulator_SimulatorMenu_makeFontSizeMenuItem_25169138810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68195;
     Object term68237;

    public Simulator_SimulatorMenu_makeFontSizeMenuItem_25169138810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68195 = newInstance(Class.forName("com.loomcom.symon.Simulator$SimulatorMenu"));
        setField(term68195, term68195.getClass(), "loadProgramItem", null);
        setField(term68195, term68195.getClass(), "loadRomItem", null);
        setField(term68195, term68195.getClass(), "this$0", null);
        setField(term68195, term68195.getClass(), "selectionModel", null);
        setBooleanField(term68195, term68195.getClass(), "paintBorder", false);
        setField(term68195, term68195.getClass(), "margin", null);
        setBooleanField(term68195, term68195.getClass(), "isAlignmentXSet", false);
        setFloatField(term68195, term68195.getClass(), "alignmentX", 0.0F);
        setBooleanField(term68195, term68195.getClass(), "isAlignmentYSet", false);
        setFloatField(term68195, term68195.getClass(), "alignmentY", 0.0F);
        setField(term68195, term68195.getClass(), "ui", null);
        setField(term68195, term68195.getClass(), "listenerList", null);
        setField(term68195, term68195.getClass(), "clientProperties", null);
        setField(term68195, term68195.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term68195, term68195.getClass(), "autoscrolls", false);
        setField(term68195, term68195.getClass(), "border", null);
        setIntField(term68195, term68195.getClass(), "flags", 0);
        setField(term68195, term68195.getClass(), "inputVerifier", null);
        setBooleanField(term68195, term68195.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term68195, term68195.getClass(), "paintingChild", null);
        setField(term68195, term68195.getClass(), "popupMenu", null);
        setField(term68195, term68195.getClass(), "revalidateRunnableScheduled", null);
        setField(term68195, term68195.getClass(), "focusInputMap", null);
        setField(term68195, term68195.getClass(), "ancestorInputMap", null);
        setField(term68195, term68195.getClass(), "windowInputMap", null);
        setField(term68195, term68195.getClass(), "actionMap", null);
        setField(term68195, term68195.getClass(), "aaHint", null);
        setField(term68195, term68195.getClass(), "lcdRenderingHint", null);
        setField(term68195, term68195.getClass(), "component", null);
        setField(term68195, term68195.getClass(), "layoutMgr", null);
        setField(term68195, term68195.getClass(), "dispatcher", null);
        setField(term68195, term68195.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term68195, term68195.getClass(), "focusCycleRoot", false);
        setBooleanField(term68195, term68195.getClass(), "focusTraversalPolicyProvider", false);
        setField(term68195, term68195.getClass(), "printingThreads", null);
        setBooleanField(term68195, term68195.getClass(), "printing", false);
        setField(term68195, term68195.getClass(), "containerListener", null);
        setIntField(term68195, term68195.getClass(), "listeningChildren", 0);
        setIntField(term68195, term68195.getClass(), "listeningBoundsChildren", 0);
        setIntField(term68195, term68195.getClass(), "descendantsCount", 0);
        setField(term68195, term68195.getClass(), "preserveBackgroundColor", null);
        setIntField(term68195, term68195.getClass(), "numOfHWComponents", 0);
        setIntField(term68195, term68195.getClass(), "numOfLWComponents", 0);
        setField(term68195, term68195.getClass(), "modalComp", null);
        setField(term68195, term68195.getClass(), "modalAppContext", null);
        setIntField(term68195, term68195.getClass(), "containerSerializedDataVersion", 0);
        setField(term68195, term68195.getClass(), "peer", null);
        setField(term68195, term68195.getClass(), "parent", null);
        setField(term68195, term68195.getClass(), "appContext", null);
        setIntField(term68195, term68195.getClass(), "x", 0);
        setIntField(term68195, term68195.getClass(), "y", 0);
        setIntField(term68195, term68195.getClass(), "width", 0);
        setIntField(term68195, term68195.getClass(), "height", 0);
        setField(term68195, term68195.getClass(), "foreground", null);
        setField(term68195, term68195.getClass(), "background", null);
        setField(term68195, term68195.getClass(), "font", null);
        setField(term68195, term68195.getClass(), "peerFont", null);
        setField(term68195, term68195.getClass(), "cursor", null);
        setField(term68195, term68195.getClass(), "locale", null);
        setField(term68195, term68195.getClass(), "graphicsConfig", null);
        setField(term68195, term68195.getClass(), "bufferStrategy", null);
        setBooleanField(term68195, term68195.getClass(), "ignoreRepaint", false);
        setBooleanField(term68195, term68195.getClass(), "visible", false);
        setBooleanField(term68195, term68195.getClass(), "enabled", false);
        setBooleanField(term68195, term68195.getClass(), "valid", false);
        setField(term68195, term68195.getClass(), "dropTarget", null);
        setField(term68195, term68195.getClass(), "popups", null);
        setField(term68195, term68195.getClass(), "name", null);
        setBooleanField(term68195, term68195.getClass(), "nameExplicitlySet", false);
        setBooleanField(term68195, term68195.getClass(), "focusable", false);
        setIntField(term68195, term68195.getClass(), "isFocusTraversableOverridden", 0);
        setField(term68195, term68195.getClass(), "focusTraversalKeys", null);
        setBooleanField(term68195, term68195.getClass(), "focusTraversalKeysEnabled", false);
        setField(term68195, term68195.getClass(), "acc", null);
        setField(term68195, term68195.getClass(), "minSize", null);
        setBooleanField(term68195, term68195.getClass(), "minSizeSet", false);
        setField(term68195, term68195.getClass(), "prefSize", null);
        setBooleanField(term68195, term68195.getClass(), "prefSizeSet", false);
        setField(term68195, term68195.getClass(), "maxSize", null);
        setBooleanField(term68195, term68195.getClass(), "maxSizeSet", false);
        setField(term68195, term68195.getClass(), "componentOrientation", null);
        setBooleanField(term68195, term68195.getClass(), "newEventsOnly", false);
        setField(term68195, term68195.getClass(), "componentListener", null);
        setField(term68195, term68195.getClass(), "focusListener", null);
        setField(term68195, term68195.getClass(), "hierarchyListener", null);
        setField(term68195, term68195.getClass(), "hierarchyBoundsListener", null);
        setField(term68195, term68195.getClass(), "keyListener", null);
        setField(term68195, term68195.getClass(), "mouseListener", null);
        setField(term68195, term68195.getClass(), "mouseMotionListener", null);
        setField(term68195, term68195.getClass(), "mouseWheelListener", null);
        setField(term68195, term68195.getClass(), "inputMethodListener", null);
        setLongField(term68195, term68195.getClass(), "eventMask", 0L);
        setField(term68195, term68195.getClass(), "changeSupport", null);
        setField(term68195, term68195.getClass(), "objectLock", null);
        setBooleanField(term68195, term68195.getClass(), "isPacked", false);
        setIntField(term68195, term68195.getClass(), "boundsOp", 0);
        setField(term68195, term68195.getClass(), "compoundShape", null);
        setField(term68195, term68195.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term68195, term68195.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term68195, term68195.getClass(), "backgroundEraseDisabled", false);
        setField(term68195, term68195.getClass(), "eventCache", null);
        setBooleanField(term68195, term68195.getClass(), "coalescingEnabled", false);
        setBooleanField(term68195, term68195.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term68195, term68195.getClass(), "componentSerializedDataVersion", 0);
        setField(term68195, term68195.getClass(), "accessibleContext", null);
        term68237 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SimulatorMenu");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("javax.swing.JMenu");
        argTypes[2] = Class.forName("javax.swing.ButtonGroup");
        Object[] args = new Object[3];
        args[0] = term68237;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "makeFontSizeMenuItem", argTypes, term68195, args);
    }

};


