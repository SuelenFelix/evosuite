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

public class JTerminal_setCellWidthAndHeight_104634107525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11018;

    public JTerminal_setCellWidthAndHeight_104634107525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11018 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term11018, term11018.getClass(), "borderWidth", 0);
        setField(term11018, term11018.getClass(), "scrollBar", null);
        setField(term11018, term11018.getClass(), "model", null);
        setField(term11018, term11018.getClass(), "font", null);
        setIntField(term11018, term11018.getClass(), "cellWidth", 0);
        setIntField(term11018, term11018.getClass(), "cellHeight", 0);
        setIntField(term11018, term11018.getClass(), "maxDescender", 0);
        setBooleanField(term11018, term11018.getClass(), "isAlignmentXSet", false);
        setFloatField(term11018, term11018.getClass(), "alignmentX", 0.0F);
        setBooleanField(term11018, term11018.getClass(), "isAlignmentYSet", false);
        setFloatField(term11018, term11018.getClass(), "alignmentY", 0.0F);
        setField(term11018, term11018.getClass(), "ui", null);
        setField(term11018, term11018.getClass(), "listenerList", null);
        setField(term11018, term11018.getClass(), "clientProperties", null);
        setField(term11018, term11018.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term11018, term11018.getClass(), "autoscrolls", false);
        setField(term11018, term11018.getClass(), "border", null);
        setIntField(term11018, term11018.getClass(), "flags", 0);
        setField(term11018, term11018.getClass(), "inputVerifier", null);
        setBooleanField(term11018, term11018.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term11018, term11018.getClass(), "paintingChild", null);
        setField(term11018, term11018.getClass(), "popupMenu", null);
        setField(term11018, term11018.getClass(), "revalidateRunnableScheduled", null);
        setField(term11018, term11018.getClass(), "focusInputMap", null);
        setField(term11018, term11018.getClass(), "ancestorInputMap", null);
        setField(term11018, term11018.getClass(), "windowInputMap", null);
        setField(term11018, term11018.getClass(), "actionMap", null);
        setField(term11018, term11018.getClass(), "aaHint", null);
        setField(term11018, term11018.getClass(), "lcdRenderingHint", null);
        setField(term11018, term11018.getClass(), "component", null);
        setField(term11018, term11018.getClass(), "layoutMgr", null);
        setField(term11018, term11018.getClass(), "dispatcher", null);
        setField(term11018, term11018.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term11018, term11018.getClass(), "focusCycleRoot", false);
        setBooleanField(term11018, term11018.getClass(), "focusTraversalPolicyProvider", false);
        setField(term11018, term11018.getClass(), "printingThreads", null);
        setBooleanField(term11018, term11018.getClass(), "printing", false);
        setField(term11018, term11018.getClass(), "containerListener", null);
        setIntField(term11018, term11018.getClass(), "listeningChildren", 0);
        setIntField(term11018, term11018.getClass(), "listeningBoundsChildren", 0);
        setIntField(term11018, term11018.getClass(), "descendantsCount", 0);
        setField(term11018, term11018.getClass(), "preserveBackgroundColor", null);
        setIntField(term11018, term11018.getClass(), "numOfHWComponents", 0);
        setIntField(term11018, term11018.getClass(), "numOfLWComponents", 0);
        setField(term11018, term11018.getClass(), "modalComp", null);
        setField(term11018, term11018.getClass(), "modalAppContext", null);
        setIntField(term11018, term11018.getClass(), "containerSerializedDataVersion", 0);
        setField(term11018, term11018.getClass(), "peer", null);
        setField(term11018, term11018.getClass(), "parent", null);
        setField(term11018, term11018.getClass(), "appContext", null);
        setIntField(term11018, term11018.getClass(), "x", 0);
        setIntField(term11018, term11018.getClass(), "y", 0);
        setIntField(term11018, term11018.getClass(), "width", 0);
        setIntField(term11018, term11018.getClass(), "height", 0);
        setField(term11018, term11018.getClass(), "foreground", null);
        setField(term11018, term11018.getClass(), "background", null);
        setField(term11018, term11018.getClass(), "peerFont", null);
        setField(term11018, term11018.getClass(), "cursor", null);
        setField(term11018, term11018.getClass(), "locale", null);
        setField(term11018, term11018.getClass(), "graphicsConfig", null);
        setField(term11018, term11018.getClass(), "bufferStrategy", null);
        setBooleanField(term11018, term11018.getClass(), "ignoreRepaint", false);
        setBooleanField(term11018, term11018.getClass(), "visible", false);
        setBooleanField(term11018, term11018.getClass(), "enabled", false);
        setBooleanField(term11018, term11018.getClass(), "valid", false);
        setField(term11018, term11018.getClass(), "dropTarget", null);
        setField(term11018, term11018.getClass(), "popups", null);
        setField(term11018, term11018.getClass(), "name", null);
        setBooleanField(term11018, term11018.getClass(), "nameExplicitlySet", false);
        setBooleanField(term11018, term11018.getClass(), "focusable", false);
        setIntField(term11018, term11018.getClass(), "isFocusTraversableOverridden", 0);
        setField(term11018, term11018.getClass(), "focusTraversalKeys", null);
        setBooleanField(term11018, term11018.getClass(), "focusTraversalKeysEnabled", false);
        setField(term11018, term11018.getClass(), "acc", null);
        setField(term11018, term11018.getClass(), "minSize", null);
        setBooleanField(term11018, term11018.getClass(), "minSizeSet", false);
        setField(term11018, term11018.getClass(), "prefSize", null);
        setBooleanField(term11018, term11018.getClass(), "prefSizeSet", false);
        setField(term11018, term11018.getClass(), "maxSize", null);
        setBooleanField(term11018, term11018.getClass(), "maxSizeSet", false);
        setField(term11018, term11018.getClass(), "componentOrientation", null);
        setBooleanField(term11018, term11018.getClass(), "newEventsOnly", false);
        setField(term11018, term11018.getClass(), "componentListener", null);
        setField(term11018, term11018.getClass(), "focusListener", null);
        setField(term11018, term11018.getClass(), "hierarchyListener", null);
        setField(term11018, term11018.getClass(), "hierarchyBoundsListener", null);
        setField(term11018, term11018.getClass(), "keyListener", null);
        setField(term11018, term11018.getClass(), "mouseListener", null);
        setField(term11018, term11018.getClass(), "mouseMotionListener", null);
        setField(term11018, term11018.getClass(), "mouseWheelListener", null);
        setField(term11018, term11018.getClass(), "inputMethodListener", null);
        setLongField(term11018, term11018.getClass(), "eventMask", 0L);
        setField(term11018, term11018.getClass(), "changeSupport", null);
        setField(term11018, term11018.getClass(), "objectLock", null);
        setBooleanField(term11018, term11018.getClass(), "isPacked", false);
        setIntField(term11018, term11018.getClass(), "boundsOp", 0);
        setField(term11018, term11018.getClass(), "compoundShape", null);
        setField(term11018, term11018.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term11018, term11018.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term11018, term11018.getClass(), "backgroundEraseDisabled", false);
        setField(term11018, term11018.getClass(), "eventCache", null);
        setBooleanField(term11018, term11018.getClass(), "coalescingEnabled", false);
        setBooleanField(term11018, term11018.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term11018, term11018.getClass(), "componentSerializedDataVersion", 0);
        setField(term11018, term11018.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setCellWidthAndHeight", argTypes, term11018, args);
    }

};


