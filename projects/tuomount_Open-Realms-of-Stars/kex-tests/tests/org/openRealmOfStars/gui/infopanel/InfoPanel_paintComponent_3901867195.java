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

public class InfoPanel_paintComponent_3901867195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60602;

    public InfoPanel_paintComponent_3901867195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60602 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.InfoPanel"));
        setField(term60602, term60602.getClass(), "border", null);
        setBooleanField(term60602, term60602.getClass(), "isAlignmentXSet", false);
        setFloatField(term60602, term60602.getClass(), "alignmentX", 0.0F);
        setBooleanField(term60602, term60602.getClass(), "isAlignmentYSet", false);
        setFloatField(term60602, term60602.getClass(), "alignmentY", 0.0F);
        setField(term60602, term60602.getClass(), "ui", null);
        setField(term60602, term60602.getClass(), "listenerList", null);
        setField(term60602, term60602.getClass(), "clientProperties", null);
        setField(term60602, term60602.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term60602, term60602.getClass(), "autoscrolls", false);
        setField(term60602, term60602.getClass(), "border", null);
        setIntField(term60602, term60602.getClass(), "flags", 0);
        setField(term60602, term60602.getClass(), "inputVerifier", null);
        setBooleanField(term60602, term60602.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term60602, term60602.getClass(), "paintingChild", null);
        setField(term60602, term60602.getClass(), "popupMenu", null);
        setField(term60602, term60602.getClass(), "revalidateRunnableScheduled", null);
        setField(term60602, term60602.getClass(), "focusInputMap", null);
        setField(term60602, term60602.getClass(), "ancestorInputMap", null);
        setField(term60602, term60602.getClass(), "windowInputMap", null);
        setField(term60602, term60602.getClass(), "actionMap", null);
        setField(term60602, term60602.getClass(), "aaHint", null);
        setField(term60602, term60602.getClass(), "lcdRenderingHint", null);
        setField(term60602, term60602.getClass(), "component", null);
        setField(term60602, term60602.getClass(), "layoutMgr", null);
        setField(term60602, term60602.getClass(), "dispatcher", null);
        setField(term60602, term60602.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term60602, term60602.getClass(), "focusCycleRoot", false);
        setBooleanField(term60602, term60602.getClass(), "focusTraversalPolicyProvider", false);
        setField(term60602, term60602.getClass(), "printingThreads", null);
        setBooleanField(term60602, term60602.getClass(), "printing", false);
        setField(term60602, term60602.getClass(), "containerListener", null);
        setIntField(term60602, term60602.getClass(), "listeningChildren", 0);
        setIntField(term60602, term60602.getClass(), "listeningBoundsChildren", 0);
        setIntField(term60602, term60602.getClass(), "descendantsCount", 0);
        setField(term60602, term60602.getClass(), "preserveBackgroundColor", null);
        setIntField(term60602, term60602.getClass(), "numOfHWComponents", 0);
        setIntField(term60602, term60602.getClass(), "numOfLWComponents", 0);
        setField(term60602, term60602.getClass(), "modalComp", null);
        setField(term60602, term60602.getClass(), "modalAppContext", null);
        setIntField(term60602, term60602.getClass(), "containerSerializedDataVersion", 0);
        setField(term60602, term60602.getClass(), "peer", null);
        setField(term60602, term60602.getClass(), "parent", null);
        setField(term60602, term60602.getClass(), "appContext", null);
        setIntField(term60602, term60602.getClass(), "x", 0);
        setIntField(term60602, term60602.getClass(), "y", 0);
        setIntField(term60602, term60602.getClass(), "width", 0);
        setIntField(term60602, term60602.getClass(), "height", 0);
        setField(term60602, term60602.getClass(), "foreground", null);
        setField(term60602, term60602.getClass(), "background", null);
        setField(term60602, term60602.getClass(), "font", null);
        setField(term60602, term60602.getClass(), "peerFont", null);
        setField(term60602, term60602.getClass(), "cursor", null);
        setField(term60602, term60602.getClass(), "locale", null);
        setField(term60602, term60602.getClass(), "graphicsConfig", null);
        setField(term60602, term60602.getClass(), "bufferStrategy", null);
        setBooleanField(term60602, term60602.getClass(), "ignoreRepaint", false);
        setBooleanField(term60602, term60602.getClass(), "visible", false);
        setBooleanField(term60602, term60602.getClass(), "enabled", false);
        setBooleanField(term60602, term60602.getClass(), "valid", false);
        setField(term60602, term60602.getClass(), "dropTarget", null);
        setField(term60602, term60602.getClass(), "popups", null);
        setField(term60602, term60602.getClass(), "name", null);
        setBooleanField(term60602, term60602.getClass(), "nameExplicitlySet", false);
        setBooleanField(term60602, term60602.getClass(), "focusable", false);
        setIntField(term60602, term60602.getClass(), "isFocusTraversableOverridden", 0);
        setField(term60602, term60602.getClass(), "focusTraversalKeys", null);
        setBooleanField(term60602, term60602.getClass(), "focusTraversalKeysEnabled", false);
        setField(term60602, term60602.getClass(), "acc", null);
        setField(term60602, term60602.getClass(), "minSize", null);
        setBooleanField(term60602, term60602.getClass(), "minSizeSet", false);
        setField(term60602, term60602.getClass(), "prefSize", null);
        setBooleanField(term60602, term60602.getClass(), "prefSizeSet", false);
        setField(term60602, term60602.getClass(), "maxSize", null);
        setBooleanField(term60602, term60602.getClass(), "maxSizeSet", false);
        setField(term60602, term60602.getClass(), "componentOrientation", null);
        setBooleanField(term60602, term60602.getClass(), "newEventsOnly", false);
        setField(term60602, term60602.getClass(), "componentListener", null);
        setField(term60602, term60602.getClass(), "focusListener", null);
        setField(term60602, term60602.getClass(), "hierarchyListener", null);
        setField(term60602, term60602.getClass(), "hierarchyBoundsListener", null);
        setField(term60602, term60602.getClass(), "keyListener", null);
        setField(term60602, term60602.getClass(), "mouseListener", null);
        setField(term60602, term60602.getClass(), "mouseMotionListener", null);
        setField(term60602, term60602.getClass(), "mouseWheelListener", null);
        setField(term60602, term60602.getClass(), "inputMethodListener", null);
        setLongField(term60602, term60602.getClass(), "eventMask", 0L);
        setField(term60602, term60602.getClass(), "changeSupport", null);
        setField(term60602, term60602.getClass(), "objectLock", null);
        setBooleanField(term60602, term60602.getClass(), "isPacked", false);
        setIntField(term60602, term60602.getClass(), "boundsOp", 0);
        setField(term60602, term60602.getClass(), "compoundShape", null);
        setField(term60602, term60602.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term60602, term60602.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term60602, term60602.getClass(), "backgroundEraseDisabled", false);
        setField(term60602, term60602.getClass(), "eventCache", null);
        setBooleanField(term60602, term60602.getClass(), "coalescingEnabled", false);
        setBooleanField(term60602, term60602.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term60602, term60602.getClass(), "componentSerializedDataVersion", 0);
        setField(term60602, term60602.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.InfoPanel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.Graphics");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "paintComponent", argTypes, term60602, args);
    }

};


