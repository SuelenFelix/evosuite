package org.openRealmOfStars.gui.infopanel;

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
import static org.openRealmOfStars.gui.infopanel.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class InfoPanel_setTitle_6391024364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60561;

    public InfoPanel_setTitle_6391024364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60561 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.InfoPanel"));
        setField(term60561, term60561.getClass(), "border", null);
        setBooleanField(term60561, term60561.getClass(), "isAlignmentXSet", false);
        setFloatField(term60561, term60561.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60561, term60561.getClass(), "isAlignmentYSet", false);
        setFloatField(term60561, term60561.getClass(), "alignmentY", 0.0F);
        setField(term60561, term60561.getClass(), "ui", null);
        setField(term60561, term60561.getClass(), "listenerList", null);
        setField(term60561, term60561.getClass(), "clientProperties", null);
        setField(term60561, term60561.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60561, term60561.getClass(), "autoscrolls", false);
        setField(term60561, term60561.getClass(), "border", null);
        setIntField(term60561, term60561.getClass(), "flags", 0);
        setField(term60561, term60561.getClass(), "inputVerifier", null);
        setBooleanField(term60561, term60561.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60561, term60561.getClass(), "paintingChild", null);
        setField(term60561, term60561.getClass(), "popupMenu", null);
        setField(term60561, term60561.getClass(), "revalidateRunnableScheduled", null);
        setField(term60561, term60561.getClass(), "focusInputMap", null);
        setField(term60561, term60561.getClass(), "ancestorInputMap", null);
        setField(term60561, term60561.getClass(), "windowInputMap", null);
        setField(term60561, term60561.getClass(), "actionMap", null);
        setField(term60561, term60561.getClass(), "aaHint", null);
        setField(term60561, term60561.getClass(), "lcdRenderingHint", null);
        setField(term60561, term60561.getClass(), "component", null);
        setField(term60561, term60561.getClass(), "layoutMgr", null);
        setField(term60561, term60561.getClass(), "dispatcher", null);
        setField(term60561, term60561.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60561, term60561.getClass(), "focusCycleRoot", false);
        setBooleanField(term60561, term60561.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60561, term60561.getClass(), "printingThreads", null);
        setBooleanField(term60561, term60561.getClass(), "printing", false);
        setField(term60561, term60561.getClass(), "containerListener", null);
        setIntField(term60561, term60561.getClass(), "listeningChildren", 0);
        setIntField(term60561, term60561.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60561, term60561.getClass(), "descendantsCount", 0);
        setField(term60561, term60561.getClass(), "preserveBackgroundColor", null);
        setIntField(term60561, term60561.getClass(), "numOfHWComponents", 0);
        setIntField(term60561, term60561.getClass(), "numOfLWComponents", 0);
        setField(term60561, term60561.getClass(), "modalComp", null);
        setField(term60561, term60561.getClass(), "modalAppContext", null);
        setIntField(term60561, term60561.getClass(), "containerSerializedDataVersion", 0);
        setField(term60561, term60561.getClass(), "peer", null);
        setField(term60561, term60561.getClass(), "parent", null);
        setField(term60561, term60561.getClass(), "appContext", null);
        setIntField(term60561, term60561.getClass(), "x", 0);
        setIntField(term60561, term60561.getClass(), "y", 0);
        setIntField(term60561, term60561.getClass(), "width", 0);
        setIntField(term60561, term60561.getClass(), "height", 0);
        setField(term60561, term60561.getClass(), "foreground", null);
        setField(term60561, term60561.getClass(), "background", null);
        setField(term60561, term60561.getClass(), "font", null);
        setField(term60561, term60561.getClass(), "peerFont", null);
        setField(term60561, term60561.getClass(), "cursor", null);
        setField(term60561, term60561.getClass(), "locale", null);
        setField(term60561, term60561.getClass(), "graphicsConfig", null);
        setField(term60561, term60561.getClass(), "bufferStrategy", null);
        setBooleanField(term60561, term60561.getClass(), "ignoreRepaint", false);
        setBooleanField(term60561, term60561.getClass(), "visible", false);
        setBooleanField(term60561, term60561.getClass(), "enabled", false);
        setBooleanField(term60561, term60561.getClass(), "valid", false);
        setField(term60561, term60561.getClass(), "dropTarget", null);
        setField(term60561, term60561.getClass(), "popups", null);
        setField(term60561, term60561.getClass(), "name", null);
        setBooleanField(term60561, term60561.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60561, term60561.getClass(), "focusable", false);
        setIntField(term60561, term60561.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60561, term60561.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60561, term60561.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60561, term60561.getClass(), "acc", null);
        setField(term60561, term60561.getClass(), "minSize", null);
        setBooleanField(term60561, term60561.getClass(), "minSizeSet", false);
        setField(term60561, term60561.getClass(), "prefSize", null);
        setBooleanField(term60561, term60561.getClass(), "prefSizeSet", false);
        setField(term60561, term60561.getClass(), "maxSize", null);
        setBooleanField(term60561, term60561.getClass(), "maxSizeSet", false);
        setField(term60561, term60561.getClass(), "componentOrientation", null);
        setBooleanField(term60561, term60561.getClass(), "newEventsOnly", false);
        setField(term60561, term60561.getClass(), "componentListener", null);
        setField(term60561, term60561.getClass(), "focusListener", null);
        setField(term60561, term60561.getClass(), "hierarchyListener", null);
        setField(term60561, term60561.getClass(), "hierarchyBoundsListener", null);
        setField(term60561, term60561.getClass(), "keyListener", null);
        setField(term60561, term60561.getClass(), "mouseListener", null);
        setField(term60561, term60561.getClass(), "mouseMotionListener", null);
        setField(term60561, term60561.getClass(), "mouseWheelListener", null);
        setField(term60561, term60561.getClass(), "inputMethodListener", null);
        setLongField(term60561, term60561.getClass(), "eventMask", 0L);
        setField(term60561, term60561.getClass(), "changeSupport", null);
        setField(term60561, term60561.getClass(), "objectLock", null);
        setBooleanField(term60561, term60561.getClass(), "isPacked", false);
        setIntField(term60561, term60561.getClass(), "boundsOp", 0);
        setField(term60561, term60561.getClass(), "compoundShape", null);
        setField(term60561, term60561.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60561, term60561.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60561, term60561.getClass(), "backgroundEraseDisabled", false);
        setField(term60561, term60561.getClass(), "eventCache", null);
        setBooleanField(term60561, term60561.getClass(), "coalescingEnabled", false);
        setBooleanField(term60561, term60561.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60561, term60561.getClass(), "componentSerializedDataVersion", 0);
        setField(term60561, term60561.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.InfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTitle", argTypes, term60561, args);
    }

};


