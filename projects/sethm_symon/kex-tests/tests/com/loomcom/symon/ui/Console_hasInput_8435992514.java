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

public class Console_hasInput_8435992514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8658;

    public Console_hasInput_8435992514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8658 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term8658, term8658.getClass(), "sendCrForLf", false);
        setField(term8658, term8658.getClass(), "typeAheadBuffer", null);
        setIntField(term8658, term8658.getClass(), "borderWidth", 0);
        setField(term8658, term8658.getClass(), "scrollBar", null);
        setField(term8658, term8658.getClass(), "model", null);
        setField(term8658, term8658.getClass(), "font", null);
        setIntField(term8658, term8658.getClass(), "cellWidth", 0);
        setIntField(term8658, term8658.getClass(), "cellHeight", 0);
        setIntField(term8658, term8658.getClass(), "maxDescender", 0);
        setBooleanField(term8658, term8658.getClass(), "isAlignmentXSet", false);
        setFloatField(term8658, term8658.getClass(), "alignmentX", 0.0F);
        setBooleanField(term8658, term8658.getClass(), "isAlignmentYSet", false);
        setFloatField(term8658, term8658.getClass(), "alignmentY", 0.0F);
        setField(term8658, term8658.getClass(), "ui", null);
        setField(term8658, term8658.getClass(), "listenerList", null);
        setField(term8658, term8658.getClass(), "clientProperties", null);
        setField(term8658, term8658.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term8658, term8658.getClass(), "autoscrolls", false);
        setField(term8658, term8658.getClass(), "border", null);
        setIntField(term8658, term8658.getClass(), "flags", 0);
        setField(term8658, term8658.getClass(), "inputVerifier", null);
        setBooleanField(term8658, term8658.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term8658, term8658.getClass(), "paintingChild", null);
        setField(term8658, term8658.getClass(), "popupMenu", null);
        setField(term8658, term8658.getClass(), "revalidateRunnableScheduled", null);
        setField(term8658, term8658.getClass(), "focusInputMap", null);
        setField(term8658, term8658.getClass(), "ancestorInputMap", null);
        setField(term8658, term8658.getClass(), "windowInputMap", null);
        setField(term8658, term8658.getClass(), "actionMap", null);
        setField(term8658, term8658.getClass(), "aaHint", null);
        setField(term8658, term8658.getClass(), "lcdRenderingHint", null);
        setField(term8658, term8658.getClass(), "component", null);
        setField(term8658, term8658.getClass(), "layoutMgr", null);
        setField(term8658, term8658.getClass(), "dispatcher", null);
        setField(term8658, term8658.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term8658, term8658.getClass(), "focusCycleRoot", false);
        setBooleanField(term8658, term8658.getClass(), "focusTraversalPolicyProvider", false);
        setField(term8658, term8658.getClass(), "printingThreads", null);
        setBooleanField(term8658, term8658.getClass(), "printing", false);
        setField(term8658, term8658.getClass(), "containerListener", null);
        setIntField(term8658, term8658.getClass(), "listeningChildren", 0);
        setIntField(term8658, term8658.getClass(), "listeningBoundsChildren", 0);
        setIntField(term8658, term8658.getClass(), "descendantsCount", 0);
        setField(term8658, term8658.getClass(), "preserveBackgroundColor", null);
        setIntField(term8658, term8658.getClass(), "numOfHWComponents", 0);
        setIntField(term8658, term8658.getClass(), "numOfLWComponents", 0);
        setField(term8658, term8658.getClass(), "modalComp", null);
        setField(term8658, term8658.getClass(), "modalAppContext", null);
        setIntField(term8658, term8658.getClass(), "containerSerializedDataVersion", 0);
        setField(term8658, term8658.getClass(), "peer", null);
        setField(term8658, term8658.getClass(), "parent", null);
        setField(term8658, term8658.getClass(), "appContext", null);
        setIntField(term8658, term8658.getClass(), "x", 0);
        setIntField(term8658, term8658.getClass(), "y", 0);
        setIntField(term8658, term8658.getClass(), "width", 0);
        setIntField(term8658, term8658.getClass(), "height", 0);
        setField(term8658, term8658.getClass(), "foreground", null);
        setField(term8658, term8658.getClass(), "background", null);
        setField(term8658, term8658.getClass(), "peerFont", null);
        setField(term8658, term8658.getClass(), "cursor", null);
        setField(term8658, term8658.getClass(), "locale", null);
        setField(term8658, term8658.getClass(), "graphicsConfig", null);
        setField(term8658, term8658.getClass(), "bufferStrategy", null);
        setBooleanField(term8658, term8658.getClass(), "ignoreRepaint", false);
        setBooleanField(term8658, term8658.getClass(), "visible", false);
        setBooleanField(term8658, term8658.getClass(), "enabled", false);
        setBooleanField(term8658, term8658.getClass(), "valid", false);
        setField(term8658, term8658.getClass(), "dropTarget", null);
        setField(term8658, term8658.getClass(), "popups", null);
        setField(term8658, term8658.getClass(), "name", null);
        setBooleanField(term8658, term8658.getClass(), "nameExplicitlySet", false);
        setBooleanField(term8658, term8658.getClass(), "focusable", false);
        setIntField(term8658, term8658.getClass(), "isFocusTraversableOverridden", 0);
        setField(term8658, term8658.getClass(), "focusTraversalKeys", null);
        setBooleanField(term8658, term8658.getClass(), "focusTraversalKeysEnabled", false);
        setField(term8658, term8658.getClass(), "acc", null);
        setField(term8658, term8658.getClass(), "minSize", null);
        setBooleanField(term8658, term8658.getClass(), "minSizeSet", false);
        setField(term8658, term8658.getClass(), "prefSize", null);
        setBooleanField(term8658, term8658.getClass(), "prefSizeSet", false);
        setField(term8658, term8658.getClass(), "maxSize", null);
        setBooleanField(term8658, term8658.getClass(), "maxSizeSet", false);
        setField(term8658, term8658.getClass(), "componentOrientation", null);
        setBooleanField(term8658, term8658.getClass(), "newEventsOnly", false);
        setField(term8658, term8658.getClass(), "componentListener", null);
        setField(term8658, term8658.getClass(), "focusListener", null);
        setField(term8658, term8658.getClass(), "hierarchyListener", null);
        setField(term8658, term8658.getClass(), "hierarchyBoundsListener", null);
        setField(term8658, term8658.getClass(), "keyListener", null);
        setField(term8658, term8658.getClass(), "mouseListener", null);
        setField(term8658, term8658.getClass(), "mouseMotionListener", null);
        setField(term8658, term8658.getClass(), "mouseWheelListener", null);
        setField(term8658, term8658.getClass(), "inputMethodListener", null);
        setLongField(term8658, term8658.getClass(), "eventMask", 0L);
        setField(term8658, term8658.getClass(), "changeSupport", null);
        setField(term8658, term8658.getClass(), "objectLock", null);
        setBooleanField(term8658, term8658.getClass(), "isPacked", false);
        setIntField(term8658, term8658.getClass(), "boundsOp", 0);
        setField(term8658, term8658.getClass(), "compoundShape", null);
        setField(term8658, term8658.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term8658, term8658.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term8658, term8658.getClass(), "backgroundEraseDisabled", false);
        setField(term8658, term8658.getClass(), "eventCache", null);
        setBooleanField(term8658, term8658.getClass(), "coalescingEnabled", false);
        setBooleanField(term8658, term8658.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term8658, term8658.getClass(), "componentSerializedDataVersion", 0);
        setField(term8658, term8658.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasInput", argTypes, term8658, args);
    }

};


