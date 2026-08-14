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

public class Console_mouseExited_170977527722 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16026;

    public Console_mouseExited_170977527722() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16026 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term16026, term16026.getClass(), "sendCrForLf", false);
        setField(term16026, term16026.getClass(), "typeAheadBuffer", null);
        setIntField(term16026, term16026.getClass(), "borderWidth", 0);
        setField(term16026, term16026.getClass(), "scrollBar", null);
        setField(term16026, term16026.getClass(), "model", null);
        setField(term16026, term16026.getClass(), "font", null);
        setIntField(term16026, term16026.getClass(), "cellWidth", 0);
        setIntField(term16026, term16026.getClass(), "cellHeight", 0);
        setIntField(term16026, term16026.getClass(), "maxDescender", 0);
        setBooleanField(term16026, term16026.getClass(), "isAlignmentXSet", false);
        setFloatField(term16026, term16026.getClass(), "alignmentX", 0.0F);
        setBooleanField(term16026, term16026.getClass(), "isAlignmentYSet", false);
        setFloatField(term16026, term16026.getClass(), "alignmentY", 0.0F);
        setField(term16026, term16026.getClass(), "ui", null);
        setField(term16026, term16026.getClass(), "listenerList", null);
        setField(term16026, term16026.getClass(), "clientProperties", null);
        setField(term16026, term16026.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term16026, term16026.getClass(), "autoscrolls", false);
        setField(term16026, term16026.getClass(), "border", null);
        setIntField(term16026, term16026.getClass(), "flags", 0);
        setField(term16026, term16026.getClass(), "inputVerifier", null);
        setBooleanField(term16026, term16026.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term16026, term16026.getClass(), "paintingChild", null);
        setField(term16026, term16026.getClass(), "popupMenu", null);
        setField(term16026, term16026.getClass(), "revalidateRunnableScheduled", null);
        setField(term16026, term16026.getClass(), "focusInputMap", null);
        setField(term16026, term16026.getClass(), "ancestorInputMap", null);
        setField(term16026, term16026.getClass(), "windowInputMap", null);
        setField(term16026, term16026.getClass(), "actionMap", null);
        setField(term16026, term16026.getClass(), "aaHint", null);
        setField(term16026, term16026.getClass(), "lcdRenderingHint", null);
        setField(term16026, term16026.getClass(), "component", null);
        setField(term16026, term16026.getClass(), "layoutMgr", null);
        setField(term16026, term16026.getClass(), "dispatcher", null);
        setField(term16026, term16026.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term16026, term16026.getClass(), "focusCycleRoot", false);
        setBooleanField(term16026, term16026.getClass(), "focusTraversalPolicyProvider", false);
        setField(term16026, term16026.getClass(), "printingThreads", null);
        setBooleanField(term16026, term16026.getClass(), "printing", false);
        setField(term16026, term16026.getClass(), "containerListener", null);
        setIntField(term16026, term16026.getClass(), "listeningChildren", 0);
        setIntField(term16026, term16026.getClass(), "listeningBoundsChildren", 0);
        setIntField(term16026, term16026.getClass(), "descendantsCount", 0);
        setField(term16026, term16026.getClass(), "preserveBackgroundColor", null);
        setIntField(term16026, term16026.getClass(), "numOfHWComponents", 0);
        setIntField(term16026, term16026.getClass(), "numOfLWComponents", 0);
        setField(term16026, term16026.getClass(), "modalComp", null);
        setField(term16026, term16026.getClass(), "modalAppContext", null);
        setIntField(term16026, term16026.getClass(), "containerSerializedDataVersion", 0);
        setField(term16026, term16026.getClass(), "peer", null);
        setField(term16026, term16026.getClass(), "parent", null);
        setField(term16026, term16026.getClass(), "appContext", null);
        setIntField(term16026, term16026.getClass(), "x", 0);
        setIntField(term16026, term16026.getClass(), "y", 0);
        setIntField(term16026, term16026.getClass(), "width", 0);
        setIntField(term16026, term16026.getClass(), "height", 0);
        setField(term16026, term16026.getClass(), "foreground", null);
        setField(term16026, term16026.getClass(), "background", null);
        setField(term16026, term16026.getClass(), "peerFont", null);
        setField(term16026, term16026.getClass(), "cursor", null);
        setField(term16026, term16026.getClass(), "locale", null);
        setField(term16026, term16026.getClass(), "graphicsConfig", null);
        setField(term16026, term16026.getClass(), "bufferStrategy", null);
        setBooleanField(term16026, term16026.getClass(), "ignoreRepaint", false);
        setBooleanField(term16026, term16026.getClass(), "visible", false);
        setBooleanField(term16026, term16026.getClass(), "enabled", false);
        setBooleanField(term16026, term16026.getClass(), "valid", false);
        setField(term16026, term16026.getClass(), "dropTarget", null);
        setField(term16026, term16026.getClass(), "popups", null);
        setField(term16026, term16026.getClass(), "name", null);
        setBooleanField(term16026, term16026.getClass(), "nameExplicitlySet", false);
        setBooleanField(term16026, term16026.getClass(), "focusable", false);
        setIntField(term16026, term16026.getClass(), "isFocusTraversableOverridden", 0);
        setField(term16026, term16026.getClass(), "focusTraversalKeys", null);
        setBooleanField(term16026, term16026.getClass(), "focusTraversalKeysEnabled", false);
        setField(term16026, term16026.getClass(), "acc", null);
        setField(term16026, term16026.getClass(), "minSize", null);
        setBooleanField(term16026, term16026.getClass(), "minSizeSet", false);
        setField(term16026, term16026.getClass(), "prefSize", null);
        setBooleanField(term16026, term16026.getClass(), "prefSizeSet", false);
        setField(term16026, term16026.getClass(), "maxSize", null);
        setBooleanField(term16026, term16026.getClass(), "maxSizeSet", false);
        setField(term16026, term16026.getClass(), "componentOrientation", null);
        setBooleanField(term16026, term16026.getClass(), "newEventsOnly", false);
        setField(term16026, term16026.getClass(), "componentListener", null);
        setField(term16026, term16026.getClass(), "focusListener", null);
        setField(term16026, term16026.getClass(), "hierarchyListener", null);
        setField(term16026, term16026.getClass(), "hierarchyBoundsListener", null);
        setField(term16026, term16026.getClass(), "keyListener", null);
        setField(term16026, term16026.getClass(), "mouseListener", null);
        setField(term16026, term16026.getClass(), "mouseMotionListener", null);
        setField(term16026, term16026.getClass(), "mouseWheelListener", null);
        setField(term16026, term16026.getClass(), "inputMethodListener", null);
        setLongField(term16026, term16026.getClass(), "eventMask", 0L);
        setField(term16026, term16026.getClass(), "changeSupport", null);
        setField(term16026, term16026.getClass(), "objectLock", null);
        setBooleanField(term16026, term16026.getClass(), "isPacked", false);
        setIntField(term16026, term16026.getClass(), "boundsOp", 0);
        setField(term16026, term16026.getClass(), "compoundShape", null);
        setField(term16026, term16026.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term16026, term16026.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term16026, term16026.getClass(), "backgroundEraseDisabled", false);
        setField(term16026, term16026.getClass(), "eventCache", null);
        setBooleanField(term16026, term16026.getClass(), "coalescingEnabled", false);
        setBooleanField(term16026, term16026.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term16026, term16026.getClass(), "componentSerializedDataVersion", 0);
        setField(term16026, term16026.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseExited", argTypes, term16026, args);
    }

};


