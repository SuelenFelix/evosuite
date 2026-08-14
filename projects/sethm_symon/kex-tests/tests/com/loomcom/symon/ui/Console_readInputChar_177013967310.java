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

public class Console_readInputChar_177013967310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11040;

    public Console_readInputChar_177013967310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11040 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term11040, term11040.getClass(), "sendCrForLf", false);
        setField(term11040, term11040.getClass(), "typeAheadBuffer", null);
        setIntField(term11040, term11040.getClass(), "borderWidth", 0);
        setField(term11040, term11040.getClass(), "scrollBar", null);
        setField(term11040, term11040.getClass(), "model", null);
        setField(term11040, term11040.getClass(), "font", null);
        setIntField(term11040, term11040.getClass(), "cellWidth", 0);
        setIntField(term11040, term11040.getClass(), "cellHeight", 0);
        setIntField(term11040, term11040.getClass(), "maxDescender", 0);
        setBooleanField(term11040, term11040.getClass(), "isAlignmentXSet", false);
        setFloatField(term11040, term11040.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11040, term11040.getClass(), "isAlignmentYSet", false);
        setFloatField(term11040, term11040.getClass(), "alignmentY", 0.0F);
        setField(term11040, term11040.getClass(), "ui", null);
        setField(term11040, term11040.getClass(), "listenerList", null);
        setField(term11040, term11040.getClass(), "clientProperties", null);
        setField(term11040, term11040.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11040, term11040.getClass(), "autoscrolls", false);
        setField(term11040, term11040.getClass(), "border", null);
        setIntField(term11040, term11040.getClass(), "flags", 0);
        setField(term11040, term11040.getClass(), "inputVerifier", null);
        setBooleanField(term11040, term11040.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11040, term11040.getClass(), "paintingChild", null);
        setField(term11040, term11040.getClass(), "popupMenu", null);
        setField(term11040, term11040.getClass(), "revalidateRunnableScheduled", null);
        setField(term11040, term11040.getClass(), "focusInputMap", null);
        setField(term11040, term11040.getClass(), "ancestorInputMap", null);
        setField(term11040, term11040.getClass(), "windowInputMap", null);
        setField(term11040, term11040.getClass(), "actionMap", null);
        setField(term11040, term11040.getClass(), "aaHint", null);
        setField(term11040, term11040.getClass(), "lcdRenderingHint", null);
        setField(term11040, term11040.getClass(), "component", null);
        setField(term11040, term11040.getClass(), "layoutMgr", null);
        setField(term11040, term11040.getClass(), "dispatcher", null);
        setField(term11040, term11040.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11040, term11040.getClass(), "focusCycleRoot", false);
        setBooleanField(term11040, term11040.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11040, term11040.getClass(), "printingThreads", null);
        setBooleanField(term11040, term11040.getClass(), "printing", false);
        setField(term11040, term11040.getClass(), "containerListener", null);
        setIntField(term11040, term11040.getClass(), "listeningChildren", 0);
        setIntField(term11040, term11040.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11040, term11040.getClass(), "descendantsCount", 0);
        setField(term11040, term11040.getClass(), "preserveBackgroundColor", null);
        setIntField(term11040, term11040.getClass(), "numOfHWComponents", 0);
        setIntField(term11040, term11040.getClass(), "numOfLWComponents", 0);
        setField(term11040, term11040.getClass(), "modalComp", null);
        setField(term11040, term11040.getClass(), "modalAppContext", null);
        setIntField(term11040, term11040.getClass(), "containerSerializedDataVersion", 0);
        setField(term11040, term11040.getClass(), "peer", null);
        setField(term11040, term11040.getClass(), "parent", null);
        setField(term11040, term11040.getClass(), "appContext", null);
        setIntField(term11040, term11040.getClass(), "x", 0);
        setIntField(term11040, term11040.getClass(), "y", 0);
        setIntField(term11040, term11040.getClass(), "width", 0);
        setIntField(term11040, term11040.getClass(), "height", 0);
        setField(term11040, term11040.getClass(), "foreground", null);
        setField(term11040, term11040.getClass(), "background", null);
        setField(term11040, term11040.getClass(), "peerFont", null);
        setField(term11040, term11040.getClass(), "cursor", null);
        setField(term11040, term11040.getClass(), "locale", null);
        setField(term11040, term11040.getClass(), "graphicsConfig", null);
        setField(term11040, term11040.getClass(), "bufferStrategy", null);
        setBooleanField(term11040, term11040.getClass(), "ignoreRepaint", false);
        setBooleanField(term11040, term11040.getClass(), "visible", false);
        setBooleanField(term11040, term11040.getClass(), "enabled", false);
        setBooleanField(term11040, term11040.getClass(), "valid", false);
        setField(term11040, term11040.getClass(), "dropTarget", null);
        setField(term11040, term11040.getClass(), "popups", null);
        setField(term11040, term11040.getClass(), "name", null);
        setBooleanField(term11040, term11040.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11040, term11040.getClass(), "focusable", false);
        setIntField(term11040, term11040.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11040, term11040.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11040, term11040.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11040, term11040.getClass(), "acc", null);
        setField(term11040, term11040.getClass(), "minSize", null);
        setBooleanField(term11040, term11040.getClass(), "minSizeSet", false);
        setField(term11040, term11040.getClass(), "prefSize", null);
        setBooleanField(term11040, term11040.getClass(), "prefSizeSet", false);
        setField(term11040, term11040.getClass(), "maxSize", null);
        setBooleanField(term11040, term11040.getClass(), "maxSizeSet", false);
        setField(term11040, term11040.getClass(), "componentOrientation", null);
        setBooleanField(term11040, term11040.getClass(), "newEventsOnly", false);
        setField(term11040, term11040.getClass(), "componentListener", null);
        setField(term11040, term11040.getClass(), "focusListener", null);
        setField(term11040, term11040.getClass(), "hierarchyListener", null);
        setField(term11040, term11040.getClass(), "hierarchyBoundsListener", null);
        setField(term11040, term11040.getClass(), "keyListener", null);
        setField(term11040, term11040.getClass(), "mouseListener", null);
        setField(term11040, term11040.getClass(), "mouseMotionListener", null);
        setField(term11040, term11040.getClass(), "mouseWheelListener", null);
        setField(term11040, term11040.getClass(), "inputMethodListener", null);
        setLongField(term11040, term11040.getClass(), "eventMask", 0L);
        setField(term11040, term11040.getClass(), "changeSupport", null);
        setField(term11040, term11040.getClass(), "objectLock", null);
        setBooleanField(term11040, term11040.getClass(), "isPacked", false);
        setIntField(term11040, term11040.getClass(), "boundsOp", 0);
        setField(term11040, term11040.getClass(), "compoundShape", null);
        setField(term11040, term11040.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11040, term11040.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11040, term11040.getClass(), "backgroundEraseDisabled", false);
        setField(term11040, term11040.getClass(), "eventCache", null);
        setBooleanField(term11040, term11040.getClass(), "coalescingEnabled", false);
        setBooleanField(term11040, term11040.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11040, term11040.getClass(), "componentSerializedDataVersion", 0);
        setField(term11040, term11040.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readInputChar", argTypes, term11040, args);
    }

};


