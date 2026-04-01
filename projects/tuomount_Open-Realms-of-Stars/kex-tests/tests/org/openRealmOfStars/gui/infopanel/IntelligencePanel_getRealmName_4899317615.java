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

public class IntelligencePanel_getRealmName_4899317615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62666;

    public IntelligencePanel_getRealmName_4899317615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62666 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.IntelligencePanel"));
        setField(term62666, term62666.getClass(), "realmName", null);
        setField(term62666, term62666.getClass(), "description", null);
        setIntField(term62666, term62666.getClass(), "value", 0);
        setField(term62666, term62666.getClass(), "border", null);
        setBooleanField(term62666, term62666.getClass(), "isAlignmentXSet", false);
        setFloatField(term62666, term62666.getClass(), "alignmentX", 0.0F);
        setBooleanField(term62666, term62666.getClass(), "isAlignmentYSet", false);
        setFloatField(term62666, term62666.getClass(), "alignmentY", 0.0F);
        setField(term62666, term62666.getClass(), "ui", null);
        setField(term62666, term62666.getClass(), "listenerList", null);
        setField(term62666, term62666.getClass(), "clientProperties", null);
        setField(term62666, term62666.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term62666, term62666.getClass(), "autoscrolls", false);
        setField(term62666, term62666.getClass(), "border", null);
        setIntField(term62666, term62666.getClass(), "flags", 0);
        setField(term62666, term62666.getClass(), "inputVerifier", null);
        setBooleanField(term62666, term62666.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term62666, term62666.getClass(), "paintingChild", null);
        setField(term62666, term62666.getClass(), "popupMenu", null);
        setField(term62666, term62666.getClass(), "revalidateRunnableScheduled", null);
        setField(term62666, term62666.getClass(), "focusInputMap", null);
        setField(term62666, term62666.getClass(), "ancestorInputMap", null);
        setField(term62666, term62666.getClass(), "windowInputMap", null);
        setField(term62666, term62666.getClass(), "actionMap", null);
        setField(term62666, term62666.getClass(), "aaHint", null);
        setField(term62666, term62666.getClass(), "lcdRenderingHint", null);
        setField(term62666, term62666.getClass(), "component", null);
        setField(term62666, term62666.getClass(), "layoutMgr", null);
        setField(term62666, term62666.getClass(), "dispatcher", null);
        setField(term62666, term62666.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term62666, term62666.getClass(), "focusCycleRoot", false);
        setBooleanField(term62666, term62666.getClass(), "focusTraversalPolicyProvider", false);
        setField(term62666, term62666.getClass(), "printingThreads", null);
        setBooleanField(term62666, term62666.getClass(), "printing", false);
        setField(term62666, term62666.getClass(), "containerListener", null);
        setIntField(term62666, term62666.getClass(), "listeningChildren", 0);
        setIntField(term62666, term62666.getClass(), "listeningBoundsChildren", 0);
        setIntField(term62666, term62666.getClass(), "descendantsCount", 0);
        setField(term62666, term62666.getClass(), "preserveBackgroundColor", null);
        setIntField(term62666, term62666.getClass(), "numOfHWComponents", 0);
        setIntField(term62666, term62666.getClass(), "numOfLWComponents", 0);
        setField(term62666, term62666.getClass(), "modalComp", null);
        setField(term62666, term62666.getClass(), "modalAppContext", null);
        setIntField(term62666, term62666.getClass(), "containerSerializedDataVersion", 0);
        setField(term62666, term62666.getClass(), "peer", null);
        setField(term62666, term62666.getClass(), "parent", null);
        setField(term62666, term62666.getClass(), "appContext", null);
        setIntField(term62666, term62666.getClass(), "x", 0);
        setIntField(term62666, term62666.getClass(), "y", 0);
        setIntField(term62666, term62666.getClass(), "width", 0);
        setIntField(term62666, term62666.getClass(), "height", 0);
        setField(term62666, term62666.getClass(), "foreground", null);
        setField(term62666, term62666.getClass(), "background", null);
        setField(term62666, term62666.getClass(), "font", null);
        setField(term62666, term62666.getClass(), "peerFont", null);
        setField(term62666, term62666.getClass(), "cursor", null);
        setField(term62666, term62666.getClass(), "locale", null);
        setField(term62666, term62666.getClass(), "graphicsConfig", null);
        setField(term62666, term62666.getClass(), "bufferStrategy", null);
        setBooleanField(term62666, term62666.getClass(), "ignoreRepaint", false);
        setBooleanField(term62666, term62666.getClass(), "visible", false);
        setBooleanField(term62666, term62666.getClass(), "enabled", false);
        setBooleanField(term62666, term62666.getClass(), "valid", false);
        setField(term62666, term62666.getClass(), "dropTarget", null);
        setField(term62666, term62666.getClass(), "popups", null);
        setField(term62666, term62666.getClass(), "name", null);
        setBooleanField(term62666, term62666.getClass(), "nameExplicitlySet", false);
        setBooleanField(term62666, term62666.getClass(), "focusable", false);
        setIntField(term62666, term62666.getClass(), "isFocusTraversableOverridden", 0);
        setField(term62666, term62666.getClass(), "focusTraversalKeys", null);
        setBooleanField(term62666, term62666.getClass(), "focusTraversalKeysEnabled", false);
        setField(term62666, term62666.getClass(), "acc", null);
        setField(term62666, term62666.getClass(), "minSize", null);
        setBooleanField(term62666, term62666.getClass(), "minSizeSet", false);
        setField(term62666, term62666.getClass(), "prefSize", null);
        setBooleanField(term62666, term62666.getClass(), "prefSizeSet", false);
        setField(term62666, term62666.getClass(), "maxSize", null);
        setBooleanField(term62666, term62666.getClass(), "maxSizeSet", false);
        setField(term62666, term62666.getClass(), "componentOrientation", null);
        setBooleanField(term62666, term62666.getClass(), "newEventsOnly", false);
        setField(term62666, term62666.getClass(), "componentListener", null);
        setField(term62666, term62666.getClass(), "focusListener", null);
        setField(term62666, term62666.getClass(), "hierarchyListener", null);
        setField(term62666, term62666.getClass(), "hierarchyBoundsListener", null);
        setField(term62666, term62666.getClass(), "keyListener", null);
        setField(term62666, term62666.getClass(), "mouseListener", null);
        setField(term62666, term62666.getClass(), "mouseMotionListener", null);
        setField(term62666, term62666.getClass(), "mouseWheelListener", null);
        setField(term62666, term62666.getClass(), "inputMethodListener", null);
        setLongField(term62666, term62666.getClass(), "eventMask", 0L);
        setField(term62666, term62666.getClass(), "changeSupport", null);
        setField(term62666, term62666.getClass(), "objectLock", null);
        setBooleanField(term62666, term62666.getClass(), "isPacked", false);
        setIntField(term62666, term62666.getClass(), "boundsOp", 0);
        setField(term62666, term62666.getClass(), "compoundShape", null);
        setField(term62666, term62666.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term62666, term62666.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term62666, term62666.getClass(), "backgroundEraseDisabled", false);
        setField(term62666, term62666.getClass(), "eventCache", null);
        setBooleanField(term62666, term62666.getClass(), "coalescingEnabled", false);
        setBooleanField(term62666, term62666.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term62666, term62666.getClass(), "componentSerializedDataVersion", 0);
        setField(term62666, term62666.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.IntelligencePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRealmName", argTypes, term62666, args);
    }

};


