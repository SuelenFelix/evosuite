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

public class JTerminal_paint_118332375721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9486;

    public JTerminal_paint_118332375721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9486 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term9486, term9486.getClass(), "borderWidth", 0);
        setField(term9486, term9486.getClass(), "scrollBar", null);
        setField(term9486, term9486.getClass(), "model", null);
        setField(term9486, term9486.getClass(), "font", null);
        setIntField(term9486, term9486.getClass(), "cellWidth", 0);
        setIntField(term9486, term9486.getClass(), "cellHeight", 0);
        setIntField(term9486, term9486.getClass(), "maxDescender", 0);
        setBooleanField(term9486, term9486.getClass(), "isAlignmentXSet", false);
        setFloatField(term9486, term9486.getClass(), "alignmentX", 0.0F);
        setBooleanField(term9486, term9486.getClass(), "isAlignmentYSet", false);
        setFloatField(term9486, term9486.getClass(), "alignmentY", 0.0F);
        setField(term9486, term9486.getClass(), "ui", null);
        setField(term9486, term9486.getClass(), "listenerList", null);
        setField(term9486, term9486.getClass(), "clientProperties", null);
        setField(term9486, term9486.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term9486, term9486.getClass(), "autoscrolls", false);
        setField(term9486, term9486.getClass(), "border", null);
        setIntField(term9486, term9486.getClass(), "flags", 0);
        setField(term9486, term9486.getClass(), "inputVerifier", null);
        setBooleanField(term9486, term9486.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term9486, term9486.getClass(), "paintingChild", null);
        setField(term9486, term9486.getClass(), "popupMenu", null);
        setField(term9486, term9486.getClass(), "revalidateRunnableScheduled", null);
        setField(term9486, term9486.getClass(), "focusInputMap", null);
        setField(term9486, term9486.getClass(), "ancestorInputMap", null);
        setField(term9486, term9486.getClass(), "windowInputMap", null);
        setField(term9486, term9486.getClass(), "actionMap", null);
        setField(term9486, term9486.getClass(), "aaHint", null);
        setField(term9486, term9486.getClass(), "lcdRenderingHint", null);
        setField(term9486, term9486.getClass(), "component", null);
        setField(term9486, term9486.getClass(), "layoutMgr", null);
        setField(term9486, term9486.getClass(), "dispatcher", null);
        setField(term9486, term9486.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term9486, term9486.getClass(), "focusCycleRoot", false);
        setBooleanField(term9486, term9486.getClass(), "focusTraversalPolicyProvider", false);
        setField(term9486, term9486.getClass(), "printingThreads", null);
        setBooleanField(term9486, term9486.getClass(), "printing", false);
        setField(term9486, term9486.getClass(), "containerListener", null);
        setIntField(term9486, term9486.getClass(), "listeningChildren", 0);
        setIntField(term9486, term9486.getClass(), "listeningBoundsChildren", 0);
        setIntField(term9486, term9486.getClass(), "descendantsCount", 0);
        setField(term9486, term9486.getClass(), "preserveBackgroundColor", null);
        setIntField(term9486, term9486.getClass(), "numOfHWComponents", 0);
        setIntField(term9486, term9486.getClass(), "numOfLWComponents", 0);
        setField(term9486, term9486.getClass(), "modalComp", null);
        setField(term9486, term9486.getClass(), "modalAppContext", null);
        setIntField(term9486, term9486.getClass(), "containerSerializedDataVersion", 0);
        setField(term9486, term9486.getClass(), "peer", null);
        setField(term9486, term9486.getClass(), "parent", null);
        setField(term9486, term9486.getClass(), "appContext", null);
        setIntField(term9486, term9486.getClass(), "x", 0);
        setIntField(term9486, term9486.getClass(), "y", 0);
        setIntField(term9486, term9486.getClass(), "width", 0);
        setIntField(term9486, term9486.getClass(), "height", 0);
        setField(term9486, term9486.getClass(), "foreground", null);
        setField(term9486, term9486.getClass(), "background", null);
        setField(term9486, term9486.getClass(), "peerFont", null);
        setField(term9486, term9486.getClass(), "cursor", null);
        setField(term9486, term9486.getClass(), "locale", null);
        setField(term9486, term9486.getClass(), "graphicsConfig", null);
        setField(term9486, term9486.getClass(), "bufferStrategy", null);
        setBooleanField(term9486, term9486.getClass(), "ignoreRepaint", false);
        setBooleanField(term9486, term9486.getClass(), "visible", false);
        setBooleanField(term9486, term9486.getClass(), "enabled", false);
        setBooleanField(term9486, term9486.getClass(), "valid", false);
        setField(term9486, term9486.getClass(), "dropTarget", null);
        setField(term9486, term9486.getClass(), "popups", null);
        setField(term9486, term9486.getClass(), "name", null);
        setBooleanField(term9486, term9486.getClass(), "nameExplicitlySet", false);
        setBooleanField(term9486, term9486.getClass(), "focusable", false);
        setIntField(term9486, term9486.getClass(), "isFocusTraversableOverridden", 0);
        setField(term9486, term9486.getClass(), "focusTraversalKeys", null);
        setBooleanField(term9486, term9486.getClass(), "focusTraversalKeysEnabled", false);
        setField(term9486, term9486.getClass(), "acc", null);
        setField(term9486, term9486.getClass(), "minSize", null);
        setBooleanField(term9486, term9486.getClass(), "minSizeSet", false);
        setField(term9486, term9486.getClass(), "prefSize", null);
        setBooleanField(term9486, term9486.getClass(), "prefSizeSet", false);
        setField(term9486, term9486.getClass(), "maxSize", null);
        setBooleanField(term9486, term9486.getClass(), "maxSizeSet", false);
        setField(term9486, term9486.getClass(), "componentOrientation", null);
        setBooleanField(term9486, term9486.getClass(), "newEventsOnly", false);
        setField(term9486, term9486.getClass(), "componentListener", null);
        setField(term9486, term9486.getClass(), "focusListener", null);
        setField(term9486, term9486.getClass(), "hierarchyListener", null);
        setField(term9486, term9486.getClass(), "hierarchyBoundsListener", null);
        setField(term9486, term9486.getClass(), "keyListener", null);
        setField(term9486, term9486.getClass(), "mouseListener", null);
        setField(term9486, term9486.getClass(), "mouseMotionListener", null);
        setField(term9486, term9486.getClass(), "mouseWheelListener", null);
        setField(term9486, term9486.getClass(), "inputMethodListener", null);
        setLongField(term9486, term9486.getClass(), "eventMask", 0L);
        setField(term9486, term9486.getClass(), "changeSupport", null);
        setField(term9486, term9486.getClass(), "objectLock", null);
        setBooleanField(term9486, term9486.getClass(), "isPacked", false);
        setIntField(term9486, term9486.getClass(), "boundsOp", 0);
        setField(term9486, term9486.getClass(), "compoundShape", null);
        setField(term9486, term9486.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term9486, term9486.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term9486, term9486.getClass(), "backgroundEraseDisabled", false);
        setField(term9486, term9486.getClass(), "eventCache", null);
        setBooleanField(term9486, term9486.getClass(), "coalescingEnabled", false);
        setBooleanField(term9486, term9486.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term9486, term9486.getClass(), "componentSerializedDataVersion", 0);
        setField(term9486, term9486.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paint", argTypes, term9486, args);
    }

};


