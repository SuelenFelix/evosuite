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

public class JTerminal_getMinimumSize_110397741715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7152;

    public JTerminal_getMinimumSize_110397741715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7152 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term7152, term7152.getClass(), "borderWidth", 0);
        setField(term7152, term7152.getClass(), "scrollBar", null);
        setField(term7152, term7152.getClass(), "model", null);
        setField(term7152, term7152.getClass(), "font", null);
        setIntField(term7152, term7152.getClass(), "cellWidth", 0);
        setIntField(term7152, term7152.getClass(), "cellHeight", 0);
        setIntField(term7152, term7152.getClass(), "maxDescender", 0);
        setBooleanField(term7152, term7152.getClass(), "isAlignmentXSet", false);
        setFloatField(term7152, term7152.getClass(), "alignmentX", 0.0F);
        setBooleanField(term7152, term7152.getClass(), "isAlignmentYSet", false);
        setFloatField(term7152, term7152.getClass(), "alignmentY", 0.0F);
        setField(term7152, term7152.getClass(), "ui", null);
        setField(term7152, term7152.getClass(), "listenerList", null);
        setField(term7152, term7152.getClass(), "clientProperties", null);
        setField(term7152, term7152.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term7152, term7152.getClass(), "autoscrolls", false);
        setField(term7152, term7152.getClass(), "border", null);
        setIntField(term7152, term7152.getClass(), "flags", 0);
        setField(term7152, term7152.getClass(), "inputVerifier", null);
        setBooleanField(term7152, term7152.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term7152, term7152.getClass(), "paintingChild", null);
        setField(term7152, term7152.getClass(), "popupMenu", null);
        setField(term7152, term7152.getClass(), "revalidateRunnableScheduled", null);
        setField(term7152, term7152.getClass(), "focusInputMap", null);
        setField(term7152, term7152.getClass(), "ancestorInputMap", null);
        setField(term7152, term7152.getClass(), "windowInputMap", null);
        setField(term7152, term7152.getClass(), "actionMap", null);
        setField(term7152, term7152.getClass(), "aaHint", null);
        setField(term7152, term7152.getClass(), "lcdRenderingHint", null);
        setField(term7152, term7152.getClass(), "component", null);
        setField(term7152, term7152.getClass(), "layoutMgr", null);
        setField(term7152, term7152.getClass(), "dispatcher", null);
        setField(term7152, term7152.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7152, term7152.getClass(), "focusCycleRoot", false);
        setBooleanField(term7152, term7152.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7152, term7152.getClass(), "printingThreads", null);
        setBooleanField(term7152, term7152.getClass(), "printing", false);
        setField(term7152, term7152.getClass(), "containerListener", null);
        setIntField(term7152, term7152.getClass(), "listeningChildren", 0);
        setIntField(term7152, term7152.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7152, term7152.getClass(), "descendantsCount", 0);
        setField(term7152, term7152.getClass(), "preserveBackgroundColor", null);
        setIntField(term7152, term7152.getClass(), "numOfHWComponents", 0);
        setIntField(term7152, term7152.getClass(), "numOfLWComponents", 0);
        setField(term7152, term7152.getClass(), "modalComp", null);
        setField(term7152, term7152.getClass(), "modalAppContext", null);
        setIntField(term7152, term7152.getClass(), "containerSerializedDataVersion", 0);
        setField(term7152, term7152.getClass(), "peer", null);
        setField(term7152, term7152.getClass(), "parent", null);
        setField(term7152, term7152.getClass(), "appContext", null);
        setIntField(term7152, term7152.getClass(), "x", 0);
        setIntField(term7152, term7152.getClass(), "y", 0);
        setIntField(term7152, term7152.getClass(), "width", 0);
        setIntField(term7152, term7152.getClass(), "height", 0);
        setField(term7152, term7152.getClass(), "foreground", null);
        setField(term7152, term7152.getClass(), "background", null);
        setField(term7152, term7152.getClass(), "peerFont", null);
        setField(term7152, term7152.getClass(), "cursor", null);
        setField(term7152, term7152.getClass(), "locale", null);
        setField(term7152, term7152.getClass(), "graphicsConfig", null);
        setField(term7152, term7152.getClass(), "bufferStrategy", null);
        setBooleanField(term7152, term7152.getClass(), "ignoreRepaint", false);
        setBooleanField(term7152, term7152.getClass(), "visible", false);
        setBooleanField(term7152, term7152.getClass(), "enabled", false);
        setBooleanField(term7152, term7152.getClass(), "valid", false);
        setField(term7152, term7152.getClass(), "dropTarget", null);
        setField(term7152, term7152.getClass(), "popups", null);
        setField(term7152, term7152.getClass(), "name", null);
        setBooleanField(term7152, term7152.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7152, term7152.getClass(), "focusable", false);
        setIntField(term7152, term7152.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7152, term7152.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7152, term7152.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7152, term7152.getClass(), "acc", null);
        setField(term7152, term7152.getClass(), "minSize", null);
        setBooleanField(term7152, term7152.getClass(), "minSizeSet", false);
        setField(term7152, term7152.getClass(), "prefSize", null);
        setBooleanField(term7152, term7152.getClass(), "prefSizeSet", false);
        setField(term7152, term7152.getClass(), "maxSize", null);
        setBooleanField(term7152, term7152.getClass(), "maxSizeSet", false);
        setField(term7152, term7152.getClass(), "componentOrientation", null);
        setBooleanField(term7152, term7152.getClass(), "newEventsOnly", false);
        setField(term7152, term7152.getClass(), "componentListener", null);
        setField(term7152, term7152.getClass(), "focusListener", null);
        setField(term7152, term7152.getClass(), "hierarchyListener", null);
        setField(term7152, term7152.getClass(), "hierarchyBoundsListener", null);
        setField(term7152, term7152.getClass(), "keyListener", null);
        setField(term7152, term7152.getClass(), "mouseListener", null);
        setField(term7152, term7152.getClass(), "mouseMotionListener", null);
        setField(term7152, term7152.getClass(), "mouseWheelListener", null);
        setField(term7152, term7152.getClass(), "inputMethodListener", null);
        setLongField(term7152, term7152.getClass(), "eventMask", 0L);
        setField(term7152, term7152.getClass(), "changeSupport", null);
        setField(term7152, term7152.getClass(), "objectLock", null);
        setBooleanField(term7152, term7152.getClass(), "isPacked", false);
        setIntField(term7152, term7152.getClass(), "boundsOp", 0);
        setField(term7152, term7152.getClass(), "compoundShape", null);
        setField(term7152, term7152.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7152, term7152.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7152, term7152.getClass(), "backgroundEraseDisabled", false);
        setField(term7152, term7152.getClass(), "eventCache", null);
        setBooleanField(term7152, term7152.getClass(), "coalescingEnabled", false);
        setBooleanField(term7152, term7152.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7152, term7152.getClass(), "componentSerializedDataVersion", 0);
        setField(term7152, term7152.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumSize", argTypes, term7152, args);
    }

};


