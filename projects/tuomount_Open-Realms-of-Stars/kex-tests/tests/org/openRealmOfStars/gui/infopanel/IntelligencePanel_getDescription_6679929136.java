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

public class IntelligencePanel_getDescription_6679929136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62708;

    public IntelligencePanel_getDescription_6679929136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62708 = newInstance(Class.forName("org.openRealmOfStars.gui.infopanel.IntelligencePanel"));
        setField(term62708, term62708.getClass(), "realmName", null);
        setField(term62708, term62708.getClass(), "description", null);
        setIntField(term62708, term62708.getClass(), "value", 0);
        setField(term62708, term62708.getClass(), "border", null);
        setBooleanField(term62708, term62708.getClass(), "isAlignmentXSet", false);
        setFloatField(term62708, term62708.getClass(), "alignmentX", 0.0F);
        setBooleanField(term62708, term62708.getClass(), "isAlignmentYSet", false);
        setFloatField(term62708, term62708.getClass(), "alignmentY", 0.0F);
        setField(term62708, term62708.getClass(), "ui", null);
        setField(term62708, term62708.getClass(), "listenerList", null);
        setField(term62708, term62708.getClass(), "clientProperties", null);
        setField(term62708, term62708.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term62708, term62708.getClass(), "autoscrolls", false);
        setField(term62708, term62708.getClass(), "border", null);
        setIntField(term62708, term62708.getClass(), "flags", 0);
        setField(term62708, term62708.getClass(), "inputVerifier", null);
        setBooleanField(term62708, term62708.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term62708, term62708.getClass(), "paintingChild", null);
        setField(term62708, term62708.getClass(), "popupMenu", null);
        setField(term62708, term62708.getClass(), "revalidateRunnableScheduled", null);
        setField(term62708, term62708.getClass(), "focusInputMap", null);
        setField(term62708, term62708.getClass(), "ancestorInputMap", null);
        setField(term62708, term62708.getClass(), "windowInputMap", null);
        setField(term62708, term62708.getClass(), "actionMap", null);
        setField(term62708, term62708.getClass(), "aaHint", null);
        setField(term62708, term62708.getClass(), "lcdRenderingHint", null);
        setField(term62708, term62708.getClass(), "component", null);
        setField(term62708, term62708.getClass(), "layoutMgr", null);
        setField(term62708, term62708.getClass(), "dispatcher", null);
        setField(term62708, term62708.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term62708, term62708.getClass(), "focusCycleRoot", false);
        setBooleanField(term62708, term62708.getClass(), "focusTraversalPolicyProvider", false);
        setField(term62708, term62708.getClass(), "printingThreads", null);
        setBooleanField(term62708, term62708.getClass(), "printing", false);
        setField(term62708, term62708.getClass(), "containerListener", null);
        setIntField(term62708, term62708.getClass(), "listeningChildren", 0);
        setIntField(term62708, term62708.getClass(), "listeningBoundsChildren", 0);
        setIntField(term62708, term62708.getClass(), "descendantsCount", 0);
        setField(term62708, term62708.getClass(), "preserveBackgroundColor", null);
        setIntField(term62708, term62708.getClass(), "numOfHWComponents", 0);
        setIntField(term62708, term62708.getClass(), "numOfLWComponents", 0);
        setField(term62708, term62708.getClass(), "modalComp", null);
        setField(term62708, term62708.getClass(), "modalAppContext", null);
        setIntField(term62708, term62708.getClass(), "containerSerializedDataVersion", 0);
        setField(term62708, term62708.getClass(), "peer", null);
        setField(term62708, term62708.getClass(), "parent", null);
        setField(term62708, term62708.getClass(), "appContext", null);
        setIntField(term62708, term62708.getClass(), "x", 0);
        setIntField(term62708, term62708.getClass(), "y", 0);
        setIntField(term62708, term62708.getClass(), "width", 0);
        setIntField(term62708, term62708.getClass(), "height", 0);
        setField(term62708, term62708.getClass(), "foreground", null);
        setField(term62708, term62708.getClass(), "background", null);
        setField(term62708, term62708.getClass(), "font", null);
        setField(term62708, term62708.getClass(), "peerFont", null);
        setField(term62708, term62708.getClass(), "cursor", null);
        setField(term62708, term62708.getClass(), "locale", null);
        setField(term62708, term62708.getClass(), "graphicsConfig", null);
        setField(term62708, term62708.getClass(), "bufferStrategy", null);
        setBooleanField(term62708, term62708.getClass(), "ignoreRepaint", false);
        setBooleanField(term62708, term62708.getClass(), "visible", false);
        setBooleanField(term62708, term62708.getClass(), "enabled", false);
        setBooleanField(term62708, term62708.getClass(), "valid", false);
        setField(term62708, term62708.getClass(), "dropTarget", null);
        setField(term62708, term62708.getClass(), "popups", null);
        setField(term62708, term62708.getClass(), "name", null);
        setBooleanField(term62708, term62708.getClass(), "nameExplicitlySet", false);
        setBooleanField(term62708, term62708.getClass(), "focusable", false);
        setIntField(term62708, term62708.getClass(), "isFocusTraversableOverridden", 0);
        setField(term62708, term62708.getClass(), "focusTraversalKeys", null);
        setBooleanField(term62708, term62708.getClass(), "focusTraversalKeysEnabled", false);
        setField(term62708, term62708.getClass(), "acc", null);
        setField(term62708, term62708.getClass(), "minSize", null);
        setBooleanField(term62708, term62708.getClass(), "minSizeSet", false);
        setField(term62708, term62708.getClass(), "prefSize", null);
        setBooleanField(term62708, term62708.getClass(), "prefSizeSet", false);
        setField(term62708, term62708.getClass(), "maxSize", null);
        setBooleanField(term62708, term62708.getClass(), "maxSizeSet", false);
        setField(term62708, term62708.getClass(), "componentOrientation", null);
        setBooleanField(term62708, term62708.getClass(), "newEventsOnly", false);
        setField(term62708, term62708.getClass(), "componentListener", null);
        setField(term62708, term62708.getClass(), "focusListener", null);
        setField(term62708, term62708.getClass(), "hierarchyListener", null);
        setField(term62708, term62708.getClass(), "hierarchyBoundsListener", null);
        setField(term62708, term62708.getClass(), "keyListener", null);
        setField(term62708, term62708.getClass(), "mouseListener", null);
        setField(term62708, term62708.getClass(), "mouseMotionListener", null);
        setField(term62708, term62708.getClass(), "mouseWheelListener", null);
        setField(term62708, term62708.getClass(), "inputMethodListener", null);
        setLongField(term62708, term62708.getClass(), "eventMask", 0L);
        setField(term62708, term62708.getClass(), "changeSupport", null);
        setField(term62708, term62708.getClass(), "objectLock", null);
        setBooleanField(term62708, term62708.getClass(), "isPacked", false);
        setIntField(term62708, term62708.getClass(), "boundsOp", 0);
        setField(term62708, term62708.getClass(), "compoundShape", null);
        setField(term62708, term62708.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term62708, term62708.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term62708, term62708.getClass(), "backgroundEraseDisabled", false);
        setField(term62708, term62708.getClass(), "eventCache", null);
        setBooleanField(term62708, term62708.getClass(), "coalescingEnabled", false);
        setBooleanField(term62708, term62708.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term62708, term62708.getClass(), "componentSerializedDataVersion", 0);
        setField(term62708, term62708.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.infopanel.IntelligencePanel");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term62708, args);
    }

};


