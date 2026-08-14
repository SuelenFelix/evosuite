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

public class Simulator_SimulatorMenu_initMenu_12227937979 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68153;

    public Simulator_SimulatorMenu_initMenu_12227937979() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68153 = newInstance(Class.forName("com.loomcom.symon.Simulator$SimulatorMenu"));
        setField(term68153, term68153.getClass(), "loadProgramItem", null);
        setField(term68153, term68153.getClass(), "loadRomItem", null);
        setField(term68153, term68153.getClass(), "this$0", null);
        setField(term68153, term68153.getClass(), "selectionModel", null);
        setBooleanField(term68153, term68153.getClass(), "paintBorder", false);
        setField(term68153, term68153.getClass(), "margin", null);
        setBooleanField(term68153, term68153.getClass(), "isAlignmentXSet", false);
        setFloatField(term68153, term68153.getClass(), "alignmentX", 0.0F);
        setBooleanField(term68153, term68153.getClass(), "isAlignmentYSet", false);
        setFloatField(term68153, term68153.getClass(), "alignmentY", 0.0F);
        setField(term68153, term68153.getClass(), "ui", null);
        setField(term68153, term68153.getClass(), "listenerList", null);
        setField(term68153, term68153.getClass(), "clientProperties", null);
        setField(term68153, term68153.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term68153, term68153.getClass(), "autoscrolls", false);
        setField(term68153, term68153.getClass(), "border", null);
        setIntField(term68153, term68153.getClass(), "flags", 0);
        setField(term68153, term68153.getClass(), "inputVerifier", null);
        setBooleanField(term68153, term68153.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term68153, term68153.getClass(), "paintingChild", null);
        setField(term68153, term68153.getClass(), "popupMenu", null);
        setField(term68153, term68153.getClass(), "revalidateRunnableScheduled", null);
        setField(term68153, term68153.getClass(), "focusInputMap", null);
        setField(term68153, term68153.getClass(), "ancestorInputMap", null);
        setField(term68153, term68153.getClass(), "windowInputMap", null);
        setField(term68153, term68153.getClass(), "actionMap", null);
        setField(term68153, term68153.getClass(), "aaHint", null);
        setField(term68153, term68153.getClass(), "lcdRenderingHint", null);
        setField(term68153, term68153.getClass(), "component", null);
        setField(term68153, term68153.getClass(), "layoutMgr", null);
        setField(term68153, term68153.getClass(), "dispatcher", null);
        setField(term68153, term68153.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term68153, term68153.getClass(), "focusCycleRoot", false);
        setBooleanField(term68153, term68153.getClass(), "focusTraversalPolicyProvider", false);
        setField(term68153, term68153.getClass(), "printingThreads", null);
        setBooleanField(term68153, term68153.getClass(), "printing", false);
        setField(term68153, term68153.getClass(), "containerListener", null);
        setIntField(term68153, term68153.getClass(), "listeningChildren", 0);
        setIntField(term68153, term68153.getClass(), "listeningBoundsChildren", 0);
        setIntField(term68153, term68153.getClass(), "descendantsCount", 0);
        setField(term68153, term68153.getClass(), "preserveBackgroundColor", null);
        setIntField(term68153, term68153.getClass(), "numOfHWComponents", 0);
        setIntField(term68153, term68153.getClass(), "numOfLWComponents", 0);
        setField(term68153, term68153.getClass(), "modalComp", null);
        setField(term68153, term68153.getClass(), "modalAppContext", null);
        setIntField(term68153, term68153.getClass(), "containerSerializedDataVersion", 0);
        setField(term68153, term68153.getClass(), "peer", null);
        setField(term68153, term68153.getClass(), "parent", null);
        setField(term68153, term68153.getClass(), "appContext", null);
        setIntField(term68153, term68153.getClass(), "x", 0);
        setIntField(term68153, term68153.getClass(), "y", 0);
        setIntField(term68153, term68153.getClass(), "width", 0);
        setIntField(term68153, term68153.getClass(), "height", 0);
        setField(term68153, term68153.getClass(), "foreground", null);
        setField(term68153, term68153.getClass(), "background", null);
        setField(term68153, term68153.getClass(), "font", null);
        setField(term68153, term68153.getClass(), "peerFont", null);
        setField(term68153, term68153.getClass(), "cursor", null);
        setField(term68153, term68153.getClass(), "locale", null);
        setField(term68153, term68153.getClass(), "graphicsConfig", null);
        setField(term68153, term68153.getClass(), "bufferStrategy", null);
        setBooleanField(term68153, term68153.getClass(), "ignoreRepaint", false);
        setBooleanField(term68153, term68153.getClass(), "visible", false);
        setBooleanField(term68153, term68153.getClass(), "enabled", false);
        setBooleanField(term68153, term68153.getClass(), "valid", false);
        setField(term68153, term68153.getClass(), "dropTarget", null);
        setField(term68153, term68153.getClass(), "popups", null);
        setField(term68153, term68153.getClass(), "name", null);
        setBooleanField(term68153, term68153.getClass(), "nameExplicitlySet", false);
        setBooleanField(term68153, term68153.getClass(), "focusable", false);
        setIntField(term68153, term68153.getClass(), "isFocusTraversableOverridden", 0);
        setField(term68153, term68153.getClass(), "focusTraversalKeys", null);
        setBooleanField(term68153, term68153.getClass(), "focusTraversalKeysEnabled", false);
        setField(term68153, term68153.getClass(), "acc", null);
        setField(term68153, term68153.getClass(), "minSize", null);
        setBooleanField(term68153, term68153.getClass(), "minSizeSet", false);
        setField(term68153, term68153.getClass(), "prefSize", null);
        setBooleanField(term68153, term68153.getClass(), "prefSizeSet", false);
        setField(term68153, term68153.getClass(), "maxSize", null);
        setBooleanField(term68153, term68153.getClass(), "maxSizeSet", false);
        setField(term68153, term68153.getClass(), "componentOrientation", null);
        setBooleanField(term68153, term68153.getClass(), "newEventsOnly", false);
        setField(term68153, term68153.getClass(), "componentListener", null);
        setField(term68153, term68153.getClass(), "focusListener", null);
        setField(term68153, term68153.getClass(), "hierarchyListener", null);
        setField(term68153, term68153.getClass(), "hierarchyBoundsListener", null);
        setField(term68153, term68153.getClass(), "keyListener", null);
        setField(term68153, term68153.getClass(), "mouseListener", null);
        setField(term68153, term68153.getClass(), "mouseMotionListener", null);
        setField(term68153, term68153.getClass(), "mouseWheelListener", null);
        setField(term68153, term68153.getClass(), "inputMethodListener", null);
        setLongField(term68153, term68153.getClass(), "eventMask", 0L);
        setField(term68153, term68153.getClass(), "changeSupport", null);
        setField(term68153, term68153.getClass(), "objectLock", null);
        setBooleanField(term68153, term68153.getClass(), "isPacked", false);
        setIntField(term68153, term68153.getClass(), "boundsOp", 0);
        setField(term68153, term68153.getClass(), "compoundShape", null);
        setField(term68153, term68153.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term68153, term68153.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term68153, term68153.getClass(), "backgroundEraseDisabled", false);
        setField(term68153, term68153.getClass(), "eventCache", null);
        setBooleanField(term68153, term68153.getClass(), "coalescingEnabled", false);
        setBooleanField(term68153, term68153.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term68153, term68153.getClass(), "componentSerializedDataVersion", 0);
        setField(term68153, term68153.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Simulator$SimulatorMenu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initMenu", argTypes, term68153, args);
    }

};


