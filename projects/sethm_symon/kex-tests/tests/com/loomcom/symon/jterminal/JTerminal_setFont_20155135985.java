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

public class JTerminal_setFont_20155135985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3221;

    public JTerminal_setFont_20155135985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3221 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term3221, term3221.getClass(), "borderWidth", 0);
        setField(term3221, term3221.getClass(), "scrollBar", null);
        setField(term3221, term3221.getClass(), "model", null);
        setField(term3221, term3221.getClass(), "font", null);
        setIntField(term3221, term3221.getClass(), "cellWidth", 0);
        setIntField(term3221, term3221.getClass(), "cellHeight", 0);
        setIntField(term3221, term3221.getClass(), "maxDescender", 0);
        setBooleanField(term3221, term3221.getClass(), "isAlignmentXSet", false);
        setFloatField(term3221, term3221.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3221, term3221.getClass(), "isAlignmentYSet", false);
        setFloatField(term3221, term3221.getClass(), "alignmentY", 0.0F);
        setField(term3221, term3221.getClass(), "ui", null);
        setField(term3221, term3221.getClass(), "listenerList", null);
        setField(term3221, term3221.getClass(), "clientProperties", null);
        setField(term3221, term3221.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3221, term3221.getClass(), "autoscrolls", false);
        setField(term3221, term3221.getClass(), "border", null);
        setIntField(term3221, term3221.getClass(), "flags", 0);
        setField(term3221, term3221.getClass(), "inputVerifier", null);
        setBooleanField(term3221, term3221.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3221, term3221.getClass(), "paintingChild", null);
        setField(term3221, term3221.getClass(), "popupMenu", null);
        setField(term3221, term3221.getClass(), "revalidateRunnableScheduled", null);
        setField(term3221, term3221.getClass(), "focusInputMap", null);
        setField(term3221, term3221.getClass(), "ancestorInputMap", null);
        setField(term3221, term3221.getClass(), "windowInputMap", null);
        setField(term3221, term3221.getClass(), "actionMap", null);
        setField(term3221, term3221.getClass(), "aaHint", null);
        setField(term3221, term3221.getClass(), "lcdRenderingHint", null);
        setField(term3221, term3221.getClass(), "component", null);
        setField(term3221, term3221.getClass(), "layoutMgr", null);
        setField(term3221, term3221.getClass(), "dispatcher", null);
        setField(term3221, term3221.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3221, term3221.getClass(), "focusCycleRoot", false);
        setBooleanField(term3221, term3221.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3221, term3221.getClass(), "printingThreads", null);
        setBooleanField(term3221, term3221.getClass(), "printing", false);
        setField(term3221, term3221.getClass(), "containerListener", null);
        setIntField(term3221, term3221.getClass(), "listeningChildren", 0);
        setIntField(term3221, term3221.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3221, term3221.getClass(), "descendantsCount", 0);
        setField(term3221, term3221.getClass(), "preserveBackgroundColor", null);
        setIntField(term3221, term3221.getClass(), "numOfHWComponents", 0);
        setIntField(term3221, term3221.getClass(), "numOfLWComponents", 0);
        setField(term3221, term3221.getClass(), "modalComp", null);
        setField(term3221, term3221.getClass(), "modalAppContext", null);
        setIntField(term3221, term3221.getClass(), "containerSerializedDataVersion", 0);
        setField(term3221, term3221.getClass(), "peer", null);
        setField(term3221, term3221.getClass(), "parent", null);
        setField(term3221, term3221.getClass(), "appContext", null);
        setIntField(term3221, term3221.getClass(), "x", 0);
        setIntField(term3221, term3221.getClass(), "y", 0);
        setIntField(term3221, term3221.getClass(), "width", 0);
        setIntField(term3221, term3221.getClass(), "height", 0);
        setField(term3221, term3221.getClass(), "foreground", null);
        setField(term3221, term3221.getClass(), "background", null);
        setField(term3221, term3221.getClass(), "peerFont", null);
        setField(term3221, term3221.getClass(), "cursor", null);
        setField(term3221, term3221.getClass(), "locale", null);
        setField(term3221, term3221.getClass(), "graphicsConfig", null);
        setField(term3221, term3221.getClass(), "bufferStrategy", null);
        setBooleanField(term3221, term3221.getClass(), "ignoreRepaint", false);
        setBooleanField(term3221, term3221.getClass(), "visible", false);
        setBooleanField(term3221, term3221.getClass(), "enabled", false);
        setBooleanField(term3221, term3221.getClass(), "valid", false);
        setField(term3221, term3221.getClass(), "dropTarget", null);
        setField(term3221, term3221.getClass(), "popups", null);
        setField(term3221, term3221.getClass(), "name", null);
        setBooleanField(term3221, term3221.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3221, term3221.getClass(), "focusable", false);
        setIntField(term3221, term3221.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3221, term3221.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3221, term3221.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3221, term3221.getClass(), "acc", null);
        setField(term3221, term3221.getClass(), "minSize", null);
        setBooleanField(term3221, term3221.getClass(), "minSizeSet", false);
        setField(term3221, term3221.getClass(), "prefSize", null);
        setBooleanField(term3221, term3221.getClass(), "prefSizeSet", false);
        setField(term3221, term3221.getClass(), "maxSize", null);
        setBooleanField(term3221, term3221.getClass(), "maxSizeSet", false);
        setField(term3221, term3221.getClass(), "componentOrientation", null);
        setBooleanField(term3221, term3221.getClass(), "newEventsOnly", false);
        setField(term3221, term3221.getClass(), "componentListener", null);
        setField(term3221, term3221.getClass(), "focusListener", null);
        setField(term3221, term3221.getClass(), "hierarchyListener", null);
        setField(term3221, term3221.getClass(), "hierarchyBoundsListener", null);
        setField(term3221, term3221.getClass(), "keyListener", null);
        setField(term3221, term3221.getClass(), "mouseListener", null);
        setField(term3221, term3221.getClass(), "mouseMotionListener", null);
        setField(term3221, term3221.getClass(), "mouseWheelListener", null);
        setField(term3221, term3221.getClass(), "inputMethodListener", null);
        setLongField(term3221, term3221.getClass(), "eventMask", 0L);
        setField(term3221, term3221.getClass(), "changeSupport", null);
        setField(term3221, term3221.getClass(), "objectLock", null);
        setBooleanField(term3221, term3221.getClass(), "isPacked", false);
        setIntField(term3221, term3221.getClass(), "boundsOp", 0);
        setField(term3221, term3221.getClass(), "compoundShape", null);
        setField(term3221, term3221.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3221, term3221.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3221, term3221.getClass(), "backgroundEraseDisabled", false);
        setField(term3221, term3221.getClass(), "eventCache", null);
        setBooleanField(term3221, term3221.getClass(), "coalescingEnabled", false);
        setBooleanField(term3221, term3221.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3221, term3221.getClass(), "componentSerializedDataVersion", 0);
        setField(term3221, term3221.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Font");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFont", argTypes, term3221, args);
    }

};


