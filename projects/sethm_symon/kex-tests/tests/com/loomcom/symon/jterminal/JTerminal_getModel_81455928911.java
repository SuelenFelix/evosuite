package com.loomcom.symon.jterminal;

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
import static com.loomcom.symon.jterminal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JTerminal_getModel_81455928911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5579;

    public JTerminal_getModel_81455928911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5579 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term5579, term5579.getClass(), "borderWidth", 0);
        setField(term5579, term5579.getClass(), "scrollBar", null);
        setField(term5579, term5579.getClass(), "model", null);
        setField(term5579, term5579.getClass(), "font", null);
        setIntField(term5579, term5579.getClass(), "cellWidth", 0);
        setIntField(term5579, term5579.getClass(), "cellHeight", 0);
        setIntField(term5579, term5579.getClass(), "maxDescender", 0);
        setBooleanField(term5579, term5579.getClass(), "isAlignmentXSet", false);
        setFloatField(term5579, term5579.getClass(), "alignmentX", 0.0F);
        setBooleanField(term5579, term5579.getClass(), "isAlignmentYSet", false);
        setFloatField(term5579, term5579.getClass(), "alignmentY", 0.0F);
        setField(term5579, term5579.getClass(), "ui", null);
        setField(term5579, term5579.getClass(), "listenerList", null);
        setField(term5579, term5579.getClass(), "clientProperties", null);
        setField(term5579, term5579.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term5579, term5579.getClass(), "autoscrolls", false);
        setField(term5579, term5579.getClass(), "border", null);
        setIntField(term5579, term5579.getClass(), "flags", 0);
        setField(term5579, term5579.getClass(), "inputVerifier", null);
        setBooleanField(term5579, term5579.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term5579, term5579.getClass(), "paintingChild", null);
        setField(term5579, term5579.getClass(), "popupMenu", null);
        setField(term5579, term5579.getClass(), "revalidateRunnableScheduled", null);
        setField(term5579, term5579.getClass(), "focusInputMap", null);
        setField(term5579, term5579.getClass(), "ancestorInputMap", null);
        setField(term5579, term5579.getClass(), "windowInputMap", null);
        setField(term5579, term5579.getClass(), "actionMap", null);
        setField(term5579, term5579.getClass(), "aaHint", null);
        setField(term5579, term5579.getClass(), "lcdRenderingHint", null);
        setField(term5579, term5579.getClass(), "component", null);
        setField(term5579, term5579.getClass(), "layoutMgr", null);
        setField(term5579, term5579.getClass(), "dispatcher", null);
        setField(term5579, term5579.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term5579, term5579.getClass(), "focusCycleRoot", false);
        setBooleanField(term5579, term5579.getClass(), "focusTraversalPolicyProvider", false);
        setField(term5579, term5579.getClass(), "printingThreads", null);
        setBooleanField(term5579, term5579.getClass(), "printing", false);
        setField(term5579, term5579.getClass(), "containerListener", null);
        setIntField(term5579, term5579.getClass(), "listeningChildren", 0);
        setIntField(term5579, term5579.getClass(), "listeningBoundsChildren", 0);
        setIntField(term5579, term5579.getClass(), "descendantsCount", 0);
        setField(term5579, term5579.getClass(), "preserveBackgroundColor", null);
        setIntField(term5579, term5579.getClass(), "numOfHWComponents", 0);
        setIntField(term5579, term5579.getClass(), "numOfLWComponents", 0);
        setField(term5579, term5579.getClass(), "modalComp", null);
        setField(term5579, term5579.getClass(), "modalAppContext", null);
        setIntField(term5579, term5579.getClass(), "containerSerializedDataVersion", 0);
        setField(term5579, term5579.getClass(), "peer", null);
        setField(term5579, term5579.getClass(), "parent", null);
        setField(term5579, term5579.getClass(), "appContext", null);
        setIntField(term5579, term5579.getClass(), "x", 0);
        setIntField(term5579, term5579.getClass(), "y", 0);
        setIntField(term5579, term5579.getClass(), "width", 0);
        setIntField(term5579, term5579.getClass(), "height", 0);
        setField(term5579, term5579.getClass(), "foreground", null);
        setField(term5579, term5579.getClass(), "background", null);
        setField(term5579, term5579.getClass(), "peerFont", null);
        setField(term5579, term5579.getClass(), "cursor", null);
        setField(term5579, term5579.getClass(), "locale", null);
        setField(term5579, term5579.getClass(), "graphicsConfig", null);
        setField(term5579, term5579.getClass(), "bufferStrategy", null);
        setBooleanField(term5579, term5579.getClass(), "ignoreRepaint", false);
        setBooleanField(term5579, term5579.getClass(), "visible", false);
        setBooleanField(term5579, term5579.getClass(), "enabled", false);
        setBooleanField(term5579, term5579.getClass(), "valid", false);
        setField(term5579, term5579.getClass(), "dropTarget", null);
        setField(term5579, term5579.getClass(), "popups", null);
        setField(term5579, term5579.getClass(), "name", null);
        setBooleanField(term5579, term5579.getClass(), "nameExplicitlySet", false);
        setBooleanField(term5579, term5579.getClass(), "focusable", false);
        setIntField(term5579, term5579.getClass(), "isFocusTraversableOverridden", 0);
        setField(term5579, term5579.getClass(), "focusTraversalKeys", null);
        setBooleanField(term5579, term5579.getClass(), "focusTraversalKeysEnabled", false);
        setField(term5579, term5579.getClass(), "acc", null);
        setField(term5579, term5579.getClass(), "minSize", null);
        setBooleanField(term5579, term5579.getClass(), "minSizeSet", false);
        setField(term5579, term5579.getClass(), "prefSize", null);
        setBooleanField(term5579, term5579.getClass(), "prefSizeSet", false);
        setField(term5579, term5579.getClass(), "maxSize", null);
        setBooleanField(term5579, term5579.getClass(), "maxSizeSet", false);
        setField(term5579, term5579.getClass(), "componentOrientation", null);
        setBooleanField(term5579, term5579.getClass(), "newEventsOnly", false);
        setField(term5579, term5579.getClass(), "componentListener", null);
        setField(term5579, term5579.getClass(), "focusListener", null);
        setField(term5579, term5579.getClass(), "hierarchyListener", null);
        setField(term5579, term5579.getClass(), "hierarchyBoundsListener", null);
        setField(term5579, term5579.getClass(), "keyListener", null);
        setField(term5579, term5579.getClass(), "mouseListener", null);
        setField(term5579, term5579.getClass(), "mouseMotionListener", null);
        setField(term5579, term5579.getClass(), "mouseWheelListener", null);
        setField(term5579, term5579.getClass(), "inputMethodListener", null);
        setLongField(term5579, term5579.getClass(), "eventMask", 0L);
        setField(term5579, term5579.getClass(), "changeSupport", null);
        setField(term5579, term5579.getClass(), "objectLock", null);
        setBooleanField(term5579, term5579.getClass(), "isPacked", false);
        setIntField(term5579, term5579.getClass(), "boundsOp", 0);
        setField(term5579, term5579.getClass(), "compoundShape", null);
        setField(term5579, term5579.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term5579, term5579.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term5579, term5579.getClass(), "backgroundEraseDisabled", false);
        setField(term5579, term5579.getClass(), "eventCache", null);
        setBooleanField(term5579, term5579.getClass(), "coalescingEnabled", false);
        setBooleanField(term5579, term5579.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term5579, term5579.getClass(), "componentSerializedDataVersion", 0);
        setField(term5579, term5579.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getModel", argTypes, term5579, args);
    }

};


