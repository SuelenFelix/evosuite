package io.codeworth.panelmatic.impl;

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
import static io.codeworth.panelmatic.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FlexibleSpaceComp_doLayout_4622910199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3402;

    public FlexibleSpaceComp_doLayout_4622910199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3402 = newInstance(Class.forName("io.codeworth.panelmatic.impl.FlexibleSpaceComp"));
        setBooleanField(term3402, term3402.getClass(), "isAlignmentXSet", false);
        setFloatField(term3402, term3402.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3402, term3402.getClass(), "isAlignmentYSet", false);
        setFloatField(term3402, term3402.getClass(), "alignmentY", 0.0F);
        setField(term3402, term3402.getClass(), "ui", null);
        setField(term3402, term3402.getClass(), "listenerList", null);
        setField(term3402, term3402.getClass(), "clientProperties", null);
        setField(term3402, term3402.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3402, term3402.getClass(), "autoscrolls", false);
        setField(term3402, term3402.getClass(), "border", null);
        setIntField(term3402, term3402.getClass(), "flags", 0);
        setField(term3402, term3402.getClass(), "inputVerifier", null);
        setBooleanField(term3402, term3402.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3402, term3402.getClass(), "paintingChild", null);
        setField(term3402, term3402.getClass(), "popupMenu", null);
        setField(term3402, term3402.getClass(), "revalidateRunnableScheduled", null);
        setField(term3402, term3402.getClass(), "focusInputMap", null);
        setField(term3402, term3402.getClass(), "ancestorInputMap", null);
        setField(term3402, term3402.getClass(), "windowInputMap", null);
        setField(term3402, term3402.getClass(), "actionMap", null);
        setField(term3402, term3402.getClass(), "aaHint", null);
        setField(term3402, term3402.getClass(), "lcdRenderingHint", null);
        setField(term3402, term3402.getClass(), "component", null);
        setField(term3402, term3402.getClass(), "layoutMgr", null);
        setField(term3402, term3402.getClass(), "dispatcher", null);
        setField(term3402, term3402.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3402, term3402.getClass(), "focusCycleRoot", false);
        setBooleanField(term3402, term3402.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3402, term3402.getClass(), "printingThreads", null);
        setBooleanField(term3402, term3402.getClass(), "printing", false);
        setField(term3402, term3402.getClass(), "containerListener", null);
        setIntField(term3402, term3402.getClass(), "listeningChildren", 0);
        setIntField(term3402, term3402.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3402, term3402.getClass(), "descendantsCount", 0);
        setField(term3402, term3402.getClass(), "preserveBackgroundColor", null);
        setIntField(term3402, term3402.getClass(), "numOfHWComponents", 0);
        setIntField(term3402, term3402.getClass(), "numOfLWComponents", 0);
        setField(term3402, term3402.getClass(), "modalComp", null);
        setField(term3402, term3402.getClass(), "modalAppContext", null);
        setIntField(term3402, term3402.getClass(), "containerSerializedDataVersion", 0);
        setField(term3402, term3402.getClass(), "peer", null);
        setField(term3402, term3402.getClass(), "parent", null);
        setField(term3402, term3402.getClass(), "appContext", null);
        setIntField(term3402, term3402.getClass(), "x", 0);
        setIntField(term3402, term3402.getClass(), "y", 0);
        setIntField(term3402, term3402.getClass(), "width", 0);
        setIntField(term3402, term3402.getClass(), "height", 0);
        setField(term3402, term3402.getClass(), "foreground", null);
        setField(term3402, term3402.getClass(), "background", null);
        setField(term3402, term3402.getClass(), "font", null);
        setField(term3402, term3402.getClass(), "peerFont", null);
        setField(term3402, term3402.getClass(), "cursor", null);
        setField(term3402, term3402.getClass(), "locale", null);
        setField(term3402, term3402.getClass(), "graphicsConfig", null);
        setField(term3402, term3402.getClass(), "bufferStrategy", null);
        setBooleanField(term3402, term3402.getClass(), "ignoreRepaint", false);
        setBooleanField(term3402, term3402.getClass(), "visible", false);
        setBooleanField(term3402, term3402.getClass(), "enabled", false);
        setBooleanField(term3402, term3402.getClass(), "valid", false);
        setField(term3402, term3402.getClass(), "dropTarget", null);
        setField(term3402, term3402.getClass(), "popups", null);
        setField(term3402, term3402.getClass(), "name", null);
        setBooleanField(term3402, term3402.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3402, term3402.getClass(), "focusable", false);
        setIntField(term3402, term3402.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3402, term3402.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3402, term3402.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3402, term3402.getClass(), "acc", null);
        setField(term3402, term3402.getClass(), "minSize", null);
        setBooleanField(term3402, term3402.getClass(), "minSizeSet", false);
        setField(term3402, term3402.getClass(), "prefSize", null);
        setBooleanField(term3402, term3402.getClass(), "prefSizeSet", false);
        setField(term3402, term3402.getClass(), "maxSize", null);
        setBooleanField(term3402, term3402.getClass(), "maxSizeSet", false);
        setField(term3402, term3402.getClass(), "componentOrientation", null);
        setBooleanField(term3402, term3402.getClass(), "newEventsOnly", false);
        setField(term3402, term3402.getClass(), "componentListener", null);
        setField(term3402, term3402.getClass(), "focusListener", null);
        setField(term3402, term3402.getClass(), "hierarchyListener", null);
        setField(term3402, term3402.getClass(), "hierarchyBoundsListener", null);
        setField(term3402, term3402.getClass(), "keyListener", null);
        setField(term3402, term3402.getClass(), "mouseListener", null);
        setField(term3402, term3402.getClass(), "mouseMotionListener", null);
        setField(term3402, term3402.getClass(), "mouseWheelListener", null);
        setField(term3402, term3402.getClass(), "inputMethodListener", null);
        setLongField(term3402, term3402.getClass(), "eventMask", 0L);
        setField(term3402, term3402.getClass(), "changeSupport", null);
        setField(term3402, term3402.getClass(), "objectLock", null);
        setBooleanField(term3402, term3402.getClass(), "isPacked", false);
        setIntField(term3402, term3402.getClass(), "boundsOp", 0);
        setField(term3402, term3402.getClass(), "compoundShape", null);
        setField(term3402, term3402.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3402, term3402.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3402, term3402.getClass(), "backgroundEraseDisabled", false);
        setField(term3402, term3402.getClass(), "eventCache", null);
        setBooleanField(term3402, term3402.getClass(), "coalescingEnabled", false);
        setBooleanField(term3402, term3402.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3402, term3402.getClass(), "componentSerializedDataVersion", 0);
        setField(term3402, term3402.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.FlexibleSpaceComp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "doLayout", argTypes, term3402, args);
    }

};


