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
import java.lang.Boolean;

public class FlexibleSpaceComp_firePropertyChange_5678747706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3267;
     Object term3308;
     Object term3310;

    public FlexibleSpaceComp_firePropertyChange_5678747706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3267 = newInstance(Class.forName("io.codeworth.panelmatic.impl.FlexibleSpaceComp"));
        setBooleanField(term3267, term3267.getClass(), "isAlignmentXSet", false);
        setFloatField(term3267, term3267.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3267, term3267.getClass(), "isAlignmentYSet", false);
        setFloatField(term3267, term3267.getClass(), "alignmentY", 0.0F);
        setField(term3267, term3267.getClass(), "ui", null);
        setField(term3267, term3267.getClass(), "listenerList", null);
        setField(term3267, term3267.getClass(), "clientProperties", null);
        setField(term3267, term3267.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3267, term3267.getClass(), "autoscrolls", false);
        setField(term3267, term3267.getClass(), "border", null);
        setIntField(term3267, term3267.getClass(), "flags", 0);
        setField(term3267, term3267.getClass(), "inputVerifier", null);
        setBooleanField(term3267, term3267.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3267, term3267.getClass(), "paintingChild", null);
        setField(term3267, term3267.getClass(), "popupMenu", null);
        setField(term3267, term3267.getClass(), "revalidateRunnableScheduled", null);
        setField(term3267, term3267.getClass(), "focusInputMap", null);
        setField(term3267, term3267.getClass(), "ancestorInputMap", null);
        setField(term3267, term3267.getClass(), "windowInputMap", null);
        setField(term3267, term3267.getClass(), "actionMap", null);
        setField(term3267, term3267.getClass(), "aaHint", null);
        setField(term3267, term3267.getClass(), "lcdRenderingHint", null);
        setField(term3267, term3267.getClass(), "component", null);
        setField(term3267, term3267.getClass(), "layoutMgr", null);
        setField(term3267, term3267.getClass(), "dispatcher", null);
        setField(term3267, term3267.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3267, term3267.getClass(), "focusCycleRoot", false);
        setBooleanField(term3267, term3267.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3267, term3267.getClass(), "printingThreads", null);
        setBooleanField(term3267, term3267.getClass(), "printing", false);
        setField(term3267, term3267.getClass(), "containerListener", null);
        setIntField(term3267, term3267.getClass(), "listeningChildren", 0);
        setIntField(term3267, term3267.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3267, term3267.getClass(), "descendantsCount", 0);
        setField(term3267, term3267.getClass(), "preserveBackgroundColor", null);
        setIntField(term3267, term3267.getClass(), "numOfHWComponents", 0);
        setIntField(term3267, term3267.getClass(), "numOfLWComponents", 0);
        setField(term3267, term3267.getClass(), "modalComp", null);
        setField(term3267, term3267.getClass(), "modalAppContext", null);
        setIntField(term3267, term3267.getClass(), "containerSerializedDataVersion", 0);
        setField(term3267, term3267.getClass(), "peer", null);
        setField(term3267, term3267.getClass(), "parent", null);
        setField(term3267, term3267.getClass(), "appContext", null);
        setIntField(term3267, term3267.getClass(), "x", 0);
        setIntField(term3267, term3267.getClass(), "y", 0);
        setIntField(term3267, term3267.getClass(), "width", 0);
        setIntField(term3267, term3267.getClass(), "height", 0);
        setField(term3267, term3267.getClass(), "foreground", null);
        setField(term3267, term3267.getClass(), "background", null);
        setField(term3267, term3267.getClass(), "font", null);
        setField(term3267, term3267.getClass(), "peerFont", null);
        setField(term3267, term3267.getClass(), "cursor", null);
        setField(term3267, term3267.getClass(), "locale", null);
        setField(term3267, term3267.getClass(), "graphicsConfig", null);
        setField(term3267, term3267.getClass(), "bufferStrategy", null);
        setBooleanField(term3267, term3267.getClass(), "ignoreRepaint", false);
        setBooleanField(term3267, term3267.getClass(), "visible", false);
        setBooleanField(term3267, term3267.getClass(), "enabled", false);
        setBooleanField(term3267, term3267.getClass(), "valid", false);
        setField(term3267, term3267.getClass(), "dropTarget", null);
        setField(term3267, term3267.getClass(), "popups", null);
        setField(term3267, term3267.getClass(), "name", null);
        setBooleanField(term3267, term3267.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3267, term3267.getClass(), "focusable", false);
        setIntField(term3267, term3267.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3267, term3267.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3267, term3267.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3267, term3267.getClass(), "acc", null);
        setField(term3267, term3267.getClass(), "minSize", null);
        setBooleanField(term3267, term3267.getClass(), "minSizeSet", false);
        setField(term3267, term3267.getClass(), "prefSize", null);
        setBooleanField(term3267, term3267.getClass(), "prefSizeSet", false);
        setField(term3267, term3267.getClass(), "maxSize", null);
        setBooleanField(term3267, term3267.getClass(), "maxSizeSet", false);
        setField(term3267, term3267.getClass(), "componentOrientation", null);
        setBooleanField(term3267, term3267.getClass(), "newEventsOnly", false);
        setField(term3267, term3267.getClass(), "componentListener", null);
        setField(term3267, term3267.getClass(), "focusListener", null);
        setField(term3267, term3267.getClass(), "hierarchyListener", null);
        setField(term3267, term3267.getClass(), "hierarchyBoundsListener", null);
        setField(term3267, term3267.getClass(), "keyListener", null);
        setField(term3267, term3267.getClass(), "mouseListener", null);
        setField(term3267, term3267.getClass(), "mouseMotionListener", null);
        setField(term3267, term3267.getClass(), "mouseWheelListener", null);
        setField(term3267, term3267.getClass(), "inputMethodListener", null);
        setLongField(term3267, term3267.getClass(), "eventMask", 0L);
        setField(term3267, term3267.getClass(), "changeSupport", null);
        setField(term3267, term3267.getClass(), "objectLock", null);
        setBooleanField(term3267, term3267.getClass(), "isPacked", false);
        setIntField(term3267, term3267.getClass(), "boundsOp", 0);
        setField(term3267, term3267.getClass(), "compoundShape", null);
        setField(term3267, term3267.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3267, term3267.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3267, term3267.getClass(), "backgroundEraseDisabled", false);
        setField(term3267, term3267.getClass(), "eventCache", null);
        setBooleanField(term3267, term3267.getClass(), "coalescingEnabled", false);
        setBooleanField(term3267, term3267.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3267, term3267.getClass(), "componentSerializedDataVersion", 0);
        setField(term3267, term3267.getClass(), "accessibleContext", null);
        term3308 = new Boolean(false);
        term3310 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.FlexibleSpaceComp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3308;
        args[2] = term3310;
        callMethod(klass, "firePropertyChange", argTypes, term3267, args);
    }

};


