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

public class JTerminal_init_115869224423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10227;

    public JTerminal_init_115869224423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10227 = newInstance(Class.forName("com.loomcom.symon.jterminal.JTerminal"));
        setIntField(term10227, term10227.getClass(), "borderWidth", 0);
        setField(term10227, term10227.getClass(), "scrollBar", null);
        setField(term10227, term10227.getClass(), "model", null);
        setField(term10227, term10227.getClass(), "font", null);
        setIntField(term10227, term10227.getClass(), "cellWidth", 0);
        setIntField(term10227, term10227.getClass(), "cellHeight", 0);
        setIntField(term10227, term10227.getClass(), "maxDescender", 0);
        setBooleanField(term10227, term10227.getClass(), "isAlignmentXSet", false);
        setFloatField(term10227, term10227.getClass(), "alignmentX", 0.0F);
        setBooleanField(term10227, term10227.getClass(), "isAlignmentYSet", false);
        setFloatField(term10227, term10227.getClass(), "alignmentY", 0.0F);
        setField(term10227, term10227.getClass(), "ui", null);
        setField(term10227, term10227.getClass(), "listenerList", null);
        setField(term10227, term10227.getClass(), "clientProperties", null);
        setField(term10227, term10227.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term10227, term10227.getClass(), "autoscrolls", false);
        setField(term10227, term10227.getClass(), "border", null);
        setIntField(term10227, term10227.getClass(), "flags", 0);
        setField(term10227, term10227.getClass(), "inputVerifier", null);
        setBooleanField(term10227, term10227.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term10227, term10227.getClass(), "paintingChild", null);
        setField(term10227, term10227.getClass(), "popupMenu", null);
        setField(term10227, term10227.getClass(), "revalidateRunnableScheduled", null);
        setField(term10227, term10227.getClass(), "focusInputMap", null);
        setField(term10227, term10227.getClass(), "ancestorInputMap", null);
        setField(term10227, term10227.getClass(), "windowInputMap", null);
        setField(term10227, term10227.getClass(), "actionMap", null);
        setField(term10227, term10227.getClass(), "aaHint", null);
        setField(term10227, term10227.getClass(), "lcdRenderingHint", null);
        setField(term10227, term10227.getClass(), "component", null);
        setField(term10227, term10227.getClass(), "layoutMgr", null);
        setField(term10227, term10227.getClass(), "dispatcher", null);
        setField(term10227, term10227.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term10227, term10227.getClass(), "focusCycleRoot", false);
        setBooleanField(term10227, term10227.getClass(), "focusTraversalPolicyProvider", false);
        setField(term10227, term10227.getClass(), "printingThreads", null);
        setBooleanField(term10227, term10227.getClass(), "printing", false);
        setField(term10227, term10227.getClass(), "containerListener", null);
        setIntField(term10227, term10227.getClass(), "listeningChildren", 0);
        setIntField(term10227, term10227.getClass(), "listeningBoundsChildren", 0);
        setIntField(term10227, term10227.getClass(), "descendantsCount", 0);
        setField(term10227, term10227.getClass(), "preserveBackgroundColor", null);
        setIntField(term10227, term10227.getClass(), "numOfHWComponents", 0);
        setIntField(term10227, term10227.getClass(), "numOfLWComponents", 0);
        setField(term10227, term10227.getClass(), "modalComp", null);
        setField(term10227, term10227.getClass(), "modalAppContext", null);
        setIntField(term10227, term10227.getClass(), "containerSerializedDataVersion", 0);
        setField(term10227, term10227.getClass(), "peer", null);
        setField(term10227, term10227.getClass(), "parent", null);
        setField(term10227, term10227.getClass(), "appContext", null);
        setIntField(term10227, term10227.getClass(), "x", 0);
        setIntField(term10227, term10227.getClass(), "y", 0);
        setIntField(term10227, term10227.getClass(), "width", 0);
        setIntField(term10227, term10227.getClass(), "height", 0);
        setField(term10227, term10227.getClass(), "foreground", null);
        setField(term10227, term10227.getClass(), "background", null);
        setField(term10227, term10227.getClass(), "peerFont", null);
        setField(term10227, term10227.getClass(), "cursor", null);
        setField(term10227, term10227.getClass(), "locale", null);
        setField(term10227, term10227.getClass(), "graphicsConfig", null);
        setField(term10227, term10227.getClass(), "bufferStrategy", null);
        setBooleanField(term10227, term10227.getClass(), "ignoreRepaint", false);
        setBooleanField(term10227, term10227.getClass(), "visible", false);
        setBooleanField(term10227, term10227.getClass(), "enabled", false);
        setBooleanField(term10227, term10227.getClass(), "valid", false);
        setField(term10227, term10227.getClass(), "dropTarget", null);
        setField(term10227, term10227.getClass(), "popups", null);
        setField(term10227, term10227.getClass(), "name", null);
        setBooleanField(term10227, term10227.getClass(), "nameExplicitlySet", false);
        setBooleanField(term10227, term10227.getClass(), "focusable", false);
        setIntField(term10227, term10227.getClass(), "isFocusTraversableOverridden", 0);
        setField(term10227, term10227.getClass(), "focusTraversalKeys", null);
        setBooleanField(term10227, term10227.getClass(), "focusTraversalKeysEnabled", false);
        setField(term10227, term10227.getClass(), "acc", null);
        setField(term10227, term10227.getClass(), "minSize", null);
        setBooleanField(term10227, term10227.getClass(), "minSizeSet", false);
        setField(term10227, term10227.getClass(), "prefSize", null);
        setBooleanField(term10227, term10227.getClass(), "prefSizeSet", false);
        setField(term10227, term10227.getClass(), "maxSize", null);
        setBooleanField(term10227, term10227.getClass(), "maxSizeSet", false);
        setField(term10227, term10227.getClass(), "componentOrientation", null);
        setBooleanField(term10227, term10227.getClass(), "newEventsOnly", false);
        setField(term10227, term10227.getClass(), "componentListener", null);
        setField(term10227, term10227.getClass(), "focusListener", null);
        setField(term10227, term10227.getClass(), "hierarchyListener", null);
        setField(term10227, term10227.getClass(), "hierarchyBoundsListener", null);
        setField(term10227, term10227.getClass(), "keyListener", null);
        setField(term10227, term10227.getClass(), "mouseListener", null);
        setField(term10227, term10227.getClass(), "mouseMotionListener", null);
        setField(term10227, term10227.getClass(), "mouseWheelListener", null);
        setField(term10227, term10227.getClass(), "inputMethodListener", null);
        setLongField(term10227, term10227.getClass(), "eventMask", 0L);
        setField(term10227, term10227.getClass(), "changeSupport", null);
        setField(term10227, term10227.getClass(), "objectLock", null);
        setBooleanField(term10227, term10227.getClass(), "isPacked", false);
        setIntField(term10227, term10227.getClass(), "boundsOp", 0);
        setField(term10227, term10227.getClass(), "compoundShape", null);
        setField(term10227, term10227.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term10227, term10227.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term10227, term10227.getClass(), "backgroundEraseDisabled", false);
        setField(term10227, term10227.getClass(), "eventCache", null);
        setBooleanField(term10227, term10227.getClass(), "coalescingEnabled", false);
        setBooleanField(term10227, term10227.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term10227, term10227.getClass(), "componentSerializedDataVersion", 0);
        setField(term10227, term10227.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.jterminal.JTerminal");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term10227, args);
    }

};


