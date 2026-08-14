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

public class JTerminal_print_44158719413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6423;

    public JTerminal_print_44158719413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6423 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term6423, term6423.getClass(), "borderWidth", 0);
        setField(term6423, term6423.getClass(), "scrollBar", null);
        setField(term6423, term6423.getClass(), "model", null);
        setField(term6423, term6423.getClass(), "font", null);
        setIntField(term6423, term6423.getClass(), "cellWidth", 0);
        setIntField(term6423, term6423.getClass(), "cellHeight", 0);
        setIntField(term6423, term6423.getClass(), "maxDescender", 0);
        setBooleanField(term6423, term6423.getClass(), "isAlignmentXSet", false);
        setFloatField(term6423, term6423.getClass(), "alignmentX", 0.0F);
        setBooleanField(term6423, term6423.getClass(), "isAlignmentYSet", false);
        setFloatField(term6423, term6423.getClass(), "alignmentY", 0.0F);
        setField(term6423, term6423.getClass(), "ui", null);
        setField(term6423, term6423.getClass(), "listenerList", null);
        setField(term6423, term6423.getClass(), "clientProperties", null);
        setField(term6423, term6423.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term6423, term6423.getClass(), "autoscrolls", false);
        setField(term6423, term6423.getClass(), "border", null);
        setIntField(term6423, term6423.getClass(), "flags", 0);
        setField(term6423, term6423.getClass(), "inputVerifier", null);
        setBooleanField(term6423, term6423.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term6423, term6423.getClass(), "paintingChild", null);
        setField(term6423, term6423.getClass(), "popupMenu", null);
        setField(term6423, term6423.getClass(), "revalidateRunnableScheduled", null);
        setField(term6423, term6423.getClass(), "focusInputMap", null);
        setField(term6423, term6423.getClass(), "ancestorInputMap", null);
        setField(term6423, term6423.getClass(), "windowInputMap", null);
        setField(term6423, term6423.getClass(), "actionMap", null);
        setField(term6423, term6423.getClass(), "aaHint", null);
        setField(term6423, term6423.getClass(), "lcdRenderingHint", null);
        setField(term6423, term6423.getClass(), "component", null);
        setField(term6423, term6423.getClass(), "layoutMgr", null);
        setField(term6423, term6423.getClass(), "dispatcher", null);
        setField(term6423, term6423.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6423, term6423.getClass(), "focusCycleRoot", false);
        setBooleanField(term6423, term6423.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6423, term6423.getClass(), "printingThreads", null);
        setBooleanField(term6423, term6423.getClass(), "printing", false);
        setField(term6423, term6423.getClass(), "containerListener", null);
        setIntField(term6423, term6423.getClass(), "listeningChildren", 0);
        setIntField(term6423, term6423.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6423, term6423.getClass(), "descendantsCount", 0);
        setField(term6423, term6423.getClass(), "preserveBackgroundColor", null);
        setIntField(term6423, term6423.getClass(), "numOfHWComponents", 0);
        setIntField(term6423, term6423.getClass(), "numOfLWComponents", 0);
        setField(term6423, term6423.getClass(), "modalComp", null);
        setField(term6423, term6423.getClass(), "modalAppContext", null);
        setIntField(term6423, term6423.getClass(), "containerSerializedDataVersion", 0);
        setField(term6423, term6423.getClass(), "peer", null);
        setField(term6423, term6423.getClass(), "parent", null);
        setField(term6423, term6423.getClass(), "appContext", null);
        setIntField(term6423, term6423.getClass(), "x", 0);
        setIntField(term6423, term6423.getClass(), "y", 0);
        setIntField(term6423, term6423.getClass(), "width", 0);
        setIntField(term6423, term6423.getClass(), "height", 0);
        setField(term6423, term6423.getClass(), "foreground", null);
        setField(term6423, term6423.getClass(), "background", null);
        setField(term6423, term6423.getClass(), "peerFont", null);
        setField(term6423, term6423.getClass(), "cursor", null);
        setField(term6423, term6423.getClass(), "locale", null);
        setField(term6423, term6423.getClass(), "graphicsConfig", null);
        setField(term6423, term6423.getClass(), "bufferStrategy", null);
        setBooleanField(term6423, term6423.getClass(), "ignoreRepaint", false);
        setBooleanField(term6423, term6423.getClass(), "visible", false);
        setBooleanField(term6423, term6423.getClass(), "enabled", false);
        setBooleanField(term6423, term6423.getClass(), "valid", false);
        setField(term6423, term6423.getClass(), "dropTarget", null);
        setField(term6423, term6423.getClass(), "popups", null);
        setField(term6423, term6423.getClass(), "name", null);
        setBooleanField(term6423, term6423.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6423, term6423.getClass(), "focusable", false);
        setIntField(term6423, term6423.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6423, term6423.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6423, term6423.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6423, term6423.getClass(), "acc", null);
        setField(term6423, term6423.getClass(), "minSize", null);
        setBooleanField(term6423, term6423.getClass(), "minSizeSet", false);
        setField(term6423, term6423.getClass(), "prefSize", null);
        setBooleanField(term6423, term6423.getClass(), "prefSizeSet", false);
        setField(term6423, term6423.getClass(), "maxSize", null);
        setBooleanField(term6423, term6423.getClass(), "maxSizeSet", false);
        setField(term6423, term6423.getClass(), "componentOrientation", null);
        setBooleanField(term6423, term6423.getClass(), "newEventsOnly", false);
        setField(term6423, term6423.getClass(), "componentListener", null);
        setField(term6423, term6423.getClass(), "focusListener", null);
        setField(term6423, term6423.getClass(), "hierarchyListener", null);
        setField(term6423, term6423.getClass(), "hierarchyBoundsListener", null);
        setField(term6423, term6423.getClass(), "keyListener", null);
        setField(term6423, term6423.getClass(), "mouseListener", null);
        setField(term6423, term6423.getClass(), "mouseMotionListener", null);
        setField(term6423, term6423.getClass(), "mouseWheelListener", null);
        setField(term6423, term6423.getClass(), "inputMethodListener", null);
        setLongField(term6423, term6423.getClass(), "eventMask", 0L);
        setField(term6423, term6423.getClass(), "changeSupport", null);
        setField(term6423, term6423.getClass(), "objectLock", null);
        setBooleanField(term6423, term6423.getClass(), "isPacked", false);
        setIntField(term6423, term6423.getClass(), "boundsOp", 0);
        setField(term6423, term6423.getClass(), "compoundShape", null);
        setField(term6423, term6423.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6423, term6423.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6423, term6423.getClass(), "backgroundEraseDisabled", false);
        setField(term6423, term6423.getClass(), "eventCache", null);
        setBooleanField(term6423, term6423.getClass(), "coalescingEnabled", false);
        setBooleanField(term6423, term6423.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6423, term6423.getClass(), "componentSerializedDataVersion", 0);
        setField(term6423, term6423.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "print", argTypes, term6423, args);
    }

};


