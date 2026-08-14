package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Console_reset_5648364162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7880;

    public Console_reset_5648364162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7880 = newInstance(Class.forName("com.loomcom.symon.ui.Console"));
        setBooleanField(term7880, term7880.getClass(), "sendCrForLf", false);
        setField(term7880, term7880.getClass(), "typeAheadBuffer", null);
        setIntField(term7880, term7880.getClass(), "borderWidth", 0);
        setField(term7880, term7880.getClass(), "scrollBar", null);
        setField(term7880, term7880.getClass(), "model", null);
        setField(term7880, term7880.getClass(), "font", null);
        setIntField(term7880, term7880.getClass(), "cellWidth", 0);
        setIntField(term7880, term7880.getClass(), "cellHeight", 0);
        setIntField(term7880, term7880.getClass(), "maxDescender", 0);
        setBooleanField(term7880, term7880.getClass(), "isAlignmentXSet", false);
        setFloatField(term7880, term7880.getClass(), "alignmentX", 0.0F);
        setBooleanField(term7880, term7880.getClass(), "isAlignmentYSet", false);
        setFloatField(term7880, term7880.getClass(), "alignmentY", 0.0F);
        setField(term7880, term7880.getClass(), "ui", null);
        setField(term7880, term7880.getClass(), "listenerList", null);
        setField(term7880, term7880.getClass(), "clientProperties", null);
        setField(term7880, term7880.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term7880, term7880.getClass(), "autoscrolls", false);
        setField(term7880, term7880.getClass(), "border", null);
        setIntField(term7880, term7880.getClass(), "flags", 0);
        setField(term7880, term7880.getClass(), "inputVerifier", null);
        setBooleanField(term7880, term7880.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term7880, term7880.getClass(), "paintingChild", null);
        setField(term7880, term7880.getClass(), "popupMenu", null);
        setField(term7880, term7880.getClass(), "revalidateRunnableScheduled", null);
        setField(term7880, term7880.getClass(), "focusInputMap", null);
        setField(term7880, term7880.getClass(), "ancestorInputMap", null);
        setField(term7880, term7880.getClass(), "windowInputMap", null);
        setField(term7880, term7880.getClass(), "actionMap", null);
        setField(term7880, term7880.getClass(), "aaHint", null);
        setField(term7880, term7880.getClass(), "lcdRenderingHint", null);
        setField(term7880, term7880.getClass(), "component", null);
        setField(term7880, term7880.getClass(), "layoutMgr", null);
        setField(term7880, term7880.getClass(), "dispatcher", null);
        setField(term7880, term7880.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7880, term7880.getClass(), "focusCycleRoot", false);
        setBooleanField(term7880, term7880.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7880, term7880.getClass(), "printingThreads", null);
        setBooleanField(term7880, term7880.getClass(), "printing", false);
        setField(term7880, term7880.getClass(), "containerListener", null);
        setIntField(term7880, term7880.getClass(), "listeningChildren", 0);
        setIntField(term7880, term7880.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7880, term7880.getClass(), "descendantsCount", 0);
        setField(term7880, term7880.getClass(), "preserveBackgroundColor", null);
        setIntField(term7880, term7880.getClass(), "numOfHWComponents", 0);
        setIntField(term7880, term7880.getClass(), "numOfLWComponents", 0);
        setField(term7880, term7880.getClass(), "modalComp", null);
        setField(term7880, term7880.getClass(), "modalAppContext", null);
        setIntField(term7880, term7880.getClass(), "containerSerializedDataVersion", 0);
        setField(term7880, term7880.getClass(), "peer", null);
        setField(term7880, term7880.getClass(), "parent", null);
        setField(term7880, term7880.getClass(), "appContext", null);
        setIntField(term7880, term7880.getClass(), "x", 0);
        setIntField(term7880, term7880.getClass(), "y", 0);
        setIntField(term7880, term7880.getClass(), "width", 0);
        setIntField(term7880, term7880.getClass(), "height", 0);
        setField(term7880, term7880.getClass(), "foreground", null);
        setField(term7880, term7880.getClass(), "background", null);
        setField(term7880, term7880.getClass(), "peerFont", null);
        setField(term7880, term7880.getClass(), "cursor", null);
        setField(term7880, term7880.getClass(), "locale", null);
        setField(term7880, term7880.getClass(), "graphicsConfig", null);
        setField(term7880, term7880.getClass(), "bufferStrategy", null);
        setBooleanField(term7880, term7880.getClass(), "ignoreRepaint", false);
        setBooleanField(term7880, term7880.getClass(), "visible", false);
        setBooleanField(term7880, term7880.getClass(), "enabled", false);
        setBooleanField(term7880, term7880.getClass(), "valid", false);
        setField(term7880, term7880.getClass(), "dropTarget", null);
        setField(term7880, term7880.getClass(), "popups", null);
        setField(term7880, term7880.getClass(), "name", null);
        setBooleanField(term7880, term7880.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7880, term7880.getClass(), "focusable", false);
        setIntField(term7880, term7880.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7880, term7880.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7880, term7880.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7880, term7880.getClass(), "acc", null);
        setField(term7880, term7880.getClass(), "minSize", null);
        setBooleanField(term7880, term7880.getClass(), "minSizeSet", false);
        setField(term7880, term7880.getClass(), "prefSize", null);
        setBooleanField(term7880, term7880.getClass(), "prefSizeSet", false);
        setField(term7880, term7880.getClass(), "maxSize", null);
        setBooleanField(term7880, term7880.getClass(), "maxSizeSet", false);
        setField(term7880, term7880.getClass(), "componentOrientation", null);
        setBooleanField(term7880, term7880.getClass(), "newEventsOnly", false);
        setField(term7880, term7880.getClass(), "componentListener", null);
        setField(term7880, term7880.getClass(), "focusListener", null);
        setField(term7880, term7880.getClass(), "hierarchyListener", null);
        setField(term7880, term7880.getClass(), "hierarchyBoundsListener", null);
        setField(term7880, term7880.getClass(), "keyListener", null);
        setField(term7880, term7880.getClass(), "mouseListener", null);
        setField(term7880, term7880.getClass(), "mouseMotionListener", null);
        setField(term7880, term7880.getClass(), "mouseWheelListener", null);
        setField(term7880, term7880.getClass(), "inputMethodListener", null);
        setLongField(term7880, term7880.getClass(), "eventMask", 0L);
        setField(term7880, term7880.getClass(), "changeSupport", null);
        setField(term7880, term7880.getClass(), "objectLock", null);
        setBooleanField(term7880, term7880.getClass(), "isPacked", false);
        setIntField(term7880, term7880.getClass(), "boundsOp", 0);
        setField(term7880, term7880.getClass(), "compoundShape", null);
        setField(term7880, term7880.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7880, term7880.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7880, term7880.getClass(), "backgroundEraseDisabled", false);
        setField(term7880, term7880.getClass(), "eventCache", null);
        setBooleanField(term7880, term7880.getClass(), "coalescingEnabled", false);
        setBooleanField(term7880, term7880.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7880, term7880.getClass(), "componentSerializedDataVersion", 0);
        setField(term7880, term7880.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.Console");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term7880, args);
    }

};


