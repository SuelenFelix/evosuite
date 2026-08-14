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
import java.lang.Integer;

public class FlexibleSpaceComp_firePropertyChange_5678430267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3312;
     Object term3353;
     Object term3355;

    public FlexibleSpaceComp_firePropertyChange_5678430267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3312 = newInstance(Class.forName("io.codeworth.panelmatic.impl.FlexibleSpaceComp"));
        setBooleanField(term3312, term3312.getClass(), "isAlignmentXSet", false);
        setFloatField(term3312, term3312.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3312, term3312.getClass(), "isAlignmentYSet", false);
        setFloatField(term3312, term3312.getClass(), "alignmentY", 0.0F);
        setField(term3312, term3312.getClass(), "ui", null);
        setField(term3312, term3312.getClass(), "listenerList", null);
        setField(term3312, term3312.getClass(), "clientProperties", null);
        setField(term3312, term3312.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3312, term3312.getClass(), "autoscrolls", false);
        setField(term3312, term3312.getClass(), "border", null);
        setIntField(term3312, term3312.getClass(), "flags", 0);
        setField(term3312, term3312.getClass(), "inputVerifier", null);
        setBooleanField(term3312, term3312.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3312, term3312.getClass(), "paintingChild", null);
        setField(term3312, term3312.getClass(), "popupMenu", null);
        setField(term3312, term3312.getClass(), "revalidateRunnableScheduled", null);
        setField(term3312, term3312.getClass(), "focusInputMap", null);
        setField(term3312, term3312.getClass(), "ancestorInputMap", null);
        setField(term3312, term3312.getClass(), "windowInputMap", null);
        setField(term3312, term3312.getClass(), "actionMap", null);
        setField(term3312, term3312.getClass(), "aaHint", null);
        setField(term3312, term3312.getClass(), "lcdRenderingHint", null);
        setField(term3312, term3312.getClass(), "component", null);
        setField(term3312, term3312.getClass(), "layoutMgr", null);
        setField(term3312, term3312.getClass(), "dispatcher", null);
        setField(term3312, term3312.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3312, term3312.getClass(), "focusCycleRoot", false);
        setBooleanField(term3312, term3312.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3312, term3312.getClass(), "printingThreads", null);
        setBooleanField(term3312, term3312.getClass(), "printing", false);
        setField(term3312, term3312.getClass(), "containerListener", null);
        setIntField(term3312, term3312.getClass(), "listeningChildren", 0);
        setIntField(term3312, term3312.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3312, term3312.getClass(), "descendantsCount", 0);
        setField(term3312, term3312.getClass(), "preserveBackgroundColor", null);
        setIntField(term3312, term3312.getClass(), "numOfHWComponents", 0);
        setIntField(term3312, term3312.getClass(), "numOfLWComponents", 0);
        setField(term3312, term3312.getClass(), "modalComp", null);
        setField(term3312, term3312.getClass(), "modalAppContext", null);
        setIntField(term3312, term3312.getClass(), "containerSerializedDataVersion", 0);
        setField(term3312, term3312.getClass(), "peer", null);
        setField(term3312, term3312.getClass(), "parent", null);
        setField(term3312, term3312.getClass(), "appContext", null);
        setIntField(term3312, term3312.getClass(), "x", 0);
        setIntField(term3312, term3312.getClass(), "y", 0);
        setIntField(term3312, term3312.getClass(), "width", 0);
        setIntField(term3312, term3312.getClass(), "height", 0);
        setField(term3312, term3312.getClass(), "foreground", null);
        setField(term3312, term3312.getClass(), "background", null);
        setField(term3312, term3312.getClass(), "font", null);
        setField(term3312, term3312.getClass(), "peerFont", null);
        setField(term3312, term3312.getClass(), "cursor", null);
        setField(term3312, term3312.getClass(), "locale", null);
        setField(term3312, term3312.getClass(), "graphicsConfig", null);
        setField(term3312, term3312.getClass(), "bufferStrategy", null);
        setBooleanField(term3312, term3312.getClass(), "ignoreRepaint", false);
        setBooleanField(term3312, term3312.getClass(), "visible", false);
        setBooleanField(term3312, term3312.getClass(), "enabled", false);
        setBooleanField(term3312, term3312.getClass(), "valid", false);
        setField(term3312, term3312.getClass(), "dropTarget", null);
        setField(term3312, term3312.getClass(), "popups", null);
        setField(term3312, term3312.getClass(), "name", null);
        setBooleanField(term3312, term3312.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3312, term3312.getClass(), "focusable", false);
        setIntField(term3312, term3312.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3312, term3312.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3312, term3312.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3312, term3312.getClass(), "acc", null);
        setField(term3312, term3312.getClass(), "minSize", null);
        setBooleanField(term3312, term3312.getClass(), "minSizeSet", false);
        setField(term3312, term3312.getClass(), "prefSize", null);
        setBooleanField(term3312, term3312.getClass(), "prefSizeSet", false);
        setField(term3312, term3312.getClass(), "maxSize", null);
        setBooleanField(term3312, term3312.getClass(), "maxSizeSet", false);
        setField(term3312, term3312.getClass(), "componentOrientation", null);
        setBooleanField(term3312, term3312.getClass(), "newEventsOnly", false);
        setField(term3312, term3312.getClass(), "componentListener", null);
        setField(term3312, term3312.getClass(), "focusListener", null);
        setField(term3312, term3312.getClass(), "hierarchyListener", null);
        setField(term3312, term3312.getClass(), "hierarchyBoundsListener", null);
        setField(term3312, term3312.getClass(), "keyListener", null);
        setField(term3312, term3312.getClass(), "mouseListener", null);
        setField(term3312, term3312.getClass(), "mouseMotionListener", null);
        setField(term3312, term3312.getClass(), "mouseWheelListener", null);
        setField(term3312, term3312.getClass(), "inputMethodListener", null);
        setLongField(term3312, term3312.getClass(), "eventMask", 0L);
        setField(term3312, term3312.getClass(), "changeSupport", null);
        setField(term3312, term3312.getClass(), "objectLock", null);
        setBooleanField(term3312, term3312.getClass(), "isPacked", false);
        setIntField(term3312, term3312.getClass(), "boundsOp", 0);
        setField(term3312, term3312.getClass(), "compoundShape", null);
        setField(term3312, term3312.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3312, term3312.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3312, term3312.getClass(), "backgroundEraseDisabled", false);
        setField(term3312, term3312.getClass(), "eventCache", null);
        setBooleanField(term3312, term3312.getClass(), "coalescingEnabled", false);
        setBooleanField(term3312, term3312.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3312, term3312.getClass(), "componentSerializedDataVersion", 0);
        setField(term3312, term3312.getClass(), "accessibleContext", null);
        term3353 = new Integer(0);
        term3355 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.FlexibleSpaceComp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3353;
        args[2] = term3355;
        callMethod(klass, "firePropertyChange", argTypes, term3312, args);
    }

};


