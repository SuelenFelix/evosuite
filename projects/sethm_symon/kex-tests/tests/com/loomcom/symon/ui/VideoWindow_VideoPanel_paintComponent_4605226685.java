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

public class VideoWindow_VideoPanel_paintComponent_4605226685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6936;

    public VideoWindow_VideoPanel_paintComponent_4605226685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6936 = newInstance(Class.forName("com.loomcom.symon.ui.VideoWindow$VideoPanel"));
        setField(term6936, term6936.getClass(), "this$0", null);
        setBooleanField(term6936, term6936.getClass(), "isAlignmentXSet", false);
        setFloatField(term6936, term6936.getClass(), "alignmentX", 0.0F);
        setBooleanField(term6936, term6936.getClass(), "isAlignmentYSet", false);
        setFloatField(term6936, term6936.getClass(), "alignmentY", 0.0F);
        setField(term6936, term6936.getClass(), "ui", null);
        setField(term6936, term6936.getClass(), "listenerList", null);
        setField(term6936, term6936.getClass(), "clientProperties", null);
        setField(term6936, term6936.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term6936, term6936.getClass(), "autoscrolls", false);
        setField(term6936, term6936.getClass(), "border", null);
        setIntField(term6936, term6936.getClass(), "flags", 0);
        setField(term6936, term6936.getClass(), "inputVerifier", null);
        setBooleanField(term6936, term6936.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term6936, term6936.getClass(), "paintingChild", null);
        setField(term6936, term6936.getClass(), "popupMenu", null);
        setField(term6936, term6936.getClass(), "revalidateRunnableScheduled", null);
        setField(term6936, term6936.getClass(), "focusInputMap", null);
        setField(term6936, term6936.getClass(), "ancestorInputMap", null);
        setField(term6936, term6936.getClass(), "windowInputMap", null);
        setField(term6936, term6936.getClass(), "actionMap", null);
        setField(term6936, term6936.getClass(), "aaHint", null);
        setField(term6936, term6936.getClass(), "lcdRenderingHint", null);
        setField(term6936, term6936.getClass(), "component", null);
        setField(term6936, term6936.getClass(), "layoutMgr", null);
        setField(term6936, term6936.getClass(), "dispatcher", null);
        setField(term6936, term6936.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6936, term6936.getClass(), "focusCycleRoot", false);
        setBooleanField(term6936, term6936.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6936, term6936.getClass(), "printingThreads", null);
        setBooleanField(term6936, term6936.getClass(), "printing", false);
        setField(term6936, term6936.getClass(), "containerListener", null);
        setIntField(term6936, term6936.getClass(), "listeningChildren", 0);
        setIntField(term6936, term6936.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6936, term6936.getClass(), "descendantsCount", 0);
        setField(term6936, term6936.getClass(), "preserveBackgroundColor", null);
        setIntField(term6936, term6936.getClass(), "numOfHWComponents", 0);
        setIntField(term6936, term6936.getClass(), "numOfLWComponents", 0);
        setField(term6936, term6936.getClass(), "modalComp", null);
        setField(term6936, term6936.getClass(), "modalAppContext", null);
        setIntField(term6936, term6936.getClass(), "containerSerializedDataVersion", 0);
        setField(term6936, term6936.getClass(), "peer", null);
        setField(term6936, term6936.getClass(), "parent", null);
        setField(term6936, term6936.getClass(), "appContext", null);
        setIntField(term6936, term6936.getClass(), "x", 0);
        setIntField(term6936, term6936.getClass(), "y", 0);
        setIntField(term6936, term6936.getClass(), "width", 0);
        setIntField(term6936, term6936.getClass(), "height", 0);
        setField(term6936, term6936.getClass(), "foreground", null);
        setField(term6936, term6936.getClass(), "background", null);
        setField(term6936, term6936.getClass(), "font", null);
        setField(term6936, term6936.getClass(), "peerFont", null);
        setField(term6936, term6936.getClass(), "cursor", null);
        setField(term6936, term6936.getClass(), "locale", null);
        setField(term6936, term6936.getClass(), "graphicsConfig", null);
        setField(term6936, term6936.getClass(), "bufferStrategy", null);
        setBooleanField(term6936, term6936.getClass(), "ignoreRepaint", false);
        setBooleanField(term6936, term6936.getClass(), "visible", false);
        setBooleanField(term6936, term6936.getClass(), "enabled", false);
        setBooleanField(term6936, term6936.getClass(), "valid", false);
        setField(term6936, term6936.getClass(), "dropTarget", null);
        setField(term6936, term6936.getClass(), "popups", null);
        setField(term6936, term6936.getClass(), "name", null);
        setBooleanField(term6936, term6936.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6936, term6936.getClass(), "focusable", false);
        setIntField(term6936, term6936.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6936, term6936.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6936, term6936.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6936, term6936.getClass(), "acc", null);
        setField(term6936, term6936.getClass(), "minSize", null);
        setBooleanField(term6936, term6936.getClass(), "minSizeSet", false);
        setField(term6936, term6936.getClass(), "prefSize", null);
        setBooleanField(term6936, term6936.getClass(), "prefSizeSet", false);
        setField(term6936, term6936.getClass(), "maxSize", null);
        setBooleanField(term6936, term6936.getClass(), "maxSizeSet", false);
        setField(term6936, term6936.getClass(), "componentOrientation", null);
        setBooleanField(term6936, term6936.getClass(), "newEventsOnly", false);
        setField(term6936, term6936.getClass(), "componentListener", null);
        setField(term6936, term6936.getClass(), "focusListener", null);
        setField(term6936, term6936.getClass(), "hierarchyListener", null);
        setField(term6936, term6936.getClass(), "hierarchyBoundsListener", null);
        setField(term6936, term6936.getClass(), "keyListener", null);
        setField(term6936, term6936.getClass(), "mouseListener", null);
        setField(term6936, term6936.getClass(), "mouseMotionListener", null);
        setField(term6936, term6936.getClass(), "mouseWheelListener", null);
        setField(term6936, term6936.getClass(), "inputMethodListener", null);
        setLongField(term6936, term6936.getClass(), "eventMask", 0L);
        setField(term6936, term6936.getClass(), "changeSupport", null);
        setField(term6936, term6936.getClass(), "objectLock", null);
        setBooleanField(term6936, term6936.getClass(), "isPacked", false);
        setIntField(term6936, term6936.getClass(), "boundsOp", 0);
        setField(term6936, term6936.getClass(), "compoundShape", null);
        setField(term6936, term6936.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6936, term6936.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6936, term6936.getClass(), "backgroundEraseDisabled", false);
        setField(term6936, term6936.getClass(), "eventCache", null);
        setBooleanField(term6936, term6936.getClass(), "coalescingEnabled", false);
        setBooleanField(term6936, term6936.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6936, term6936.getClass(), "componentSerializedDataVersion", 0);
        setField(term6936, term6936.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.VideoWindow$VideoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term6936, args);
    }

};


