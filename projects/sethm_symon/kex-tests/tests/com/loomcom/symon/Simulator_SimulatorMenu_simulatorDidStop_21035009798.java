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

public class Simulator_SimulatorMenu_simulatorDidStop_21035009798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68111;

    public Simulator_SimulatorMenu_simulatorDidStop_21035009798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68111 = newInstance(Class.forName("com.loomcom.symon.Simulator$SimulatorMenu"));
        setField(term68111, term68111.getClass(), "loadProgramItem", null);
        setField(term68111, term68111.getClass(), "loadRomItem", null);
        setField(term68111, term68111.getClass(), "this$0", null);
        setField(term68111, term68111.getClass(), "selectionModel", null);
        setBooleanField(term68111, term68111.getClass(), "paintBorder", false);
        setField(term68111, term68111.getClass(), "margin", null);
        setBooleanField(term68111, term68111.getClass(), "isAlignmentXSet", false);
        setFloatField(term68111, term68111.getClass(), "alignmentX", 0.0F);
        setBooleanField(term68111, term68111.getClass(), "isAlignmentYSet", false);
        setFloatField(term68111, term68111.getClass(), "alignmentY", 0.0F);
        setField(term68111, term68111.getClass(), "ui", null);
        setField(term68111, term68111.getClass(), "listenerList", null);
        setField(term68111, term68111.getClass(), "clientProperties", null);
        setField(term68111, term68111.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term68111, term68111.getClass(), "autoscrolls", false);
        setField(term68111, term68111.getClass(), "border", null);
        setIntField(term68111, term68111.getClass(), "flags", 0);
        setField(term68111, term68111.getClass(), "inputVerifier", null);
        setBooleanField(term68111, term68111.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term68111, term68111.getClass(), "paintingChild", null);
        setField(term68111, term68111.getClass(), "popupMenu", null);
        setField(term68111, term68111.getClass(), "revalidateRunnableScheduled", null);
        setField(term68111, term68111.getClass(), "focusInputMap", null);
        setField(term68111, term68111.getClass(), "ancestorInputMap", null);
        setField(term68111, term68111.getClass(), "windowInputMap", null);
        setField(term68111, term68111.getClass(), "actionMap", null);
        setField(term68111, term68111.getClass(), "aaHint", null);
        setField(term68111, term68111.getClass(), "lcdRenderingHint", null);
        setField(term68111, term68111.getClass(), "component", null);
        setField(term68111, term68111.getClass(), "layoutMgr", null);
        setField(term68111, term68111.getClass(), "dispatcher", null);
        setField(term68111, term68111.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term68111, term68111.getClass(), "focusCycleRoot", false);
        setBooleanField(term68111, term68111.getClass(), "focusTraversalPolicyProvider", false);
        setField(term68111, term68111.getClass(), "printingThreads", null);
        setBooleanField(term68111, term68111.getClass(), "printing", false);
        setField(term68111, term68111.getClass(), "containerListener", null);
        setIntField(term68111, term68111.getClass(), "listeningChildren", 0);
        setIntField(term68111, term68111.getClass(), "listeningBoundsChildren", 0);
        setIntField(term68111, term68111.getClass(), "descendantsCount", 0);
        setField(term68111, term68111.getClass(), "preserveBackgroundColor", null);
        setIntField(term68111, term68111.getClass(), "numOfHWComponents", 0);
        setIntField(term68111, term68111.getClass(), "numOfLWComponents", 0);
        setField(term68111, term68111.getClass(), "modalComp", null);
        setField(term68111, term68111.getClass(), "modalAppContext", null);
        setIntField(term68111, term68111.getClass(), "containerSerializedDataVersion", 0);
        setField(term68111, term68111.getClass(), "peer", null);
        setField(term68111, term68111.getClass(), "parent", null);
        setField(term68111, term68111.getClass(), "appContext", null);
        setIntField(term68111, term68111.getClass(), "x", 0);
        setIntField(term68111, term68111.getClass(), "y", 0);
        setIntField(term68111, term68111.getClass(), "width", 0);
        setIntField(term68111, term68111.getClass(), "height", 0);
        setField(term68111, term68111.getClass(), "foreground", null);
        setField(term68111, term68111.getClass(), "background", null);
        setField(term68111, term68111.getClass(), "font", null);
        setField(term68111, term68111.getClass(), "peerFont", null);
        setField(term68111, term68111.getClass(), "cursor", null);
        setField(term68111, term68111.getClass(), "locale", null);
        setField(term68111, term68111.getClass(), "graphicsConfig", null);
        setField(term68111, term68111.getClass(), "bufferStrategy", null);
        setBooleanField(term68111, term68111.getClass(), "ignoreRepaint", false);
        setBooleanField(term68111, term68111.getClass(), "visible", false);
        setBooleanField(term68111, term68111.getClass(), "enabled", false);
        setBooleanField(term68111, term68111.getClass(), "valid", false);
        setField(term68111, term68111.getClass(), "dropTarget", null);
        setField(term68111, term68111.getClass(), "popups", null);
        setField(term68111, term68111.getClass(), "name", null);
        setBooleanField(term68111, term68111.getClass(), "nameExplicitlySet", false);
        setBooleanField(term68111, term68111.getClass(), "focusable", false);
        setIntField(term68111, term68111.getClass(), "isFocusTraversableOverridden", 0);
        setField(term68111, term68111.getClass(), "focusTraversalKeys", null);
        setBooleanField(term68111, term68111.getClass(), "focusTraversalKeysEnabled", false);
        setField(term68111, term68111.getClass(), "acc", null);
        setField(term68111, term68111.getClass(), "minSize", null);
        setBooleanField(term68111, term68111.getClass(), "minSizeSet", false);
        setField(term68111, term68111.getClass(), "prefSize", null);
        setBooleanField(term68111, term68111.getClass(), "prefSizeSet", false);
        setField(term68111, term68111.getClass(), "maxSize", null);
        setBooleanField(term68111, term68111.getClass(), "maxSizeSet", false);
        setField(term68111, term68111.getClass(), "componentOrientation", null);
        setBooleanField(term68111, term68111.getClass(), "newEventsOnly", false);
        setField(term68111, term68111.getClass(), "componentListener", null);
        setField(term68111, term68111.getClass(), "focusListener", null);
        setField(term68111, term68111.getClass(), "hierarchyListener", null);
        setField(term68111, term68111.getClass(), "hierarchyBoundsListener", null);
        setField(term68111, term68111.getClass(), "keyListener", null);
        setField(term68111, term68111.getClass(), "mouseListener", null);
        setField(term68111, term68111.getClass(), "mouseMotionListener", null);
        setField(term68111, term68111.getClass(), "mouseWheelListener", null);
        setField(term68111, term68111.getClass(), "inputMethodListener", null);
        setLongField(term68111, term68111.getClass(), "eventMask", 0L);
        setField(term68111, term68111.getClass(), "changeSupport", null);
        setField(term68111, term68111.getClass(), "objectLock", null);
        setBooleanField(term68111, term68111.getClass(), "isPacked", false);
        setIntField(term68111, term68111.getClass(), "boundsOp", 0);
        setField(term68111, term68111.getClass(), "compoundShape", null);
        setField(term68111, term68111.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term68111, term68111.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term68111, term68111.getClass(), "backgroundEraseDisabled", false);
        setField(term68111, term68111.getClass(), "eventCache", null);
        setBooleanField(term68111, term68111.getClass(), "coalescingEnabled", false);
        setBooleanField(term68111, term68111.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term68111, term68111.getClass(), "componentSerializedDataVersion", 0);
        setField(term68111, term68111.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SimulatorMenu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "simulatorDidStop", argTypes, term68111, args);
    }

};


