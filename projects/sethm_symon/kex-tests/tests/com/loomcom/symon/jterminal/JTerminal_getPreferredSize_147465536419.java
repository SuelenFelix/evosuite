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

public class JTerminal_getPreferredSize_147465536419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8727;

    public JTerminal_getPreferredSize_147465536419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8727 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term8727, term8727.getClass(), "borderWidth", 0);
        setField(term8727, term8727.getClass(), "scrollBar", null);
        setField(term8727, term8727.getClass(), "model", null);
        setField(term8727, term8727.getClass(), "font", null);
        setIntField(term8727, term8727.getClass(), "cellWidth", 0);
        setIntField(term8727, term8727.getClass(), "cellHeight", 0);
        setIntField(term8727, term8727.getClass(), "maxDescender", 0);
        setBooleanField(term8727, term8727.getClass(), "isAlignmentXSet", false);
        setFloatField(term8727, term8727.getClass(), "alignmentX", 0.0F);
        setBooleanField(term8727, term8727.getClass(), "isAlignmentYSet", false);
        setFloatField(term8727, term8727.getClass(), "alignmentY", 0.0F);
        setField(term8727, term8727.getClass(), "ui", null);
        setField(term8727, term8727.getClass(), "listenerList", null);
        setField(term8727, term8727.getClass(), "clientProperties", null);
        setField(term8727, term8727.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term8727, term8727.getClass(), "autoscrolls", false);
        setField(term8727, term8727.getClass(), "border", null);
        setIntField(term8727, term8727.getClass(), "flags", 0);
        setField(term8727, term8727.getClass(), "inputVerifier", null);
        setBooleanField(term8727, term8727.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term8727, term8727.getClass(), "paintingChild", null);
        setField(term8727, term8727.getClass(), "popupMenu", null);
        setField(term8727, term8727.getClass(), "revalidateRunnableScheduled", null);
        setField(term8727, term8727.getClass(), "focusInputMap", null);
        setField(term8727, term8727.getClass(), "ancestorInputMap", null);
        setField(term8727, term8727.getClass(), "windowInputMap", null);
        setField(term8727, term8727.getClass(), "actionMap", null);
        setField(term8727, term8727.getClass(), "aaHint", null);
        setField(term8727, term8727.getClass(), "lcdRenderingHint", null);
        setField(term8727, term8727.getClass(), "component", null);
        setField(term8727, term8727.getClass(), "layoutMgr", null);
        setField(term8727, term8727.getClass(), "dispatcher", null);
        setField(term8727, term8727.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term8727, term8727.getClass(), "focusCycleRoot", false);
        setBooleanField(term8727, term8727.getClass(), "focusTraversalPolicyProvider", false);
        setField(term8727, term8727.getClass(), "printingThreads", null);
        setBooleanField(term8727, term8727.getClass(), "printing", false);
        setField(term8727, term8727.getClass(), "containerListener", null);
        setIntField(term8727, term8727.getClass(), "listeningChildren", 0);
        setIntField(term8727, term8727.getClass(), "listeningBoundsChildren", 0);
        setIntField(term8727, term8727.getClass(), "descendantsCount", 0);
        setField(term8727, term8727.getClass(), "preserveBackgroundColor", null);
        setIntField(term8727, term8727.getClass(), "numOfHWComponents", 0);
        setIntField(term8727, term8727.getClass(), "numOfLWComponents", 0);
        setField(term8727, term8727.getClass(), "modalComp", null);
        setField(term8727, term8727.getClass(), "modalAppContext", null);
        setIntField(term8727, term8727.getClass(), "containerSerializedDataVersion", 0);
        setField(term8727, term8727.getClass(), "peer", null);
        setField(term8727, term8727.getClass(), "parent", null);
        setField(term8727, term8727.getClass(), "appContext", null);
        setIntField(term8727, term8727.getClass(), "x", 0);
        setIntField(term8727, term8727.getClass(), "y", 0);
        setIntField(term8727, term8727.getClass(), "width", 0);
        setIntField(term8727, term8727.getClass(), "height", 0);
        setField(term8727, term8727.getClass(), "foreground", null);
        setField(term8727, term8727.getClass(), "background", null);
        setField(term8727, term8727.getClass(), "peerFont", null);
        setField(term8727, term8727.getClass(), "cursor", null);
        setField(term8727, term8727.getClass(), "locale", null);
        setField(term8727, term8727.getClass(), "graphicsConfig", null);
        setField(term8727, term8727.getClass(), "bufferStrategy", null);
        setBooleanField(term8727, term8727.getClass(), "ignoreRepaint", false);
        setBooleanField(term8727, term8727.getClass(), "visible", false);
        setBooleanField(term8727, term8727.getClass(), "enabled", false);
        setBooleanField(term8727, term8727.getClass(), "valid", false);
        setField(term8727, term8727.getClass(), "dropTarget", null);
        setField(term8727, term8727.getClass(), "popups", null);
        setField(term8727, term8727.getClass(), "name", null);
        setBooleanField(term8727, term8727.getClass(), "nameExplicitlySet", false);
        setBooleanField(term8727, term8727.getClass(), "focusable", false);
        setIntField(term8727, term8727.getClass(), "isFocusTraversableOverridden", 0);
        setField(term8727, term8727.getClass(), "focusTraversalKeys", null);
        setBooleanField(term8727, term8727.getClass(), "focusTraversalKeysEnabled", false);
        setField(term8727, term8727.getClass(), "acc", null);
        setField(term8727, term8727.getClass(), "minSize", null);
        setBooleanField(term8727, term8727.getClass(), "minSizeSet", false);
        setField(term8727, term8727.getClass(), "prefSize", null);
        setBooleanField(term8727, term8727.getClass(), "prefSizeSet", false);
        setField(term8727, term8727.getClass(), "maxSize", null);
        setBooleanField(term8727, term8727.getClass(), "maxSizeSet", false);
        setField(term8727, term8727.getClass(), "componentOrientation", null);
        setBooleanField(term8727, term8727.getClass(), "newEventsOnly", false);
        setField(term8727, term8727.getClass(), "componentListener", null);
        setField(term8727, term8727.getClass(), "focusListener", null);
        setField(term8727, term8727.getClass(), "hierarchyListener", null);
        setField(term8727, term8727.getClass(), "hierarchyBoundsListener", null);
        setField(term8727, term8727.getClass(), "keyListener", null);
        setField(term8727, term8727.getClass(), "mouseListener", null);
        setField(term8727, term8727.getClass(), "mouseMotionListener", null);
        setField(term8727, term8727.getClass(), "mouseWheelListener", null);
        setField(term8727, term8727.getClass(), "inputMethodListener", null);
        setLongField(term8727, term8727.getClass(), "eventMask", 0L);
        setField(term8727, term8727.getClass(), "changeSupport", null);
        setField(term8727, term8727.getClass(), "objectLock", null);
        setBooleanField(term8727, term8727.getClass(), "isPacked", false);
        setIntField(term8727, term8727.getClass(), "boundsOp", 0);
        setField(term8727, term8727.getClass(), "compoundShape", null);
        setField(term8727, term8727.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term8727, term8727.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term8727, term8727.getClass(), "backgroundEraseDisabled", false);
        setField(term8727, term8727.getClass(), "eventCache", null);
        setBooleanField(term8727, term8727.getClass(), "coalescingEnabled", false);
        setBooleanField(term8727, term8727.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term8727, term8727.getClass(), "componentSerializedDataVersion", 0);
        setField(term8727, term8727.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreferredSize", argTypes, term8727, args);
    }

};


