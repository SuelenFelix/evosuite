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

public class VideoWindow_VideoPanel_getPreferredSize_5713253407 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7018;

    public VideoWindow_VideoPanel_getPreferredSize_5713253407() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7018 = newInstance(Class.forName("com.loomcom.symon.ui.VideoWindow$VideoPanel"));
        setField(term7018, term7018.getClass(), "this$0", null);
        setBooleanField(term7018, term7018.getClass(), "isAlignmentXSet", false);
        setFloatField(term7018, term7018.getClass(), "alignmentX", 0.0F);
        setBooleanField(term7018, term7018.getClass(), "isAlignmentYSet", false);
        setFloatField(term7018, term7018.getClass(), "alignmentY", 0.0F);
        setField(term7018, term7018.getClass(), "ui", null);
        setField(term7018, term7018.getClass(), "listenerList", null);
        setField(term7018, term7018.getClass(), "clientProperties", null);
        setField(term7018, term7018.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term7018, term7018.getClass(), "autoscrolls", false);
        setField(term7018, term7018.getClass(), "border", null);
        setIntField(term7018, term7018.getClass(), "flags", 0);
        setField(term7018, term7018.getClass(), "inputVerifier", null);
        setBooleanField(term7018, term7018.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term7018, term7018.getClass(), "paintingChild", null);
        setField(term7018, term7018.getClass(), "popupMenu", null);
        setField(term7018, term7018.getClass(), "revalidateRunnableScheduled", null);
        setField(term7018, term7018.getClass(), "focusInputMap", null);
        setField(term7018, term7018.getClass(), "ancestorInputMap", null);
        setField(term7018, term7018.getClass(), "windowInputMap", null);
        setField(term7018, term7018.getClass(), "actionMap", null);
        setField(term7018, term7018.getClass(), "aaHint", null);
        setField(term7018, term7018.getClass(), "lcdRenderingHint", null);
        setField(term7018, term7018.getClass(), "component", null);
        setField(term7018, term7018.getClass(), "layoutMgr", null);
        setField(term7018, term7018.getClass(), "dispatcher", null);
        setField(term7018, term7018.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term7018, term7018.getClass(), "focusCycleRoot", false);
        setBooleanField(term7018, term7018.getClass(), "focusTraversalPolicyProvider", false);
        setField(term7018, term7018.getClass(), "printingThreads", null);
        setBooleanField(term7018, term7018.getClass(), "printing", false);
        setField(term7018, term7018.getClass(), "containerListener", null);
        setIntField(term7018, term7018.getClass(), "listeningChildren", 0);
        setIntField(term7018, term7018.getClass(), "listeningBoundsChildren", 0);
        setIntField(term7018, term7018.getClass(), "descendantsCount", 0);
        setField(term7018, term7018.getClass(), "preserveBackgroundColor", null);
        setIntField(term7018, term7018.getClass(), "numOfHWComponents", 0);
        setIntField(term7018, term7018.getClass(), "numOfLWComponents", 0);
        setField(term7018, term7018.getClass(), "modalComp", null);
        setField(term7018, term7018.getClass(), "modalAppContext", null);
        setIntField(term7018, term7018.getClass(), "containerSerializedDataVersion", 0);
        setField(term7018, term7018.getClass(), "peer", null);
        setField(term7018, term7018.getClass(), "parent", null);
        setField(term7018, term7018.getClass(), "appContext", null);
        setIntField(term7018, term7018.getClass(), "x", 0);
        setIntField(term7018, term7018.getClass(), "y", 0);
        setIntField(term7018, term7018.getClass(), "width", 0);
        setIntField(term7018, term7018.getClass(), "height", 0);
        setField(term7018, term7018.getClass(), "foreground", null);
        setField(term7018, term7018.getClass(), "background", null);
        setField(term7018, term7018.getClass(), "font", null);
        setField(term7018, term7018.getClass(), "peerFont", null);
        setField(term7018, term7018.getClass(), "cursor", null);
        setField(term7018, term7018.getClass(), "locale", null);
        setField(term7018, term7018.getClass(), "graphicsConfig", null);
        setField(term7018, term7018.getClass(), "bufferStrategy", null);
        setBooleanField(term7018, term7018.getClass(), "ignoreRepaint", false);
        setBooleanField(term7018, term7018.getClass(), "visible", false);
        setBooleanField(term7018, term7018.getClass(), "enabled", false);
        setBooleanField(term7018, term7018.getClass(), "valid", false);
        setField(term7018, term7018.getClass(), "dropTarget", null);
        setField(term7018, term7018.getClass(), "popups", null);
        setField(term7018, term7018.getClass(), "name", null);
        setBooleanField(term7018, term7018.getClass(), "nameExplicitlySet", false);
        setBooleanField(term7018, term7018.getClass(), "focusable", false);
        setIntField(term7018, term7018.getClass(), "isFocusTraversableOverridden", 0);
        setField(term7018, term7018.getClass(), "focusTraversalKeys", null);
        setBooleanField(term7018, term7018.getClass(), "focusTraversalKeysEnabled", false);
        setField(term7018, term7018.getClass(), "acc", null);
        setField(term7018, term7018.getClass(), "minSize", null);
        setBooleanField(term7018, term7018.getClass(), "minSizeSet", false);
        setField(term7018, term7018.getClass(), "prefSize", null);
        setBooleanField(term7018, term7018.getClass(), "prefSizeSet", false);
        setField(term7018, term7018.getClass(), "maxSize", null);
        setBooleanField(term7018, term7018.getClass(), "maxSizeSet", false);
        setField(term7018, term7018.getClass(), "componentOrientation", null);
        setBooleanField(term7018, term7018.getClass(), "newEventsOnly", false);
        setField(term7018, term7018.getClass(), "componentListener", null);
        setField(term7018, term7018.getClass(), "focusListener", null);
        setField(term7018, term7018.getClass(), "hierarchyListener", null);
        setField(term7018, term7018.getClass(), "hierarchyBoundsListener", null);
        setField(term7018, term7018.getClass(), "keyListener", null);
        setField(term7018, term7018.getClass(), "mouseListener", null);
        setField(term7018, term7018.getClass(), "mouseMotionListener", null);
        setField(term7018, term7018.getClass(), "mouseWheelListener", null);
        setField(term7018, term7018.getClass(), "inputMethodListener", null);
        setLongField(term7018, term7018.getClass(), "eventMask", 0L);
        setField(term7018, term7018.getClass(), "changeSupport", null);
        setField(term7018, term7018.getClass(), "objectLock", null);
        setBooleanField(term7018, term7018.getClass(), "isPacked", false);
        setIntField(term7018, term7018.getClass(), "boundsOp", 0);
        setField(term7018, term7018.getClass(), "compoundShape", null);
        setField(term7018, term7018.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term7018, term7018.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term7018, term7018.getClass(), "backgroundEraseDisabled", false);
        setField(term7018, term7018.getClass(), "eventCache", null);
        setBooleanField(term7018, term7018.getClass(), "coalescingEnabled", false);
        setBooleanField(term7018, term7018.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term7018, term7018.getClass(), "componentSerializedDataVersion", 0);
        setField(term7018, term7018.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.VideoWindow$VideoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPreferredSize", argTypes, term7018, args);
    }

};


