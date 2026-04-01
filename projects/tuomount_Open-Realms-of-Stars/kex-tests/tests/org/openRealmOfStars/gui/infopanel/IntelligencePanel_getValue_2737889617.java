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

public class IntelligencePanel_getValue_2737889617 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62750;

    public IntelligencePanel_getValue_2737889617() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62750 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.IntelligencePanel"));
        setField(term62750, term62750.getClass(), "realmName", null);
        setField(term62750, term62750.getClass(), "description", null);
        setIntField(term62750, term62750.getClass(), "value", 0);
        setField(term62750, term62750.getClass(), "border", null);
        setBooleanField(term62750, term62750.getClass(), "isAlignmentXSet", false);
        setFloatField(term62750, term62750.getClass(), "alignmentX", 0.0F);
        setBooleanField(term62750, term62750.getClass(), "isAlignmentYSet", false);
        setFloatField(term62750, term62750.getClass(), "alignmentY", 0.0F);
        setField(term62750, term62750.getClass(), "ui", null);
        setField(term62750, term62750.getClass(), "listenerList", null);
        setField(term62750, term62750.getClass(), "clientProperties", null);
        setField(term62750, term62750.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term62750, term62750.getClass(), "autoscrolls", false);
        setField(term62750, term62750.getClass(), "border", null);
        setIntField(term62750, term62750.getClass(), "flags", 0);
        setField(term62750, term62750.getClass(), "inputVerifier", null);
        setBooleanField(term62750, term62750.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term62750, term62750.getClass(), "paintingChild", null);
        setField(term62750, term62750.getClass(), "popupMenu", null);
        setField(term62750, term62750.getClass(), "revalidateRunnableScheduled", null);
        setField(term62750, term62750.getClass(), "focusInputMap", null);
        setField(term62750, term62750.getClass(), "ancestorInputMap", null);
        setField(term62750, term62750.getClass(), "windowInputMap", null);
        setField(term62750, term62750.getClass(), "actionMap", null);
        setField(term62750, term62750.getClass(), "aaHint", null);
        setField(term62750, term62750.getClass(), "lcdRenderingHint", null);
        setField(term62750, term62750.getClass(), "component", null);
        setField(term62750, term62750.getClass(), "layoutMgr", null);
        setField(term62750, term62750.getClass(), "dispatcher", null);
        setField(term62750, term62750.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term62750, term62750.getClass(), "focusCycleRoot", false);
        setBooleanField(term62750, term62750.getClass(), "focusTraversalPolicyProvider", false);
        setField(term62750, term62750.getClass(), "printingThreads", null);
        setBooleanField(term62750, term62750.getClass(), "printing", false);
        setField(term62750, term62750.getClass(), "containerListener", null);
        setIntField(term62750, term62750.getClass(), "listeningChildren", 0);
        setIntField(term62750, term62750.getClass(), "listeningBoundsChildren", 0);
        setIntField(term62750, term62750.getClass(), "descendantsCount", 0);
        setField(term62750, term62750.getClass(), "preserveBackgroundColor", null);
        setIntField(term62750, term62750.getClass(), "numOfHWComponents", 0);
        setIntField(term62750, term62750.getClass(), "numOfLWComponents", 0);
        setField(term62750, term62750.getClass(), "modalComp", null);
        setField(term62750, term62750.getClass(), "modalAppContext", null);
        setIntField(term62750, term62750.getClass(), "containerSerializedDataVersion", 0);
        setField(term62750, term62750.getClass(), "peer", null);
        setField(term62750, term62750.getClass(), "parent", null);
        setField(term62750, term62750.getClass(), "appContext", null);
        setIntField(term62750, term62750.getClass(), "x", 0);
        setIntField(term62750, term62750.getClass(), "y", 0);
        setIntField(term62750, term62750.getClass(), "width", 0);
        setIntField(term62750, term62750.getClass(), "height", 0);
        setField(term62750, term62750.getClass(), "foreground", null);
        setField(term62750, term62750.getClass(), "background", null);
        setField(term62750, term62750.getClass(), "font", null);
        setField(term62750, term62750.getClass(), "peerFont", null);
        setField(term62750, term62750.getClass(), "cursor", null);
        setField(term62750, term62750.getClass(), "locale", null);
        setField(term62750, term62750.getClass(), "graphicsConfig", null);
        setField(term62750, term62750.getClass(), "bufferStrategy", null);
        setBooleanField(term62750, term62750.getClass(), "ignoreRepaint", false);
        setBooleanField(term62750, term62750.getClass(), "visible", false);
        setBooleanField(term62750, term62750.getClass(), "enabled", false);
        setBooleanField(term62750, term62750.getClass(), "valid", false);
        setField(term62750, term62750.getClass(), "dropTarget", null);
        setField(term62750, term62750.getClass(), "popups", null);
        setField(term62750, term62750.getClass(), "name", null);
        setBooleanField(term62750, term62750.getClass(), "nameExplicitlySet", false);
        setBooleanField(term62750, term62750.getClass(), "focusable", false);
        setIntField(term62750, term62750.getClass(), "isFocusTraversableOverridden", 0);
        setField(term62750, term62750.getClass(), "focusTraversalKeys", null);
        setBooleanField(term62750, term62750.getClass(), "focusTraversalKeysEnabled", false);
        setField(term62750, term62750.getClass(), "acc", null);
        setField(term62750, term62750.getClass(), "minSize", null);
        setBooleanField(term62750, term62750.getClass(), "minSizeSet", false);
        setField(term62750, term62750.getClass(), "prefSize", null);
        setBooleanField(term62750, term62750.getClass(), "prefSizeSet", false);
        setField(term62750, term62750.getClass(), "maxSize", null);
        setBooleanField(term62750, term62750.getClass(), "maxSizeSet", false);
        setField(term62750, term62750.getClass(), "componentOrientation", null);
        setBooleanField(term62750, term62750.getClass(), "newEventsOnly", false);
        setField(term62750, term62750.getClass(), "componentListener", null);
        setField(term62750, term62750.getClass(), "focusListener", null);
        setField(term62750, term62750.getClass(), "hierarchyListener", null);
        setField(term62750, term62750.getClass(), "hierarchyBoundsListener", null);
        setField(term62750, term62750.getClass(), "keyListener", null);
        setField(term62750, term62750.getClass(), "mouseListener", null);
        setField(term62750, term62750.getClass(), "mouseMotionListener", null);
        setField(term62750, term62750.getClass(), "mouseWheelListener", null);
        setField(term62750, term62750.getClass(), "inputMethodListener", null);
        setLongField(term62750, term62750.getClass(), "eventMask", 0L);
        setField(term62750, term62750.getClass(), "changeSupport", null);
        setField(term62750, term62750.getClass(), "objectLock", null);
        setBooleanField(term62750, term62750.getClass(), "isPacked", false);
        setIntField(term62750, term62750.getClass(), "boundsOp", 0);
        setField(term62750, term62750.getClass(), "compoundShape", null);
        setField(term62750, term62750.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term62750, term62750.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term62750, term62750.getClass(), "backgroundEraseDisabled", false);
        setField(term62750, term62750.getClass(), "eventCache", null);
        setBooleanField(term62750, term62750.getClass(), "coalescingEnabled", false);
        setBooleanField(term62750, term62750.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term62750, term62750.getClass(), "componentSerializedDataVersion", 0);
        setField(term62750, term62750.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.IntelligencePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getValue", argTypes, term62750, args);
    }

};


