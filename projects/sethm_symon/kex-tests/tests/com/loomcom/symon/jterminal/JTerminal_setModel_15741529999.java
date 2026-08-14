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

public class JTerminal_setModel_15741529999 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4850;

    public JTerminal_setModel_15741529999() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4850 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term4850, term4850.getClass(), "borderWidth", 0);
        setField(term4850, term4850.getClass(), "scrollBar", null);
        setField(term4850, term4850.getClass(), "model", null);
        setField(term4850, term4850.getClass(), "font", null);
        setIntField(term4850, term4850.getClass(), "cellWidth", 0);
        setIntField(term4850, term4850.getClass(), "cellHeight", 0);
        setIntField(term4850, term4850.getClass(), "maxDescender", 0);
        setBooleanField(term4850, term4850.getClass(), "isAlignmentXSet", false);
        setFloatField(term4850, term4850.getClass(), "alignmentX", 0.0F);
        setBooleanField(term4850, term4850.getClass(), "isAlignmentYSet", false);
        setFloatField(term4850, term4850.getClass(), "alignmentY", 0.0F);
        setField(term4850, term4850.getClass(), "ui", null);
        setField(term4850, term4850.getClass(), "listenerList", null);
        setField(term4850, term4850.getClass(), "clientProperties", null);
        setField(term4850, term4850.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term4850, term4850.getClass(), "autoscrolls", false);
        setField(term4850, term4850.getClass(), "border", null);
        setIntField(term4850, term4850.getClass(), "flags", 0);
        setField(term4850, term4850.getClass(), "inputVerifier", null);
        setBooleanField(term4850, term4850.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term4850, term4850.getClass(), "paintingChild", null);
        setField(term4850, term4850.getClass(), "popupMenu", null);
        setField(term4850, term4850.getClass(), "revalidateRunnableScheduled", null);
        setField(term4850, term4850.getClass(), "focusInputMap", null);
        setField(term4850, term4850.getClass(), "ancestorInputMap", null);
        setField(term4850, term4850.getClass(), "windowInputMap", null);
        setField(term4850, term4850.getClass(), "actionMap", null);
        setField(term4850, term4850.getClass(), "aaHint", null);
        setField(term4850, term4850.getClass(), "lcdRenderingHint", null);
        setField(term4850, term4850.getClass(), "component", null);
        setField(term4850, term4850.getClass(), "layoutMgr", null);
        setField(term4850, term4850.getClass(), "dispatcher", null);
        setField(term4850, term4850.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term4850, term4850.getClass(), "focusCycleRoot", false);
        setBooleanField(term4850, term4850.getClass(), "focusTraversalPolicyProvider", false);
        setField(term4850, term4850.getClass(), "printingThreads", null);
        setBooleanField(term4850, term4850.getClass(), "printing", false);
        setField(term4850, term4850.getClass(), "containerListener", null);
        setIntField(term4850, term4850.getClass(), "listeningChildren", 0);
        setIntField(term4850, term4850.getClass(), "listeningBoundsChildren", 0);
        setIntField(term4850, term4850.getClass(), "descendantsCount", 0);
        setField(term4850, term4850.getClass(), "preserveBackgroundColor", null);
        setIntField(term4850, term4850.getClass(), "numOfHWComponents", 0);
        setIntField(term4850, term4850.getClass(), "numOfLWComponents", 0);
        setField(term4850, term4850.getClass(), "modalComp", null);
        setField(term4850, term4850.getClass(), "modalAppContext", null);
        setIntField(term4850, term4850.getClass(), "containerSerializedDataVersion", 0);
        setField(term4850, term4850.getClass(), "peer", null);
        setField(term4850, term4850.getClass(), "parent", null);
        setField(term4850, term4850.getClass(), "appContext", null);
        setIntField(term4850, term4850.getClass(), "x", 0);
        setIntField(term4850, term4850.getClass(), "y", 0);
        setIntField(term4850, term4850.getClass(), "width", 0);
        setIntField(term4850, term4850.getClass(), "height", 0);
        setField(term4850, term4850.getClass(), "foreground", null);
        setField(term4850, term4850.getClass(), "background", null);
        setField(term4850, term4850.getClass(), "peerFont", null);
        setField(term4850, term4850.getClass(), "cursor", null);
        setField(term4850, term4850.getClass(), "locale", null);
        setField(term4850, term4850.getClass(), "graphicsConfig", null);
        setField(term4850, term4850.getClass(), "bufferStrategy", null);
        setBooleanField(term4850, term4850.getClass(), "ignoreRepaint", false);
        setBooleanField(term4850, term4850.getClass(), "visible", false);
        setBooleanField(term4850, term4850.getClass(), "enabled", false);
        setBooleanField(term4850, term4850.getClass(), "valid", false);
        setField(term4850, term4850.getClass(), "dropTarget", null);
        setField(term4850, term4850.getClass(), "popups", null);
        setField(term4850, term4850.getClass(), "name", null);
        setBooleanField(term4850, term4850.getClass(), "nameExplicitlySet", false);
        setBooleanField(term4850, term4850.getClass(), "focusable", false);
        setIntField(term4850, term4850.getClass(), "isFocusTraversableOverridden", 0);
        setField(term4850, term4850.getClass(), "focusTraversalKeys", null);
        setBooleanField(term4850, term4850.getClass(), "focusTraversalKeysEnabled", false);
        setField(term4850, term4850.getClass(), "acc", null);
        setField(term4850, term4850.getClass(), "minSize", null);
        setBooleanField(term4850, term4850.getClass(), "minSizeSet", false);
        setField(term4850, term4850.getClass(), "prefSize", null);
        setBooleanField(term4850, term4850.getClass(), "prefSizeSet", false);
        setField(term4850, term4850.getClass(), "maxSize", null);
        setBooleanField(term4850, term4850.getClass(), "maxSizeSet", false);
        setField(term4850, term4850.getClass(), "componentOrientation", null);
        setBooleanField(term4850, term4850.getClass(), "newEventsOnly", false);
        setField(term4850, term4850.getClass(), "componentListener", null);
        setField(term4850, term4850.getClass(), "focusListener", null);
        setField(term4850, term4850.getClass(), "hierarchyListener", null);
        setField(term4850, term4850.getClass(), "hierarchyBoundsListener", null);
        setField(term4850, term4850.getClass(), "keyListener", null);
        setField(term4850, term4850.getClass(), "mouseListener", null);
        setField(term4850, term4850.getClass(), "mouseMotionListener", null);
        setField(term4850, term4850.getClass(), "mouseWheelListener", null);
        setField(term4850, term4850.getClass(), "inputMethodListener", null);
        setLongField(term4850, term4850.getClass(), "eventMask", 0L);
        setField(term4850, term4850.getClass(), "changeSupport", null);
        setField(term4850, term4850.getClass(), "objectLock", null);
        setBooleanField(term4850, term4850.getClass(), "isPacked", false);
        setIntField(term4850, term4850.getClass(), "boundsOp", 0);
        setField(term4850, term4850.getClass(), "compoundShape", null);
        setField(term4850, term4850.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term4850, term4850.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term4850, term4850.getClass(), "backgroundEraseDisabled", false);
        setField(term4850, term4850.getClass(), "eventCache", null);
        setBooleanField(term4850, term4850.getClass(), "coalescingEnabled", false);
        setBooleanField(term4850, term4850.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term4850, term4850.getClass(), "componentSerializedDataVersion", 0);
        setField(term4850, term4850.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.jterminal.TerminalModel");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setModel", argTypes, term4850, args);
    }

};


