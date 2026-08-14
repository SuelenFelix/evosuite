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

public class JTerminal_getFont_3165446467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4064;

    public JTerminal_getFont_3165446467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4064 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term4064, term4064.getClass(), "borderWidth", 0);
        setField(term4064, term4064.getClass(), "scrollBar", null);
        setField(term4064, term4064.getClass(), "model", null);
        setField(term4064, term4064.getClass(), "font", null);
        setIntField(term4064, term4064.getClass(), "cellWidth", 0);
        setIntField(term4064, term4064.getClass(), "cellHeight", 0);
        setIntField(term4064, term4064.getClass(), "maxDescender", 0);
        setBooleanField(term4064, term4064.getClass(), "isAlignmentXSet", false);
        setFloatField(term4064, term4064.getClass(), "alignmentX", 0.0F);
        setBooleanField(term4064, term4064.getClass(), "isAlignmentYSet", false);
        setFloatField(term4064, term4064.getClass(), "alignmentY", 0.0F);
        setField(term4064, term4064.getClass(), "ui", null);
        setField(term4064, term4064.getClass(), "listenerList", null);
        setField(term4064, term4064.getClass(), "clientProperties", null);
        setField(term4064, term4064.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term4064, term4064.getClass(), "autoscrolls", false);
        setField(term4064, term4064.getClass(), "border", null);
        setIntField(term4064, term4064.getClass(), "flags", 0);
        setField(term4064, term4064.getClass(), "inputVerifier", null);
        setBooleanField(term4064, term4064.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term4064, term4064.getClass(), "paintingChild", null);
        setField(term4064, term4064.getClass(), "popupMenu", null);
        setField(term4064, term4064.getClass(), "revalidateRunnableScheduled", null);
        setField(term4064, term4064.getClass(), "focusInputMap", null);
        setField(term4064, term4064.getClass(), "ancestorInputMap", null);
        setField(term4064, term4064.getClass(), "windowInputMap", null);
        setField(term4064, term4064.getClass(), "actionMap", null);
        setField(term4064, term4064.getClass(), "aaHint", null);
        setField(term4064, term4064.getClass(), "lcdRenderingHint", null);
        setField(term4064, term4064.getClass(), "component", null);
        setField(term4064, term4064.getClass(), "layoutMgr", null);
        setField(term4064, term4064.getClass(), "dispatcher", null);
        setField(term4064, term4064.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term4064, term4064.getClass(), "focusCycleRoot", false);
        setBooleanField(term4064, term4064.getClass(), "focusTraversalPolicyProvider", false);
        setField(term4064, term4064.getClass(), "printingThreads", null);
        setBooleanField(term4064, term4064.getClass(), "printing", false);
        setField(term4064, term4064.getClass(), "containerListener", null);
        setIntField(term4064, term4064.getClass(), "listeningChildren", 0);
        setIntField(term4064, term4064.getClass(), "listeningBoundsChildren", 0);
        setIntField(term4064, term4064.getClass(), "descendantsCount", 0);
        setField(term4064, term4064.getClass(), "preserveBackgroundColor", null);
        setIntField(term4064, term4064.getClass(), "numOfHWComponents", 0);
        setIntField(term4064, term4064.getClass(), "numOfLWComponents", 0);
        setField(term4064, term4064.getClass(), "modalComp", null);
        setField(term4064, term4064.getClass(), "modalAppContext", null);
        setIntField(term4064, term4064.getClass(), "containerSerializedDataVersion", 0);
        setField(term4064, term4064.getClass(), "peer", null);
        setField(term4064, term4064.getClass(), "parent", null);
        setField(term4064, term4064.getClass(), "appContext", null);
        setIntField(term4064, term4064.getClass(), "x", 0);
        setIntField(term4064, term4064.getClass(), "y", 0);
        setIntField(term4064, term4064.getClass(), "width", 0);
        setIntField(term4064, term4064.getClass(), "height", 0);
        setField(term4064, term4064.getClass(), "foreground", null);
        setField(term4064, term4064.getClass(), "background", null);
        setField(term4064, term4064.getClass(), "peerFont", null);
        setField(term4064, term4064.getClass(), "cursor", null);
        setField(term4064, term4064.getClass(), "locale", null);
        setField(term4064, term4064.getClass(), "graphicsConfig", null);
        setField(term4064, term4064.getClass(), "bufferStrategy", null);
        setBooleanField(term4064, term4064.getClass(), "ignoreRepaint", false);
        setBooleanField(term4064, term4064.getClass(), "visible", false);
        setBooleanField(term4064, term4064.getClass(), "enabled", false);
        setBooleanField(term4064, term4064.getClass(), "valid", false);
        setField(term4064, term4064.getClass(), "dropTarget", null);
        setField(term4064, term4064.getClass(), "popups", null);
        setField(term4064, term4064.getClass(), "name", null);
        setBooleanField(term4064, term4064.getClass(), "nameExplicitlySet", false);
        setBooleanField(term4064, term4064.getClass(), "focusable", false);
        setIntField(term4064, term4064.getClass(), "isFocusTraversableOverridden", 0);
        setField(term4064, term4064.getClass(), "focusTraversalKeys", null);
        setBooleanField(term4064, term4064.getClass(), "focusTraversalKeysEnabled", false);
        setField(term4064, term4064.getClass(), "acc", null);
        setField(term4064, term4064.getClass(), "minSize", null);
        setBooleanField(term4064, term4064.getClass(), "minSizeSet", false);
        setField(term4064, term4064.getClass(), "prefSize", null);
        setBooleanField(term4064, term4064.getClass(), "prefSizeSet", false);
        setField(term4064, term4064.getClass(), "maxSize", null);
        setBooleanField(term4064, term4064.getClass(), "maxSizeSet", false);
        setField(term4064, term4064.getClass(), "componentOrientation", null);
        setBooleanField(term4064, term4064.getClass(), "newEventsOnly", false);
        setField(term4064, term4064.getClass(), "componentListener", null);
        setField(term4064, term4064.getClass(), "focusListener", null);
        setField(term4064, term4064.getClass(), "hierarchyListener", null);
        setField(term4064, term4064.getClass(), "hierarchyBoundsListener", null);
        setField(term4064, term4064.getClass(), "keyListener", null);
        setField(term4064, term4064.getClass(), "mouseListener", null);
        setField(term4064, term4064.getClass(), "mouseMotionListener", null);
        setField(term4064, term4064.getClass(), "mouseWheelListener", null);
        setField(term4064, term4064.getClass(), "inputMethodListener", null);
        setLongField(term4064, term4064.getClass(), "eventMask", 0L);
        setField(term4064, term4064.getClass(), "changeSupport", null);
        setField(term4064, term4064.getClass(), "objectLock", null);
        setBooleanField(term4064, term4064.getClass(), "isPacked", false);
        setIntField(term4064, term4064.getClass(), "boundsOp", 0);
        setField(term4064, term4064.getClass(), "compoundShape", null);
        setField(term4064, term4064.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term4064, term4064.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term4064, term4064.getClass(), "backgroundEraseDisabled", false);
        setField(term4064, term4064.getClass(), "eventCache", null);
        setBooleanField(term4064, term4064.getClass(), "coalescingEnabled", false);
        setBooleanField(term4064, term4064.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term4064, term4064.getClass(), "componentSerializedDataVersion", 0);
        setField(term4064, term4064.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFont", argTypes, term4064, args);
    }

};


