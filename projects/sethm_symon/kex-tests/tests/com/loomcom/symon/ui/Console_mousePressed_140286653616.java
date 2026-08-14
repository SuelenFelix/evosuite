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

public class Console_mousePressed_140286653616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13596;

    public Console_mousePressed_140286653616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13596 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term13596, term13596.getClass(), "sendCrForLf", false);
        setField(term13596, term13596.getClass(), "typeAheadBuffer", null);
        setIntField(term13596, term13596.getClass(), "borderWidth", 0);
        setField(term13596, term13596.getClass(), "scrollBar", null);
        setField(term13596, term13596.getClass(), "model", null);
        setField(term13596, term13596.getClass(), "font", null);
        setIntField(term13596, term13596.getClass(), "cellWidth", 0);
        setIntField(term13596, term13596.getClass(), "cellHeight", 0);
        setIntField(term13596, term13596.getClass(), "maxDescender", 0);
        setBooleanField(term13596, term13596.getClass(), "isAlignmentXSet", false);
        setFloatField(term13596, term13596.getClass(), "alignmentX", 0.0F);
        setBooleanField(term13596, term13596.getClass(), "isAlignmentYSet", false);
        setFloatField(term13596, term13596.getClass(), "alignmentY", 0.0F);
        setField(term13596, term13596.getClass(), "ui", null);
        setField(term13596, term13596.getClass(), "listenerList", null);
        setField(term13596, term13596.getClass(), "clientProperties", null);
        setField(term13596, term13596.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term13596, term13596.getClass(), "autoscrolls", false);
        setField(term13596, term13596.getClass(), "border", null);
        setIntField(term13596, term13596.getClass(), "flags", 0);
        setField(term13596, term13596.getClass(), "inputVerifier", null);
        setBooleanField(term13596, term13596.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term13596, term13596.getClass(), "paintingChild", null);
        setField(term13596, term13596.getClass(), "popupMenu", null);
        setField(term13596, term13596.getClass(), "revalidateRunnableScheduled", null);
        setField(term13596, term13596.getClass(), "focusInputMap", null);
        setField(term13596, term13596.getClass(), "ancestorInputMap", null);
        setField(term13596, term13596.getClass(), "windowInputMap", null);
        setField(term13596, term13596.getClass(), "actionMap", null);
        setField(term13596, term13596.getClass(), "aaHint", null);
        setField(term13596, term13596.getClass(), "lcdRenderingHint", null);
        setField(term13596, term13596.getClass(), "component", null);
        setField(term13596, term13596.getClass(), "layoutMgr", null);
        setField(term13596, term13596.getClass(), "dispatcher", null);
        setField(term13596, term13596.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term13596, term13596.getClass(), "focusCycleRoot", false);
        setBooleanField(term13596, term13596.getClass(), "focusTraversalPolicyProvider", false);
        setField(term13596, term13596.getClass(), "printingThreads", null);
        setBooleanField(term13596, term13596.getClass(), "printing", false);
        setField(term13596, term13596.getClass(), "containerListener", null);
        setIntField(term13596, term13596.getClass(), "listeningChildren", 0);
        setIntField(term13596, term13596.getClass(), "listeningBoundsChildren", 0);
        setIntField(term13596, term13596.getClass(), "descendantsCount", 0);
        setField(term13596, term13596.getClass(), "preserveBackgroundColor", null);
        setIntField(term13596, term13596.getClass(), "numOfHWComponents", 0);
        setIntField(term13596, term13596.getClass(), "numOfLWComponents", 0);
        setField(term13596, term13596.getClass(), "modalComp", null);
        setField(term13596, term13596.getClass(), "modalAppContext", null);
        setIntField(term13596, term13596.getClass(), "containerSerializedDataVersion", 0);
        setField(term13596, term13596.getClass(), "peer", null);
        setField(term13596, term13596.getClass(), "parent", null);
        setField(term13596, term13596.getClass(), "appContext", null);
        setIntField(term13596, term13596.getClass(), "x", 0);
        setIntField(term13596, term13596.getClass(), "y", 0);
        setIntField(term13596, term13596.getClass(), "width", 0);
        setIntField(term13596, term13596.getClass(), "height", 0);
        setField(term13596, term13596.getClass(), "foreground", null);
        setField(term13596, term13596.getClass(), "background", null);
        setField(term13596, term13596.getClass(), "peerFont", null);
        setField(term13596, term13596.getClass(), "cursor", null);
        setField(term13596, term13596.getClass(), "locale", null);
        setField(term13596, term13596.getClass(), "graphicsConfig", null);
        setField(term13596, term13596.getClass(), "bufferStrategy", null);
        setBooleanField(term13596, term13596.getClass(), "ignoreRepaint", false);
        setBooleanField(term13596, term13596.getClass(), "visible", false);
        setBooleanField(term13596, term13596.getClass(), "enabled", false);
        setBooleanField(term13596, term13596.getClass(), "valid", false);
        setField(term13596, term13596.getClass(), "dropTarget", null);
        setField(term13596, term13596.getClass(), "popups", null);
        setField(term13596, term13596.getClass(), "name", null);
        setBooleanField(term13596, term13596.getClass(), "nameExplicitlySet", false);
        setBooleanField(term13596, term13596.getClass(), "focusable", false);
        setIntField(term13596, term13596.getClass(), "isFocusTraversableOverridden", 0);
        setField(term13596, term13596.getClass(), "focusTraversalKeys", null);
        setBooleanField(term13596, term13596.getClass(), "focusTraversalKeysEnabled", false);
        setField(term13596, term13596.getClass(), "acc", null);
        setField(term13596, term13596.getClass(), "minSize", null);
        setBooleanField(term13596, term13596.getClass(), "minSizeSet", false);
        setField(term13596, term13596.getClass(), "prefSize", null);
        setBooleanField(term13596, term13596.getClass(), "prefSizeSet", false);
        setField(term13596, term13596.getClass(), "maxSize", null);
        setBooleanField(term13596, term13596.getClass(), "maxSizeSet", false);
        setField(term13596, term13596.getClass(), "componentOrientation", null);
        setBooleanField(term13596, term13596.getClass(), "newEventsOnly", false);
        setField(term13596, term13596.getClass(), "componentListener", null);
        setField(term13596, term13596.getClass(), "focusListener", null);
        setField(term13596, term13596.getClass(), "hierarchyListener", null);
        setField(term13596, term13596.getClass(), "hierarchyBoundsListener", null);
        setField(term13596, term13596.getClass(), "keyListener", null);
        setField(term13596, term13596.getClass(), "mouseListener", null);
        setField(term13596, term13596.getClass(), "mouseMotionListener", null);
        setField(term13596, term13596.getClass(), "mouseWheelListener", null);
        setField(term13596, term13596.getClass(), "inputMethodListener", null);
        setLongField(term13596, term13596.getClass(), "eventMask", 0L);
        setField(term13596, term13596.getClass(), "changeSupport", null);
        setField(term13596, term13596.getClass(), "objectLock", null);
        setBooleanField(term13596, term13596.getClass(), "isPacked", false);
        setIntField(term13596, term13596.getClass(), "boundsOp", 0);
        setField(term13596, term13596.getClass(), "compoundShape", null);
        setField(term13596, term13596.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term13596, term13596.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term13596, term13596.getClass(), "backgroundEraseDisabled", false);
        setField(term13596, term13596.getClass(), "eventCache", null);
        setBooleanField(term13596, term13596.getClass(), "coalescingEnabled", false);
        setBooleanField(term13596, term13596.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term13596, term13596.getClass(), "componentSerializedDataVersion", 0);
        setField(term13596, term13596.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mousePressed", argTypes, term13596, args);
    }

};


