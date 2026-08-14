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

public class JTerminal_getMaximumSize_71832874117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8001;

    public JTerminal_getMaximumSize_71832874117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8001 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term8001, term8001.getClass(), "borderWidth", 0);
        setField(term8001, term8001.getClass(), "scrollBar", null);
        setField(term8001, term8001.getClass(), "model", null);
        setField(term8001, term8001.getClass(), "font", null);
        setIntField(term8001, term8001.getClass(), "cellWidth", 0);
        setIntField(term8001, term8001.getClass(), "cellHeight", 0);
        setIntField(term8001, term8001.getClass(), "maxDescender", 0);
        setBooleanField(term8001, term8001.getClass(), "isAlignmentXSet", false);
        setFloatField(term8001, term8001.getClass(), "alignmentX", 0.0F);
        setBooleanField(term8001, term8001.getClass(), "isAlignmentYSet", false);
        setFloatField(term8001, term8001.getClass(), "alignmentY", 0.0F);
        setField(term8001, term8001.getClass(), "ui", null);
        setField(term8001, term8001.getClass(), "listenerList", null);
        setField(term8001, term8001.getClass(), "clientProperties", null);
        setField(term8001, term8001.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term8001, term8001.getClass(), "autoscrolls", false);
        setField(term8001, term8001.getClass(), "border", null);
        setIntField(term8001, term8001.getClass(), "flags", 0);
        setField(term8001, term8001.getClass(), "inputVerifier", null);
        setBooleanField(term8001, term8001.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term8001, term8001.getClass(), "paintingChild", null);
        setField(term8001, term8001.getClass(), "popupMenu", null);
        setField(term8001, term8001.getClass(), "revalidateRunnableScheduled", null);
        setField(term8001, term8001.getClass(), "focusInputMap", null);
        setField(term8001, term8001.getClass(), "ancestorInputMap", null);
        setField(term8001, term8001.getClass(), "windowInputMap", null);
        setField(term8001, term8001.getClass(), "actionMap", null);
        setField(term8001, term8001.getClass(), "aaHint", null);
        setField(term8001, term8001.getClass(), "lcdRenderingHint", null);
        setField(term8001, term8001.getClass(), "component", null);
        setField(term8001, term8001.getClass(), "layoutMgr", null);
        setField(term8001, term8001.getClass(), "dispatcher", null);
        setField(term8001, term8001.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term8001, term8001.getClass(), "focusCycleRoot", false);
        setBooleanField(term8001, term8001.getClass(), "focusTraversalPolicyProvider", false);
        setField(term8001, term8001.getClass(), "printingThreads", null);
        setBooleanField(term8001, term8001.getClass(), "printing", false);
        setField(term8001, term8001.getClass(), "containerListener", null);
        setIntField(term8001, term8001.getClass(), "listeningChildren", 0);
        setIntField(term8001, term8001.getClass(), "listeningBoundsChildren", 0);
        setIntField(term8001, term8001.getClass(), "descendantsCount", 0);
        setField(term8001, term8001.getClass(), "preserveBackgroundColor", null);
        setIntField(term8001, term8001.getClass(), "numOfHWComponents", 0);
        setIntField(term8001, term8001.getClass(), "numOfLWComponents", 0);
        setField(term8001, term8001.getClass(), "modalComp", null);
        setField(term8001, term8001.getClass(), "modalAppContext", null);
        setIntField(term8001, term8001.getClass(), "containerSerializedDataVersion", 0);
        setField(term8001, term8001.getClass(), "peer", null);
        setField(term8001, term8001.getClass(), "parent", null);
        setField(term8001, term8001.getClass(), "appContext", null);
        setIntField(term8001, term8001.getClass(), "x", 0);
        setIntField(term8001, term8001.getClass(), "y", 0);
        setIntField(term8001, term8001.getClass(), "width", 0);
        setIntField(term8001, term8001.getClass(), "height", 0);
        setField(term8001, term8001.getClass(), "foreground", null);
        setField(term8001, term8001.getClass(), "background", null);
        setField(term8001, term8001.getClass(), "peerFont", null);
        setField(term8001, term8001.getClass(), "cursor", null);
        setField(term8001, term8001.getClass(), "locale", null);
        setField(term8001, term8001.getClass(), "graphicsConfig", null);
        setField(term8001, term8001.getClass(), "bufferStrategy", null);
        setBooleanField(term8001, term8001.getClass(), "ignoreRepaint", false);
        setBooleanField(term8001, term8001.getClass(), "visible", false);
        setBooleanField(term8001, term8001.getClass(), "enabled", false);
        setBooleanField(term8001, term8001.getClass(), "valid", false);
        setField(term8001, term8001.getClass(), "dropTarget", null);
        setField(term8001, term8001.getClass(), "popups", null);
        setField(term8001, term8001.getClass(), "name", null);
        setBooleanField(term8001, term8001.getClass(), "nameExplicitlySet", false);
        setBooleanField(term8001, term8001.getClass(), "focusable", false);
        setIntField(term8001, term8001.getClass(), "isFocusTraversableOverridden", 0);
        setField(term8001, term8001.getClass(), "focusTraversalKeys", null);
        setBooleanField(term8001, term8001.getClass(), "focusTraversalKeysEnabled", false);
        setField(term8001, term8001.getClass(), "acc", null);
        setField(term8001, term8001.getClass(), "minSize", null);
        setBooleanField(term8001, term8001.getClass(), "minSizeSet", false);
        setField(term8001, term8001.getClass(), "prefSize", null);
        setBooleanField(term8001, term8001.getClass(), "prefSizeSet", false);
        setField(term8001, term8001.getClass(), "maxSize", null);
        setBooleanField(term8001, term8001.getClass(), "maxSizeSet", false);
        setField(term8001, term8001.getClass(), "componentOrientation", null);
        setBooleanField(term8001, term8001.getClass(), "newEventsOnly", false);
        setField(term8001, term8001.getClass(), "componentListener", null);
        setField(term8001, term8001.getClass(), "focusListener", null);
        setField(term8001, term8001.getClass(), "hierarchyListener", null);
        setField(term8001, term8001.getClass(), "hierarchyBoundsListener", null);
        setField(term8001, term8001.getClass(), "keyListener", null);
        setField(term8001, term8001.getClass(), "mouseListener", null);
        setField(term8001, term8001.getClass(), "mouseMotionListener", null);
        setField(term8001, term8001.getClass(), "mouseWheelListener", null);
        setField(term8001, term8001.getClass(), "inputMethodListener", null);
        setLongField(term8001, term8001.getClass(), "eventMask", 0L);
        setField(term8001, term8001.getClass(), "changeSupport", null);
        setField(term8001, term8001.getClass(), "objectLock", null);
        setBooleanField(term8001, term8001.getClass(), "isPacked", false);
        setIntField(term8001, term8001.getClass(), "boundsOp", 0);
        setField(term8001, term8001.getClass(), "compoundShape", null);
        setField(term8001, term8001.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term8001, term8001.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term8001, term8001.getClass(), "backgroundEraseDisabled", false);
        setField(term8001, term8001.getClass(), "eventCache", null);
        setBooleanField(term8001, term8001.getClass(), "coalescingEnabled", false);
        setBooleanField(term8001, term8001.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term8001, term8001.getClass(), "componentSerializedDataVersion", 0);
        setField(term8001, term8001.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaximumSize", argTypes, term8001, args);
    }

};


