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

public class VideoWindow_VideoPanel_getMinimumSize_11450091756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6977;

    public VideoWindow_VideoPanel_getMinimumSize_11450091756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6977 = newInstance(Class.forName("com.loomcom.symon.ui.VideoWindow$VideoPanel"));
        setField(term6977, term6977.getClass(), "this$0", null);
        setBooleanField(term6977, term6977.getClass(), "isAlignmentXSet", false);
        setFloatField(term6977, term6977.getClass(), "alignmentX", 0.0F);
        setBooleanField(term6977, term6977.getClass(), "isAlignmentYSet", false);
        setFloatField(term6977, term6977.getClass(), "alignmentY", 0.0F);
        setField(term6977, term6977.getClass(), "ui", null);
        setField(term6977, term6977.getClass(), "listenerList", null);
        setField(term6977, term6977.getClass(), "clientProperties", null);
        setField(term6977, term6977.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term6977, term6977.getClass(), "autoscrolls", false);
        setField(term6977, term6977.getClass(), "border", null);
        setIntField(term6977, term6977.getClass(), "flags", 0);
        setField(term6977, term6977.getClass(), "inputVerifier", null);
        setBooleanField(term6977, term6977.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term6977, term6977.getClass(), "paintingChild", null);
        setField(term6977, term6977.getClass(), "popupMenu", null);
        setField(term6977, term6977.getClass(), "revalidateRunnableScheduled", null);
        setField(term6977, term6977.getClass(), "focusInputMap", null);
        setField(term6977, term6977.getClass(), "ancestorInputMap", null);
        setField(term6977, term6977.getClass(), "windowInputMap", null);
        setField(term6977, term6977.getClass(), "actionMap", null);
        setField(term6977, term6977.getClass(), "aaHint", null);
        setField(term6977, term6977.getClass(), "lcdRenderingHint", null);
        setField(term6977, term6977.getClass(), "component", null);
        setField(term6977, term6977.getClass(), "layoutMgr", null);
        setField(term6977, term6977.getClass(), "dispatcher", null);
        setField(term6977, term6977.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term6977, term6977.getClass(), "focusCycleRoot", false);
        setBooleanField(term6977, term6977.getClass(), "focusTraversalPolicyProvider", false);
        setField(term6977, term6977.getClass(), "printingThreads", null);
        setBooleanField(term6977, term6977.getClass(), "printing", false);
        setField(term6977, term6977.getClass(), "containerListener", null);
        setIntField(term6977, term6977.getClass(), "listeningChildren", 0);
        setIntField(term6977, term6977.getClass(), "listeningBoundsChildren", 0);
        setIntField(term6977, term6977.getClass(), "descendantsCount", 0);
        setField(term6977, term6977.getClass(), "preserveBackgroundColor", null);
        setIntField(term6977, term6977.getClass(), "numOfHWComponents", 0);
        setIntField(term6977, term6977.getClass(), "numOfLWComponents", 0);
        setField(term6977, term6977.getClass(), "modalComp", null);
        setField(term6977, term6977.getClass(), "modalAppContext", null);
        setIntField(term6977, term6977.getClass(), "containerSerializedDataVersion", 0);
        setField(term6977, term6977.getClass(), "peer", null);
        setField(term6977, term6977.getClass(), "parent", null);
        setField(term6977, term6977.getClass(), "appContext", null);
        setIntField(term6977, term6977.getClass(), "x", 0);
        setIntField(term6977, term6977.getClass(), "y", 0);
        setIntField(term6977, term6977.getClass(), "width", 0);
        setIntField(term6977, term6977.getClass(), "height", 0);
        setField(term6977, term6977.getClass(), "foreground", null);
        setField(term6977, term6977.getClass(), "background", null);
        setField(term6977, term6977.getClass(), "font", null);
        setField(term6977, term6977.getClass(), "peerFont", null);
        setField(term6977, term6977.getClass(), "cursor", null);
        setField(term6977, term6977.getClass(), "locale", null);
        setField(term6977, term6977.getClass(), "graphicsConfig", null);
        setField(term6977, term6977.getClass(), "bufferStrategy", null);
        setBooleanField(term6977, term6977.getClass(), "ignoreRepaint", false);
        setBooleanField(term6977, term6977.getClass(), "visible", false);
        setBooleanField(term6977, term6977.getClass(), "enabled", false);
        setBooleanField(term6977, term6977.getClass(), "valid", false);
        setField(term6977, term6977.getClass(), "dropTarget", null);
        setField(term6977, term6977.getClass(), "popups", null);
        setField(term6977, term6977.getClass(), "name", null);
        setBooleanField(term6977, term6977.getClass(), "nameExplicitlySet", false);
        setBooleanField(term6977, term6977.getClass(), "focusable", false);
        setIntField(term6977, term6977.getClass(), "isFocusTraversableOverridden", 0);
        setField(term6977, term6977.getClass(), "focusTraversalKeys", null);
        setBooleanField(term6977, term6977.getClass(), "focusTraversalKeysEnabled", false);
        setField(term6977, term6977.getClass(), "acc", null);
        setField(term6977, term6977.getClass(), "minSize", null);
        setBooleanField(term6977, term6977.getClass(), "minSizeSet", false);
        setField(term6977, term6977.getClass(), "prefSize", null);
        setBooleanField(term6977, term6977.getClass(), "prefSizeSet", false);
        setField(term6977, term6977.getClass(), "maxSize", null);
        setBooleanField(term6977, term6977.getClass(), "maxSizeSet", false);
        setField(term6977, term6977.getClass(), "componentOrientation", null);
        setBooleanField(term6977, term6977.getClass(), "newEventsOnly", false);
        setField(term6977, term6977.getClass(), "componentListener", null);
        setField(term6977, term6977.getClass(), "focusListener", null);
        setField(term6977, term6977.getClass(), "hierarchyListener", null);
        setField(term6977, term6977.getClass(), "hierarchyBoundsListener", null);
        setField(term6977, term6977.getClass(), "keyListener", null);
        setField(term6977, term6977.getClass(), "mouseListener", null);
        setField(term6977, term6977.getClass(), "mouseMotionListener", null);
        setField(term6977, term6977.getClass(), "mouseWheelListener", null);
        setField(term6977, term6977.getClass(), "inputMethodListener", null);
        setLongField(term6977, term6977.getClass(), "eventMask", 0L);
        setField(term6977, term6977.getClass(), "changeSupport", null);
        setField(term6977, term6977.getClass(), "objectLock", null);
        setBooleanField(term6977, term6977.getClass(), "isPacked", false);
        setIntField(term6977, term6977.getClass(), "boundsOp", 0);
        setField(term6977, term6977.getClass(), "compoundShape", null);
        setField(term6977, term6977.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term6977, term6977.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term6977, term6977.getClass(), "backgroundEraseDisabled", false);
        setField(term6977, term6977.getClass(), "eventCache", null);
        setBooleanField(term6977, term6977.getClass(), "coalescingEnabled", false);
        setBooleanField(term6977, term6977.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term6977, term6977.getClass(), "componentSerializedDataVersion", 0);
        setField(term6977, term6977.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.VideoWindow$VideoPanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMinimumSize", argTypes, term6977, args);
    }

};


