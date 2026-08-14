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
import java.lang.Character;

public class FlexibleSpaceComp_firePropertyChange_5678747708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3357;
     Object term3398;
     Object term3400;

    public FlexibleSpaceComp_firePropertyChange_5678747708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3357 = newInstance(Class.forName("io.codeworth.panelmatic.impl.FlexibleSpaceComp"));
        setBooleanField(term3357, term3357.getClass(), "isAlignmentXSet", false);
        setFloatField(term3357, term3357.getClass(), "alignmentX", 0.0F);
        setBooleanField(term3357, term3357.getClass(), "isAlignmentYSet", false);
        setFloatField(term3357, term3357.getClass(), "alignmentY", 0.0F);
        setField(term3357, term3357.getClass(), "ui", null);
        setField(term3357, term3357.getClass(), "listenerList", null);
        setField(term3357, term3357.getClass(), "clientProperties", null);
        setField(term3357, term3357.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term3357, term3357.getClass(), "autoscrolls", false);
        setField(term3357, term3357.getClass(), "border", null);
        setIntField(term3357, term3357.getClass(), "flags", 0);
        setField(term3357, term3357.getClass(), "inputVerifier", null);
        setBooleanField(term3357, term3357.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term3357, term3357.getClass(), "paintingChild", null);
        setField(term3357, term3357.getClass(), "popupMenu", null);
        setField(term3357, term3357.getClass(), "revalidateRunnableScheduled", null);
        setField(term3357, term3357.getClass(), "focusInputMap", null);
        setField(term3357, term3357.getClass(), "ancestorInputMap", null);
        setField(term3357, term3357.getClass(), "windowInputMap", null);
        setField(term3357, term3357.getClass(), "actionMap", null);
        setField(term3357, term3357.getClass(), "aaHint", null);
        setField(term3357, term3357.getClass(), "lcdRenderingHint", null);
        setField(term3357, term3357.getClass(), "component", null);
        setField(term3357, term3357.getClass(), "layoutMgr", null);
        setField(term3357, term3357.getClass(), "dispatcher", null);
        setField(term3357, term3357.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term3357, term3357.getClass(), "focusCycleRoot", false);
        setBooleanField(term3357, term3357.getClass(), "focusTraversalPolicyProvider", false);
        setField(term3357, term3357.getClass(), "printingThreads", null);
        setBooleanField(term3357, term3357.getClass(), "printing", false);
        setField(term3357, term3357.getClass(), "containerListener", null);
        setIntField(term3357, term3357.getClass(), "listeningChildren", 0);
        setIntField(term3357, term3357.getClass(), "listeningBoundsChildren", 0);
        setIntField(term3357, term3357.getClass(), "descendantsCount", 0);
        setField(term3357, term3357.getClass(), "preserveBackgroundColor", null);
        setIntField(term3357, term3357.getClass(), "numOfHWComponents", 0);
        setIntField(term3357, term3357.getClass(), "numOfLWComponents", 0);
        setField(term3357, term3357.getClass(), "modalComp", null);
        setField(term3357, term3357.getClass(), "modalAppContext", null);
        setIntField(term3357, term3357.getClass(), "containerSerializedDataVersion", 0);
        setField(term3357, term3357.getClass(), "peer", null);
        setField(term3357, term3357.getClass(), "parent", null);
        setField(term3357, term3357.getClass(), "appContext", null);
        setIntField(term3357, term3357.getClass(), "x", 0);
        setIntField(term3357, term3357.getClass(), "y", 0);
        setIntField(term3357, term3357.getClass(), "width", 0);
        setIntField(term3357, term3357.getClass(), "height", 0);
        setField(term3357, term3357.getClass(), "foreground", null);
        setField(term3357, term3357.getClass(), "background", null);
        setField(term3357, term3357.getClass(), "font", null);
        setField(term3357, term3357.getClass(), "peerFont", null);
        setField(term3357, term3357.getClass(), "cursor", null);
        setField(term3357, term3357.getClass(), "locale", null);
        setField(term3357, term3357.getClass(), "graphicsConfig", null);
        setField(term3357, term3357.getClass(), "bufferStrategy", null);
        setBooleanField(term3357, term3357.getClass(), "ignoreRepaint", false);
        setBooleanField(term3357, term3357.getClass(), "visible", false);
        setBooleanField(term3357, term3357.getClass(), "enabled", false);
        setBooleanField(term3357, term3357.getClass(), "valid", false);
        setField(term3357, term3357.getClass(), "dropTarget", null);
        setField(term3357, term3357.getClass(), "popups", null);
        setField(term3357, term3357.getClass(), "name", null);
        setBooleanField(term3357, term3357.getClass(), "nameExplicitlySet", false);
        setBooleanField(term3357, term3357.getClass(), "focusable", false);
        setIntField(term3357, term3357.getClass(), "isFocusTraversableOverridden", 0);
        setField(term3357, term3357.getClass(), "focusTraversalKeys", null);
        setBooleanField(term3357, term3357.getClass(), "focusTraversalKeysEnabled", false);
        setField(term3357, term3357.getClass(), "acc", null);
        setField(term3357, term3357.getClass(), "minSize", null);
        setBooleanField(term3357, term3357.getClass(), "minSizeSet", false);
        setField(term3357, term3357.getClass(), "prefSize", null);
        setBooleanField(term3357, term3357.getClass(), "prefSizeSet", false);
        setField(term3357, term3357.getClass(), "maxSize", null);
        setBooleanField(term3357, term3357.getClass(), "maxSizeSet", false);
        setField(term3357, term3357.getClass(), "componentOrientation", null);
        setBooleanField(term3357, term3357.getClass(), "newEventsOnly", false);
        setField(term3357, term3357.getClass(), "componentListener", null);
        setField(term3357, term3357.getClass(), "focusListener", null);
        setField(term3357, term3357.getClass(), "hierarchyListener", null);
        setField(term3357, term3357.getClass(), "hierarchyBoundsListener", null);
        setField(term3357, term3357.getClass(), "keyListener", null);
        setField(term3357, term3357.getClass(), "mouseListener", null);
        setField(term3357, term3357.getClass(), "mouseMotionListener", null);
        setField(term3357, term3357.getClass(), "mouseWheelListener", null);
        setField(term3357, term3357.getClass(), "inputMethodListener", null);
        setLongField(term3357, term3357.getClass(), "eventMask", 0L);
        setField(term3357, term3357.getClass(), "changeSupport", null);
        setField(term3357, term3357.getClass(), "objectLock", null);
        setBooleanField(term3357, term3357.getClass(), "isPacked", false);
        setIntField(term3357, term3357.getClass(), "boundsOp", 0);
        setField(term3357, term3357.getClass(), "compoundShape", null);
        setField(term3357, term3357.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term3357, term3357.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term3357, term3357.getClass(), "backgroundEraseDisabled", false);
        setField(term3357, term3357.getClass(), "eventCache", null);
        setBooleanField(term3357, term3357.getClass(), "coalescingEnabled", false);
        setBooleanField(term3357, term3357.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term3357, term3357.getClass(), "componentSerializedDataVersion", 0);
        setField(term3357, term3357.getClass(), "accessibleContext", null);
        term3398 = new Character((char) 0);
        term3400 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("io.codeworth.panelmatic.impl.FlexibleSpaceComp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = char.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term3398;
        args[2] = term3400;
        callMethod(klass, "firePropertyChange", argTypes, term3357, args);
    }

};


