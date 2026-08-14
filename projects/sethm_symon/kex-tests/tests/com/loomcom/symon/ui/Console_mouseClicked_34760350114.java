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

public class Console_mouseClicked_34760350114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12726;

    public Console_mouseClicked_34760350114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12726 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term12726, term12726.getClass(), "sendCrForLf", false);
        setField(term12726, term12726.getClass(), "typeAheadBuffer", null);
        setIntField(term12726, term12726.getClass(), "borderWidth", 0);
        setField(term12726, term12726.getClass(), "scrollBar", null);
        setField(term12726, term12726.getClass(), "model", null);
        setField(term12726, term12726.getClass(), "font", null);
        setIntField(term12726, term12726.getClass(), "cellWidth", 0);
        setIntField(term12726, term12726.getClass(), "cellHeight", 0);
        setIntField(term12726, term12726.getClass(), "maxDescender", 0);
        setBooleanField(term12726, term12726.getClass(), "isAlignmentXSet", false);
        setFloatField(term12726, term12726.getClass(), "alignmentX", 0.0F);
        setBooleanField(term12726, term12726.getClass(), "isAlignmentYSet", false);
        setFloatField(term12726, term12726.getClass(), "alignmentY", 0.0F);
        setField(term12726, term12726.getClass(), "ui", null);
        setField(term12726, term12726.getClass(), "listenerList", null);
        setField(term12726, term12726.getClass(), "clientProperties", null);
        setField(term12726, term12726.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term12726, term12726.getClass(), "autoscrolls", false);
        setField(term12726, term12726.getClass(), "border", null);
        setIntField(term12726, term12726.getClass(), "flags", 0);
        setField(term12726, term12726.getClass(), "inputVerifier", null);
        setBooleanField(term12726, term12726.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term12726, term12726.getClass(), "paintingChild", null);
        setField(term12726, term12726.getClass(), "popupMenu", null);
        setField(term12726, term12726.getClass(), "revalidateRunnableScheduled", null);
        setField(term12726, term12726.getClass(), "focusInputMap", null);
        setField(term12726, term12726.getClass(), "ancestorInputMap", null);
        setField(term12726, term12726.getClass(), "windowInputMap", null);
        setField(term12726, term12726.getClass(), "actionMap", null);
        setField(term12726, term12726.getClass(), "aaHint", null);
        setField(term12726, term12726.getClass(), "lcdRenderingHint", null);
        setField(term12726, term12726.getClass(), "component", null);
        setField(term12726, term12726.getClass(), "layoutMgr", null);
        setField(term12726, term12726.getClass(), "dispatcher", null);
        setField(term12726, term12726.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term12726, term12726.getClass(), "focusCycleRoot", false);
        setBooleanField(term12726, term12726.getClass(), "focusTraversalPolicyProvider", false);
        setField(term12726, term12726.getClass(), "printingThreads", null);
        setBooleanField(term12726, term12726.getClass(), "printing", false);
        setField(term12726, term12726.getClass(), "containerListener", null);
        setIntField(term12726, term12726.getClass(), "listeningChildren", 0);
        setIntField(term12726, term12726.getClass(), "listeningBoundsChildren", 0);
        setIntField(term12726, term12726.getClass(), "descendantsCount", 0);
        setField(term12726, term12726.getClass(), "preserveBackgroundColor", null);
        setIntField(term12726, term12726.getClass(), "numOfHWComponents", 0);
        setIntField(term12726, term12726.getClass(), "numOfLWComponents", 0);
        setField(term12726, term12726.getClass(), "modalComp", null);
        setField(term12726, term12726.getClass(), "modalAppContext", null);
        setIntField(term12726, term12726.getClass(), "containerSerializedDataVersion", 0);
        setField(term12726, term12726.getClass(), "peer", null);
        setField(term12726, term12726.getClass(), "parent", null);
        setField(term12726, term12726.getClass(), "appContext", null);
        setIntField(term12726, term12726.getClass(), "x", 0);
        setIntField(term12726, term12726.getClass(), "y", 0);
        setIntField(term12726, term12726.getClass(), "width", 0);
        setIntField(term12726, term12726.getClass(), "height", 0);
        setField(term12726, term12726.getClass(), "foreground", null);
        setField(term12726, term12726.getClass(), "background", null);
        setField(term12726, term12726.getClass(), "peerFont", null);
        setField(term12726, term12726.getClass(), "cursor", null);
        setField(term12726, term12726.getClass(), "locale", null);
        setField(term12726, term12726.getClass(), "graphicsConfig", null);
        setField(term12726, term12726.getClass(), "bufferStrategy", null);
        setBooleanField(term12726, term12726.getClass(), "ignoreRepaint", false);
        setBooleanField(term12726, term12726.getClass(), "visible", false);
        setBooleanField(term12726, term12726.getClass(), "enabled", false);
        setBooleanField(term12726, term12726.getClass(), "valid", false);
        setField(term12726, term12726.getClass(), "dropTarget", null);
        setField(term12726, term12726.getClass(), "popups", null);
        setField(term12726, term12726.getClass(), "name", null);
        setBooleanField(term12726, term12726.getClass(), "nameExplicitlySet", false);
        setBooleanField(term12726, term12726.getClass(), "focusable", false);
        setIntField(term12726, term12726.getClass(), "isFocusTraversableOverridden", 0);
        setField(term12726, term12726.getClass(), "focusTraversalKeys", null);
        setBooleanField(term12726, term12726.getClass(), "focusTraversalKeysEnabled", false);
        setField(term12726, term12726.getClass(), "acc", null);
        setField(term12726, term12726.getClass(), "minSize", null);
        setBooleanField(term12726, term12726.getClass(), "minSizeSet", false);
        setField(term12726, term12726.getClass(), "prefSize", null);
        setBooleanField(term12726, term12726.getClass(), "prefSizeSet", false);
        setField(term12726, term12726.getClass(), "maxSize", null);
        setBooleanField(term12726, term12726.getClass(), "maxSizeSet", false);
        setField(term12726, term12726.getClass(), "componentOrientation", null);
        setBooleanField(term12726, term12726.getClass(), "newEventsOnly", false);
        setField(term12726, term12726.getClass(), "componentListener", null);
        setField(term12726, term12726.getClass(), "focusListener", null);
        setField(term12726, term12726.getClass(), "hierarchyListener", null);
        setField(term12726, term12726.getClass(), "hierarchyBoundsListener", null);
        setField(term12726, term12726.getClass(), "keyListener", null);
        setField(term12726, term12726.getClass(), "mouseListener", null);
        setField(term12726, term12726.getClass(), "mouseMotionListener", null);
        setField(term12726, term12726.getClass(), "mouseWheelListener", null);
        setField(term12726, term12726.getClass(), "inputMethodListener", null);
        setLongField(term12726, term12726.getClass(), "eventMask", 0L);
        setField(term12726, term12726.getClass(), "changeSupport", null);
        setField(term12726, term12726.getClass(), "objectLock", null);
        setBooleanField(term12726, term12726.getClass(), "isPacked", false);
        setIntField(term12726, term12726.getClass(), "boundsOp", 0);
        setField(term12726, term12726.getClass(), "compoundShape", null);
        setField(term12726, term12726.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term12726, term12726.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term12726, term12726.getClass(), "backgroundEraseDisabled", false);
        setField(term12726, term12726.getClass(), "eventCache", null);
        setBooleanField(term12726, term12726.getClass(), "coalescingEnabled", false);
        setBooleanField(term12726, term12726.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term12726, term12726.getClass(), "componentSerializedDataVersion", 0);
        setField(term12726, term12726.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseClicked", argTypes, term12726, args);
    }

};


