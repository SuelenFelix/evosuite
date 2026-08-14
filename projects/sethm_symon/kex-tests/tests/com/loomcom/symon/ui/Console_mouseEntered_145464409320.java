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

public class Console_mouseEntered_145464409320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15216;

    public Console_mouseEntered_145464409320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15216 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term15216, term15216.getClass(), "sendCrForLf", false);
        setField(term15216, term15216.getClass(), "typeAheadBuffer", null);
        setIntField(term15216, term15216.getClass(), "borderWidth", 0);
        setField(term15216, term15216.getClass(), "scrollBar", null);
        setField(term15216, term15216.getClass(), "model", null);
        setField(term15216, term15216.getClass(), "font", null);
        setIntField(term15216, term15216.getClass(), "cellWidth", 0);
        setIntField(term15216, term15216.getClass(), "cellHeight", 0);
        setIntField(term15216, term15216.getClass(), "maxDescender", 0);
        setBooleanField(term15216, term15216.getClass(), "isAlignmentXSet", false);
        setFloatField(term15216, term15216.getClass(), "alignmentX", 0.0F);
        setBooleanField(term15216, term15216.getClass(), "isAlignmentYSet", false);
        setFloatField(term15216, term15216.getClass(), "alignmentY", 0.0F);
        setField(term15216, term15216.getClass(), "ui", null);
        setField(term15216, term15216.getClass(), "listenerList", null);
        setField(term15216, term15216.getClass(), "clientProperties", null);
        setField(term15216, term15216.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term15216, term15216.getClass(), "autoscrolls", false);
        setField(term15216, term15216.getClass(), "border", null);
        setIntField(term15216, term15216.getClass(), "flags", 0);
        setField(term15216, term15216.getClass(), "inputVerifier", null);
        setBooleanField(term15216, term15216.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term15216, term15216.getClass(), "paintingChild", null);
        setField(term15216, term15216.getClass(), "popupMenu", null);
        setField(term15216, term15216.getClass(), "revalidateRunnableScheduled", null);
        setField(term15216, term15216.getClass(), "focusInputMap", null);
        setField(term15216, term15216.getClass(), "ancestorInputMap", null);
        setField(term15216, term15216.getClass(), "windowInputMap", null);
        setField(term15216, term15216.getClass(), "actionMap", null);
        setField(term15216, term15216.getClass(), "aaHint", null);
        setField(term15216, term15216.getClass(), "lcdRenderingHint", null);
        setField(term15216, term15216.getClass(), "component", null);
        setField(term15216, term15216.getClass(), "layoutMgr", null);
        setField(term15216, term15216.getClass(), "dispatcher", null);
        setField(term15216, term15216.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term15216, term15216.getClass(), "focusCycleRoot", false);
        setBooleanField(term15216, term15216.getClass(), "focusTraversalPolicyProvider", false);
        setField(term15216, term15216.getClass(), "printingThreads", null);
        setBooleanField(term15216, term15216.getClass(), "printing", false);
        setField(term15216, term15216.getClass(), "containerListener", null);
        setIntField(term15216, term15216.getClass(), "listeningChildren", 0);
        setIntField(term15216, term15216.getClass(), "listeningBoundsChildren", 0);
        setIntField(term15216, term15216.getClass(), "descendantsCount", 0);
        setField(term15216, term15216.getClass(), "preserveBackgroundColor", null);
        setIntField(term15216, term15216.getClass(), "numOfHWComponents", 0);
        setIntField(term15216, term15216.getClass(), "numOfLWComponents", 0);
        setField(term15216, term15216.getClass(), "modalComp", null);
        setField(term15216, term15216.getClass(), "modalAppContext", null);
        setIntField(term15216, term15216.getClass(), "containerSerializedDataVersion", 0);
        setField(term15216, term15216.getClass(), "peer", null);
        setField(term15216, term15216.getClass(), "parent", null);
        setField(term15216, term15216.getClass(), "appContext", null);
        setIntField(term15216, term15216.getClass(), "x", 0);
        setIntField(term15216, term15216.getClass(), "y", 0);
        setIntField(term15216, term15216.getClass(), "width", 0);
        setIntField(term15216, term15216.getClass(), "height", 0);
        setField(term15216, term15216.getClass(), "foreground", null);
        setField(term15216, term15216.getClass(), "background", null);
        setField(term15216, term15216.getClass(), "peerFont", null);
        setField(term15216, term15216.getClass(), "cursor", null);
        setField(term15216, term15216.getClass(), "locale", null);
        setField(term15216, term15216.getClass(), "graphicsConfig", null);
        setField(term15216, term15216.getClass(), "bufferStrategy", null);
        setBooleanField(term15216, term15216.getClass(), "ignoreRepaint", false);
        setBooleanField(term15216, term15216.getClass(), "visible", false);
        setBooleanField(term15216, term15216.getClass(), "enabled", false);
        setBooleanField(term15216, term15216.getClass(), "valid", false);
        setField(term15216, term15216.getClass(), "dropTarget", null);
        setField(term15216, term15216.getClass(), "popups", null);
        setField(term15216, term15216.getClass(), "name", null);
        setBooleanField(term15216, term15216.getClass(), "nameExplicitlySet", false);
        setBooleanField(term15216, term15216.getClass(), "focusable", false);
        setIntField(term15216, term15216.getClass(), "isFocusTraversableOverridden", 0);
        setField(term15216, term15216.getClass(), "focusTraversalKeys", null);
        setBooleanField(term15216, term15216.getClass(), "focusTraversalKeysEnabled", false);
        setField(term15216, term15216.getClass(), "acc", null);
        setField(term15216, term15216.getClass(), "minSize", null);
        setBooleanField(term15216, term15216.getClass(), "minSizeSet", false);
        setField(term15216, term15216.getClass(), "prefSize", null);
        setBooleanField(term15216, term15216.getClass(), "prefSizeSet", false);
        setField(term15216, term15216.getClass(), "maxSize", null);
        setBooleanField(term15216, term15216.getClass(), "maxSizeSet", false);
        setField(term15216, term15216.getClass(), "componentOrientation", null);
        setBooleanField(term15216, term15216.getClass(), "newEventsOnly", false);
        setField(term15216, term15216.getClass(), "componentListener", null);
        setField(term15216, term15216.getClass(), "focusListener", null);
        setField(term15216, term15216.getClass(), "hierarchyListener", null);
        setField(term15216, term15216.getClass(), "hierarchyBoundsListener", null);
        setField(term15216, term15216.getClass(), "keyListener", null);
        setField(term15216, term15216.getClass(), "mouseListener", null);
        setField(term15216, term15216.getClass(), "mouseMotionListener", null);
        setField(term15216, term15216.getClass(), "mouseWheelListener", null);
        setField(term15216, term15216.getClass(), "inputMethodListener", null);
        setLongField(term15216, term15216.getClass(), "eventMask", 0L);
        setField(term15216, term15216.getClass(), "changeSupport", null);
        setField(term15216, term15216.getClass(), "objectLock", null);
        setBooleanField(term15216, term15216.getClass(), "isPacked", false);
        setIntField(term15216, term15216.getClass(), "boundsOp", 0);
        setField(term15216, term15216.getClass(), "compoundShape", null);
        setField(term15216, term15216.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term15216, term15216.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term15216, term15216.getClass(), "backgroundEraseDisabled", false);
        setField(term15216, term15216.getClass(), "eventCache", null);
        setBooleanField(term15216, term15216.getClass(), "coalescingEnabled", false);
        setBooleanField(term15216, term15216.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term15216, term15216.getClass(), "componentSerializedDataVersion", 0);
        setField(term15216, term15216.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.MouseEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "mouseEntered", argTypes, term15216, args);
    }

};


