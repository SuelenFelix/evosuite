package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Console_keyTyped_383470246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9482;

    public Console_keyTyped_383470246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9482 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term9482, term9482.getClass(), "sendCrForLf", false);
        setField(term9482, term9482.getClass(), "typeAheadBuffer", null);
        setIntField(term9482, term9482.getClass(), "borderWidth", 0);
        setField(term9482, term9482.getClass(), "scrollBar", null);
        setField(term9482, term9482.getClass(), "model", null);
        setField(term9482, term9482.getClass(), "font", null);
        setIntField(term9482, term9482.getClass(), "cellWidth", 0);
        setIntField(term9482, term9482.getClass(), "cellHeight", 0);
        setIntField(term9482, term9482.getClass(), "maxDescender", 0);
        setBooleanField(term9482, term9482.getClass(), "isAlignmentXSet", false);
        setFloatField(term9482, term9482.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9482, term9482.getClass(), "isAlignmentYSet", false);
        setFloatField(term9482, term9482.getClass(), "alignmentY", 0.0F);
        setField(term9482, term9482.getClass(), "ui", null);
        setField(term9482, term9482.getClass(), "listenerList", null);
        setField(term9482, term9482.getClass(), "clientProperties", null);
        setField(term9482, term9482.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9482, term9482.getClass(), "autoscrolls", false);
        setField(term9482, term9482.getClass(), "border", null);
        setIntField(term9482, term9482.getClass(), "flags", 0);
        setField(term9482, term9482.getClass(), "inputVerifier", null);
        setBooleanField(term9482, term9482.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9482, term9482.getClass(), "paintingChild", null);
        setField(term9482, term9482.getClass(), "popupMenu", null);
        setField(term9482, term9482.getClass(), "revalidateRunnableScheduled", null);
        setField(term9482, term9482.getClass(), "focusInputMap", null);
        setField(term9482, term9482.getClass(), "ancestorInputMap", null);
        setField(term9482, term9482.getClass(), "windowInputMap", null);
        setField(term9482, term9482.getClass(), "actionMap", null);
        setField(term9482, term9482.getClass(), "aaHint", null);
        setField(term9482, term9482.getClass(), "lcdRenderingHint", null);
        setField(term9482, term9482.getClass(), "component", null);
        setField(term9482, term9482.getClass(), "layoutMgr", null);
        setField(term9482, term9482.getClass(), "dispatcher", null);
        setField(term9482, term9482.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9482, term9482.getClass(), "focusCycleRoot", false);
        setBooleanField(term9482, term9482.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9482, term9482.getClass(), "printingThreads", null);
        setBooleanField(term9482, term9482.getClass(), "printing", false);
        setField(term9482, term9482.getClass(), "containerListener", null);
        setIntField(term9482, term9482.getClass(), "listeningChildren", 0);
        setIntField(term9482, term9482.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9482, term9482.getClass(), "descendantsCount", 0);
        setField(term9482, term9482.getClass(), "preserveBackgroundColor", null);
        setIntField(term9482, term9482.getClass(), "numOfHWComponents", 0);
        setIntField(term9482, term9482.getClass(), "numOfLWComponents", 0);
        setField(term9482, term9482.getClass(), "modalComp", null);
        setField(term9482, term9482.getClass(), "modalAppContext", null);
        setIntField(term9482, term9482.getClass(), "containerSerializedDataVersion", 0);
        setField(term9482, term9482.getClass(), "peer", null);
        setField(term9482, term9482.getClass(), "parent", null);
        setField(term9482, term9482.getClass(), "appContext", null);
        setIntField(term9482, term9482.getClass(), "x", 0);
        setIntField(term9482, term9482.getClass(), "y", 0);
        setIntField(term9482, term9482.getClass(), "width", 0);
        setIntField(term9482, term9482.getClass(), "height", 0);
        setField(term9482, term9482.getClass(), "foreground", null);
        setField(term9482, term9482.getClass(), "background", null);
        setField(term9482, term9482.getClass(), "peerFont", null);
        setField(term9482, term9482.getClass(), "cursor", null);
        setField(term9482, term9482.getClass(), "locale", null);
        setField(term9482, term9482.getClass(), "graphicsConfig", null);
        setField(term9482, term9482.getClass(), "bufferStrategy", null);
        setBooleanField(term9482, term9482.getClass(), "ignoreRepaint", false);
        setBooleanField(term9482, term9482.getClass(), "visible", false);
        setBooleanField(term9482, term9482.getClass(), "enabled", false);
        setBooleanField(term9482, term9482.getClass(), "valid", false);
        setField(term9482, term9482.getClass(), "dropTarget", null);
        setField(term9482, term9482.getClass(), "popups", null);
        setField(term9482, term9482.getClass(), "name", null);
        setBooleanField(term9482, term9482.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9482, term9482.getClass(), "focusable", false);
        setIntField(term9482, term9482.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9482, term9482.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9482, term9482.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9482, term9482.getClass(), "acc", null);
        setField(term9482, term9482.getClass(), "minSize", null);
        setBooleanField(term9482, term9482.getClass(), "minSizeSet", false);
        setField(term9482, term9482.getClass(), "prefSize", null);
        setBooleanField(term9482, term9482.getClass(), "prefSizeSet", false);
        setField(term9482, term9482.getClass(), "maxSize", null);
        setBooleanField(term9482, term9482.getClass(), "maxSizeSet", false);
        setField(term9482, term9482.getClass(), "componentOrientation", null);
        setBooleanField(term9482, term9482.getClass(), "newEventsOnly", false);
        setField(term9482, term9482.getClass(), "componentListener", null);
        setField(term9482, term9482.getClass(), "focusListener", null);
        setField(term9482, term9482.getClass(), "hierarchyListener", null);
        setField(term9482, term9482.getClass(), "hierarchyBoundsListener", null);
        setField(term9482, term9482.getClass(), "keyListener", null);
        setField(term9482, term9482.getClass(), "mouseListener", null);
        setField(term9482, term9482.getClass(), "mouseMotionListener", null);
        setField(term9482, term9482.getClass(), "mouseWheelListener", null);
        setField(term9482, term9482.getClass(), "inputMethodListener", null);
        setLongField(term9482, term9482.getClass(), "eventMask", 0L);
        setField(term9482, term9482.getClass(), "changeSupport", null);
        setField(term9482, term9482.getClass(), "objectLock", null);
        setBooleanField(term9482, term9482.getClass(), "isPacked", false);
        setIntField(term9482, term9482.getClass(), "boundsOp", 0);
        setField(term9482, term9482.getClass(), "compoundShape", null);
        setField(term9482, term9482.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9482, term9482.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9482, term9482.getClass(), "backgroundEraseDisabled", false);
        setField(term9482, term9482.getClass(), "eventCache", null);
        setBooleanField(term9482, term9482.getClass(), "coalescingEnabled", false);
        setBooleanField(term9482, term9482.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9482, term9482.getClass(), "componentSerializedDataVersion", 0);
        setField(term9482, term9482.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.KeyEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "keyTyped", argTypes, term9482, args);
    }

};


