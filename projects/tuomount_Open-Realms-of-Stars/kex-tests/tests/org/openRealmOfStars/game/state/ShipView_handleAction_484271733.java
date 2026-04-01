package org.openRealmOfStars.game.state;

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
import static org.openRealmOfStars.game.state.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShipView_handleAction_484271733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1946863;

    public ShipView_handleAction_484271733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1946863 = newInstance(Class.forName("org.openRealmOfStars.game.state.ShipView"));
        setField(term1946863, term1946863.getClass(), "player", null);
        setField(term1946863, term1946863.getClass(), "shipList", null);
        setField(term1946863, term1946863.getClass(), "shipImage", null);
        setField(term1946863, term1946863.getClass(), "infoText", null);
        setBooleanField(term1946863, term1946863.getClass(), "copyClicked", false);
        setIntField(term1946863, term1946863.getClass(), "lastSelectedIndex", 0);
        setField(term1946863, term1946863.getClass(), "obsoleteBtn", null);
        setField(term1946863, term1946863.getClass(), "deleteBtn", null);
        setBooleanField(term1946863, term1946863.getClass(), "isAlignmentXSet", false);
        setFloatField(term1946863, term1946863.getClass(), "alignmentX", 0.0F);
        setBooleanField(term1946863, term1946863.getClass(), "isAlignmentYSet", false);
        setFloatField(term1946863, term1946863.getClass(), "alignmentY", 0.0F);
        setField(term1946863, term1946863.getClass(), "ui", null);
        setField(term1946863, term1946863.getClass(), "listenerList", null);
        setField(term1946863, term1946863.getClass(), "clientProperties", null);
        setField(term1946863, term1946863.getClass(), "vetoableChangeSupport", null);
        setBooleanField(term1946863, term1946863.getClass(), "autoscrolls", false);
        setField(term1946863, term1946863.getClass(), "border", null);
        setIntField(term1946863, term1946863.getClass(), "flags", 0);
        setField(term1946863, term1946863.getClass(), "inputVerifier", null);
        setBooleanField(term1946863, term1946863.getClass(), "verifyInputWhenFocusTarget", false);
        setField(term1946863, term1946863.getClass(), "paintingChild", null);
        setField(term1946863, term1946863.getClass(), "popupMenu", null);
        setField(term1946863, term1946863.getClass(), "revalidateRunnableScheduled", null);
        setField(term1946863, term1946863.getClass(), "focusInputMap", null);
        setField(term1946863, term1946863.getClass(), "ancestorInputMap", null);
        setField(term1946863, term1946863.getClass(), "windowInputMap", null);
        setField(term1946863, term1946863.getClass(), "actionMap", null);
        setField(term1946863, term1946863.getClass(), "aaHint", null);
        setField(term1946863, term1946863.getClass(), "lcdRenderingHint", null);
        setField(term1946863, term1946863.getClass(), "component", null);
        setField(term1946863, term1946863.getClass(), "layoutMgr", null);
        setField(term1946863, term1946863.getClass(), "dispatcher", null);
        setField(term1946863, term1946863.getClass(), "focusTraversalPolicy", null);
        setBooleanField(term1946863, term1946863.getClass(), "focusCycleRoot", false);
        setBooleanField(term1946863, term1946863.getClass(), "focusTraversalPolicyProvider", false);
        setField(term1946863, term1946863.getClass(), "printingThreads", null);
        setBooleanField(term1946863, term1946863.getClass(), "printing", false);
        setField(term1946863, term1946863.getClass(), "containerListener", null);
        setIntField(term1946863, term1946863.getClass(), "listeningChildren", 0);
        setIntField(term1946863, term1946863.getClass(), "listeningBoundsChildren", 0);
        setIntField(term1946863, term1946863.getClass(), "descendantsCount", 0);
        setField(term1946863, term1946863.getClass(), "preserveBackgroundColor", null);
        setIntField(term1946863, term1946863.getClass(), "numOfHWComponents", 0);
        setIntField(term1946863, term1946863.getClass(), "numOfLWComponents", 0);
        setField(term1946863, term1946863.getClass(), "modalComp", null);
        setField(term1946863, term1946863.getClass(), "modalAppContext", null);
        setIntField(term1946863, term1946863.getClass(), "containerSerializedDataVersion", 0);
        setField(term1946863, term1946863.getClass(), "peer", null);
        setField(term1946863, term1946863.getClass(), "parent", null);
        setField(term1946863, term1946863.getClass(), "appContext", null);
        setIntField(term1946863, term1946863.getClass(), "x", 0);
        setIntField(term1946863, term1946863.getClass(), "y", 0);
        setIntField(term1946863, term1946863.getClass(), "width", 0);
        setIntField(term1946863, term1946863.getClass(), "height", 0);
        setField(term1946863, term1946863.getClass(), "foreground", null);
        setField(term1946863, term1946863.getClass(), "background", null);
        setField(term1946863, term1946863.getClass(), "font", null);
        setField(term1946863, term1946863.getClass(), "peerFont", null);
        setField(term1946863, term1946863.getClass(), "cursor", null);
        setField(term1946863, term1946863.getClass(), "locale", null);
        setField(term1946863, term1946863.getClass(), "graphicsConfig", null);
        setField(term1946863, term1946863.getClass(), "bufferStrategy", null);
        setBooleanField(term1946863, term1946863.getClass(), "ignoreRepaint", false);
        setBooleanField(term1946863, term1946863.getClass(), "visible", false);
        setBooleanField(term1946863, term1946863.getClass(), "enabled", false);
        setBooleanField(term1946863, term1946863.getClass(), "valid", false);
        setField(term1946863, term1946863.getClass(), "dropTarget", null);
        setField(term1946863, term1946863.getClass(), "popups", null);
        setField(term1946863, term1946863.getClass(), "name", null);
        setBooleanField(term1946863, term1946863.getClass(), "nameExplicitlySet", false);
        setBooleanField(term1946863, term1946863.getClass(), "focusable", false);
        setIntField(term1946863, term1946863.getClass(), "isFocusTraversableOverridden", 0);
        setField(term1946863, term1946863.getClass(), "focusTraversalKeys", null);
        setBooleanField(term1946863, term1946863.getClass(), "focusTraversalKeysEnabled", false);
        setField(term1946863, term1946863.getClass(), "acc", null);
        setField(term1946863, term1946863.getClass(), "minSize", null);
        setBooleanField(term1946863, term1946863.getClass(), "minSizeSet", false);
        setField(term1946863, term1946863.getClass(), "prefSize", null);
        setBooleanField(term1946863, term1946863.getClass(), "prefSizeSet", false);
        setField(term1946863, term1946863.getClass(), "maxSize", null);
        setBooleanField(term1946863, term1946863.getClass(), "maxSizeSet", false);
        setField(term1946863, term1946863.getClass(), "componentOrientation", null);
        setBooleanField(term1946863, term1946863.getClass(), "newEventsOnly", false);
        setField(term1946863, term1946863.getClass(), "componentListener", null);
        setField(term1946863, term1946863.getClass(), "focusListener", null);
        setField(term1946863, term1946863.getClass(), "hierarchyListener", null);
        setField(term1946863, term1946863.getClass(), "hierarchyBoundsListener", null);
        setField(term1946863, term1946863.getClass(), "keyListener", null);
        setField(term1946863, term1946863.getClass(), "mouseListener", null);
        setField(term1946863, term1946863.getClass(), "mouseMotionListener", null);
        setField(term1946863, term1946863.getClass(), "mouseWheelListener", null);
        setField(term1946863, term1946863.getClass(), "inputMethodListener", null);
        setLongField(term1946863, term1946863.getClass(), "eventMask", 0L);
        setField(term1946863, term1946863.getClass(), "changeSupport", null);
        setField(term1946863, term1946863.getClass(), "objectLock", null);
        setBooleanField(term1946863, term1946863.getClass(), "isPacked", false);
        setIntField(term1946863, term1946863.getClass(), "boundsOp", 0);
        setField(term1946863, term1946863.getClass(), "compoundShape", null);
        setField(term1946863, term1946863.getClass(), "mixingCutoutRegion", null);
        setBooleanField(term1946863, term1946863.getClass(), "isAddNotifyComplete", false);
        setBooleanField(term1946863, term1946863.getClass(), "backgroundEraseDisabled", false);
        setField(term1946863, term1946863.getClass(), "eventCache", null);
        setBooleanField(term1946863, term1946863.getClass(), "coalescingEnabled", false);
        setBooleanField(term1946863, term1946863.getClass(), "autoFocusTransferOnDisposal", false);
        setIntField(term1946863, term1946863.getClass(), "componentSerializedDataVersion", 0);
        setField(term1946863, term1946863.getClass(), "accessibleContext", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.state.ShipView");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.awt.event.ActionEvent");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "handleAction", argTypes, term1946863, args);
    }

};


