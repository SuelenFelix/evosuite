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
import java.lang.Integer;

public class JTerminal_setBorderWidth_6181831903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2353;
     Object term2398;

    public JTerminal_setBorderWidth_6181831903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2353 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term2353, term2353.getClass(), "borderWidth", 0);
        setField(term2353, term2353.getClass(), "scrollBar", null);
        setField(term2353, term2353.getClass(), "model", null);
        setField(term2353, term2353.getClass(), "font", null);
        setIntField(term2353, term2353.getClass(), "cellWidth", 0);
        setIntField(term2353, term2353.getClass(), "cellHeight", 0);
        setIntField(term2353, term2353.getClass(), "maxDescender", 0);
        setBooleanField(term2353, term2353.getClass(), "isAlignmentXSet", false);
        setFloatField(term2353, term2353.getClass(), "alignmentX", 0.0F);
        setBooleanField(term2353, term2353.getClass(), "isAlignmentYSet", false);
        setFloatField(term2353, term2353.getClass(), "alignmentY", 0.0F);
        setField(term2353, term2353.getClass(), "ui", null);
        setField(term2353, term2353.getClass(), "listenerList", null);
        setField(term2353, term2353.getClass(), "clientProperties", null);
        setField(term2353, term2353.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term2353, term2353.getClass(), "autoscrolls", false);
        setField(term2353, term2353.getClass(), "border", null);
        setIntField(term2353, term2353.getClass(), "flags", 0);
        setField(term2353, term2353.getClass(), "inputVerifier", null);
        setBooleanField(term2353, term2353.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term2353, term2353.getClass(), "paintingChild", null);
        setField(term2353, term2353.getClass(), "popupMenu", null);
        setField(term2353, term2353.getClass(), "revalidateRunnableScheduled", null);
        setField(term2353, term2353.getClass(), "focusInputMap", null);
        setField(term2353, term2353.getClass(), "ancestorInputMap", null);
        setField(term2353, term2353.getClass(), "windowInputMap", null);
        setField(term2353, term2353.getClass(), "actionMap", null);
        setField(term2353, term2353.getClass(), "aaHint", null);
        setField(term2353, term2353.getClass(), "lcdRenderingHint", null);
        setField(term2353, term2353.getClass(), "component", null);
        setField(term2353, term2353.getClass(), "layoutMgr", null);
        setField(term2353, term2353.getClass(), "dispatcher", null);
        setField(term2353, term2353.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term2353, term2353.getClass(), "focusCycleRoot", false);
        setBooleanField(term2353, term2353.getClass(), "focusTraversalPolicyProvider", false);
        setField(term2353, term2353.getClass(), "printingThreads", null);
        setBooleanField(term2353, term2353.getClass(), "printing", false);
        setField(term2353, term2353.getClass(), "containerListener", null);
        setIntField(term2353, term2353.getClass(), "listeningChildren", 0);
        setIntField(term2353, term2353.getClass(), "listeningBoundsChildren", 0);
        setIntField(term2353, term2353.getClass(), "descendantsCount", 0);
        setField(term2353, term2353.getClass(), "preserveBackgroundColor", null);
        setIntField(term2353, term2353.getClass(), "numOfHWComponents", 0);
        setIntField(term2353, term2353.getClass(), "numOfLWComponents", 0);
        setField(term2353, term2353.getClass(), "modalComp", null);
        setField(term2353, term2353.getClass(), "modalAppContext", null);
        setIntField(term2353, term2353.getClass(), "containerSerializedDataVersion", 0);
        setField(term2353, term2353.getClass(), "peer", null);
        setField(term2353, term2353.getClass(), "parent", null);
        setField(term2353, term2353.getClass(), "appContext", null);
        setIntField(term2353, term2353.getClass(), "x", 0);
        setIntField(term2353, term2353.getClass(), "y", 0);
        setIntField(term2353, term2353.getClass(), "width", 0);
        setIntField(term2353, term2353.getClass(), "height", 0);
        setField(term2353, term2353.getClass(), "foreground", null);
        setField(term2353, term2353.getClass(), "background", null);
        setField(term2353, term2353.getClass(), "peerFont", null);
        setField(term2353, term2353.getClass(), "cursor", null);
        setField(term2353, term2353.getClass(), "locale", null);
        setField(term2353, term2353.getClass(), "graphicsConfig", null);
        setField(term2353, term2353.getClass(), "bufferStrategy", null);
        setBooleanField(term2353, term2353.getClass(), "ignoreRepaint", false);
        setBooleanField(term2353, term2353.getClass(), "visible", false);
        setBooleanField(term2353, term2353.getClass(), "enabled", false);
        setBooleanField(term2353, term2353.getClass(), "valid", false);
        setField(term2353, term2353.getClass(), "dropTarget", null);
        setField(term2353, term2353.getClass(), "popups", null);
        setField(term2353, term2353.getClass(), "name", null);
        setBooleanField(term2353, term2353.getClass(), "nameExplicitlySet", false);
        setBooleanField(term2353, term2353.getClass(), "focusable", false);
        setIntField(term2353, term2353.getClass(), "isFocusTraversableOverridden", 0);
        setField(term2353, term2353.getClass(), "focusTraversalKeys", null);
        setBooleanField(term2353, term2353.getClass(), "focusTraversalKeysEnabled", false);
        setField(term2353, term2353.getClass(), "acc", null);
        setField(term2353, term2353.getClass(), "minSize", null);
        setBooleanField(term2353, term2353.getClass(), "minSizeSet", false);
        setField(term2353, term2353.getClass(), "prefSize", null);
        setBooleanField(term2353, term2353.getClass(), "prefSizeSet", false);
        setField(term2353, term2353.getClass(), "maxSize", null);
        setBooleanField(term2353, term2353.getClass(), "maxSizeSet", false);
        setField(term2353, term2353.getClass(), "componentOrientation", null);
        setBooleanField(term2353, term2353.getClass(), "newEventsOnly", false);
        setField(term2353, term2353.getClass(), "componentListener", null);
        setField(term2353, term2353.getClass(), "focusListener", null);
        setField(term2353, term2353.getClass(), "hierarchyListener", null);
        setField(term2353, term2353.getClass(), "hierarchyBoundsListener", null);
        setField(term2353, term2353.getClass(), "keyListener", null);
        setField(term2353, term2353.getClass(), "mouseListener", null);
        setField(term2353, term2353.getClass(), "mouseMotionListener", null);
        setField(term2353, term2353.getClass(), "mouseWheelListener", null);
        setField(term2353, term2353.getClass(), "inputMethodListener", null);
        setLongField(term2353, term2353.getClass(), "eventMask", 0L);
        setField(term2353, term2353.getClass(), "changeSupport", null);
        setField(term2353, term2353.getClass(), "objectLock", null);
        setBooleanField(term2353, term2353.getClass(), "isPacked", false);
        setIntField(term2353, term2353.getClass(), "boundsOp", 0);
        setField(term2353, term2353.getClass(), "compoundShape", null);
        setField(term2353, term2353.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term2353, term2353.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term2353, term2353.getClass(), "backgroundEraseDisabled", false);
        setField(term2353, term2353.getClass(), "eventCache", null);
        setBooleanField(term2353, term2353.getClass(), "coalescingEnabled", false);
        setBooleanField(term2353, term2353.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term2353, term2353.getClass(), "componentSerializedDataVersion", 0);
        setField(term2353, term2353.getClass(), "accessibleContext", null);
        term2398 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term2398;
        callMethod(klass, "setBorderWidth", argTypes, term2353, args);
    }

};


