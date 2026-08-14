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

public class Console_mouseReleased_92473738918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14406;

    public Console_mouseReleased_92473738918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14406 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term14406, term14406.getClass(), "sendCrForLf", false);
        setField(term14406, term14406.getClass(), "typeAheadBuffer", null);
        setIntField(term14406, term14406.getClass(), "borderWidth", 0);
        setField(term14406, term14406.getClass(), "scrollBar", null);
        setField(term14406, term14406.getClass(), "model", null);
        setField(term14406, term14406.getClass(), "font", null);
        setIntField(term14406, term14406.getClass(), "cellWidth", 0);
        setIntField(term14406, term14406.getClass(), "cellHeight", 0);
        setIntField(term14406, term14406.getClass(), "maxDescender", 0);
        setBooleanField(term14406, term14406.getClass(), "isAlignmentXSet", false);
        setFloatField(term14406, term14406.getClass(), "alignmentX", 0.0F);
        setBooleanField(term14406, term14406.getClass(), "isAlignmentYSet", false);
        setFloatField(term14406, term14406.getClass(), "alignmentY", 0.0F);
        setField(term14406, term14406.getClass(), "ui", null);
        setField(term14406, term14406.getClass(), "listenerList", null);
        setField(term14406, term14406.getClass(), "clientProperties", null);
        setField(term14406, term14406.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term14406, term14406.getClass(), "autoscrolls", false);
        setField(term14406, term14406.getClass(), "border", null);
        setIntField(term14406, term14406.getClass(), "flags", 0);
        setField(term14406, term14406.getClass(), "inputVerifier", null);
        setBooleanField(term14406, term14406.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term14406, term14406.getClass(), "paintingChild", null);
        setField(term14406, term14406.getClass(), "popupMenu", null);
        setField(term14406, term14406.getClass(), "revalidateRunnableScheduled", null);
        setField(term14406, term14406.getClass(), "focusInputMap", null);
        setField(term14406, term14406.getClass(), "ancestorInputMap", null);
        setField(term14406, term14406.getClass(), "windowInputMap", null);
        setField(term14406, term14406.getClass(), "actionMap", null);
        setField(term14406, term14406.getClass(), "aaHint", null);
        setField(term14406, term14406.getClass(), "lcdRenderingHint", null);
        setField(term14406, term14406.getClass(), "component", null);
        setField(term14406, term14406.getClass(), "layoutMgr", null);
        setField(term14406, term14406.getClass(), "dispatcher", null);
        setField(term14406, term14406.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term14406, term14406.getClass(), "focusCycleRoot", false);
        setBooleanField(term14406, term14406.getClass(), "focusTraversalPolicyProvider", false);
        setField(term14406, term14406.getClass(), "printingThreads", null);
        setBooleanField(term14406, term14406.getClass(), "printing", false);
        setField(term14406, term14406.getClass(), "containerListener", null);
        setIntField(term14406, term14406.getClass(), "listeningChildren", 0);
        setIntField(term14406, term14406.getClass(), "listeningBoundsChildren", 0);
        setIntField(term14406, term14406.getClass(), "descendantsCount", 0);
        setField(term14406, term14406.getClass(), "preserveBackgroundColor", null);
        setIntField(term14406, term14406.getClass(), "numOfHWComponents", 0);
        setIntField(term14406, term14406.getClass(), "numOfLWComponents", 0);
        setField(term14406, term14406.getClass(), "modalComp", null);
        setField(term14406, term14406.getClass(), "modalAppContext", null);
        setIntField(term14406, term14406.getClass(), "containerSerializedDataVersion", 0);
        setField(term14406, term14406.getClass(), "peer", null);
        setField(term14406, term14406.getClass(), "parent", null);
        setField(term14406, term14406.getClass(), "appContext", null);
        setIntField(term14406, term14406.getClass(), "x", 0);
        setIntField(term14406, term14406.getClass(), "y", 0);
        setIntField(term14406, term14406.getClass(), "width", 0);
        setIntField(term14406, term14406.getClass(), "height", 0);
        setField(term14406, term14406.getClass(), "foreground", null);
        setField(term14406, term14406.getClass(), "background", null);
        setField(term14406, term14406.getClass(), "peerFont", null);
        setField(term14406, term14406.getClass(), "cursor", null);
        setField(term14406, term14406.getClass(), "locale", null);
        setField(term14406, term14406.getClass(), "graphicsConfig", null);
        setField(term14406, term14406.getClass(), "bufferStrategy", null);
        setBooleanField(term14406, term14406.getClass(), "ignoreRepaint", false);
        setBooleanField(term14406, term14406.getClass(), "visible", false);
        setBooleanField(term14406, term14406.getClass(), "enabled", false);
        setBooleanField(term14406, term14406.getClass(), "valid", false);
        setField(term14406, term14406.getClass(), "dropTarget", null);
        setField(term14406, term14406.getClass(), "popups", null);
        setField(term14406, term14406.getClass(), "name", null);
        setBooleanField(term14406, term14406.getClass(), "nameExplicitlySet", false);
        setBooleanField(term14406, term14406.getClass(), "focusable", false);
        setIntField(term14406, term14406.getClass(), "isFocusTraversableOverridden", 0);
        setField(term14406, term14406.getClass(), "focusTraversalKeys", null);
        setBooleanField(term14406, term14406.getClass(), "focusTraversalKeysEnabled", false);
        setField(term14406, term14406.getClass(), "acc", null);
        setField(term14406, term14406.getClass(), "minSize", null);
        setBooleanField(term14406, term14406.getClass(), "minSizeSet", false);
        setField(term14406, term14406.getClass(), "prefSize", null);
        setBooleanField(term14406, term14406.getClass(), "prefSizeSet", false);
        setField(term14406, term14406.getClass(), "maxSize", null);
        setBooleanField(term14406, term14406.getClass(), "maxSizeSet", false);
        setField(term14406, term14406.getClass(), "componentOrientation", null);
        setBooleanField(term14406, term14406.getClass(), "newEventsOnly", false);
        setField(term14406, term14406.getClass(), "componentListener", null);
        setField(term14406, term14406.getClass(), "focusListener", null);
        setField(term14406, term14406.getClass(), "hierarchyListener", null);
        setField(term14406, term14406.getClass(), "hierarchyBoundsListener", null);
        setField(term14406, term14406.getClass(), "keyListener", null);
        setField(term14406, term14406.getClass(), "mouseListener", null);
        setField(term14406, term14406.getClass(), "mouseMotionListener", null);
        setField(term14406, term14406.getClass(), "mouseWheelListener", null);
        setField(term14406, term14406.getClass(), "inputMethodListener", null);
        setLongField(term14406, term14406.getClass(), "eventMask", 0L);
        setField(term14406, term14406.getClass(), "changeSupport", null);
        setField(term14406, term14406.getClass(), "objectLock", null);
        setBooleanField(term14406, term14406.getClass(), "isPacked", false);
        setIntField(term14406, term14406.getClass(), "boundsOp", 0);
        setField(term14406, term14406.getClass(), "compoundShape", null);
        setField(term14406, term14406.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term14406, term14406.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term14406, term14406.getClass(), "backgroundEraseDisabled", false);
        setField(term14406, term14406.getClass(), "eventCache", null);
        setBooleanField(term14406, term14406.getClass(), "coalescingEnabled", false);
        setBooleanField(term14406, term14406.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term14406, term14406.getClass(), "componentSerializedDataVersion", 0);
        setField(term14406, term14406.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseReleased", argTypes, term14406, args);
    }

};


